public class Personagem {
    // Atributos
    private String nome;
    private int nivel;
    private int vida;
    private int mana; // Adicionado: usado em métodos de evolução
    private float defesa;
    private int dano;

    // Construtor (opcional, para inicializar valores)
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.vida = 100;
        this.mana = 50;
        this.defesa = 10;
        this.dano = 10;
    }

    // QUESTÃO 01 – Métodos Guerreiro
    public void saudacaoGuerreiro() {
        System.out.println("Boas vindas caro jogador, prepare-se para uma aventura épica.");
    }

    public void subirNivelGuerreiro() {
        if (this.nivel < 20) {
            this.nivel += 1;
        } else {
            this.nivel = 20;
        }
    }

    public void reduzirVidaGuerreiro() {
        if (this.vida > 100) {
            this.vida -= 10;
        } else {
            this.vida = 0;
        }
    }

    public void aumentarDefesaGuerreiro() {
        if (this.defesa < 100) {
            this.defesa += 20;
        } else {
            this.defesa = 100;
        }
    }

    public void aumentarDanoGuerreiro() {
        if (this.dano < 20) {
            this.dano += 20;
        } else {
            this.dano = 40;
        }
    }

    // Evoluir Guerreiro
    public void evoluirGuerreiro() {
        this.nivel += 1;
        this.vida += 30;
        this.mana += 18;
        this.defesa += 5;
        this.dano += 7;
    }

    // QUESTÃO 03 – Sofrer dano
    public void sofrerDano(int damage) {
        this.vida -= damage;

        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println("Game Over");
        }
    }

    // Exibir status do personagem
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Defesa: " + defesa);
        System.out.println("Dano: " + dano);
    }

    // Métodos Mago
    public void saudacaoMago() {
        System.out.println("Guiarei você a sua jornada em Javalândia!");
    }

    public void subirNivelMago() {
        if (this.nivel < 20) {
            this.nivel += 1;
        } else {
            this.nivel = 20;
        }
    }

    public void reduzirVidaMago() {
        if (this.vida > 200) {
            this.vida -= 20;
        } else {
            this.vida = 0;
        }
    }

    public void aumentarDefesaMago() {
        if (this.defesa < 300) {
            this.defesa += 25;
        } else {
            this.defesa = 300;
        }
    }

    public void aumentarDanoMago() {
        if (this.dano < 40) {
            this.dano += 40;
        } else {
            this.dano = 50;
        }
    }

    // Evoluir Mago
    public void evoluirMago() {
        this.nivel += 1;
        this.vida += 30;
        this.mana += 18;
        this.defesa += 5;
        this.dano += 7;
    }
}

