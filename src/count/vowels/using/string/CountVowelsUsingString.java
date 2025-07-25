package count.vowels.using.string;
//Count Vowels from sentence in lower case letter 
/**
 *
 * @author Imran Shihan
 */
public class CountVowelsUsingString {

    public static int countVowels(String sentence) {
        int count = 0;
        sentence = sentence.toLowerCase(); 
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "Hello, Can you count NO of vowels";
        int total = countVowels(sentence);
        System.out.println("Vowels: " + total);
    }

}
