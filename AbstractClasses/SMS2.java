
package AbstractClasses;

public class SMS2 extends Message{
    User user;

    SMS2(String text, User user){
        super(text);
        this.user = user;
    }

    void send(){
        System.out.println("Phone number: "+ this.user.phoneNumber);
        System.out.println("Number of characters: "+ this.charNumber());
        System.out.println("Text: "+ this.getText());
    }

    public static void main(String[] args) {
        User user1 = new User("Krzysztof", "Markiewicz", "krzy.mark@gmail.pl", "123456789");
        SMS2 sms1 = new SMS2("Siemanko", user1);
        SMS2 sms2 = new SMS2("Co tam", user1);
        sms1.send();
        System.out.println();
        sms2.send();
    }
}

