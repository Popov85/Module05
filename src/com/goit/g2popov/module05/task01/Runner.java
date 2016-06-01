package com.goit.g2popov.module05.task01;

/**
 * Created by Андрей on 01.06.2016.
 */
public class Runner {
        public static void main (String[] args) {
                int specimen[] = {10,5,1,3,5,9,8,7,5,1,2,0,4,5,0,1,2};
                MinMaxFinder minMaxInstance = new MinMaxFinder(specimen);
                System.out.println("Maximum is: " + minMaxInstance.getMaximalNumber());
                System.out.println("Minimum is: " + minMaxInstance.getMinimalNumber());
        }
}
