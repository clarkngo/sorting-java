// Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}

class SortSameNums {

  public static int[] sort(int[] arr) {


    return arr;
  }

  // insert a number from array and move the index of the rest
  public static int[] reinsertNum(int[] arr, int position, int num) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < position; i++) {

    }

    
    return newArr;
  }

  public static int findIndex(int[] arr, int find_num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == find_num) {
        return i;
      }
    }
    return -1;
  }


  // insert additional number
  public static int[] insertNewNum(int[] arr, int position, int num) {

    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < position - 1; i++) {
      newArr[i] = arr[i];
    }


    newArr[position - 1] = num;

    for (int j = position; j < newArr.length; j++) {
      newArr[j] = arr[j - 1]; 
    }
    return newArr;
  }


  public static void toString(int[] arr) {
    // for (int item: arr) {
    //   System.out.println(item);
    // }
    System.out.print("{" + arr[0]);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(", "  +  arr[i]);
    }
    System.out.print("}");
    System.out.println();
  }

  public static void main(String[] args) {
    int[] intArray = {2, 5, 2, 8, 5, 6, 8, 8};

    System.out.println("Original array:");
    toString(intArray);

    System.out.println("Sorted array:");
    sort(intArray);
    toString(intArray);

    System.out.println("Insert 100 at index 3:");
    toString(insertNewNum(intArray, 3, 100));
    System.out.println();

    int[] uniqIntArr = {1, 2, 3, 4, 5};
    System.out.println(findIndex(uniqIntArr, 2));
    
  }
}
