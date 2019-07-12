package com.kodilla.stream.array;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations{
   static double getAverage(int[] numbers) {

         IntStream intstream = IntStream.range(0,numbers.length);
         intstream.forEach(element -> System.out.println(numbers[element]));

         IntStream intstreamAvg = IntStream.range(0,numbers.length);
         DoubleStream doubleStream = intstreamAvg.mapToDouble(i -> numbers[i]);
        // System.out.println(doubleStream.average().getAsDouble());
         return doubleStream.average().getAsDouble();
     }
}
