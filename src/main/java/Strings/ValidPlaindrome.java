package Strings;

public class ValidPlaindrome {
    public static void main(String[] args) {
String str ="Amama";
str = str.toLowerCase();
String revStr ="";
for(int i = str.length()-1; i>=0 ;i--){
    revStr = revStr+str.charAt(i);
}
        System.out.println(revStr);

if (revStr.equals(str)){
    System.out.println("strinfg is plaindrome");

}
else {
    System.out.println("string is not plaindorme");
}
    }
}
