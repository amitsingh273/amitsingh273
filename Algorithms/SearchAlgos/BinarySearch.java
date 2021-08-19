package Algorithms.SearchAlgos;

public class BinarySearch {

    static int search(int arr[], int searchElement, int left,int mid, int right) {

        if (arr[mid] == searchElement) {
            return mid;
        } else if (arr[mid] < searchElement) {
            if (arr[right] == searchElement)
                return right;
            if (arr[left] == searchElement)
                return left;
            if (right - left < 2)
                return -1;
            left = mid;
            mid = (right + left) / 2;

            return search(arr, searchElement, left, mid, right);
        } else {
            if (arr[right] == searchElement)
                return right;
            if (arr[left] == searchElement)
                return left;
            if (right - left < 2)
                return -1;
            right = mid;
            mid = (right - left) / 2;
            return search(arr, searchElement, left, mid, right);
        }
    }

    public static void main(String[] args){
        int arr[] = {1,4,7,9,56,87};
        int search = 86;
        int search2 = 4;
        int left = 0;
        int right = arr.length-1;
        int mid = arr.length/2;
        int index;
        index = search(arr,search,left,mid,right);
        result(index);
        index = search(arr,search2,left,mid,right);
        result(index);
    }

    static void result(int index){
        if(index==-1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at position: " + index);
    }
}
