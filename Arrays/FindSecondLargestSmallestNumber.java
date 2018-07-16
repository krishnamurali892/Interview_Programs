package CricBuzz;

public class FindSecondLargestSmallestNumber {

    public static void main(String[] args){
        int[] arr = {12, -1, 2, 34, 9, 10, 11, 10,78};
        System.out.println("Second smallest: "+findSecondSmallest(arr));

        int[] arr1 = {12, -1, 2, 34, 9, 10, 11, 10,78};
        System.out.println("Second largest: "+findSecondLargest(arr1));
    }

    public static int findSecondLargest(int[] arr){
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(firstLargest < arr[i]){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(secondLargest < arr[i]){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int findSecondSmallest(int[] arr){
        int firstSmallest = arr[0];
        int secondSmallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(firstSmallest > arr[i]){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }else if(secondSmallest > arr[i]){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
