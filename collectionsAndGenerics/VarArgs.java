package collectionsAndGenerics;

public class VarArgs {
    public static String functionOfVariablArguments(String... str) {
        String a = "";
        for (String ptr : str) {
            a += ptr;
        }
        return a;
    }
}
