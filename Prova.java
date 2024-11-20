public class Prova {
    

    public double rispostaCorretta;
    public int[] difficolta = {1,2,3};


    public Prova(int[] difficolta, double rispostaCorretta){

            this.difficolta = difficolta;
            this.rispostaCorretta = rispostaCorretta;
    }


    

    

    Prova prova = new Prova(difficolta, rispostaCorretta);
    
    public void difficolta(int[] diff) {
        int index = 1;
        for (int difficolta : diff) { // Itera sull'array delle difficoltà
            System.out.println("Difficoltà " + index + ": " + difficolta);
    
            // Esegui task specifici per ogni difficoltà
            switch (difficolta) {
                case 1:
                    System.out.println("Task per la difficoltà 1: Avviare il livello facile.");
                    // Inserisci il codice specifico per la difficoltà 1
                    break;
    
                case 2:
                    System.out.println("Task per la difficoltà 2: Avviare il livello intermedio.");
                    // Inserisci il codice specifico per la difficoltà 2
                    break;
    
                case 3:
                    System.out.println("Task per la difficoltà 3: Avviare il livello difficile.");
                    // Inserisci il codice specifico per la difficoltà 3
                    break;
    
                default:
                    System.out.println("Difficoltà non riconosciuta: " + difficolta);
                    // Inserisci un task di default, se necessario
                    break;
            }
            index++;
        }
    }
    

    public int verificaRisposta(int risposta)
    {

        if(risposta == )

        return
    }

    
    

    









}
