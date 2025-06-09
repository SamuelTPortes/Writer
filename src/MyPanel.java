import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel {

    private int mouseX = 0;
    private int mouseY = 0;
    private int keyD = 0;
    public MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {}
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                repaint();
            }
        });
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_A:
                        keyD-=1;
                        System.out.println("Apertou A");
                        repaint();
                        break;
                    case KeyEvent.VK_D:
                    case KeyEvent.VK_RIGHT:
                        keyD+=1;
                        System.out.println("Movendo para direita");
                        repaint();
                        break;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(250,250,mouseX,mouseY);
        g2D.drawRect(keyD, 250, 30,30);

    }
}
