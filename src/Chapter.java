import java.util.Scanner;
public class Chapter{
    String name, text, escolha1, escolha2;
    Caracter Caracter1, Caracter2, Caracter3;
    String escolhaNumber;
    int alterationEnergy1, alterationEnergy2, alterationEnergy3;
    Scanner input;

    Chapter(String name, String text, String escolha1, String escolha2, Caracter Caracter1, Caracter Caracter2, Caracter Caracter3, int alterationEnergy1, int alterationEnergy2, int alterationEnergy3, Scanner input) {
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
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
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
        
        if (this.escolha1 != "") {
            System.out.print(" -> " + this.escolha1);
        }
        if (this.escolha2 != "") {
            System.out.print(" -> " + this.escolha2);
        }
        if (this.escolha1 == "" && this.escolha2 == "") {
            System.out.print("Fim.");
        }
        System.out.println();
    }
    int Choice(){
        
        int escolha = -1;
        
        if (escolha1 !=  "" && escolha2 != "") {
            
            while (escolha == -1) {
                System.out.print("Faça a sua escolha: ");
                escolhaNumber = input.nextLine();
                
                if (escolhaNumber.equals(escolha1)) {
                    escolha = 1;
                } else if (escolhaNumber.equals(escolha2)) {
                    escolha = 2;
                } else {
                    System.out.println("ESCOLHA INVÁLIDA!!!");
                }
            }
        }
        
        return escolha;
    }
}