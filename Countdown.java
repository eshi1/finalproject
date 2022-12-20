import java.util.Timer;
import java.util.TimerTask;
public class Countdown{
    public static int count;
    public static int counter = 50;
    public static int CountDown(){
        //Credit for the timer goes to @BroCode (https://www.youtube.com/watch?v=QEF62Fm81h4&ab_channel=BroCode)
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            
            @Override
            public void run() {
                if (count == 0){
                    timer.cancel();
                    return;
                }
                else if (counter>=0){
                    //System.out.print(counter+"  ");
                    counter = counter-1;
                }
            }
        };
        if (count == 1){
            timer.scheduleAtFixedRate(task, 0, 1000);
        }
        else{
            timer.cancel();
        }
        return counter;
    }
}