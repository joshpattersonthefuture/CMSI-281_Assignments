//File: IntLinkedList.Java
//Author: Joshua Patterson
//Date:9/20/18
//Purpose: Implement removing and inserting index locations in lists
//To compile: javac IntLinkedlist.java
//To Run: java IntLinkedList

public class IntLinkedList {

     private Node head;
     private int  size;

    // the constructor
     IntLinkedList() {
        head = null;
        size = 0;
     }
     //**************************************
     public int getSize() {
        return size;
     }
     //**************************************
     public void prepend( int dataToAdd ) {
        Node currentHead = head;
        head = new Node( dataToAdd );
        head.next = currentHead;
        size++;
     }
     //**************************************
     private class Node {

        int data;            // remember this is an IntLinkedList
        Node next;           // here's the self-referential part

        // constructor
        Node( int d ) {
           data = d;
           next = null;
        }
     }
     //************************************
     public Iterator getIteratorAt( int index ) {
        if( (index > size) || (index < 0) ) {
           throw new IllegalArgumentException();
        }
        Iterator it = new Iterator();
        while( index > 0 ) {
           it.next();
           index--;
        }
        return it;
     }
     //************************************
     public class Iterator {
        private Node currentNode;

        Iterator() {
           currentNode = head;
        }

        public void next() {
           if( currentNode == null ) {
              return;
           } else {
              currentNode = currentNode.next;
           }
        }

        public boolean hasNext() {
           return ((currentNode != null) && (currentNode.next != null));
        }

        public int getCurrentInt() {
           return currentNode.data;
        }

     }
    //*************************************** Added Method insertAt

     public void insertAt(int index, int dataToAdd){
       if(index != 0){
          throw new IllegalArgumentException();
       }
       if(index == 0){
          prepend(dataToAdd);
       }
       else {
          Node Insert = new Node(dataToAdd);
          Iterator InsertNum = getIteratorAt(index-1);

          Insert.next = InsertNum.currentNode.next;
          InsertNum.currentNode.next = Insert;
          size++;
       }
    }

    //*************************************** Added method removeAt()

    public int removeAt(int index) {
    Iterator backer = getIteratorAt(index-1);
    Iterator remover = getIteratorAt(index);

    int remove = remover.currentNode.data;

    backer.currentNode.next = backer.currentNode.next.next;
    size--;
    return remove;
    }
}
