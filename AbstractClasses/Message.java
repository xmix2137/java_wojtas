/*8.	An abstract Message class describes an abstract message.
The class contains the text attribute with the message text and accessor and mutator methods for this attribute.
The parameterless constructor allows you to create
a new, empty message, while the overloaded constructor with one parameter allows you to create a new message with the given content.
The class also includes a charNumber() method that returns the number of characters in the message. 
Moreover, the abstract class includes an abstract send() method for sending a message (displays message along with its details). 
Define an abstract class and its attributes and methods. */

package AbstractClasses;

abstract class Message {
    private String text;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }

    Message(){
        this.setText("");
    }

    Message(String text){
        this.setText(text);
    }

    public int charNumber(){
        return this.text.length();
    }

    abstract String send();
}
