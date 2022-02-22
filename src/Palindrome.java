public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(124));

    }
    public static boolean isPalindrome (int number){
        if(number < 0){
            number *= -1;
        }
        int reverse = 0;
        int initialNum = number;
        do {
           int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;}
        while (number > 0);
        return initialNum == reverse;
    }
}
