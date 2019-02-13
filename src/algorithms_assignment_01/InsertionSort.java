package algorithms_assignment_01;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public class InsertionSort {

    public void sort(ArrayList<String> fileArr) {
        //System.out.println("before:");
        //for (int i = 0; i < fileArr.size(); i++) {
        //    System.out.println(fileArr.get(i));
        //}
        /*
        if return is negative, the sequence is correct, sequence is not correct if return is positive.
         */
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < fileArr.size(); i++) {
            //System.out.println("i is: " + i);
            if (i + 1 >= fileArr.size()) {
                break;
            }
            if (fileArr.get(i).compareTo(fileArr.get(i + 1)) > 0) { //if c compared to a then positive
                //  System.out.println(fileArr.get(i) + " is larger than " + fileArr.get(i + 1));
                // System.out.println("rest of array:");

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
                System.out.println("we're at: " + i + " out of: " + fileArr.size());
            }
        }
        watch.stop();
        for (int i = 0; i < fileArr.size(); i++) {
            System.out.println(fileArr.get(i));
        }
        System.out.println("hours: " + watch.getTime(TimeUnit.HOURS));
        System.out.println("minutes: " + watch.getTime(TimeUnit.MINUTES));
        System.out.println("seconds: " + watch.getTime(TimeUnit.SECONDS));
        System.out.println("milliseconds: " + watch.getTime(TimeUnit.MILLISECONDS));
        System.out.println("microseconds: " + watch.getTime(TimeUnit.MICROSECONDS));
        System.out.println("nanoseconds: " + watch.getTime(TimeUnit.NANOSECONDS));
    }

    /*public void copyPaste(ArrayList<String> arr) {
        int n = arr.size();

        for (int i = 1; i < n; i++) {
            String key = arr.get(i);
            int j = i - 1;

            while ((j > -1) && (arr.get(j).compareTo(key) > 0)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
            for (int x = 0; x < arr.size(); x++) {
              
            }
            System.out.println("we're at " + i + " out of " + arr.size());
        }
    }*/
}
