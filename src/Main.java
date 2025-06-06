import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Label label = new Label("Arthur viado");
        label.setAlignment(Label.CENTER);

        frame.add(label);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}