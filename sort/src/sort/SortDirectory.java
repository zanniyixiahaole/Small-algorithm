package sort;

public class SortDirectory {
    public static void bubbleSort(int[] arr) {
    /*判断数组为空或为一个元素的情况，即边界检查*/
    if (arr == null || arr.length < 2) {
        return;
    }
    /*规定每次两两比较的末尾元素的位置，最多为数组的最后一个位置*/
    for (int end = arr.length - 1; end > 0; end--) {
			/*从第一个元素开始，两两进行比较，如果前面的元素大于后面的
			  元素，就交换，最终的结果就是最大的数在最后面
			*/
        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }
}
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void choosesort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        for (int i=0;i < arr.length-1;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
}



