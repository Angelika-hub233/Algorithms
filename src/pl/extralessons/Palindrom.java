package pl.extralessons;


class Palindrom {
    public static void main(String[] args){

        int liczba = 543;
        if(czyJestPalindromem(liczba))
            System.out.println("Liczba "+ liczba +" jest polindromem." );
        else
            System.out.println("Liczba "+ liczba +" nie jest polindromem." );
    }
    //Metoda sprawdza czy dana liczba jest palindromem
    public static boolean czyJestPalindromem(int liczba){
        int ostatniaCyfra;
        int suma = 0;

        int temp = liczba;
        while(liczba > 0){
            ostatniaCyfra = liczba %10;
            suma = (suma * 10) + ostatniaCyfra;
            liczba = liczba/10;
        }
        return temp == suma;
    }
}
