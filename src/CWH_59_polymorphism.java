interface My_Camera {
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

interface My_Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class My_CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling..." + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class My_Smart_Phone extends My_CellPhone implements My_Camera, My_Wifi {
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

    public void sampleMeth() {
        System.out.println("Meth...");
    }
}

public class CWH_59_polymorphism {
    public static void main(String[] args) {
        My_Camera cam = new My_Smart_Phone(); // This is a smartphone, but use it as a camera:-
//        Reference:-
//          cam.getNetworks(); // Not Allowed:-
        cam.recordVideo();
        cam.record4KVideo();
//        cam.sampleMeth(); // Not Allowed:-

        My_Smart_Phone s = new My_Smart_Phone();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(34);
    }
}