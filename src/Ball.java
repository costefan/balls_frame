import java.awt.*;
import java.awt.geom.Ellipse2D;

class Ball {
    public int x, y, dx, dy;
    private static final int XSIZE = 20;
    private static final int YSIZE = 20;

    Ball(int x, int y, int dx, int dy) {
        this.x=x;
        this.y=y;
        this.dx=dx;
        this.dy=dy;
    }
    public int getXsize() {
        return XSIZE;
    }

    public int getYsize() {
        return YSIZE;
    }

    public void draw (Graphics2D g2){
        g2.setColor(Color.blue);
        g2.fill(new Ellipse2D.Double(x, y, XSIZE, YSIZE));
    }
}
