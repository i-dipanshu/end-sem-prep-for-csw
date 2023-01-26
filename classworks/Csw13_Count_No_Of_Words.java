// Qns: Count the number of words present in a sentence

public class Csw13_Count_No_Of_Words {
    public static void main(String[] args) {
        String str = "Count the number of words present in a sentence";

        // split the str on spaces and store it in a array
        String[] arr = str.split(" ");

        // size of array = no. of words
        System.out.println(arr.length);
    }
}
