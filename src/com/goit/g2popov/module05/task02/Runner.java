package com.goit.g2popov.module05.task02;

/**
 * Created by Андрей on 03.06.2016.
 */
public class Runner {
        public static void main(String[] args) {
                int sampleArray[] = {5, -1, 9 ,7 ,3 ,2 ,11 , 10 ,-7 ,6 , 10 ,9};

                SortArray testArray = new SortArray(sampleArray);
                int sortedArray[] = testArray.sortArray();
                System.out.println("Sorted by Bubbles method array is:");
                for (int i = 0; i<sortedArray.length; i++) {
                        System.out.print(sortedArray[i]+" ");
                }
                System.out.println();
                SortArray testArray2 = new SortArray(sampleArray);
                System.out.println("Sorted by Binary tree method array is:");
                testArray2.sortArrayBinaryTree();
                System.out.println();
                System.out.println("Job is done!");
        }
}
