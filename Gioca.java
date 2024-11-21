import java.util.ArrayList;
import java.util.Scanner;

public class Gioca {
    public static void main(String[] args) {
        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        Registro registro = new Registro();
        APP_final app = new APP_final();
       
        
        Utente utente1 = new Utente("Mario", "password123");
        Utente utente2 = new Utente("Luigi", "password456");
        registro.aggiungiUtente(utente1);
        registro.aggiungiUtente(utente2);

        String nome = "Mario";
        String password = "password123";
 
        if (app.login(nome, password, registro ) == 1) {
            System.out.println("Login effettuato con successo!");
 
            // Esecuzione di una prova matematica
            Prova prova = new Prova(1); // Difficoltà 1
            app.eseguiProva(prova);
 
            // Mostra il punteggio attuale
            app.mostraPunteggio();
        } else {
            System.out.println("Nome utente o password errati.");
        } 
    }
 
}
