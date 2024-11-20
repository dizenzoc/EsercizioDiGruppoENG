public class Prova {
    
    String domanda;
    public int rispostaCorretta;
    public int difficolta;


    public Prova(int difficolta){

            this.difficolta = difficolta;
            generaDomanda(difficolta);
    }

    private void generaDomanda(int difficolta) {
        switch (difficolta) {
            case 1:
                domanda = "Quanto fa 2 + 2?";
                rispostaCorretta = 4;
                break;
            case 2:
                domanda = "Quanto fa 10 / 2?";
                rispostaCorretta = 5;
                break;
            case 3:
                domanda = "Quanto fa 15 * 3?";
                rispostaCorretta = 45;
                break;
            default:
                domanda = "Difficoltà non valida.";
                rispostaCorretta = -1; // Valore di fallback
                break;
        }
    }


    public boolean verificaRisposta(int risposta) {
        return risposta == rispostaCorretta;
    }
 
    public String getDomanda() {
        return domanda;
    }

    }
