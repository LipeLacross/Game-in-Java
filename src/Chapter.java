import java.util.ArrayList;
import java.util.Scanner;
public class Chapter{
    String name, text; 
    Character Character1, Character2, Character3;
    ArrayList<Choice> choices;
    int alterationEnergy1, alterationEnergy2, alterationEnergy3;
    Scanner input;

    Chapter(String name, String text, Character Character1, Character Character2, Character Character3, int alterationEnergy1, int alterationEnergy2, int alterationEnergy3, Scanner input) {
        this.name = name;   
        this.text = text;
        this.Character1 = Character1;
        this.Character2 = Character2;
        this.Character3 = Character3;
        //this.Character4 = Character4;
        this.alterationEnergy1 = alterationEnergy1;
        this.alterationEnergy2 = alterationEnergy2;
        this.alterationEnergy3 = alterationEnergy3;
        //this.alterationEnergy4 = alterationEnergy4;
        this.input = input;
        this.choices = new ArrayList<Choice>();

    }

    void Show() {
        try
        {
        System.out.println("...");
        System.out.println(this.name);
        System.out.println(this.text);
        this.Character1.ModifyEnergy(this.alterationEnergy1);
        this.Character2.ModifyEnergy(this.alterationEnergy2);
        this.Character3.ModifyEnergy(this.alterationEnergy3);
        //this.Caracter.ModifyEnergy4(this.alterationEnergy4);
        }
        catch(NullPointerException exception) 
        {
            
		}
        //if(this.escolhas.size() > 0) 
        if (this.choices.size() > 0) {
            for (Choice escolha : choices) {
                System.out.println(" - " + escolha.text);
            /*Outra forma para vasculhar o array
            for (String escolha : escolhas) {
                System.out.println(" - " + escolha);
            }*/
        
            }
            System.out.println();

            int TapEscolha = Choice();
            this.choices.get(TapEscolha).next.Show();
        }
        /*if (this.escolhas == null) {
            System.out.print("Fim.");
        }*/


    }
    
    int Choice() {
        
        int TapChoice = -1;
        
        if (choices != null) {
            
            while (TapChoice == -1) {
                System.out.print("Faça a sua escolha: ");
                String choiceNumber = input.nextLine();
                
                for (int i = 0; i < choices.size(); i ++) {
                    if (choiceNumber.equals(choices.get(i).text)) {
                        TapChoice = i;
                    }
                }
            
                /* Outra forma de vasculhar o array
                TapAtual = 0;
                for (String escolha : escolhas) {
                    if (escolhaEscolhida.equals(escolha)) {
                        TapAtual = TapAtual;
                    }
                    TapAtual++;
                }*/
            }
            System.out.println();
        }
        return TapChoice;
    }
}