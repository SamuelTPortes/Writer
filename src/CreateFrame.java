import java.awt.*;
import java.awt.image.BufferedImage;

public class CreateFrame {
    Frame f1;
    public CreateFrame(){
        f1 = new Frame("Bem vindo au seu primeiro frame");
        f1.setLayout(new GridLayout(2,1));
        f1.setSize(500,400);
        BufferedImage teste = new BufferedImage(500,500, 2);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        CreateFrame f2 = new CreateFrame();

    }
}