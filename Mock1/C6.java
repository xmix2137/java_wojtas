/*(C6.java) Define a class with a “title” attribute of a string type and a “pages” attribute of an integer type.
Apply data encapsulation. Create set and get methods for each attribute.
In the method that modifies the number of book pages,
change the value of the object attribute only when the specified number of book pages is positive. Sample result: */

package Mock1;

public class C6 {

    private String title;
    private int pages;

    public void setTitle(String title){
        this.title = title;
    }

    public void setPages(int pages){
        if (pages>=0){
            this.pages = pages;
        }
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }
}
