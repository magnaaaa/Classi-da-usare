import javax.swing.*;
import java.awt.*;

public class ImmagineBot extends Immagine implements Runnable{
    private Disegna palestra;
    private int velocità;
    private Thread t;

    public ImmagineBot(String nomeImg, int x, int y, int lunghezza, int altezza, boolean visible, Disegna palestra, int velocità) {
        super(nomeImg, x, y, lunghezza, altezza, visible);
        this.palestra = palestra;
        this.velocità = velocità;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {

        }
        catch (InterruptedException e) {
        }
    }
}