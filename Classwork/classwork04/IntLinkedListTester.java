//File: IntLinkedListTester.Java
//Author: Joshua Patterson
//Date:9/20/18
//Purpose: Implement removing and inserting index locations in lists (TESTER)
//To compile: javac IntLinkedlistTester.java
//To Run: java IntLinkedListTester

public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList = new IntLinkedList();
         myList.prepend( 23 );
         myList.prepend( 19 );
         myList.prepend( 17 );
         myList.prepend( 13 );
         myList.prepend( 11 );
         myList.prepend(  7 );
         myList.prepend(  5 );
         myList.prepend(  3 );
         myList.prepend(  2 );
         myList.insertAt(2,4);   //Added Method insertAt()
         myList.removeAt(9);      //Added Method removeAt()
         IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 4
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
         myIt = myList.getIteratorAt( 3 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 19

      }
   }
