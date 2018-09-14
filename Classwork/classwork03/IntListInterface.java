/*
Author: BJ Johnson
Date: 9/13/18
Purpose: implementing lists
*/
public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
}
