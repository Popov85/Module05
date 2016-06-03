package com.goit.g2popov.module05.task02;

/**
 * Created by Андрей on 03.06.2016.
 */
public class Runner {
        public static void main(String[] args) {
                int sampleArray[] = {5, -1, 9 ,7 ,3 ,2 ,11 ,0 ,-7 ,6 , 10 ,9};

                SortArray testArray = new SortArray(sampleArray);
                int sortedArray[] = testArray.sortArray();
                for (int i = 0; i<sortedArray.length; i++) {
                        System.out.println(sortedArray[i]);
                }
        }

}
