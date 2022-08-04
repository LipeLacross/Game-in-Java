import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String situation1, situation2, situation3, situation4, situation5, situation6;
        //String error = "ESCOLHA INVÁLIDA!!! VOCÊ PERDEU.";
        Scanner input = new Scanner(System.in);

        Caracter solda = new Caracter("Soldado", 100);
        Caracter bruta = new Caracter("Brutamontes", 100);
        Caracter rei = new Caracter("Rei", 100);
        Caracter princess = new Caracter("Princesa", 100);
        Caracter ghost = new Caracter("Ghost", 100000);
            
        situation1 = "Você segue adiante em direção ao castelo com o propósito de defender o rei... No meio do caminho há um brutamontes com um machado.";
        situation2 = "Derrotar seu inimigo o faz pensar na condição que se encontra a realiza, você pensa se realmente vale a pena(ir) arriscar a sua vida(fugir).";
        situation3 = "Você sabe que buscar honra não o leva a nada, você foge desesperadamente.";
        situation4 = "Você pensa nos prêmios e na glória que poderia receber, e diante disso vai correndo até o castelo...\nDurante sua corrida um arqueiro inimigo atira em você.";
        situation5 = "Ao entrar no castelo, você vê alguns membros do castelo mortos. Através de sua análise rápida você percebe que o rei(rei) e a princesa(princesa) podem estar vivos, porém você deve escolher quem vai procurar.";
        situation6 = ("Você vai até o trono e vê o seu rei apuros, ele está cercado de inimigos. Você tenta salva-lo, mas fracassa.");  
        //Base Chapter chapter0 = new Chapter("", "", "", "", , , input);
        
        //"System.out.println("===============================CAPÍTULO 0===============================");
        Chapter chapter0 = new Chapter("==O amanhecer da fera==","\nVocê é um soldado do reino de Drazio, sua missão é defender o castelo." + "\nAcorde! O castelo está sendo atacado! Diz o capitão. \nVocê vai continuar dormindo(dormir) ou vai partir para a batalha?(lutar)", "dormir", "lutar", solda, ghost, ghost, 0, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 1E1===============================");
        Chapter chapter1E1 = new Chapter("==Dorminhoco==", "Você dormiu, mas infelizmente o barulho está tão alto lá fora que o seu sono se esvai. Você preguiçosamente se levanta e sai de sua cabana para verificar as armas restantes...\nInfelizmente já pegaram todas as armas.\nDesesperadamente você se lembra dos treinos de Muai Thay(mt) e karatê(kt) que você teve com sua avó, mas fica em dúvida sobre qual escolher.\nVocê se esforça para lembrar da técnica.", "mt", "kt", solda, ghost, ghost, -5, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 2E1E1===============================");
        Chapter chapter2E1E1 = new Chapter("==Coragem a mil==", situation1 + "Pela graça dos deuses ele está de costas pra você e sem capacete. Seu corpo é uma arma integrada, você aproveita-se da situação para chutar a cabeça do seu inimigo. Seu chute é tão forte quanto uma bigorna, e o faz desmaiar.\nInfelizmente você machucou seu pé e não pode correr.\n" + situation2, "ir", "fugir", solda, bruta, ghost, 0, -89, 0, input);
        //bruta.ModifyEnergy(-89);

        //System.out.println("===============================CAPÍTULO 3E1E1E1===============================");
        Chapter chapter3E1E1E1 = new Chapter("==Em busca da glória==", "Você pensa nos prêmios e na glória que poderia receber, e diante disso vai andando até o castelo...\nDurante sua corrida um arqueiro inimigo atira em você, já que você não tinha nenhuma armadura o resultado foi fatal...\nWarrior ending.", "", "", solda, ghost, ghost, -100, 0, 0, input);
        
        //System.out.println("===========do====================CAPÍTULO 3E1E1E2===============================");
        Chapter chapter3E1E1E2 = new Chapter("==Uma longa vida==", situation3 + "\nLive Coward ending.", "", "", solda, ghost , ghost, -70, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 2E1E2===============================");
        Chapter chapter2E1E2 = new Chapter("==Ataque surpresa==", "Pela graça dos deuses ele está de costas pra você e sem capacete. Seu corpo é uma arma integrada, você aproveita-se da situação para pular no pescoço do seu inimigo. Com o seus braços você o enforca até o matar." + situation2, "ir", "fugir", solda, bruta, ghost, 0, -100, 0, input);
        //bruta.ModifyEnergy(-100);

        //System.out.println("===============================CAPÍTULO 3E1E2E1===============================");
        Chapter chapter3E1E2E1 = new Chapter("==Flash==", situation4 + "\nGraças a sua alta agilidade você não sofre nenhum dano durante o trajeto.\nMas você fica um pouco cansado." + situation5, "rei", "princesa", solda, ghost, ghost, -15, 0, 0, input);
        
        //System.out.println("===============================CAPÍTULO 3E1E2E2===============================");
        Chapter chapter3E1E2E2 = new Chapter("==Uma longa vida==", situation3 + "\nLive Coward ending.", "", "", solda, ghost, ghost, -70, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 4E1E2E1E1===============================");
        Chapter chapter4E1E2E1E1 = new Chapter("==Aposta alta==", situation6 + "\nlogo em seguida você é derrotado pela quantidade absurda de soldados.\nSoldier ending.", "", "", solda, ghost, ghost, -100, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 4E1E2E1E2===============================");
        Chapter chapter4E1E2E1E2 = new Chapter("==Salvador estranho==", "Você vai até o quarto da princesa e não se depara com ninguém, ao entrar no quarto você começa a procura-la...\nEla estava escondida embaixo da cama, logo você explica a situação para ela e decide fugir com ela. \n Ela diz que há uma passagem secreta em determinado lugar do castelo, enquanto olha discretamente para sua vestimenta.\nVocê a leva até o local, ela abre passagem, assim permitindo a fuga.\nMas antes ela se aproxima de você para beija-lo, e sorrateiramente esfaqueia seu pescoço.\nLogo depois ela foge sozinha.\nGado ending", "", "", solda, ghost, ghost, -100, 0, 0, input);


        //System.out.println("===============================CAPÍTULO 1E2===============================");
        Chapter chapter1E2 = new Chapter("==Coragem a mil==", "Você corajosamente se levanta com sangue no olho e corre ansiosamente em busca do seu equipamento. Sua pressa é crucial e lhe faz encontrar algumas restantes...\nSobrou apenas um arco com duas flechas(arco), uma espada(espada) e algumas peças de armadura." + situation1, "arco", "espada", solda, ghost, ghost, 0, 0, 0, input); 

        //System.out.println("===============================CAPÍTULO 2E2E1===============================");
        Chapter chapter2E2E1= new Chapter("==Descendente dos elfos==", "Seu inimigo olha para você e corre loucamente para ataca-lo. Você só tem duas chances de acertar a sua flecha.\nVocê mira na cabeça do seu inimigo e atira, no entanto seu inimigo se defende com o machado.\nVocê engole seco e prepara sua última flecha, sabe que se errar irá morrer...\nVocê atira e...\nAcerta!\nNa parede... logo recebe uma machadada.\nBlind ending.", "", "", solda, ghost, ghost, -100, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 2E2E2===============================");
        Chapter chapter2E2E2 = new Chapter("==Vale tudo==", "Seu inimigo olha para você e corre loucamente para ataca-lo. Sua mente é perspicaz, você corre na direção do seu oponente, ele o ataca pela direita, mas você se joga no chão e desliza em baixo.\nRapidamente você vê uma brecha na virilha do seu oponente, ela se encontra desprotegida, você dá uma cotovelada no saco do brutamontes e o faz ficar atordoado." + "\nEle fica de joelhos, você aproveita-se da situação para cortar a cabeça do obeso." + situation2, "ir", "fugir", solda, bruta, ghost, 0, -100, 0, input);
        //bruta.ModifyEnergy(-20);
        //bruta.ModifyEnergy(-80);

        //System.out.println("===============================CAPÍTULO 3E2E2E1===============================");
        Chapter chapter3E2E2E1 = new Chapter("==Homem de ferro==", situation4 + "Graças a sua armadura você não sofre nenhum dano durante o trajeto.\nNo entanto esse ataque recebido lhe deixou paranóico." + situation5, "rei", "princesa", solda, ghost, ghost, -10, 0, 0, input);
        
        //System.out.println("===============================CAPÍTULO 3E2E2E2===============================");
        Chapter chapter3E2E2E2 = new Chapter("==Uma longa vida==", situation3 + "\nLive Coward ending.", "", "", solda, ghost, ghost, -70, 0, 0, input);

        //System.out.println("===============================CAPÍTULO 4E2E2E2E1===============================");
        Chapter chapter4E2E2E2E1 = new Chapter("==Aposta alta==", situation6 + "\nlogo em seguida você é derrotado pela quantidade absurda de soldados.\nSoldier ending.", "", "", solda, rei, ghost, -100, -100, 0, input);
        //rei.ModifyEnergy(-100);

        //System.out.println("===============================CAPÍTULO 4E2E2E2E2===============================");
        Chapter chapter4E2E2E2E2 = new Chapter("==Gado do bom==", "Você vai até o quarto da princesa e não se depara com ninguém, ao entrar no quarto você começa a procura-la...\nEla estava escondida embaixo da cama, logo você explica a situação para ela e decide fugir com ela. \n Ela diz que há uma passagem secreta em determinado lugar do castelo, enquanto olha discretamente para sua vestimenta.\nVocê a leva até o local, ela abre passagem, assim permitindo a fuga.\nMas antes ela se aproxima de você para beija-lo, logo depois vocês fogem juntos.\nGood ending", "", "", solda, ghost, ghost, 0, 0, 0, input);
        
        //Livro interativo
        System.out.println("O reino de Drázio é um lugar onde muitas coisas podem acontecer.\nVocê terá 100 de energia.");
        
        chapter0.Show();
        int escolha;
        escolha = chapter0.Choice();
        if (escolha == 1) {
            chapter1E1.Show();
            escolha= chapter1E1.Choice();
            if (escolha == 1) {
                chapter2E1E1.Show();
                escolha = chapter2E1E1.Choice();
                if (escolha == 1) {
                    chapter3E1E1E1.Show();
                } else if (escolha == 2) {
                    chapter3E1E1E2.Show();
                } 
            } else if (escolha == 2) {
                chapter2E1E2.Show();
                escolha = chapter2E1E2.Choice();
                if (escolha == 1) {
                    chapter3E1E2E1.Show();
                    escolha = chapter3E1E2E1.Choice();
                    if (escolha == 1) {
                        chapter4E1E2E1E1.Show();
                    } else if (escolha == 2) {
                        chapter4E1E2E1E2.Show();
                    } 
                } else if (escolha == 2) {
                    chapter3E1E2E2.Show();
                }
            } 
        } else if (escolha == 2) { 
            chapter1E2.Show();
            escolha = chapter1E2.Choice();
            if (escolha == 1) {
                chapter2E2E1.Show();
            } else if (escolha == 2) {
                chapter2E2E2.Show();
                escolha = chapter2E2E2.Choice();
                if (escolha == 1) {
                    chapter3E2E2E1.Show();
                    escolha = chapter3E2E2E1.Choice();
                    if (escolha == 1) {
                        chapter4E2E2E2E1.Show();
                    } else if (escolha == 2) {
                        chapter4E2E2E2E2.Show();
                    }
                } else if (escolha == 2) {
                    chapter3E2E2E2.Show();
                }
            }
        }
        input.close();
    } 
}
//Ordem
//System.out.println("===============================CAPÍTULO 0===============================");
    //System.out.println("===============================CAPÍTULO 1E1===============================");
        //System.out.println("===============================CAPÍTULO 2E1E1===============================");
            //System.out.println("===============================CAPÍTULO 3E1E1E1===============================");
            //System.out.println("===============================CAPÍTULO 3E1E1E2===============================");
        //System.out.println("===============================CAPÍTULO 2E1E2===============================");
            //System.out.println("===============================CAPÍTULO 3E1E2E1===============================");
            //System.out.println("===============================CAPÍTULO 3E1E2E2===============================");
                //System.out.println("===============================CAPÍTULO 4E1E2E1E1===============================");
                //System.out.println("===============================CAPÍTULO 4E1E2E1E2===============================");
    //System.out.println("===============================CAPÍTULO 1E2===============================");
        //System.out.println("===============================CAPÍTULO 2E2E1===============================");
        //System.out.println("===============================CAPÍTULO 2E2E2===============================");
            //System.out.println("===============================CAPÍTULO 3E2E2E1===============================");
            //System.out.println("===============================CAPÍTULO 3E2E2E2===============================");
                //System.out.println("===============================CAPÍTULO 4E2E2E2E1===============================");
                //System.out.println("===============================CAPÍTULO 4E2E2E2E2===============================");

/* Livro interativo BASE
if (escolha == 1) {
    chapter1.Show();
} else if (escolha == 2) {
    chapter2.Show();
    escolha = chapter2.Choice();
}
input.close();
*/

/* Trash
else if (classe.toLowerCase().equals("templo")) {
        System.out.println("Você está no templo no senhor em um momento de lazer no qual você usufrui visualmente das palavras sagradas do nosso senhor.\nVocê se encontra bastante cansado(dormir) mas ainda tem muito oque deve saber(ler).");
        escolha1 = input.nextLine();

        if (escolha1.toLowerCase().equals("dormir")) {
            System.out.println("Você resolve deixar sua bíblia de lado");
            escolha2 = input.nextLine();
        } else if (escolha1.toLowerCase().equals("ler")) {
            System.out.println("Apesar de seu cansaço físico sua fé é forte e  ");
            escolha2 = input.nextLine();
        } else {
            System.out.println(error);
        }
    } else if (classe.toLowerCase().equals("campo")) {
    } else {
        System.out.println(error);
    }
*/

/* Escolhas BASE
if (escolha.toLowerCase().equals("")) {
    System.out.println("");
} else if (escolha.toLowerCase().equals("")) {
    System.out.println("");
} else {
    System.out.println(error);
}
*/
