public class Stack {

    private CircularmyList myList;
    private int size;
    private int first;
    int firstInt;
    int nextInt;

    public Stack() {
        myList = new CircularmyList();
        size = 0;
        first = 0;
    }

    private void prevCurrent(int value) {
        int current = 0;
        while(myList.getNextInt() != value && current < size) {
            myList.step();
            current++;
        }

    }
    public int peek() {
        if(size == 0) {
          System.out.println("empty");
        }
        return myList.getInt();
    }

    public void push(int value) {
        first = value;
        size++;
        myList.insertVal(value);
    }

    public int pop() {
        if (size == 0) {
          System.out.println("empty");
        }
        firstInt = first;
        nextInt = myList.getNextInt();
        prevCurrent(firstInt);
        myList.removeNext();
        prevCurrent(nextInt);
        size--;
        first = myList.getInt();
        return firstInt;
    }

    public void display() {
        myList.display();
    }
}
