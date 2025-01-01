package collectionsAndGenerics.enums;

//We have restricted the color of the traffic light to red,green and yellow 
public enum TrafficLight {
    // RED, GREEN, YELLOW;

    // If we want some action associated with any constant eg. in case of red we
    // want action stop then..see example.
    RED("Go");

    private String action;

    TrafficLight(String string) {
        this.action = string;
    }

    String getAction() {
        return action;
    }

}
