public class CircularListTester {
    public static void main( String[] args ) {
        CircularList myList = new CircularList();
System.out.println("*********************** Inserting ....");

        myList.insertVal( 23 );
        myList.insertVal( 19 );
        myList.insertVal( 17 );
        myList.insertVal( 13 );
        myList.insertVal( 11 );
        myList.insertVal( 7 );
        myList.insertVal( 5 );
        myList.insertVal( 3 );
        myList.insertVal( 2 );
        System.out.println(" Initial Circular Linked List:" + myList.display() + "\n");

System.out.println("*********************** Deleting (2,3,23 ) ....");

        myList.deleteVal(2);
        myList.deleteVal(3);
        myList.deleteVal(23);
        System.out.println("Current Circular Linked List: " + myList.display() + "\n");   // 23,19,17,13, 11, 7

System.out.println("*********************** searching ....");

        System.out.println("Zero index: " + myList.searchAt(0));   // 23
        System.out.println("One index: " + myList.searchAt(1));   // 19
        System.out.println("Two index: " + myList.searchAt(2));   // 17
        System.out.println("Three index: " + myList.searchAt(3)); //13
        System.out.println("Four index: " + myList.searchAt(4));   // 11
        System.out.println("Five index: " + myList.searchAt(5) + "\n");   // 7

System.out.println("*********************** Stepping ....");
        CircularList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 19
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 17
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );
        myIt = myList.getIteratorAt( 3 );   // 13
        System.out.println( "Current Node is: " + myIt.getCurrentInt() ); // 13
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 11
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 7
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 5
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 23  (back to Zero Index)
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 19
    }
}
