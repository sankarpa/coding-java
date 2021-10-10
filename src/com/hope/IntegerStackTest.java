package com.hope;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IntegerStackTest {

    private static IntegerStack stack = new IntegerStack(5);


    void testIsFullShouldReturnTrueWhenStackIsFull(){



    }

    void testIsFullShouldReturnFalseWhenStackIsNotFull(){

    }


    @Test
    void testisEmptyShouldReturnTrueWhenStackIsEmpty() {
//        Arrange
//        Act
         boolean isEmpty = stack.isEmpty();
//        Assert
        assertTrue(isEmpty);
    }


    @Test
    void testEnqueueShouldReturnPushWhenStackIsEmptyItShouldNotPrintError(){
        PrintStream stream = System.err;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setErr(stream);

        stack.push(10);

        assertEquals(outputStream.toString(),"");
    }

    @Test
    void testEnqueueShouldReturnPushWhenStackIsNotEmptyItShouldNotPrintError(){

        stack.push(10);

        assertFalse(stack.isEmpty());

        PrintStream stream = System.err;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setErr(stream);

        stack.push(11);

        assertEquals(outputStream.toString(),"");
    }

    @Test
    void testEnqueueShouldReturnPushWhenStackIsFullItShouldPrintError(){

    }



    @Test
    void testisEmptyShouldReturnFalseWhenStackIsNotEmpty() {


    }
}