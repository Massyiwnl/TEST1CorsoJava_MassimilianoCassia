import java.util.Scanner;

public class Esercizio1TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creo al solito l'oggetto scanner per poi dare in input i vari dati
        System.out.println("Quanti anni hai? ");
        int eta = input.nextInt();

        System.out.println("Quanti anni di esperienza hai di programmazione? ");
        int anniEsperienza = input.nextInt();

        System.out.println("Quante certificazioni hai ottenuto? ");
        int certificazioniOttenute = input.nextInt();

        //if completo con tutte le condizioni richieste, che mi permetteranno in caso di true di accedere
        if (eta > 18 && anniEsperienza >= 2 || certificazioniOttenute >= 1 && eta >= 16 && eta <= 18){ 
            System.out.println("Puoi accedere al corso avanzato");
            //anni + esperienza
            int totaleAnni = eta + anniEsperienza;
            double radice = Math.sqrt(totaleAnni); //calcolo la radice quadrata

            System.out.println("La radice quadrata del totale anni è: " + radice);
            System.out.println("Idoneo al corso");
        }else{
            System.out.println("Non puoi accedere al corso avanzato, non idoneo al corso");
        }
    }
}
