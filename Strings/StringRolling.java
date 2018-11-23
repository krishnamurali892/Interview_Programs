public class StringRolling {

    public static void main(String[] args) {
        String s = "abc";
        int k[] = {3, 1, 2};
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
