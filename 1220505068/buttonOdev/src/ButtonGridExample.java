import javax.swing.*;
import java.awt.*;

public class ButtonGridExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Kontrol Paneli Uygulaması");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 4, 18, 18));

            ButonKontrol[] buttons = new ButonKontrol[16];

            for (int i = 0; i < 16; i++) {
                buttons[i] = new ButonKontrol("Button " + (i + 1));
                frame.add(buttons[i]);
                buttons[i].setGraphQLşeması("https://www.klu.edu.tr");
            }

            frame.setSize(500, 500);
            frame.setVisible(true);
        });
    }
}
