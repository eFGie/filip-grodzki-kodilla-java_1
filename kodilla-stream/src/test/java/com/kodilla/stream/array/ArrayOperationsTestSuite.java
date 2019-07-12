package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] numbers = {15,43,52,64,855,673,44,55,33,67,32,78,4,1,1,2,15,63,4,6};

        double expectedAvg = 105.35;
        double actualAvg = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(expectedAvg,actualAvg,0);

    }
}
