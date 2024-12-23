public class Prova {
    
    String domanda;
    public int rispostaCorretta;
    public int difficolta;


    //l'oggetto deve contenere solamente l'informazione della difficolta
    public Prova(int diff){

        // `this.difficolta` si riferisce alla variabile d'istanza,
        // mentre `difficolta` senza `this` è il parametro del costruttore
        this.difficolta = diff;
        this.domanda = generaDomanda();
    }


    //uso la difficolta che è variabile di istanza

    public String generaDomanda() {
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
    public int getDifficolta() {
        return difficolta;
    }

    }
