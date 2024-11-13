package MyImplementations;

public class MyArrayList<E> implements MyList<E> {
  public static final int INITIAL_CAPACITY = 16;
  @SuppressWarnings("unchecked") private E[] data = (E[]) new Object[INITIAL_CAPACITY];

  private int size = 0; // Number of elements in the list

  /** Create an empty list */
  public MyArrayList() {
  }

  @SuppressWarnings("unchecked")
  public MyArrayList(int capacity) {
    data = (E[]) new Object[capacity];
  }

  /** Create a list from an array of objects */
  public MyArrayList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); // Warning: don’t use super(objects)!
  }

  @Override /** Add a new element at the specified index */
  public void add(int index, E e) {
    // Ensure the index is in the right range
// WRITE YOUR CODE HERE
  }

  /** Create a new larger array, double the current size + 1 */
  private void ensureCapacity() {
// WRITE YOUR CODE HERE
  }

  /** Clear the list */
  @SuppressWarnings("unchecked")
  public void clear() {
// WRITE YOUR CODE HERE
  }

  /** Return true if this list contains the element */
  public boolean contains(Object e) {
// WRITE YOUR CODE HERE
  }

  @Override /** Return the element at the specified index */
  public E get(int index) {
// WRITE YOUR CODE HERE
  }

  // Check whether the index is in the range of 0 to size - 1
  // throw IndexOutOfBoundsException if it is not
  private void checkIndex(int index) {
// WRITE YOUR CODE HERE
  }

  @Override /**
             * Return the index of the first matching element
             * in this list. Return -1 if no match.
             */
  public int indexOf(Object e) {
// WRITE YOUR CODE HERE
  }

  @Override /**
             * Return the index of the last matching element
             * in this list. Return -1 if no match.
             */
  public int lastIndexOf(E e) {
// WRITE YOUR CODE HERE
  }

  @Override /**
             * Remove the element at the specified position
             * in this list. Shift any subsequent elements to the left.
             * Return the element that was removed from the list.
             */
  public E remove(int index) {
    checkIndex(index);
// WRITE YOUR CODE HERE
  }

  @Override /**
             * Replace the element at the specified position
             * in this list with the specified element.
             */
  public E set(int index, E e) {
    checkIndex(index);
    E old = data[index];
    data[index] = e;
    return old;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    for (int i = 0; i < size; i++) {
      result.append(data[i]);
      if (i < size - 1)
        result.append(", ");
    }

    return result.toString() + "]";
  }

  /** Trims the capacity to current size */
  public void trimToSize() {
    if (size != data.length) {
      @SuppressWarnings("unchecked") E[] newData = (E[]) (new Object[size]);
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    } // If size == capacity, no need to trim
  }

  // @Override /** Override iterator() defined in Iterable */
  // public java.util.Iterator<E> iterator() {
  //   return new ArrayListIterator();
  // }

  private class ArrayListIterator
      implements java.util.Iterator<E> {
    private int current = 0; // Current index

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public E next() {
      return data[current++];
    }

    @Override // Remove the element returned by the last next()
    public void remove() {
      if (current == 0) // next() has not been called yet
        throw new IllegalStateException();
      MyArrayList.this.remove(--current);
    }
  }

  /** Return the number of elements in this list */
  public int size() {
    return size;
  }
}