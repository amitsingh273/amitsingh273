package Algorithms.SearchAlgos;

public class LinearSearch {
    //Complexity logO(n)

    //search function
    static int search(int arr[], int searchElement){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == searchElement){
                System.out.println("Element found at position: " + i);
                return i;
            }
        }
        System.out.println("Element not present in array");
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,4,7,9,56,87};
        int search = 56;
        int search2 = 13;
        search(arr,search);
        search(arr,search2);
    }
}
