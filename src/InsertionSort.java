public class InsertionSort {

    public static void sort(int arr[]){
        for ( int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //finding the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;

        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {75,97,34,23,12};
        System.out.println("---------");
        sort(arr);
        printArr(arr);
    }
}
