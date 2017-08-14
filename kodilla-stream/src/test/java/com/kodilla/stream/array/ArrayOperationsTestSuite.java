package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given

        int[] numbers = new int[20];
        numbers[0] = 55;
        numbers[1] = 68;
        numbers[2] = 28;
        numbers[3] = 8;
        numbers[4] = 11;
        numbers[5] = 69;
        numbers[6] = 100;
        numbers[7] = 6;
        numbers[8] = 44;
        numbers[9] = 35;
        numbers[10] = 52;
        numbers[11] = 12;
        numbers[12] = 77;
        numbers[13] = 72;
        numbers[14] = 89;
        numbers[15] = 90;
        numbers[16] = 99;
        numbers[17] = 48;
        numbers[18] = 58;
        numbers[19] = 63;

        //When
        double average  = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(54.2, average, 0.01);
    }
}
