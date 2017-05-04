/*
Have all input methods
 */
package relojdespertador;

import static relojdespertador.Altavoz.ringON;

/**
 *
 * @author Adry
 */
public class Botonera {
    boolean alarmActive,setHr,setAlarm;
    /**
     * Active the alarm
     * @return alarmActive=true
     */
    public boolean alarmON(){
        return alarmActive=true;
    }
    /**
     * Desactive the alarm
     * @return alarmActive=false
     */
    public boolean alarmOFF(){
        return alarmActive=false;
    }
    /**
     * Put the mode to change the hour
     * @return setHr=true
     */
    public boolean configHr(){
        return setHr=true;
    }
    /**
     * Put the mode to change the alarm´s hour
     * @return setAlarm=true
     */
    public boolean configAlarm(){
        return setAlarm=true;
    }
    /**
     * Sume 1 hour
     */
    public void plusHr(){
    /**
     * Sume 1 minute
     */    
    }
    public void plusMin(){
        
    }
    public boolean stopAlarm(){
        return ringON=false;
    }
}
