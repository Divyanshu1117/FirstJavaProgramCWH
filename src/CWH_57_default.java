interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning...");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNUmber(int phoneNumber) {
        System.out.println("Calling..." + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class Smart_Phone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Recording...");
    }

//    public void record4KVideo() {
//        System.out.println("Taking Sanp and Recording 4K Video...");
//    }

    public String[] getNetworks() {
        System.out.println("Getting List of networks...");
        String[] networkList = {"Divyanshu", "Lovish", "Pasha"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to..." + network);
    }
}

public class CWH_57_default {
    public static void main(String[] args) {
        Smart_Phone ms = new Smart_Phone();
        ms.record4KVideo();
//        ms.greet(); // Throws an error!:-
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}