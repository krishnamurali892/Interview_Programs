package CricBuzz;

public class TokonizingStringFromSpaceToNewLine {

    public static void main(String[] args){

        // Replace space with new line in a given String except if SubString contained in " "
        String str  = "hi how are u \"hi how r u\" bye bye nd BFJ nkfkasnf fas fjkasf as fjknaskf \"bjgebgjwebj\"bfjk bfkj \"fquwfbiqw\" \"gwehwehw\"";
        System.out.println(tokonizedString(str));
    }

    public static String tokonizedString(String str){
        char[] charArray = str.toCharArray();
        boolean isTokenize = true;
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == '"'){
                isTokenize = !isTokenize;
            }
            if(charArray[i] == ' ' && isTokenize){
                charArray[i] = '\n';
            }
        }
        return new String(charArray);
    }
}
