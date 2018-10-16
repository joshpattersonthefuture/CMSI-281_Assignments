public class CircularListTester {
    public static void main( String[] args ) {
        CircularList myList = new CircularList();
System.out.println("*********************** Inserting ....");

        myList.insertion( 23 );
        myList.insertion( 19 );
        myList.insertion( 17 );
        myList.insertion( 13 );
        myList.insertion( 11 );
        myList.insertion( 7 );
        myList.insertion( 5 );
        myList.insertion( 3 );
        myList.insertion( 2 );
        System.out.println(" Initial Circular Linked List:" + myList.display() + "\n");

System.out.println("*********************** Deleting (3 index's ) ....");

        myList.deletion();
        myList.deletion();
        myList.deletion();
        System.out.println("Current Circular Linked List: " + myList.display() + "\n");   // 23,19,17,13, 11, 7

System.out.println("*********************** Searching ....");

        System.out.println("Zero index: " + myList.searching(0));   // 23
        System.out.println("One index: " + myList.searching(1));   // 19
        System.out.println("Two index: " + myList.searching(2));   // 17
        System.out.println("Three index: " + myList.searching(3)); //13
        System.out.println("Four index: " + myList.searching(4));   // 11
        System.out.println("Five index: " + myList.searching(5) + "\n");   // 7

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
