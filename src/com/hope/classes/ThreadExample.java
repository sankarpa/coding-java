package com.hope.classes;

public class ThreadExample extends Thread{

    private String name;

    public ThreadExample(String name){
        this.name = name;
    }

    @Override
    public void run() {

        for(int i=0; i<5 ; i++){
            System.out.println(name+"-"+i);
        }

    }


    public static void main(String[] args) {
        ThreadExample printer5ThreadOne = new ThreadExample("thread1");
        ThreadExample printer5ThreadTwo = new ThreadExample("thread2");

        System.out.println("Main.....Here");
        printer5ThreadOne.start();
        printer5ThreadTwo.start();
        System.out.println("Main.....Over");

    }
}
