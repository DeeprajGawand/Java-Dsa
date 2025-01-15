package StringCommon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        removeSpace();
//        countWords();
//        reversedEachWord();
//        removeJunkorSpecial();
//        removeOutermostParenthesis();
//        largestOddNumber();
//        rotateStrings();
//        validAnargram();
//        nestingDepth();
//        reverseString();
        findDuplicateChars();
    }

    public static void removeSpace(){
        String str = "Follow code yatra";

        String noWhitSpace = str.replace(" ", "");
        System.out.println(noWhitSpace);

       StringBuilder nospace = new StringBuilder();
//       for(int i =0;i<str.length(); i++){
//           char combine = str.charAt(i);
//           if (combine !=' '){
//               nospace.append(combine);
//           }
//       }
        for(int i=0;i<str.length();i++){
            char combine=str.charAt(i);
            if(combine !=' '){
                nospace.append(combine);
            }
        }
        System.out.println(nospace);

    }

    public static void countWords(){
        String str = "Follow code yatra and deepraj";

        String [] word = str.split(" ");
        int words = word.length;
        System.out.println(words);
 // next solution
        int wordCount = 0;
        boolean isWord = false;

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!= ' ' && !isWord){
                wordCount++;
                isWord =true;
            }else if (ch == ' '){
                isWord =false;
            }
        }
        System.out.println(wordCount);

    }

    public static void reversedEachWord(){
        String str = "Follow code yatra";

      String [] str1= str.split(" ");
      for(int i =0;i<str.length(); i++){
          StringBuilder revWord = new StringBuilder();
          revWord.reverse();
      }
    }

    public static void removeJunkorSpecial(){
        String str ="!@#5 Follow code yatra";
        StringBuilder noJunk = new StringBuilder();

        for(char c : str.toCharArray()){
            if(Character.isLetter(c) || Character.isSpaceChar(c)){
                noJunk.append(c);
            }

        }
        System.out.println(noJunk);
    }

    public static void removeOutermostParenthesis(){
        String s = "(()())(())";
        StringBuilder sb = new StringBuilder();
        int balance =0 ;
        for (char c:s.toCharArray()){
            if (c=='('){
              if (balance>0){
                  sb.append(c);
              }balance++;
            } else if (c==')') {
                balance--;
                if (balance > 0){
                    sb.append(c);

                }

            }
        }
        System.out.println(sb.toString());

    }

    //largest odd number in string
    public static void largestOddNumber(){
        String s = "420128";
        for (int i = s.length()-1;i>0;i--){
            char c= s.charAt(i);
            if ((c-'0')%2!=0){
                System.out.println(s.substring(0,i+1));
                return;
            }
        }
        System.out.println("no odd number ");
    }
    //Rotate Strings
    public static void rotateStrings(){
        String s = "abcde";
        String goal = "cdeab";

        if(s.length()!=goal.length()){
            System.out.println("cant rotate");
            return;
        }
        String concatenated = s+s;
        if(concatenated.contains(goal)){
            System.out.println("can rotate");
        }
    }
    public static void validAnargram(){
        String s = "listen";
        String t = "silent";

        if(s.length() != t.length()){
            System.out.println("no anargram");
            return;
        }

        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if(Arrays.equals(sArray,tArray)){
            System.out.println("valid anargram");
        }else{
            System.out.println("not valid anargram");
        }

    }
    public static void nestingDepth(){
        String s = "(1)+((2))+(((3)))";
        int count = 0;
        int maxCount = 0;
        for (char c : s.toCharArray()){
            if (c=='('){
                count++;
                if (maxCount<count){
                    maxCount =count;
                }
            }else if (c==')'){
                count--;

            }
        }
        System.out.println("Maximum Nesting Depth: " + maxCount);

    }

    public static void reverseString(){
        String s = "madam";
        s=s.toLowerCase();
        String reversed ="";
        for (int i = s.length()-1; i>=0;i--){
            reversed = reversed +s.charAt(i);
        }

        System.out.println(reversed);
        if (s.equals(reversed)){
            System.out.println("string is palindrome");
        }

    }

    public static void findDuplicateChars(){
        String s = "Deepraj Gawand";
        Map<Character, Integer> map = new HashMap<>();
        char [] c = s.toCharArray();
        for(char ch : c){
            if (Character.isAlphabetic(ch)) {

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
    }


}
