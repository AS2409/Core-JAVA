package collectionsAndGenerics.enums.practice;

public enum Day {
    MONDAY("MONDAY", " Not a week day"), TUESDAY("TUESDAY", " Not a week day"),
    WEDNESDAY("WEDNESDAY", " Not a week day"), THURSDAY("THURSDAY", " Not a week day"),
    FRIDAY("FRIDAY", " Not a week day"), SATURDAY("SATURDAY", " It is a weekend"), SUNDAY("SUNDAY", " It is a weekend");

    private String dayName;
    private String weekend;

    Day(String dayName, String weekend) {
        this.dayName = dayName;
        this.weekend = weekend;
    }

    String getDayName() {
        return this.dayName + this.weekend;
    }

    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        System.out.println(day.getDayName());
    }
}
