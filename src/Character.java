public class Character {
    String name;
    int energy;

    Character(String nomePerson, int energiaPerson) {
        this.name = nomePerson;
        this.energy = energiaPerson;
    }

        void ModifyEnergy(int alteration) {
        this.energy += alteration;

        if (alteration > 0) {
            System.out.println(this.name + " conseguiu mais " + alteration + " de energia." );
        } else if (alteration < 0) {
            System.out.println(this.name + " perdeu " + alteration + " de energia." );
        }
        
        if (this.energy > 100) {
            this.energy = 100;
        } else if (this.energy <= 0) {
            if (this.name == "Soldado"){
                System.out.println("Energia esgotada, você morreu.");
            } else {
                System.out.println("Energia esgotada, " + this.name + " morreu.");
            }
            
        }
    }
}