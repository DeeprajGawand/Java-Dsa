//package Programming;
//
//import java.util.Locale;
//
//public class Programs {
//    public static void main(String[] args) {
//         String input = "ABCD";
//         String reversed = " ";
//
//         for(int i = input.length()-1 ; i>=0 ; i--){
//             reversed = reversed+ input.charAt(i);
//         }
//        System.out.println(reversed);
//
//
//        // reversed a number
//         int num = 1234;
//         int revNum =0;
//
//         while (num != 0){
//             int digit = num % 10;
//             revNum = revNum *10 + digit;
//             num = num/10;
//         }
//        System.out.println(revNum);
//
//         //number is palindrome or not
//
//        int number = 123321;
//        int originalNum = number;
//        int revesedNum = 0;
//
//        while(number != 0){
//            int digit = number %10;
//            revesedNum = revesedNum*10 + digit;
//            number = number /10;
//        }
//        if (originalNum != revesedNum){
//            System.out.println("given number is not plaindrome");
//        }else {
//            System.out.println("no is palindrome");
//        }
//
//      //write a program id string is palindrome or not
//
//        String str = "Madam";
//        str =  str.toLowerCase();
//        int left =0;
//        int right = str.length()-1;
//
//        boolean isPlainDrome = true ;
//        while (left<right){
//            if (str.charAt(left)!=str.charAt(right)){
//                isPlainDrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if(isPlainDrome){
//            System.out.println("string plaindrome");
//        }else {
//            System.out.println("not plaindrom");
//        }
//
//        // write a progrma to count number of digits
//
//        int numb = 1234;
//        int count = 0;
//
//        while(numb != 0){
//            numb = numb/10;
//            count++;
//        }
//        System.out.println(count);
//
//
//        // number are even are odd
//
//        int num;
//    }
//}
