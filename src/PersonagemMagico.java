public class PersonagemMagico {
    String nome;
    String poderMagico;
    int nivelEnergia;

    HabilidadeEspecial habilidade;

    public  PersonagemMagico() {}

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    public void atacar (String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " esta sem energia para atacar.");
        }
    }

    public int aumentarEnergia (int energia) {
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if (!habilidade.habilitada){
            System.out.println("Habilidade especial não esta ativada");
        } else if (nivelEnergia >= habilidade.custoEnergia) {
            System.out.println("Ativando a habilidade: " + habilidade.nome);
            nivelEnergia -= habilidade.custoEnergia;
        } else {
            System.out.println(nome + "esta sem energia para a habilidade especial.");
        }
    }

}
