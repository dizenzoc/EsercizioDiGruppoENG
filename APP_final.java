import java.util.Scanner;

public class APP_final {
    Utente utenteCorrente;

    public int login(String nome, String password, Registro registro) {
        Utente utente = registro.trovaUtente(nome); //verifica se l'utente esiste nel registro e se le credenziali sono corrette.
        if (utente != null && utente.login(nome, password) == 1) {  // Se entrambe le condizioni sono soddisfatte
            utenteCorrente = utente;  //imposta l'utente corrente (utenteCorrente)
            return 1; //restituisce true
        }
        return 0; //, altrimenti restituisce false.
    }

    public void eseguiProva(Prova prova) {
        if (utenteCorrente != null) { //verifico se esiste un utente loggato
            Scanner scanner = new Scanner(System.in);
            System.out.println(prova.domanda()); //utilizzo uno Scanner per leggere la risposta dell'utente dalla console.
            int risposta = scanner.nextInt();
            if (prova.verificaRisposta(risposta)) {
                utenteCorrente.punteggio = (utenteCorrente.punteggio() + 10); //Se la risposta è corretta, incrementa il punteggio dell'utente di 10 punti.
                System.out.println("Risposta corretta! Punteggio: " + utenteCorrente.punteggio());
            } else {
                utenteCorrente.setPunteggio(utenteCorrente.getPunteggio() - 5); // Se la risposta è sbagliata, decrementa il punteggio dell'utente di 5 punti.
                System.out.println("Risposta sbagliata. Punteggio: " + utenteCorrente.punteggio());
            }
        }
    }

    public void mostraPunteggio() { //mostro il punteggio all'utente
        if (utenteCorrente != null) {
            System.out.println("Punteggio attuale: " + utenteCorrente.punteggio());
        }
    }
}