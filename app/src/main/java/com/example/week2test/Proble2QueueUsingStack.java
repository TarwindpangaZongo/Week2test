package com.example.week2test;

import java.util.Stack;

public class Proble2QueueUsingStack<Item> {
    private Stack<Item> stack1; //stack1 is the tail of the queue
    private Stack<Item> stack2; //stack2 is the head of the queue


    //creating the Queue
    public void queue() {
        stack1 = new Stack<Item>();
        stack2 = new Stack<Item>();
    }

    //getting the head of the queue
    public void headReady() {
        while(!stack1.isEmpty()) stack2.push(stack1.pop());
    }

    // is the queue empty?
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void tailReady() {
        while(!stack2.isEmpty()) stack1.push(stack2.pop());
    }

    // add the item to the queue
    public void enqueue(Item item) {
        tailReady();
        stack1.push(item);
    }

    public void dequeue(Item item) {
        headReady();
        stack2.pop();
    }
}
