public class Chapter{
    String name, text, escolha1, escolha2;
    Caracter Caracter;
    int alterationEnergy;

    Chapter(String name, String text, String escolha1, String escolha2, Caracter Caracter, int alterationEnergy) {
        this.name = name;
        this.text = text;
        this.Caracter = Caracter;
        this.alterationEnergy = alterationEnergy;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
    }

    void Show() {
        System.out.println("...");
        System.out.println(this.name);
        System.out.println(this.text);
        System.out.println(" ... " + this.escolha1);
        System.out.println(" ... " + this.escolha2);

        if (this.escolha1 != null) {
            System.out.print(" - " + this.escolha1);
        }
        if (this.escolha2 != null) {
            System.out.print(" - " + this.escolha2);
        }
    }
    int choice(){
        int choice = -1;

        if(escolha1 !=  || escolha1 != null) {
            
        }
    }
}