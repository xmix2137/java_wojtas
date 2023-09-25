//14.	Define a class for describing books. 
//Then, define fields and methods in the class that represent the attributes and behaviors of the book objects.
// Finally, create two books, assign them attribute values, and call defined methods.

package ClassesAndObjects;

public class Books {
    String Author = "Mark Twain";
    String Title = "Tajemniczy Przybysz";
    int Pages = 123;
    String Wydawnictwo = "Czarna perła";
    boolean Przeczytana = false;
    int PageNow = 0;

    public void Czytanie(){
        if (Przeczytana == false){
            Przeczytana = true;
        }
        else {
            Przeczytana = true;
        }
    }
    public void Display(){
        System.out.println("Autor: " + Author);
        System.out.println("Tytuł: " + Title);
        System.out.println("Wydawnictwo: " + Wydawnictwo);
    }
    public void setPage(int x){
        PageNow = x;
    }
    public void showPage(){
        System.out.println(PageNow);
    }
    
    public static void main(String[] args){

        Books Ksiazka1 = new Books();
        Books Ksiazka2 = new Books();

        Ksiazka2.Author = "Adam Mickiewicz";
        Ksiazka2.Pages = 100;
        Ksiazka2.Title = "Dziady";
        Ksiazka2.Wydawnictwo = "Dzika Róża";

        Ksiazka1.Display();
        Ksiazka2.Display();
        Ksiazka1.setPage(69);
        Ksiazka1.showPage();


    }
}
