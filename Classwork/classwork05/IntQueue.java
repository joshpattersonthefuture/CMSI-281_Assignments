public class IntQueue {

     IntLinkedList myQueue;

     IntQueue() {
        myQueue = new IntLinkedList();         // constructor
     }
////////////////////////////////////////////////////////////
     public void pushQ( int itemToPushQ ) {
        myQueue.prepend( itemToPushQ );
     }
////////////////////////////////////////////////////////////
     public int peekQ() {
       int size = myQueue.getSize()-1;
        return myQueue.getIeratorAt(size).getCurrentInt();     // we use the iterator
     }
///////////////////////////////////////////////////////////
     public void popQ() {
        int size = myQueue.getSize()-1;
        if (myQueue.getSize() = 0){
          throw new IllegalArgumentException;
        }
        return myQueue.removeAt(size);
     }
///////////////////////////////////////////////////////////
     publid static void main( String[] args ) {
        IntQueue testQueue = new IntQueue()
        testQueue.pushQ( 19 );
        testQueue.pushQ( 23 );
        testQueue.pushQ( 29 );
        testQueue.pushQ( 31 );
        testQueue.pushQ( 37 );
        testQueue.pushQ( 41 );
        testQueue.pushQ( 43 );
        testQueue.pushQ( 47 );
        testQueue.pushQ( 51 );
        testQueue.pushQ( 57 );
        System.out.println( "The top of the stack: " + testQueue.peekQ() );      // 57
        System.out.println( "Removing top thing: " + testQueue.popQ() );         // 57 removed
        System.out.println( "The top of the stack: " + testQueue.peekQ() );      // 51
        System.out.println( "Removing top thing: " + testQueue.popQ() );         // 51 removed
        System.out.println( "The top of the stack: " + testQueue.peekQ() );      // 47
        System.out.println( "Removing top thing: " + testQueue.popQ() );         // 47 removed
        System.out.println( "The top of the stack: " + testQueue.peekQ() );      // 43
        testQueue.pushQ( testQueue.popQ() + testQueue.popQ() );
        System.out.println( "The top of the stack: " + testQueue.peekQ() );      // what'll it be?
     }

  }
