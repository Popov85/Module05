package com.goit.g2popov.module05.task01;

/**
 * Created by Андрей on 01.06.2016.
 */
public class MinMaxFinder {
        private int intArray[];
        MinMaxFinder(int intArray[]) {
              this.intArray = intArray;
        }

        public int getMinimalNumber() {
                int minimum = intArray[0];
                for (int i = 1; i<intArray.length; i++) {
                       if (intArray[i] < minimum) {
                               minimum = intArray[i];
                       }
                }
                return minimum;
        }

        public int getMaximalNumber() {
                int maximum = intArray[0];
                for (int i = 1; i<intArray.length; i++) {
                        if (intArray[i] > maximum) {
                                maximum = intArray[i];
                        }
                }
                return maximum;
        }

}
