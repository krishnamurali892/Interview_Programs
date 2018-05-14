public class PalindromeStringInteger {
    public static void main(String[] args){
        System.out.println("Is String palindrome: " +isStringPalindrome("malayalam"));
        System.out.println("Is Int palindrome: " +isIntPalindrome(101));
    }


    private static boolean isStringPalindrome(String str){
        for(int i = 0, j  = str.length() -1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    private static boolean isIntPalindrome(int num){
        int temp = num;
        int sum = 0;
        int remainder;
        while(num > 0){
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if(temp == sum){
            return true;
        }else{
            return false;
        }
    }
}
