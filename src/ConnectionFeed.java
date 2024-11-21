import java.util.ArrayList;

public class ConnectionFeed {
    private Connection connection;
    private ArrayList<TrafficLight > status  =new ArrayList<>();
    public void printStatus(){
        status.forEach(System.out::println);
    }

}
