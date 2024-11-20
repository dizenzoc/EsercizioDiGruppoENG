import java.io.File;
import java.util.Scanner;

public class Utente {

    String username;
    String password;
    int punteggio;

    public Utente (String username, String password){

        this.username = username;
        this.password = password;
        this.punteggio = 0;

    }

    //metodo modifica utente

    public void modificaUtente (String nuovoUtente){

        this.username = nuovoUtente;

    }
    

    //metodo modifica password

    public void modificaPassword (String nuovaPassword){

        if(nuovaPassword != password){
            this.password = nuovaPassword;
        }
        else
            System.out.println("La nuova password deve essere diversa dalla precedente!");


    }

}
