import sort.SortDirectory;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int []arr={3,4,5,6,3,1,5,5};
        //SortDirectory.bubbleSort(arr);
        SortDirectory.choosesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
