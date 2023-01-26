// Qns : Reverse a sentence
// input: I am Don
// output : Don am I 

public class Csw10_Reverse_Word {
    public static void main(String[] args) {
        String str = "I am Don";
        String[] arr = str.split(" ");
        String ans = " ";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        System.out.println(ans);
    }
}
