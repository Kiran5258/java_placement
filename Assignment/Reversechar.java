import java.util.*;
public class Reversechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        Stack<Character> letters = new Stack<>();
        for (char ch : arr) {
            if (Character.isLetter(ch)) {
                letters.push(ch);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = letters.pop();
            }
        }
        System.out.println(new String(arr));
    }
}
