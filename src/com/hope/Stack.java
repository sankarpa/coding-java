package com.hope;

public class Stack<T> {

    private T  stackArray[];
    private int top;
    private int size;


    Stack(int size){
        stackArray = (T[]) new Object[size];
        this.size = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T element){
//        if(isFull()){
//            System.err.println("Stack is full");
//            return;
//        }
        top++;
        stackArray[top] = element;
    }

    private boolean isFull() {
        return stackArray.length == size;
    }

    public T pop(){
        if(isEmpty()){
            System.err.println("Stack is empty");
            return (T) new Stack(-1);
        }
        T popedElement = stackArray[top];
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
        Stack<Integer> stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(10);
        stack.printStack();


        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("Hello");
        stringStack.push("Hai");
        stringStack.push("World");
        stringStack.push("Good");
        stringStack.printStack();

    }
}
