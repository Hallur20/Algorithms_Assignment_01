package algorithms_assignment_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;

public class Main {

    static InsertionSort insertionSort = new InsertionSort();
    static MergeSort mergeSort = new MergeSort();
    static SelectionSort selectionSort = new SelectionSort();
    private static ArrayList<String> textFileList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        FileReaderLogic l = new FileReaderLogic();
        l.readFile(textFileList);

        while (true) {
            System.out.println("file has been read, choose the algorithm you want to search with:\ntype: 'insert' for insertionSort\ntype: 'selection' for selectionSort\ntype: 'merge' for mergeSort");
            String answer = scanner.nextLine();
            if (answer.equals("insert")) {
                StopWatch sw = new StopWatch();
                sw.start();
                selectionSort.selectionSort(textFileList);
                System.out.println("please wait");
                sw.stop();
                getTime(sw);
            }
            if (answer.equals("selection")) {
                StopWatch sw = new StopWatch();
                sw.start();
                selectionSort.selectionSort(textFileList);
                sw.stop();
                System.out.println("please wait");
                getTime(sw);
            }
            if (answer.equals("merge")) {
                StopWatch sw = new StopWatch();
                sw.start();
                ArrayList<String> arr2 = MergeSort.mergesort(textFileList);
                sw.stop();
                getTime(sw);
            }
        }
    }
    
    public static void getTime(StopWatch sw){
        System.out.println("hours: " + sw.getTime(TimeUnit.HOURS));
                System.out.println("minutes: " + sw.getTime(TimeUnit.MINUTES));
                System.out.println("seconds: " + sw.getTime(TimeUnit.SECONDS));
                System.out.println("milliseconds: " + sw.getTime(TimeUnit.MILLISECONDS));
                System.out.println("microseconds: " + sw.getTime(TimeUnit.MICROSECONDS));
                System.out.println("nanoseconds: " + sw.getTime(TimeUnit.NANOSECONDS));
    }
}
