
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args)
    {
    
   
       TV  tv = new TV ();
        tv.turnOn();
        tv.setChannel(25);
        tv.setVolume(4);

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeUp();

        System.out.println("tv1's channel is " + tv.channel + " and volume level is " + tv.volumeLevel);
        System.out.println("tv2's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
    }
}
    
    
