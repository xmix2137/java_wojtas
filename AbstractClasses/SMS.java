/*9.	Using inheritance, define an SMS class that derives from the Message class and describes text messages sent from a mobile phone.
The class contains the phone number attribute to which the text message is sent.
The class constructor allows you to initialize a phone number. 
The class also includes accessor and mutator methods to modify value of the attribute. 
Then create and send two mobile messages.*/

package AbstractClasses;

public class SMS extends Message{
    private String phoneNumber = "";

    SMS(String phoneNumber, String text){
        super(text);
        this.setNumber(phoneNumber);
    }

    public void setNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getNumber(){
        return this.phoneNumber;
    }

    void send(){
        System.out.println("Phone number: "+ this.getNumber());
        System.out.println("Number of characters: "+ this.charNumber());
        System.out.println("Text: "+ this.getText());
    }

    public static void main(String[] args) {
        SMS sms1 = new SMS("123456789", "Dupa dupa dupa");
        SMS sms2 = new SMS("987654321", "Jem zupe");
        sms1.send();
        System.out.println();
        sms2.send();
    }

}
