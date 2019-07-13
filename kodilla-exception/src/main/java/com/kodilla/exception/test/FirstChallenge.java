package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {

            if (b == 0) {
                  throw new ArithmeticException();
              }
            return  a / b;

        } catch (ArithmeticException aex) {

            System.out.println("Argument 'divisor' is 0!");
            return -1;

        } finally {

            System.out.println("finally always executes");

        }
    }

//    public double divide(double a, double b) throws ArithmeticException {
//        double result = 0;
//        try {
//
//            if (b == 0) {
//                throw new ArithmeticException();
//            }
//            result = a / b;
//
//        } catch (ArithmeticException aex) {
//
//            System.out.println("Argument 'divisor' is 0!");
//
//        } finally {
//
//            System.out.println("finally always executes");
//
//        }
//        return result;
//    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
