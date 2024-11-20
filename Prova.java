public class Prova {
    
    String domanda;
    public int rispostaCorretta;
    public int difficolta;


    public Prova(int difficolta){

            this.difficolta = difficolta;
            generaDomanda(difficolta);
    }
    

    

    Prova prova = new Prova(difficolta);

    private void generaDomanda(int difficoltà) {

        // Logica per generare una domanda basata sulla difficoltà
        // Esempio semplice:
        if (difficoltà == 1) {
            domanda = "Quanto fa 2 + 2?";
            rispostaCorretta = 4;
        } else if (difficoltà == 2) {
            domanda = "Quanto fa 10 / 2?";
            rispostaCorretta = 5;
        } else if (difficoltà == 3) {
            domanda = "Quanto fa 15 * 3?";
            rispostaCorretta = 45;
        }
    }


    public boolean verificaRisposta(int risposta) {
        return risposta == rispostaCorretta;
    }
 
    public String getDomanda() {
        return domanda;
    }
    }



    
    

    









}
