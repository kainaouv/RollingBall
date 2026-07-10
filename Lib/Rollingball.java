package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel import JFrame{
    int x = 100;
    int s = 0;
    public RollingBall(){
        Timer t = new Timer(50,this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, 90, 80,80);
        g.fillArc(x, 90, 80 , 80, s, 180);
    }
    @override
    public void actionPerformed(ActionEvent e){
        s += 2;
        x -= 2;
        if(x,-80) x = getWidth();
        if(s>=360) s = 0;
        repaint();
    }
}
