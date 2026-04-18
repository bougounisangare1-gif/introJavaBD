import java.applet.Applet;
import java.awt.*;
public class FirstApplet extends Applet {

            public void init() {
                add(new Label("Nom:"));
                add(new TextField(12));
                add(new List());
                add(new Button("OK"));
            }

            public void paint(Graphics g) {
                g.drawRect(2, 2, 400, 300);
                g.drawRect(2, 2, 400, 300);

            }
        }