//Fazer o Main

public class Personagem_Main {

    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        personagem.setNome("Guerreiro");
        personagem.setNivel(5);
        personagem.setDano(30);
        personagem.setVida(100);
        personagem.setMana(40);
        personagem.setDefesa(20);

        personagem.mostrarStatus();
    }
}
