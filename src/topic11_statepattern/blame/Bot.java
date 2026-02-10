package topic11_statepattern.blame;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Bot {

    public static void main(String[] args) {
        try{
            Robot clickBot = new Robot();
            clickBot.delay(1000);
            // Thread.sleep(1000);

            int clicks = 6000;
            System.out.println("clicking");

            for (int i = 0; i < clicks; i++) {
                clickBot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                // Thread.sleep(20);
                clickBot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                // clickBot.delay(100);
                Thread.sleep(20);
            }

            System.out.println("done clicking");
        }catch(Exception Ex){
            System.out.println("fuck");
        }
    }

}
