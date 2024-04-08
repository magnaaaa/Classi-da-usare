import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class Disegna extends JPanel {
    protected Immagine sfondo, img1;
    protected ImmagineBot bot1;
    private JFrame frame;
    protected String testo;
    private int framX, framY;
    private Sound suono;

    //VARIABILI GIOCO 1
    //scrivere qui

    //VARIABILI GIOCO 2
    //scrivere qui

    //VARIABILI GIOCO 3
    //scrivere qui

    //VARIABILI GIOCO 4
    //scrivere qui

    //VARIABILI GIOCO 5
    //scrivere qui

    //VARIABILI GIOCO 6
    //scrivere qui

    //VARIABILI GIOCO 7
    //scrivere qui

//-------------------------------------------------------------------------------------------------------
    //costruttore
    public Disegna(JFrame frame) {
        this.setPreferredSize(new Dimension(0, 0));
        this.frame = frame;
        sfondo = new Immagine("nomeImg.jpg", 0,0, 900, 600, true);
        testo = "NULL";
    }

//-------------------------------------------------------------------------------------------------------

    //modifica testo
    public void setTesto(String testo) {
        this.testo = testo;
        repaint();
    }

//-------------------------------------------------------------------------------------------------------

    public void paint(Graphics g) {
        this.sfondo.disegna(g);

        //settaggio scritta
        g.setColor(Color.BLACK);
        g.setFont(new Font("Verdana", Font.BOLD, 25));
        g.drawString(testo, 0, 0);
    }
}