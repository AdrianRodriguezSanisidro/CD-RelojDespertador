/*
Have the melodi´s methods
 */
package relojdespertador;

/**
 * 
 * @author Adry
 */
public class Altavoz {
    String melodia;
    static boolean ringON;
    /**
     * The melody start
     * @param active
     * @return ringON
     */
    public boolean playSound(boolean active){
        if(active==false){
        return ringON=true;
        }else{
            return ringON=false;
        }
    }
    }
    
