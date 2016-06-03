package com.goit.g2popov.module05.task02;

/**
 * Created by Андрей on 03.06.2016.
 */
public class SortArray {
        private int anArray[];

        SortArray (int inputArray[]) {
             this.anArray = inputArray;
        }

        // Classic Bubbles sorting
        public int[] sortArray () {
                int arrayLength = this.anArray.length;
                for (int i = arrayLength; i>0; i--) {
                        for (int j = 1; j < i-1; j++) {
                                if (anArray[j+1]<anArray[j]) {
                                        int tempVariable = anArray[j];
                                        anArray[j] = anArray[j+1];
                                        anArray[j+1] = tempVariable;
                                }
                        }
                }
                return this.anArray;
        }
}
