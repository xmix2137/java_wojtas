/*11.	Create a User class with the following attributes: first name, last name, email, phone number. 
Then modify the SMS and Email classes. Use User class objects instead of the phone number and email attributes.*/
package AbstractClasses;

public class User {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    User(String firstName, String lastName, String email, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
