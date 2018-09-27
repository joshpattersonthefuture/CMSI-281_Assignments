//File: IntQueue.Java
//Author: Joshua Patterson
//Date:9/27/18
//Purpose: Implement push, peek and pop functions within a Queue
//To compile: javac IntQueue.java
//To Run: java IntQueue
public class IntQueue {
     IntLinkedList myQueue;
     int size = myQueue.getSize()-1;

     IntQueue() {
        myQueue = new IntLinkedList();         // constructor
     }

     public void push( int itemTopush ) {
        myQueue.prepend( itemTopush );
     }

     public int peek() {
        return myQueue.getIteratorAt(size).getCurrentInt();     // we use the iterator
     }

     public int pop() {
        if (myQueue.getSize() == 0){
          throw new IllegalArgumentException("Empty");
        }
        return myQueue.removeAt(size);
     }

     public static void main( String[] args ) {
        IntQueue testQueue = new IntQueue();
        testQueue.push( 19 );
        testQueue.push( 23 );
        testQueue.push( 29 );
        testQueue.push( 31 );
        testQueue.push( 37 );
        testQueue.push( 41 );
        testQueue.push( 43 );
        testQueue.push( 47 );
        testQueue.push( 51 );
        testQueue.push( 57 );
        System.out.println( "The top of the stack: " + testQueue.peek() );      // 57
        System.out.println( "Removing top thing: " + testQueue.pop() );         // 57 removed
        System.out.println( "The top of the stack: " + testQueue.peek() );      // 51
        System.out.println( "Removing top thing: " + testQueue.pop() );         // 51 removed
        System.out.println( "The top of the stack: " + testQueue.peek() );      // 47
        System.out.println( "Removing top thing: " + testQueue.pop() );         // 47 removed
        System.out.println( "The top of the stack: " + testQueue.peek() );      // 43
        testQueue.push( testQueue.pop() + testQueue.pop() );
        System.out.println( "The top of the stack: " + testQueue.peek() );      // what'll it be?
     }

  }
