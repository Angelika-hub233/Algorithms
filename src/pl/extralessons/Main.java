package pl.extralessons;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        int liczba = 11;

        if(czyJestDoskonala(liczba))
            System.out.println("\nLiczba "+liczba+" jest doskonała." );
        else
            System.out.println("\nLiczba "+liczba+" nie jest doskonała." );

        System.out.println("Suma cyfr liczby " + liczba + " wynosi: " + sumaCyfrLiczby(liczba));

        if(czyJestPalindromem(liczba))
            System.out.println("\nLiczba "+liczba+" jest polindromem." );
        else
            System.out.println("\nLiczba "+liczba+" nie jest polindromem." );

        System.out.println("Suma cyfr liczby " + liczba + " wynosi: " + sumaCyfrLiczby(liczba));

        liczbyNarcystyczne(7);
        liczbyPierwsze(7);

    }
    //Metoda sprawdza czy liczba jest doskonała
    public static boolean czyJestDoskonala (int liczba) {
        int suma = 0;
        for (int i = 1; i < liczba; i++) {
            if (liczba%i == 0)
                suma += i;
        }
        return suma == liczba;
    }

    //Metoda sumuje cyfry danej liczby
    public static int sumaCyfrLiczby(int liczba){
        int temp = liczba;
        int iloscCyfr = ileCyfrMaLiczba(liczba);
        int suma = 0;
        for (int i = 0; i < iloscCyfr; i++) {
            suma += temp%10;
            temp/=10;
        }
        return suma;
    }

    //Metoda sprawdza czy dana liczba jest palindromem
    public static boolean czyJestPalindromem(int liczba){
        int iloscCyfr = ileCyfrMaLiczba(liczba);
        int[] tab = new int[iloscCyfr];
        int temp = liczba;
        for (int i = 0; i < iloscCyfr; i++) {
            tab[i] = temp%10;
            temp/=10;
        }
        for (int i = 0; i < tab.length/2; i++) {
            if(tab[i] != tab[tab.length -1 - i])
                return false;
        }
        return true;
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
        System.out.println("\nLiczby pierwsze:");
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


