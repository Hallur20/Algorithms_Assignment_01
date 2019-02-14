package algorithms_assignment_01;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public class InsertionSort {

    public void sort(ArrayList<String> fileArr) {
        /*
        if return is negative, the sequence is correct, sequence is not correct if return is positive.
         */
        for (int i = 0; i < fileArr.size(); i++) {
            //System.out.println("i is: " + i);
            if (i + 1 >= fileArr.size()) {
                break;
            }
            if (fileArr.get(i).compareTo(fileArr.get(i + 1)) > 0) { //if c compared to a then positive

                String moveOne = fileArr.get(i);
                String compareRest = fileArr.get(i + 1);
                fileArr.set(i, compareRest);
                fileArr.set(i + 1, moveOne);
                //here we need to compare 'compareRest' with the rest of the start of array, and switch each time
                for (int j = (i - 1); j >= 0; j--) { //this time we want to find smaller than... until we cant anymore.
                    if (compareRest.compareTo(fileArr.get(j)) > 0) { //break if the string to the left is larger...
                        break;
                    }
                    if (compareRest.compareTo(fileArr.get(j)) < 0) { //switch if string to the left is smaller...
                        String holder = fileArr.get(j);
                        fileArr.set(j, compareRest);
                        fileArr.set((j + 1), holder);
                    }
                }
            }
        }
    }
}
