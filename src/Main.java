import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Window;
import java.awt.image.ColorModel;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Label label = new Label("Arthur viado");
        Button button = new Button("Ele é mesmo?");
        frame.setLayout(new FlowLayout());
        BufferedImage imagem = new BufferedImage(500,500,2);

        window.add(imagem);

        label.setAlignment(Label.CENTER);

        frame.add(button);
        frame.add(label);
        frame.setSize(500,500);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicou no Frame na posição: X=" + e.getX() + ", Y=" + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBounds(e.getX() + button.getX(),e.getY()+button.getY(), 100,100);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}