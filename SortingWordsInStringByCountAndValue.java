import java.util.Comparator;
import java.util.TreeSet;

public class SortingWordsInStringByCountAndValue {

    public static void main(String[] args){
        // program which prints
        // condition 1: words with length small to large
        // condition 2: if same length then compare there value like aa ab ae ba bb be
        // condition 3: Allow duplicates too
        String  str = "hi ab ab abb ae aa ba bb ee cc aaa bye how howww how are u";
        String[] strArr = str.split(" ");
        TreeSet<String> treeSet = new TreeSet<String>(new MyCompator());
        for(int i = 0; i < strArr.length; i++){
            treeSet.add(strArr[i]);
        }
        System.out.println(treeSet);
    }
}

class MyCompator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() > s2.length()){
            return 1;
        }else if(s1.length() < s2.length()){
            return -1;
        }else {
            // Which blocks duplicates
//            return s1.compareTo(s2);
            // which allows duplicates too
            if(s1.equals(s2)){
                return -1;
            }else {
                return s1.compareTo(s2);
            }
        }
    }
}
