public class Prova {
    
    String domanda;
    public int rispostaCorretta;
    public int difficolta;


    public Prova(int difficolta, String domanda){

            this.difficolta = difficolta;
            this.domanda = domanda;
            generaDomanda(difficolta);
    }

    public String generaDomanda(int difficolta) {
        switch (difficolta) {
            case 1:
                domanda = "Quanto fa 2 + 2?";
                rispostaCorretta = 4;
                return domanda;
            case 2:
                domanda = "Quanto fa 10 / 2?";
                rispostaCorretta = 5;
                return domanda;
            case 3:
                domanda = "Quanto fa 15 * 3?";
                rispostaCorretta = 45;
                return domanda;
            default:
                domanda = "Difficoltà non valida.";
                rispostaCorretta = -1; // Valore di fallback
                return domanda;
        }
    }


    public boolean verificaRisposta(int risposta) {
        return risposta == rispostaCorretta;
    }
 
    public String getDomanda() {
        return domanda;
    }

    }
