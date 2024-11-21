public class Utente {

    String nome;
    String password;
    int punteggio;

    public Utente (String username, String password){

        this.nome = username;
        this.password = password;
        this.punteggio = 0;

    }

    //metodo modifica utente

    public void modificaUtente (String nuovoUtente){
    
        this.nome = nuovoUtente;

    }
    

    //metodo modifica password

    public void modificaPassword (String nuovaPassword){

        if(nuovaPassword != password){
            this.password = nuovaPassword;
        }
        else
            System.out.println("La nuova password deve essere diversa dalla precedente!");


    }

    public void stampa(){
        System.out.println("\nNome utente: " + this.nome + "\nPunteggio: 0");
    }

}
