class SortUniqueNums {

  
  public static int[] sortAcsending(int[] arr) {
    int temp;

    // i index start at index 1 for comparison
    for (int i = 1; i < arr.length; i++) {
      
      // j index does not need to go back to 0 index
      for (int j = i - 1; j < arr.length; j++) {

        // switch values
        if (arr[j] > arr[i]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    return arr;
  }

  public static int[] sortDescending(int[] arr) {
    int temp;
    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] < arr[i]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    return arr;
  }


  public static void toString(int[] arr) {

    for (int item: arr) {
      System.out.println(item);
   }
  }

  public static void main(String[] args) {
    int[] intArray = {3, 1, 5, 7, 10, 8};

    toString(sortAcsending(intArray));
    toString(sortDescending(intArray));
  }
}