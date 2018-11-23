/**
 * input: will be String and a int array
 * output: will be a string in which characters will be shifted to next character(i,e if 'a' then 'b' and if 'z' then 'a')
 *         as number of times as array length and each value in array represents numbers of characters need to be shifted from start
 *         i,e for example if [1, 2, 3] then 1 means only first character of string and 2 means first 2 characters of string and so on ...
 * sample input: 
 *         String str = "azc" and array int[] = {1, 2}
 * sample output: 
 *         first array value 1 so shift only first character of "abc" then o/p bzc
 *         second array value 2 so shift first two characters again each by 1 position then o/p cac
 *         third array value 3 so shift first three characters again each by 1 position then o/p dbd
 */

public class StringRolling {

    public static void main(String[] args) {
        String s = "azc";
        int k[] = {1, 2, 3};
        System.out.println(stringRoll(s,k));
    }

    public static String stringRoll(String str, int[] arr) {
       char[] charArr = str.toCharArray();
       int valueZ = 'z';
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[i]; j++){
               int value = charArr[j] + 1;
               if(value > valueZ) {
                   charArr[j] = 'a';
               }else{
                   charArr[j] = (char) value;
               }
           }
       }
       return new String(charArr);
    }
}
