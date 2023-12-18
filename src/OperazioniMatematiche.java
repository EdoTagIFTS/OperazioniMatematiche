import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int n2 = scanner.nextInt();

        scanner.close();

        System.out.println("La somma dei due numeri è: " + Somma(n1,n2));

        System.out.println("La differenza dei due numeri è: " + Sottrazione(n1,n2));

        System.out.println("Il prodotto dei due numeri è: " + Prodotto(n1,n2));

        System.out.println("Il quoziente dei due numeri è: " + Quoziente(n1,n2));

        System.out.println("Il modulo dei due numeri è: " + Modulo(n1,n2));
    }

    public static int Somma(int n1, int n2){
        return n1+n2;
    }
    
    public static int Sottrazione(int n1, int n2){
        return n1-n2;
    }
    
    public static int Prodotto(int n1, int n2){
        return n1*n2;
    }

    public static int Quoziente(int n1, int n2){
        return n1/n2;
    }

    public static int Modulo(int n1, int n2){
        return n1%n2;
    }
}
