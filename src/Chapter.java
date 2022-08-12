import java.util.Scanner;
public class Chapter{
    String name, text; 
    String[] escolhas;
    Caracter Caracter1, Caracter2, Caracter3;
    int alterationEnergy1, alterationEnergy2, alterationEnergy3;
    Scanner input;

    Chapter(String name, String text, String[] escolhas, Caracter Caracter1, Caracter Caracter2, Caracter Caracter3, int alterationEnergy1, int alterationEnergy2, int alterationEnergy3, Scanner input) {
        this.name = name;   
        this.text = text;
        this.Caracter1 = Caracter1;
        this.Caracter2 = Caracter2;
        this.Caracter3 = Caracter3;
        //this.Caracter4 = Caracter4;
        this.alterationEnergy1 = alterationEnergy1;
        this.alterationEnergy2 = alterationEnergy2;
        this.alterationEnergy3 = alterationEnergy3;
        //this.alterationEnergy4 = alterationEnergy4;
        this.escolhas = escolhas;
        this.input = input;
    }

    void Show() {
        System.out.println("...");
        System.out.println(this.name);
        System.out.println(this.text);
        this.Caracter1.ModifyEnergy(this.alterationEnergy1);
        this.Caracter2.ModifyEnergy(this.alterationEnergy2);
        this.Caracter3.ModifyEnergy(this.alterationEnergy3);
        //this.Caracter.ModifyEnergy4(this.alterationEnergy4);
    
        if (this.escolhas != null) {
            for (String escolha : escolhas) {
                System.out.println(" - " + escolha);
            /*Outra forma para vasculhar o array
            for (String escolha : escolhas) {
                System.out.println(" - " + escolha);
            }*/
            }   

        }
        if (this.escolhas == null) {
            System.out.print("Fim.");
        }
        System.out.println();
    }
    
    int Choice() {
        
        int TapEscolha = -1;
        
        if (escolhas != null) {
            
            while (TapEscolha == -1) {
                System.out.print("Faça a sua escolha: ");
                String escolhaNumber = input.nextLine();
                
                for (int i = 0; i < escolhas.length; i ++) {
                    if (escolhaNumber.equals(escolhas[i])) {
                        TapEscolha = i;
                    /*} else {
                        System.out.println("ESCOLHA INVÁLIDA!!!");
                    */
                    }
                }
            
                /* Outra forma de vasculhar o array
                TapAtual = 0;
                for (String escolha : escolhas) {
                    if (escolhaEscolhida.equals(escolha)) {
                        TapAtual = TapAtual;
                    } else {
                        System.out.println("ESCOLHA INVÁLIDA!!!");
                    }
                    idAtual ++;
                }*/
            }
            System.out.println();
        }
        return TapEscolha;
    }
}