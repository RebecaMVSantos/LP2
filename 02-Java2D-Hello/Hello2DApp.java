import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
	 //inseri a modificação da cor da tela de fundo
        this.getContentPane().setBackground(Color.RED);    
        this.setVisible(true);
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
	    //quadrado preto
	    g2d.fillRect(350, 350, 400, 400);
	    // circulo branco
	    g2d.setColor(Color.white);
	    g2d.fillOval(370, 370, 360, 360);

    }
}
