interface TVRemote_0 {
    void powerOn();

    void powerOff();
}

interface SmartTVRemote_0 extends TVRemote_0 {
    void openNetflix();

    void openYouTube();
}

class TV implements TVRemote_0 {
    public void powerOn() {
        System.out.println("TV is switched ON...");
    }

    public void powerOff() {
        System.out.println("TV is switched OFF...");
    }
}

public class CWH_60_ch11ps_7 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();
        tv.powerOff();
    }
}