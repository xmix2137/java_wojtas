/*10.	Using inheritance, define an Email class that derives from the Message class and describes messages sent using email.
The class includes the following attributes: 
message subject and recipient's address. 
The class also includes accessor and mutator methods for class attributes. 
Add a constructor that allows you to create an email with the given subject and content that is sent to the given email address. 
Then create and send two emails. */

package AbstractClasses;

public class Email extends Message{
    private String messageSubject;
    private String recipientsAddres;

    public void setMessageSubject(String messageSubject){
        this.messageSubject = messageSubject;
    }

    public void setRecipientsAddres(String recipientsAddres){
        this.recipientsAddres = recipientsAddres;
    }

    public String getMessageSubject(){
        return this.messageSubject;
    }

    public String getRecipientsAddres(){
        return this.recipientsAddres;
    }

    void send(){
        System.out.println("Message subject: " + getMessageSubject());
        System.out.println("Recipient's address: " + getRecipientsAddres());
        System.out.println("Text: "+this.getText());
    }

    Email(String messageSubject, String recipientsAddres, String text){
        super(text);
        this.setMessageSubject(messageSubject);
        this.setRecipientsAddres(recipientsAddres);
    }

    public static void main(String[] args) {
        Email email1 = new Email("Krzysztof", "marek.mysl@gmail.com", "Nie pozdrawiam");
        Email email2 = new Email("Piotr", "janina.kula@gmail.com", "Wal sie");

        email1.send();
        System.out.println();
        email2.send();
    }
}
