/*
 *Show the leds
 */
package relojdespertador;

import java.sql.Time;

/**
 * @author Adry
 */
public class Display {
    boolean ledClock,ledAlarm,ledSet;
    public void showLeds(boolean showClock,boolean showAlarm,boolean showSet){
        ledClock=showClock;
        ledAlarm=showAlarm;
        ledSet=showSet;
    }
    /**
     * Show the hour
     * @param tiempo 
     */
    public void showClock(Time tiempo){
        
    }
    /**
     * Show the hour when the alarm start
     * @param alarma 
     */
    public void showAlarm(Time alarma){
        
    }
}
