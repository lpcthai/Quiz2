public class Car implements Vehicle {
    private String color() {
        return "TrafficLightColor";

    }

    @Override
    public String trafficLightColor() {
        return "transition";
    }
}



//    private int duration;
//
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public int getDuration() {
//        return duration;
//    }
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//    public Car(String color, int duration) {
//        this.color = color;
//        this.duration = duration;
//    }
//}
