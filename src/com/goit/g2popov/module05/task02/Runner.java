package com.goit.g2popov.module05.task02;

/**
 * Created by Андрей on 03.06.2016.
 */
public class Runner {
        public static void main(String[] args) {
                int sampleArray[] = {5, -1, 9 ,7 ,3 ,2 ,11 , 10 ,-7 ,6 , 10 ,9};
                SortArray testArray = new SortArray(sampleArray);
                System.out.println("Initial array is:");
                System.out.println(testArray.toString());

                testArray.sortArray();
                System.out.println("Sorted by Bubbles method array is:");
                System.out.println(testArray.toString());

                SortArray testArray2 = new SortArray(sampleArray);

                System.out.println("Initial array is:");
                System.out.print(testArray2.toString());
                System.out.println();

                System.out.println("Sorted by Binary tree method array is:");
                testArray2.sortArrayBinaryTree();
                System.out.println(testArray2.toString());
                System.out.println("Job is done!");
        }
}
