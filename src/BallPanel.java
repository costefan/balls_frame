import javax.swing.JPanel;
import java.awt.*;
import java.util.*;
import java.util.List;

public class BallPanel extends JPanel{
    private static final int XSIZE = 20;
    private static final int YSIZE = 20;
    int counter = 0;
    public static List<Ball> ballList;

    private static final int BALLSCOUNT=20;

    public BallPanel(){
        ballList = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < this.BALLSCOUNT; i++){
            ballList.add(new Ball(
                    random.nextInt(300),
                    random.nextInt(300),
                    2, 2
                    ));
        }
        this.counter=0;
        this.repaint();
    }


    public void move(){
        for(int i=0; i < ballList.size(); i++) {
            Ball ball = ballList.get(i);
            ball.y+=ball.dy;//*(1000/(c+1));
            ball.x+=ball.dx;//*(1000/(c+1));
            int counterOld = counter;
            if (ball.x<0) {
                ball.x = 0;
                ball.dx = -ball.dx;
                this.counter += 1;
            }
            if(ball.x + ball.getXsize()>=this.getWidth()){
                ball.x = this.getWidth()-ball.getXsize();
                ball.dx = -ball.dx;
                this.counter += 1;
            }
            if(ball.y < 0){
                ball.y=0;
                ball.dy = -ball.dy;
                this.counter += 1;
            }
            if (ball.y+ball.getYsize()>=this.getHeight()) {
                ball.y = this.getHeight() - ball.getYsize();
                ball.dy = -ball.dy;
                this.counter += 1;
            }
            if (counterOld != counter) {
                System.out.print("COUNTER" + counter + " ");
            }
        }

        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0; i<this.ballList.size(); i++){
            Ball ball = ballList.get(i);
            ball.draw(g2);
        }
    }


}