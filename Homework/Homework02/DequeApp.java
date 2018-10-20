//Authors: Joshua Patterson & Rediet Teferi
//Date: October 15, 2018
class DequeApp{
  public static void main(String[] args){

    Deque theDeque = new Deque(5);

    theDeque.insertLeft(10);
    theDeque.insertLeft(20);
    theDeque.insertLeft(30);
    //theDeque.insertRight(40);

    theDeque.insertLeft(50);
    //theDeque.insertLeft(90);
    /*theDeque.removeLeft();
    theDeque.removeRight();
    theDeque.removeRight();

    theDeque.insertRight(50);
    theDeque.insertLeft(60);
    theDeque.insertLeft(70);
    theDeque.insertLeft(80);
*/
    while( !theDeque.isEmpty() ){
      long n = theDeque.removeRight(); // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
    }

    System.out.println(" ");

    theDeque.contentDequeDisplayer();
    }
  }
