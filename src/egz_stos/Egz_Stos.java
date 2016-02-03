package egz_stos;
/*
 Klasa powinna zawierać metody:
 * konstruktor tworzący pusty stos. 
 * NaStos(łańcuch) - wstawia łańcuch na stos
 * ZeStosu() - zwraca łańcuch i usuwa go ze stosu
 * Konsertuj() - łańcuch na szczycie stosu zostaje odwrócony
 (nie stosować funkcji reverse() klasy StringBuffer)
 * PiszStos() - wypisywanie zawartości stosu na konsolę

 */

public class Egz_Stos {

    int i = 0;
    String[] Stos = null;

    public Egz_Stos(int zmienna) {
        Stos = new String[zmienna];
    }

    public void NaStos(String łańcuch) {
        Stos[i++] = łańcuch;

    }

    public String ZeStosu() {
        String zwrot;
        zwrot = Stos[--i];
        Stos[i] = null;
        return zwrot;
    }

    public void Konwertuj() {

        String temp = "";
        String ostatni = Stos[i - 1];

        for (int x = ostatni.length() - 1; x >= 0; x--) {
            temp +=  ostatni.charAt(x);
        }
        Stos[i-1] = temp;
     

    }

    public void PiszStos() {
        for (int x = 0; x < i; x++) {
            System.out.println(x + Stos[x]);
        }
    }

    public static void main(String[] args) {
        // Obiekt
        Egz_Stos e = new Egz_Stos(5);
        e.NaStos("abcd");
        e.NaStos("abcdb");
        e.NaStos("abcdc");
        e.NaStos("abcdd");
        e.NaStos("abcde");
        e.PiszStos();
        System.out.println("****************");
        e.Konwertuj();
        e.PiszStos();
    }
}
