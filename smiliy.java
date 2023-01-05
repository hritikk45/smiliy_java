import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class smiliy extends Applet implements KeyListener
{
 int x=500,y=300;
 public void paint(Graphics g)
 {

  addKeyListener(this);
  
        //face
        g.setColor(Color.yellow);
        g.fillOval(x, y,200,200);
        
        //eyes
        g.setColor(Color.blue);
        
        g.fillOval(x+50, y+50,30,30);
        g.fillOval(x+125, y+50,30,30);
        
       
        
        //mouth
        // g.fillOval(x+40,y+125,120,60);
        //smile
        // g.setColor(Color.red);
        // g.fillRect(x+40,y+150,120,30);
        // g.fillOval(x+40,y+140,120,60);
        g.drawArc(x+90, y+150, 50, 20, 180,180);





 }
 public void keyPressed(KeyEvent ke){

    int KeyCode = ke.getKeyCode();

    switch(KeyCode)
    {
        case KeyEvent.VK_UP:
        if(y>0)
        y=y-1;
        break;
        case KeyEvent.VK_DOWN:
        if(y<getHeight()-200)
        y=y+1;
        break;
        case KeyEvent.VK_LEFT:
        if(x>0)
        x=x-1;
        break;
        case KeyEvent.VK_RIGHT:
        if(x<getWidth()-200)
        x++;
        break;
    }
    repaint();
 }

 public void keyTyped(KeyEvent ke) {} 

 public void keyReleased(KeyEvent ke){}


 

}

/*

<html>
<body>
<applet code="smiliy" width=1200 height=720></applet>
</body>
</html>


*/