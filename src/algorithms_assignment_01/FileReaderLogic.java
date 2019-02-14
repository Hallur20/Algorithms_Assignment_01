/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_assignment_01;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.time.StopWatch;

public class FileReaderLogic {

    private ArrayList<String> textFileList = new ArrayList<>();

    public void readFile() throws FileNotFoundException, IOException {
        List<String> lines;
        lines = Collections.emptyList();
        lines = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "\\src\\file\\Shakespeare_Complete_Works.txt"), StandardCharsets.UTF_8);
        String[] arr = null;
        System.out.println("adding file data to the list, please wait...");
        for (int i = 0; i < lines.size(); i++) {
            arr = lines.get(i).split(" ");
            for (int j = 0; j < arr.length; j++) {

                if (!arr[j].isEmpty()) {
                    arr[j] = arr[j].replaceAll("(?:--|[\\/#$-_,.()`:;!*{}~|\"?<>&'c])", "");
                    if (!arr[j].isEmpty()) {
                        textFileList.add(arr[j].toLowerCase());
                    }
                }
            }
        }
        System.out.println(textFileList.size());
        System.out.println("job complete");

        /*ArrayList<String> shortList = new ArrayList<>();
        shortList.add("aaaaab");
        shortList.add("aaaaaa");
        shortList.add("aaaaaa");
        shortList.add("aaax");
        shortList.add("aaaaak");
        shortList.add("aaaaap");
        shortList.add("aaaaac");*/
        //sort.sort(textFileList);  
        
        //Insertion sort
        InsertionSort sort = new InsertionSort();
        sort.sort(textFileList);

        //SelectionSort
        SelectionSort.selectionSort(textFileList);
        for (int k = 0; k < textFileList.size(); k++) {
            System.out.println(textFileList.get(k));
        }
        //Merge sorting 
        StopWatch watch = new StopWatch();
        watch.start();

        ArrayList<String> arr2 = MergeSort.mergesort(textFileList);
        watch.stop();
        System.out.println(watch.getTime());

    }
}