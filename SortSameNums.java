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
    newArr[position] = arr[i];

    
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
    for (int i = 0; i < position; i++) {
      newArr[i] = arr[i];
    }

    newArr[position] = num;

    for (int j = position + 1; j < arr.length; j++) {
      newArr[j] = arr[j]; 
    }
    return newArr;
  }


  public static void toString(int[] arr) {
    for (int item: arr) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    int[] intArray = {2, 5, 2, 8, 5, 6, 8, 8};
    sort(intArray);

    toString(insertNewNum(intArray, 3, 100));
    System.out.println();

    int[] uniqIntArr = {1, 2, 3, 4, 5};
    System.out.println(findIndex(uniqIntArr, 2));
    
  }
}
