//-----------------------------------------------------
// Title: Test class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This class tests each sorting algorithms 5 times and prints their average
//-----------------------------------------------------
public class Test {
    public void Sort1(int[] arr){

        double avg = 0;

        for(int i = 0; i < 5; i++){
            long start = System.currentTimeMillis();
            SortingAlgorithms.sort1(arr, Enter your id);
            long end = System.currentTimeMillis();
            double time = (double)end-start;
            avg += time;
        }

        avg /= 5000;

        System.out.printf("%.4f%n", avg);
    }

    public void Sort2(int[] arr){

        double avg = 0;

        for(int i = 0; i < 5; i++){
            long start = System.currentTimeMillis();
            SortingAlgorithms.sort2(arr, Enter your id);
            long end = System.currentTimeMillis();
            double time = (double)end-start;
            avg += time;
        }

        avg /= 5000;

        System.out.printf("%.4f%n", avg);
    }

    public void Sort3(int[] arr){

        double avg = 0;

        for(int i = 0; i < 5; i++){
            long start = System.currentTimeMillis();
            SortingAlgorithms.sort3(arr, Enter your id);
            long end = System.currentTimeMillis();
            double time = (double)end-start;
            avg += time;
        }

        avg /= 5000;

        System.out.printf("%.4f%n", avg);
    }

    public void Sort4(int[] arr){

        double avg = 0;

        for(int i = 0; i < 5; i++){
            long start = System.currentTimeMillis();
            SortingAlgorithms.sort4(arr, Enter your id);
            long end = System.currentTimeMillis();
            double time = (double)end-start;
            avg += time;
        }

        avg /= 5000;

        System.out.printf("%.4f%n", avg);
    }

    public void Sort5(int[] arr){

        double avg = 0;

        for(int i = 0; i < 5; i++){
            long start = System.currentTimeMillis();
            SortingAlgorithms.sort5(arr, Enter youd id);
            long end = System.currentTimeMillis();
            double time = (double)end-start;
            avg += time;
        }

        avg /= 5000;

        System.out.printf("%.4f%n", avg);
    }
}
