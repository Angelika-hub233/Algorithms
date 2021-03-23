package pl.extralessons;


public class LiczbaDoskonala {

    public static void main(String[] args) {

        int iloscLiczb = 0;
        int suma = 0;
        int liczba = 2;

        while (iloscLiczb < 4) {

            for (int i = 1; i < liczba; i++) {
                if (liczba % i == 0)
                    suma += i;
            }
            if (suma == liczba) {
                System.out.println(liczba);
                iloscLiczb++;
            }

            suma = 0;
            liczba++;
        }

    }

}