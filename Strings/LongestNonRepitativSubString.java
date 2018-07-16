package CricBuzz;

public class LongestNonRepitativSubString {

    public static void main(String[] args) {
        System.out.println("Longest non repetative substring: "+ longestNonRepeatedSubString("abcabcbbbbabcdef"));
    }

    public static String longestNonRepeatedSubString(String str){
        StringBuffer longestSubString = new StringBuffer();
        StringBuffer temp;
        for(int i = 0; i < str.length(); i++){
            temp = new StringBuffer();
            temp.append(str.charAt(i));
            for(int j = i+1; j < str.length(); j++){
                if(!temp.toString().contains(""+str.charAt(j))){
                    temp.append(str.charAt(j));
                }else{
                    break;
                }
            }
            if(temp.length() > longestSubString.length()){
                longestSubString = temp;
            }
        }
        return longestSubString.toString();
    }
}
