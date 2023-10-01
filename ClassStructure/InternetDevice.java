/*16.	There are many devices that can use the Internet: 
a personal computer, laptop, tablet, smartphone, internet radio or TV. 
Define an InternetDevice class to describe such devices. 
The class should contain attributes: name (device name), connected (whether a device is connected to the Internet), 
and connectedDevices (the number of connected devices - static field). Add a constructor InternetDevice(name) 
and methods for device manipulation: connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (static method).
 Then write a program that creates five different internet devices, three of which are connected to the Internet.
  Display the status of each device and information about the number of devices connected to the Internet. */

package ClassStructure;

public class InternetDevice {
    String name;
    boolean connected = false;
    static int connectedDevices;

    public InternetDevice(String nameC){
        name = nameC;
    }

    public void connect(){
        connected = true;
        connectedDevices++;
    }

    public void disconnect(){
        connected = false;
        connectedDevices --;
    }

    public void isConnected(){      
        if (connected == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
    public void displayStatus(){
        System.out.println("Nazwa: " + name);
        System.out.println("Połączony : " + connected);
    }
    static void displayConnections(){
        System.out.println("Liczba połączonych urządzeń: "+ connectedDevices);
    }

    public static void main(String[] args){
        InternetDevice telewizor = new InternetDevice("Telewizor");
        InternetDevice telefon = new InternetDevice("Telefon");
        InternetDevice drukarka = new InternetDevice("Srukarka");
        InternetDevice skaner = new InternetDevice("Skaner");
        InternetDevice tablet = new InternetDevice("Tablet");
        InternetDevice.displayConnections();
        telewizor.connect();
        InternetDevice.displayConnections();
        telefon.connect();
        InternetDevice.displayConnections();
        drukarka.connect();
        InternetDevice.displayConnections();
        telewizor.displayStatus();
        telefon.displayStatus();
        drukarka.displayStatus();
        skaner.displayStatus();
        tablet.displayStatus();
        tablet.connect();
        InternetDevice.displayConnections();
        tablet.disconnect();
        InternetDevice.displayConnections();

    }

}
