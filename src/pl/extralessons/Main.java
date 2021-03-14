package pl.extralessons;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        liczbyPierwsze(7);
        liczbyNarcystyczne(7);
    }
    //Metoda sprawdza ile cyfr ma liczba
    public static int ileCyfrMaLiczba(int liczba){
        int ileCyfr =0;
        while (liczba > 0){
            liczba /= 10;
            ileCyfr++;
        }
        return ileCyfr;
    }
    //Metoda wyświetlająca podaną ilość liczb narcystycznych
    public static void liczbyNarcystyczne(int iloscLiczb){
        System.out.println("Liczby narcystyczne:");
        int liczbaLiczbNarcystycznych =0;
        int liczbaSprawdzana = 10;
        while (liczbaLiczbNarcystycznych < iloscLiczb){

            int temp = liczbaSprawdzana;
            int ile = ileCyfrMaLiczba(liczbaSprawdzana);
            int suma = 0;
            while (temp > 0){
                suma += pow((int)(temp%10),ile);
                temp/=10;
            }
            if (suma == liczbaSprawdzana){
                liczbaLiczbNarcystycznych++;
                System.out.print(liczbaSprawdzana + " ");
            }
            liczbaSprawdzana++;
        }
    }

    //Metoda wyświetlająca podaną ilość liczb pierwszych
    public static void liczbyPierwsze(int iloscLiczb){
        System.out.println("Liczby pierwsze:");
        int liczbaSprawdzana = 1;
        int liczbaLiczbPierwszych = 0;
        while(liczbaLiczbPierwszych < iloscLiczb ){
            int iloscDzielnikow = 0;
            for (int i = 1; i < liczbaSprawdzana; i++) { //zaczynam od 1, bo przez 0 nie dzielimy
                if (liczbaSprawdzana % i == 0)
                    iloscDzielnikow++;
            }
            if (iloscDzielnikow == 2) {
                System.out.print(liczbaSprawdzana +" ");
                liczbaLiczbPierwszych++;
            }
            liczbaSprawdzana++;
        }
    }
}


