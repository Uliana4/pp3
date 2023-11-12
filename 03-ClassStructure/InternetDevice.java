public class InternetDevice {
    private String name;
    private boolean connected;
    private static int connectedDevices = 0;

    public InternetDevice(String name) {
        this.name = name;
    }
    
    public void connect(){
        if (connected != true){
            connected = true;
            connectedDevices++;
            System.out.println(name + " [the device has been connected]");
        }
    } 

    public void disconnect(){
        if (connected != false){
            connected = false;
            connectedDevices--;
            System.out.println(name+ " [the device has been disconnected]");
        }
    } 

    public boolean isConnected(boolean connected){
        return connected;
    }

    public void displayStatus(){
        System.out.println(" "+ name + " is" + (connected ? " connected" : " disconnected") + " to the internet");
    }

    public static void displayConnections(){
        System.out.println("Currently there are " + connectedDevices + " connected devices");
    }

    public static void main(String[] args){
        InternetDevice device1 = new InternetDevice("Personal Computer");
        InternetDevice device2 = new InternetDevice("Tablet");
        InternetDevice device3 = new InternetDevice("Smartphone");

        InternetDevice device4 = new InternetDevice("Internet Radio");
        InternetDevice device5 = new InternetDevice("Smart TV");

        device1.connect();
        device2.connect();
        device3.connect();

        device1.displayStatus();
        device2.displayStatus();
        device3.displayStatus();
        device4.displayStatus();
        device5.displayStatus();

        InternetDevice.displayConnections();
    } 
}
