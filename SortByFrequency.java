import java.util.Hashtable;
import java.util.Arrays;

// https://www.geeksforgeeks.org/sort-elements-by-frequency/

// Print the elements of an array in the decreasing frequency 
// if 2 numbers have same frequency then print the one which came first.

// Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

// Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
class SortByFrequency {

  // public static int[] Sort (int[] arr) {
  //   int[] newArr = {};
  //   Hashtable<Integer, Integer> numbers
  //   = new Hashtable<Integer, Integer>();

  //   for (int i = 0; i < arr.length; i++) {

  //     // add to hashtable if unique
  //     if (numbers.containsKey(arr[i])) {
  //       numbers.put(arr[i], numbers.get(arr[i]) + 1);
  //     }
  //     else {
  //       numbers.put(arr[i], 1);
  //     }
  //   }
  //   System.out.println(numbers);
  //   return arr;
  // }
  public static int[] addPos(int[] original_array, int position, int num) {
    int[] new_arr = new int[original_array.length];
    for(int i = 0; i < position; i++)
      new_arr[i] = original_array[i];
    new_arr[position] = num;
    for(int i = position + 1; i < original_array.length; i++)
      new_arr[i] = original_array[i - 1];
    return Arrays.toString(new_arr);
  }


  public static void main(String[] args) {
    int[] intArray = {2, 5, 2, 8, 5, 6, 8, 8};
   // SortByFrequency.Sort(arr);
    System.out.println(SortByFrequency.addPos(intArray, 2, 4));
  }
}
