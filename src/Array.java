import java.util.Arrays;
import java.util.*;

class Array<E> {

    private final Object[] arr;
    public final int length;

    // constructor
    public Array(int length)
    {
        // Creates a new Object array of specified length
        arr = new Object[length];
        this.length = length;
    }

    // Function to get Object present at index i in the array
    E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E)arr[i];
        return e;
    }

    // Function to set a value e at index i in the array
    void set(int i, E e) {
        arr[i] = e;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

class Main {
    // Program to create a generic array in Java
    public static void main(String[] args)
    {
        final int length = 5;

        // create an Integer array of given length
        Array<Integer> intArray = new Array(length);

        for (int i = 0; i < length; i++)
            intArray.set(i, i + 1);

        System.out.println(intArray);

        // create a String array of given length
        Array<String> strArray = new Array(length);

        for (int i = 0; i < length; i++)
            strArray.set(i, String.valueOf((char)(i + 65)));

        System.out.println(strArray);
    }
}