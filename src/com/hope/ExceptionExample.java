package com.hope;

import java.util.Arrays;

public class ExceptionExample {

    public String throwException() throws ExampleException {
        throw new ExampleException("This is a example exception");
    }

//    Errors Vs Exceptions

    public static void main(String[] args) {

        try{
        Integer[] array = {1,2,3,4,5,6,7,8};

        for(Integer i = 0; i< Integer.MAX_VALUE; i++){

            Stack stack  = new Stack(i+1);
            Stack stack1  = new Stack(i+1);

            Stack stack2  = new Stack(i+1);
            Stack stack3  = new Stack(i+1);
            Stack stack4  = new Stack(i+1);
            Stack stack5  = new Stack(i+1);
            stack.printStack();
            stack1.printStack();
            stack2.printStack();
            stack3.printStack();
            stack4.printStack();
            stack5.printStack();
            stack4.printStack();
        }

           String a = args[0];
            String[] strArray = a.split(",");
            System.out.println(Arrays.toString(strArray));

            Integer zero = 0;

            for (Integer i: array){
                Integer division = i/zero;
            }

            System.out.println(array[9]);

            ExceptionExample e = new ExceptionExample();
            e.throwException();

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("That particular index is not present....");
        }catch (ArithmeticException e){
            System.err.println("This Exception occured because I am dividing By zero");
        }catch( Exception e){
            System.err.println("Wild card catch block");
        }

    }



}
