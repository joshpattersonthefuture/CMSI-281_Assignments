//File: HighArray.java
//Author: Joshua Patterson 
//Date: 9/17/18
//Purpose: array insertion, deletion, and location operations
//Enjoy
public class HighArray
{
    private long[] a;
    private int nElems;
    public HighArray(int max)
    {
        a = new long[max];
        nElems = 0;
    }
//*********************************************************** Added Method noDups()
    public void noDups() {
       for (int dup=nElems-1; dup>= 1; dup--) {
          for (int j=dup-1; j>=0; j--) {
              if (a[dup] == a[j]) {
                  delete(a[j]);
              }
          }
       }
    }
//***********************************************************
    public boolean find(long searchKey) {
        int j;
        for(j=0; j<nElems; j++) {
            if(a[j] == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        }
        else {
            return true;
        }
    }
//***********************************************************
    public void insert(long value)  {
        a[nElems] = value;
        nElems++;
    }
//***********************************************************
    public boolean delete(long value) {
        int j;
        for(j=0; j<nElems; j++) {
            if( value == a[j] ) {
                break;
            }
        }
        if(j==nElems) {
            return false;
        }
        else {
            for(int k=j; k<nElems; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }
//*********************************************************** Added Method getMax()
    public long getMax() {
        long max = 0;
        if(nElems != 0) {
            for(int i = 0; i < nElems; i++) {
                if(a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
        else {
            return -1;
        }
    }
//***********************************************************
    public void display()  {
        for(int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
}
