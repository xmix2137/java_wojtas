/*1.Zaprojektuj klasę dla obiektu samochód słuzbowy. Samochód jest identyfikowany po marce, roku produkcji i numerze
rejestracyjnym. Można go zarezerwowac, zwrócić z rezerwacji, oddać do naprawy i zwrócic z naprawy, wyświetlić informacje
 o samochodzie. Utwórz flotę trzech samochodów. Zarezerwuj dwa, a jeden oddaj do naprawy
 */

package KodyWojtasa;

public class Samochod {
    String marka;
    int rokProdukcji;
    String numerRejestracyjny;
    boolean zarezerwowany = false;
    boolean wNaprawie = false;

    public Samochod(String marka, int rokProdukcji, String numerRejestracyjny){
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public void rezerwacja(){
        this.zarezerwowany = true;
    }
    
    public void zwrot(){
        this.zarezerwowany = false;
    }

    public void doNaprawy(){
        this.wNaprawie = true;
    }

    public void zNaprawy(){
        this.wNaprawie = false;
    }

    public void informacje(){
        System.out.print("Marka: "+ this.marka);
        System.out.print(" Rok produkcji: " + this.rokProdukcji);
        System.out.print(" Numer: " + this.numerRejestracyjny);
        if (this.zarezerwowany == true){
            System.out.print(" Zarezerwowany: tak");
        }
        else{
            System.out.print(" Zarezerwowany: nie");
        }
        if (this.wNaprawie == true){
            System.out.print(" W naprawie: tak");
        }
        else{
            System.out.print(" W naprawie: nie");
        }
        System.out.println();
    } 

    public static void main(String[] args){
        Samochod audi = new Samochod("Audi", 2023, "ID10T4");
        Samochod merc = new Samochod("Mercedes", 2020, "CH456");
        Samochod toyota = new Samochod("Toyota", 1998, "SBI123");
        audi.rezerwacja();
        merc.rezerwacja();
        toyota.doNaprawy();
        audi.informacje();
        merc.informacje();
        toyota.informacje();
    }
}
