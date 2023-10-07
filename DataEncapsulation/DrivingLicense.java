/*8.	Find an image of a driving license on the Internet. Take a look at what information the driving license contains.
 Then define the DrivingLicense class, containing the following attributes: driver's name and surname, address, postal code,
  city, driving license number, year of issue and driving license category. Use private access modifiers when declaring attributes.
   Then create a driving license and try to assign values to the attributes. What message are you getting? After that,
    change the access modifiers from private to public and try to assign values once again. 
    
8.	v9.	Complete the DrivingLicense class. Define a method that displays the driving license 
(all data contained on the driving license). 
Try to display the data in an attractive form. What access modifier will you apply to the defined method?

10.	Apply the private access modifier to all attributes of the DriverLicense class. 
Then create the get and set methods for each of the attributes. 
After that, modify the program and the method displaying the driving license. Replace attributes names with get and set methods.

11.	Add a toString() method in the DrivingLicense class to return driving license information.
 Use getter methods to get the driving license data. Then check the method in action.
 
 1.	In the DrivingLicense class, modify the setter method for the year of issue attribute.
  The valid value of the attribute should be greater than or equal to 1980 and less than or equal to the current year.
   If the given value is different, do not change the attribute.
   
13.	Modify the setName() method in the DrivingLicense. Regardless of the given name value, 
the value of the attribute should begin with a capital letter. Replace the remaining letters with lowercase.
 Then check the method in action. Tip. Use the methods available in the String class.*/


package DataEncapsulation;

public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String number;
    private int yearOfIssue;
    private String category;

    DrivingLicense(String name, String surname, String address, String postalCode, String city, String number, int yearOfIssue, String category){
        this.setName(name);
        this.setSurname(surname);
        this.setAddress(address);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setNumber(number);
        this.setYearOfIssue(yearOfIssue);
        this.setCategory(category);
    }

    public void displayLicense(){
        System.out.println("Name: " + this.getName() +" "+ this.getSurname());
        System.out.println("Address: " + this.getAddress() + ", " + this.getPostalCode() + ", "+this.getCity());
        System.out.println("Data: "+this.getNumber()+", "+ this.getYearOfIssue()+", "+this.getCategory());
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getAddress(){
        return this.address;
    }

    public String getPostalCode(){
        return this.postalCode;
    }

    public String getCity(){
        return this.city;
    }

    public String getNumber(){
        return this.number;
    }

    public int getYearOfIssue(){
        return this.yearOfIssue;
    }

    public String getCategory(){
        return this.category;
    }

    public void setName(String name){
        String name1 = name.substring(0,1).toUpperCase();
        String name2 = name.substring(1).toLowerCase();
        String name3 = name1 + name2;
        this.name = name3;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(String city){
        this.city = city;
    }

     public void setNumber(String number){
        this.number = number;
    }

    public void setYearOfIssue(int yearOfIssue){
        if(yearOfIssue>1980 && yearOfIssue<=2023){
            this.yearOfIssue = yearOfIssue;
        }
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String toString(){
        return "Name: " + this.getName() +" "+ this.getSurname() + "\n" + "Address: " + this.getAddress() + ", " + this.getPostalCode() + ", "+this.getCity() + "\n" + "Data: "+this.getNumber()+", "+ this.getYearOfIssue()+", "+this.getCategory();
    }
    public static void main(String[] args){
        DrivingLicense licencja1 = new DrivingLicense("krzysztof", "Lichota", "Mieszczańska 20", "45-800", "Kraków", "1233698", 2023, "B");
        //licencja1.displayLicense();
        System.out.println(licencja1.toString());
    }
    
}
