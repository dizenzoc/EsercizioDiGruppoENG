import java.util.ArrayList;


public class Registro {
    ArrayList<Utente> utenti = new ArrayList<Utente>();

    //Metodo che controlla prende un oggetto Utente come parametro e controlla se il nome inserito è già esistente in un altro oggetto.
    public void aggiungiUtente(Utente tmp){
        

        if (ricercaUtente(tmp.nome) != null){
            //SE IL NOME UTENTE NON ESISTE GIA' NELL'ARRAYLIST utenti INSERISCO IL NUOVO UTENTE
            this.utenti.add(tmp);
            return;
        }
            //ALTRIMENTI STAMPO UN ERRORE ED ESCO DALLA FUNZIONE 
        else {
            System.out.println("Utente già esistente! Seleziona un altro nome");
            return;
        }
    }

    public void rimuoviUtente(String tmp){
        
        if (ricercaUtente(tmp) != null){
            this.utenti.remove(ricercaUtente(tmp));
        } else {
            System.out.println("L'utente non è presente nel registro");
        }
    }

            //valore di ritorno -> Utente
    public Utente ricercaUtente(String nome){
        for (int i=0; i<this.utenti.size(); ++i){
            if(nome.equals(this.utenti.get(i).nome.toLowerCase())){
                return this.utenti.get(i);
            }
        }
        return null;
    }

    public void stampaUtenti(){
        for (int i=0; i<this.utenti.size(); ++i){
            this.utenti.get(i).stampa();
        }
    }

}
