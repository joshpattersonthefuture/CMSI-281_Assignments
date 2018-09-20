//File: HighArrayApp.java
//Author: Joshua Patterson
//Date: 9/17/18
//Purpose: To test the file HighArray.Java
//Compile Using: javac HighArrayApp.java
//Run Using: java HighArrayApp
//Enjoy

public class HighArrayApp {
  public static void main(String[] args) {
    int maxSize = 100;
    HighArray arr;
    arr = new HighArray(maxSize);

System.out.println("Initial Testing.......");
    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);

    arr.display();

    int searchKey = 35;
    if( arr.find(searchKey) ) {
      System.out.println("Found " + searchKey);
    } else {
      System.out.println("Can’t find " + searchKey);
    }

    arr.delete(00);
    arr.delete(55);
    arr.delete(99);

    arr.display();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ getMax tests
  System.out.println("**********************************");
System.out.println("Method : 'getMax()' Testing.......");
    HighArray arr2;
    arr2 = new HighArray(maxSize);

    arr2.insert(200);
    arr2.insert(960);
    arr2.insert(4000);
    arr2.display();
    System.out.println("Max value is:" + arr2.getMax()); //should be 4000
    System.out.println("**********************************");
    arr2.delete(4000);
    arr2.display();
    System.out.println("Max value is:" + arr2.getMax()); //should be 960
    System.out.println("**********************************");
    arr2.insert(-200);
    arr2.insert(-960);
    arr2.insert(-4000);
    arr2.insert(-1);
    arr2.display();
    System.out.println("Max value is:" + arr2.getMax()); //should still be 4000
    System.out.println("**********************************");
    arr2.insert(4001);
    arr2.display();
    System.out.println("Max value is:" + arr2.getMax()); //should be 4001
    System.out.println("**********************************");
    arr2.delete(4001);
    arr2.delete(4000);
    arr2.delete(960);
    arr2.display();
    System.out.println("Max value is:" + arr2.getMax()); //should be 2
    System.out.println("**********************************");
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ noDups tests

System.out.println("Method : 'noDups()' Testing.......");
    HighArray arr3;
    arr3 = new HighArray(maxSize);

    arr3.insert(11);
    arr3.insert(11);
    arr3.insert(20);
    arr3.insert(105);
    arr3.insert(105);
    arr3.insert(5);
    arr3.insert(781);
    arr3.insert(718);
    arr3.insert(86);
    arr3.display();
    arr3.noDups();

    System.out.println("Without Duplicates:");
    arr3.display();
    System.out.println("**********************************");
    HighArray arr4;
    arr4 = new HighArray(maxSize);

    arr4.insert(1);
    arr4.insert(1);
    arr4.insert(1);
    arr4.display();
    arr4.noDups();
    System.out.println("Without Duplicates:");
    arr4.display();
    System.out.println("**********************************");
    HighArray arr5;
    arr5 = new HighArray(maxSize);

    arr5.insert(40);
    arr5.insert(4040);
    arr5.insert(26);
    arr5.insert(511);
    arr5.display();
    arr5.noDups();
    System.out.println("Without Duplicates:");
    arr5.display();
    System.out.println("**********************************");
    arr5.insert(40);
    arr5.insert(4040);
    arr5.display();
    arr5.noDups();
    System.out.println("Without Duplicates:");
    arr5.display();

    System.out.println("**********************************");
    HighArray arr6;
    arr6 = new HighArray(maxSize);

    arr6.insert(16);
    arr6.insert(16);
    arr6.insert(16);
    arr6.insert(100000);
    arr6.display();
    arr6.noDups();
    System.out.println("Without Duplicates:");
    arr6.display();
    System.out.println("**********************************");
  }
}
