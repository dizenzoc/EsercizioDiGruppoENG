import java.util.ArrayList;

public class Registro {
    ArrayList<Utente> utenti = new ArrayList();


    //Metodo che controlla prende un oggetto Utente come parametro e controlla se il nome inserito è già esistente in un altro oggetto.
    public void aggiungiutente(Utente tmp){
        boolean flag = ricercautente(tmp);

        if (!flag){
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

    public void rimuoviutente(Utente tmp){
        boolean flag = ricercautente(tmp);
        if (flag){
            this.utenti.remove(tmp);
        } else {
            System.out.println("L'utente non è presente nel registro");
        }
    }

            //valore di ritorno -> Utente
    public boolean ricercautente(Utente tmp){
        for (int i=0; i<this.utenti.size(); ++i){
            if(tmp.nome.toLowercase().equals(this.utenti.get(i).nome.toLowercase()){
                return this.utenti.get(i);
            }
        }
        return;
    }

    public void stampautenti(){
        for (int i=0; i<this.utenti.size(); ++i){
            this.utenti.get(i).stampa();
        }
    }

}
