import javax.swing.*;
import java.awt.*;

public class BounceFrame extends JFrame {

    private BallPanel ballPanel1;
    private BallPanel ballPanel2;
    public static final int WIDTH = 450;
    public static final int HEIGHT = 350;

    public BounceFrame() {
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Ball simple program");
        this.setLayout(new GridLayout( 1, 1));

        this.ballPanel1 = new BallPanel();
        this.add(ballPanel1);
    }

    public void simulate(){
        int i=0;
        while(true){
            this.ballPanel1.move();
            try {
                Thread.sleep(i);
            } catch (InterruptedException ex) {
                break;
            }
            System.out.println("i= "+(i++));
        }
    }

}