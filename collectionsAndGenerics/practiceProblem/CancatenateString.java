package collectionsAndGenerics.practiceProblem;

public class CancatenateString {
    public static String stringAddition(String... str) {
        String temp = "";
        for (String it : str) {
            temp += it;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(stringAddition("Aditi ", "Sonkar ", "is ", "a ", "good ", "girl."));
    }
}
