package collectionsAndGenerics.enums.practice;

import java.util.*;

public enum CountryMap {
    INDIA("Delhi"), PAKISTAN("Karachi"), CHINA("Beijing"), AUSTRALIA("Canberra"), USA("Washington DC");

    private String capital;

    CountryMap(String capital) {
        this.capital = capital;
    }

    private String getCapital() {
        return capital;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the country name: ");
        str = sc.next();
        String newstr = str.toUpperCase();
        System.out.println(newstr);

        // Incomplete

    }
}
