/*
 *Show the leds
 */
package relojdespertador;

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
}
