public class CircularList {
    private Node current;
    private int  size;
//***************************************************
    public CircularList() {
        current = null;
        size = 0;
    }
//***************************************************
   private class Node {            //declare node
        int data;
        Node next;
        Node( int d ) {
           data = d;
           next = null;
        }
   }
//*****************************************************
   public class Iterator {              //declare iterator
        private Node currentNode;

        Iterator() {
           currentNode = current;
        }

        public void step() {
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
//***********************************************
    public Iterator getIteratorAt( int index ) {
         if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         Iterator it = new Iterator();
         while( index > 0 ) {
            it.step();
            index--;
         }
         return it;
       }
  //************************************************
     public void insertion(int value){  //insertion
       //declare Node
       Node insert = new Node(value);
         if(size == 0){
             current = insert;
             insert.next = insert;
         }
         else {
           //declare it
           Iterator inserter = getIteratorAt(getSize()-1);
           inserter.currentNode.next = insert;
           insert.next= current;
         }
            size++;
     }
//*************************************************
    public int searching( int index ) {      //searching
            if (size==0) {
                  throw new IllegalArgumentException("empty");
            }
            //declare it
            Iterator searcher = getIteratorAt(index);
            return searcher.getCurrentInt();
    }
//*************************************************
    public void deletion() {                     //deletion
            if (size == 1) {
                current = null;
                size--;
            } else {
            //declare it
            Iterator remover = getIteratorAt(getSize()-2);
            remover.currentNode.next = remover.currentNode.next.next;
            size--;
            }
    }
//*************************************************
    public int getSize() {    //useless?
           return size;
    }
//*************************************************
    public String display() {
        String mylist = "";
            if (size == 0) {
            return null;
            }
        //declare it
        Iterator displayer = getIteratorAt(0);
        for (int i = 0; i < size; i++) {
            if (i < (size - 1)) {
                mylist += (displayer.getCurrentInt() + ", ");
            } else {
                mylist += (displayer.getCurrentInt());
            }
            displayer.step();
        }
        return mylist;
    }
}
