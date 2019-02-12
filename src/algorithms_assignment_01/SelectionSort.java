/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_assignment_01;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MoK
 */
public class SelectionSort {

    public static void selectionSort(String[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < array.length; k++) {
                if (array[k].compareTo(array[min]) < 0) {
                    min = k;
                }
            }
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
    }

}

/*
    public static void sort(ArrayList<String> textList) {
        System.out.println(textList);
        int i;
        int j;
        int minValue;
        int minIndex;

        for (i = 0; i < textList.size(); i++) {
            System.out.println(textList.get(i));
            char iLetter = (textList.get(i).charAt(0));
            int iValue = (int) iLetter;
            minValue = iValue;
            minIndex = i;
            for (j = i; j < textList.size(); j++) {
                char jLetter = textList.get(j).charAt(0);
                int jValue = (int) jLetter;
                if (jValue < minValue) {
                    minValue = jValue;
                    minIndex = j;
                }
            }
            if (minValue < iValue) {
                Collections.swap(textList, i, minIndex);
                //textList.set(i, textList.set(minIndex, textList.get(i)));
            }
        }
        System.out.println(textList);
    }

}
 */
// if (names.get(l).compareTo(names.get(max)) > 1) {
             //   max = l;
