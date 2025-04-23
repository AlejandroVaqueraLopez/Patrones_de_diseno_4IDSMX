import java.util.ArrayList;
import java.util.List;
public class PoliceC implements Police {
    private List<Transit>  transitList = new ArrayList<>();

    public void registerTransit(Transit transit){
        transitList.add(transit);
    }
    @Override
    public void sendMsg(String message, Transit sender) {
        for(Transit t : transitList){
            if(t != sender){
                t.getMsg("\nTransit message " + sender.getName() + ": " + message);
            }
        }
    }
}
