package CricBuzz;

public class MaxDifferenceInArrayWithLowerIndexElements {

    public static void main(String[] args) {
        // sample input [1 2 6 4]
        // sample output 5 (6 - 1)
        maxDifference(new int[]{1, 2, 6, 4});
    }

    public static void maxDifference(int[] arr){
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >=0; j--){
                if((arr[i] - arr[j]) > maxDiff){
                    maxDiff = arr[i] - arr[j];
                }
            }
        }
        System.out.println("Max diff: "+ maxDiff);
    }
}
