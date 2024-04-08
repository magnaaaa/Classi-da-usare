import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private Disegna disegna;
    public boolean premuto; //variabili che indiciano alle altre classi se è stato premuto un determinato tasto

    //costruttore
    public KeyHandler(Disegna disegna) {
        this.disegna = disegna;
    }

    //gestione comandi
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
