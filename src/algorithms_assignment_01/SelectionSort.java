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

    public void selectionSort(ArrayList<String> list) {
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
    }
}
