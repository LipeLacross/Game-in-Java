public class Caracter {
    String nome;
    int energia;

    Caracter(String nomePerson, int energiaPerson) {
        this.nome = nomePerson;
        this.energia = energiaPerson;
    }

    void ModifyEnergy(int alteration) {
        this.energia += alteration;

        if (alteration > 0) {
            System.out.println(this.nome + " conseguiu mais " + alteration + " de energia." );
        } else if (alteration < 0) {
            System.out.println(this.nome + " perdeu " + alteration + " de energia." );
        }
        
        if (this.energia > 100) {
            this.energia = 100;
        } else if (this.energia <= 0) {
            if (this.nome == "Soldado"){
                System.out.println("Energia esgotada, você morreu.");
            } else {
                System.out.println("Energia esgotada, o " + this.nome + " morreu.");
            }
            
        }
    }
}