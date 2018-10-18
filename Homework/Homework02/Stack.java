public class Stack {

    private CircularList list;
    private int size;
    private int first;

    public Stack() {
        list = new CircularList();
        size = 0;
        first = 0;
    }

    private void setCurrentBefore(int data) {
        int counter = 0;
        while(list.getNextInt() != data && counter < size) {
            list.step();
            counter++;
        }

    }

    public void push(int data) {
        first = data;
        size++;
        list.insertVal(data);
    }

    public int pop() {
        if (size == 0) {
          System.out.println("empty");
        }

        int tempInt, tempIntNext;
        tempInt = first;
        tempIntNext = list.getNextInt();
        setCurrentBefore(tempInt);
        list.removeNext();
        setCurrentBefore(tempIntNext);
        size--;
        first = list.getInt();
        return tempInt;
    }

    public int peek() {
        if(size == 0) {
          System.out.println("empty");
        }
        return list.getInt();
        }

    public void display() {
        list.display();
    }
}
