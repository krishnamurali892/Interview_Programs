public class FindThirdLargest {

    public static void main(String[] args) {
        int[] arr = {4, 9, 20, 12, 1, 0, 120, -10};
        System.out.println("Third Largest: "+ findThirdLargest(arr));
    }


    public static int findThirdLargest(int[] arr) {
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];

        for (int i: arr){
            if(i > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = i;
            }else if(i > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = i;
            }else if(i > thirdLargest){
                thirdLargest = i;
            }
        }
        return thirdLargest;
    }
}
