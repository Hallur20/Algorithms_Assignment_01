package algorithms_assignment_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {



    public static ArrayList mergesort(ArrayList<String> b) {

        // We make sure that if the array is 1, it should just return it as it is.
        if (b.size() == 1) {
            return b;
        }

        int midt = b.size() / 2;
        String[] left = new String[midt];
        String[] right = new String[b.size() - midt];


        ArrayList result = new ArrayList();

        // Seperating our array into left and right arrays.
        for (int i = 0; i < midt; i++)
        {
            left[i] = b.get(i);
        }

        // Since we want the right side of our array into the new array,
        // We make sure that we put it in the start of the new array.
        int x = 0;
        for (int l = midt; l < b.size(); l++)
        {
                right[x] = b.get(l);
x++;
           }



        ArrayList<String> LeftList = new ArrayList<String>(Arrays.asList(left));
        ArrayList<String> RightList = new ArrayList<String>(Arrays.asList(right));
        // Here we repeat the same sorting and then merge it.
        LeftList = mergesort(LeftList);
        RightList = mergesort(RightList);

        result = merge(LeftList, RightList);
return result;
    }

    public static ArrayList  merge (ArrayList<String> leftList, ArrayList<String> rightList)
    {

        String[] left = leftList.toArray(new String[leftList.size()]);
        String[] right = rightList.toArray(new String[rightList.size()]);



        int finalLenght = left.length + right.length;
        String [] result = new String[finalLenght];
        int indexL = 0;
        int indexR = 0;
        int indexRes = 0;

        while(indexL < left.length || indexR < right.length)
        {
            if(indexL < left.length && indexR < right.length)
            {
                if (left[indexL].compareTo(right[indexR]) <= 0)
                {
                    result[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
                }

                else
                {
                    result[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }
            }

                else if (indexL < left.length) {

                    result[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
            }


            else if (indexR < right.length) {

                result[indexRes] = right[indexR];
                indexR++;
                indexRes++;
            }
            }

        ArrayList<String> resultList = new ArrayList<String>(Arrays.asList(result));
        return resultList;
            }
        }





