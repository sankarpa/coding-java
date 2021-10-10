package com.hope;

public class IntegerStack {

    private int  stackArray[];
    private int top;
    private int size;


    IntegerStack(int size){
        stackArray = new int[size];
        this.size = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int element){
        if(isFull()){
            System.err.println("Stack is full");
            return;
        }
        top++;
        stackArray[top] = element;
    }

    private boolean isFull() {
        return stackArray.length == size;
    }

    public int pop(){
        if(isEmpty()){
            System.err.println("Stack is empty");
            return -1;
        }
        int popedElement = stackArray[top];
        top--;
        return popedElement;
    }

    public void printStack(){
        System.out.println("Printing Stack");
        for(int i=top; i>=0; i--){
            System.out.println(stackArray[i]);
        }
    }


    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(10);
        stack.printStack();

    }
}
