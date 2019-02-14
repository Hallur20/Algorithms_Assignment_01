/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_assignment_01;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

/**
 *
 * @author MoK
 */
public class SelectionSort {

    static void selectionSort(ArrayList<String> list) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < list.size(); i++) {
            String smallest = list.get(i);
            int smallestIndex = i;
            for (int j = i; j < list.size(); j++) {
                String value = list.get(j);
                if (value.compareTo(smallest) < 0) {
                    smallest = value;
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                String head = list.get(i);
                list.set(i, smallest);
                list.set(smallestIndex, head);
            }
        }
        sw.stop();
        //geting timer
        System.out.println("time" + " " + sw.getTime());
        System.out.println("Minutes" + " " + sw.getTime(TimeUnit.MINUTES));
        System.out.println("Secounds" + " " + sw.getTime(TimeUnit.SECONDS));
        System.out.println("Millesecoind" + " " + sw.getTime(TimeUnit.MILLISECONDS));
        System.out.println("Microsecounds" + " " + sw.getTime(TimeUnit.MICROSECONDS));
        System.out.println("Nanosecounds" + " " + sw.getTime(TimeUnit.NANOSECONDS));

    }
}
