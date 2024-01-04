
package AbstractClasses;

public class Email2 extends Message{
    User user;

    void send(){
        System.out.println("Message subject: " + this.user.firstName);
        System.out.println("Recipient's address: " + this.user.email);
        System.out.println("Text: "+this.getText());
    }

    Email2(String text, String firstName, String lastName, String email, String phoneNumber){
        super(text);
        this.user = new User(firstName, lastName, email, phoneNumber);
    }

    public static void main(String[] args) {
        Email2 email1 = new Email2("Nie pozdrawiam", "Krzysztof", "Markiewicz", "krzy.mark@gmail.pl", "123456789");
        Email2 email2 = new Email2("Wal sie", "Krzysztof", "Markiewicz", "krzy.mark@gmail.pl", "123456789");

        email1.send();
        System.out.println();
        email2.send();
    }
}

