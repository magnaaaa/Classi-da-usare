import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    //Utilizzo attributi di tipo Clip e URL
    private Clip clip;
    private URL soundURL[] = new URL[30];

//_________________________________________________________________________________________________

    //Istanzio i file audio
    public Sound(){
        soundURL[0] = getClass().getResource("/Soundtrak_base.wav");
        soundURL[1] = getClass().getResource("/DoorOpening.wav");
        soundURL[2] = getClass().getResource("/Key_obtained.wav");
    }

//_________________________________________________________________________________________________

    //Attribuisce il file audio all'attributo Clip, per essere riprodotto
    public void setFile(int i){
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e){

        }
    }

//-------------------------------------------------------------------------------------------------------

    //Riproduce l'attributo clip
    public void play(){
        clip.start();
    }

//-------------------------------------------------------------------------------------------------------

    //Mette in loop l'attributo clip
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

//-------------------------------------------------------------------------------------------------------

    //Stoppa l'attributo clip
    public void stop(){
        clip.stop();
    }
}