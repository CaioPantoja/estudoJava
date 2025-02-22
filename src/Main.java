import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PersonagemMagico personagem = new PersonagemMagico();
    int op;
    do{
        System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0-Sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o nome do personagem: ");
                String nome = sc.next() + sc.nextLine();
                System.out.println("Digite o poder do personagem: ");
                String poder = sc.next() + sc.nextLine();
                System.out.println("Digite o nível de energia: ");
                int energia = sc.nextInt();
                personagem.nome = nome;
                personagem.nivelEnergia = energia;
                personagem.poderMagico = poder;
                System.out.println("Digite o nome da habilidade especial:");
                String nomeHabilidade = sc.next() + sc.nextLine();
                System.out.println("Digite o custo de energia para usar a habilidade especial:");
                int nivelEnergia = sc.nextInt();
                System.out.println("A habilidade está ativada? (true/false):");
                boolean ativada = sc.nextBoolean();
                personagem.habilidade = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                break;
            case 2:
                System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Nivel Energia: " + personagem.nivelEnergia);
                System.out.println("Habilidade: " + personagem.habilidade.nome + " Custo energia: " + personagem.habilidade.custoEnergia + " Habilitada: " + personagem.habilidade.habilitada);
                break;
            case 0:
                System.out.println("Finalizando o programa");
            default:
                System.out.println("Opção invalida");
        }
    }while (op != 0);

    sc.close();
    }
}
