package collectionsAndGenerics.enums;

//Enum is the way to restrict the range of the constants.
public class EnumTesting {
    public static void main(String[] args) {

        TrafficLight color = TrafficLight.RED; /*
                                                * by creating reference type of TrafficLight we can use any
                                                * constant defined in the enum trafficlight;
                                                */
        System.out.println(color.getAction());

    }
}
