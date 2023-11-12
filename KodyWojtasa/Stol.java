/*2.Zaprojektuj klasę dla obiektu stół. Zdefiniuj sześć cech i pięć zachowań. Utwórzy trzy obiekty stołów o róznych cechach */

package KodyWojtasa;

public class Stol {

    boolean poskladany = false;
    String kolor;
    int iloscNog;
    boolean zapakowany = true;
    String material;
    String marka;

    public Stol(String kolor, int iloscNog, String material, String marka){
        this.kolor = kolor;
        this.iloscNog = iloscNog;
        this.material = material;
        this.marka = marka;
    }

    public void poskladaj(){
        this.poskladany = true;
    }

    public void rozloz(){
        this.poskladany = false;
    }

    public void pokoloruj(String kolor){
        this.kolor = kolor;
    }

    public void rozpakuj(){
        this.zapakowany = false;
    }

    public void spakuj(){
        this.zapakowany = true;
    }

    public void info(){
        System.out.println("kolor: " + this.kolor);
        System.out.println("ilosc nog: " + this.iloscNog);
        System.out.println("material: "+ this.material);
        System.out.println("marka: "+ this.marka);
        System.out.println("zapakowany: "+ this.zapakowany);
        System.out.println("poskladany: "+ this.poskladany);
    }

    public static void main(String[] args){
        Stol janek = new Stol("Czarny", 4, "Drewno", "Stolex");
        Stol marek = new Stol("Brazawy", 5, "Plastik", "Kapa");
        Stol wojtek = new Stol("Niebieski", 3, "Metal", "Debix");
        janek.info();
        marek.info();
        wojtek.info();
    }


    
}
