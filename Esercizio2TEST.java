import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2TEST {
    public static void main(String[] args) {
        ArrayList<String> nomiArticoli = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String articolo;

        while (true) { //Qui inserisco sempre nomi, fino a quando non viene scritto "fine"
            System.out.println("Inserisci un nome dell'articolo(scrivi \"fine\" per terminare):");
            articolo = input.nextLine();

            if (articolo.equalsIgnoreCase("fine")) { 
                System.out.println("Hai terminato l'inserimento.");
                break; // Uscita dal ciclo
            }
            nomiArticoli.add(articolo); //Con add vado ad aggiungere il nome nella lista 
            // Dopo qui faccio le altre parti (ordinamento, stampa, eliminazione ecc.)
         }
        // Stampa tutti gli elementi uno per riga
        System.out.println("Ecco gli articoli inseriti:"); 
        for (int i = 0; i < nomiArticoli.size(); i++) {  // size restituisce il numero totale di elementi presenti nella lista. Il ciclo parte da i = 0 e continua finché i è minore della lunghezza della lista
            System.out.println(nomiArticoli.get(i)); // restituisce l'elemento che si trova nella posizione i della lista
        }

        // Stampa numero totale di elementi
        System.out.println("Numero totale di elementi inseriti: " + nomiArticoli.size());

        // Controlla se contiene sia "pane" che "latte"
        if (nomiArticoli.contains("pane") && nomiArticoli.contains("latte")) { //contains() controlla se la lista contiene l'elemento indicato
            System.out.println("Hai pensato alla colazione!");
        }
    }
}
