package Programa;

public abstract class Jogador {
	private String nome;
	private int hp;
	private int xp;
	private boolean envenenado;
	private int x;
    private int y;

	public Jogador() {
	    this.nome = "";
	    this.hp = 0;
	    this.xp = 0;
	    this.envenenado = false;
	}

	public Jogador(String nome) {
	    this.nome = nome;
	    this.hp = 100;
	    this.xp = 0;
	    this.envenenado = false;
	    this.x = 0;
	    this.y = 0;
	}

	
	
	public String getNome() {
		return nome;
	}
	
	public int getXp() {
	    return xp;
	}

	public int getHp() {
	    return hp;
	}

	public boolean isEnvenenado() {
	    return envenenado;
	}

	public void receberDano(int pontos) {
	    this.hp -= pontos;
	    if (this.hp <= 0) {
	        System.out.println("Game Over! O jogador " + this.nome + " foi derrotado.");
	    }
	}

	public void receberCura(int pontos) {
	    this.hp += pontos;
	    if (this.hp > 100) {
	        this.hp = 100;
	    }
	}

	public void ganharExperiencia(int pontos) {
	    this.xp += pontos;
	}

	public void receberAntiduto() {
	    if (this.envenenado) {
	        this.envenenado = false;
	    } else {
	        this.envenenado = true;
	    }
	}

	public void atacar(Jogador jogador) {
	    int pontosDano = this.xp;
	    jogador.receberDano(pontosDano);
	    if (jogador.getHp() <= 0) {
	        this.ganharExperiencia(jogador.getXp());
	    }
	}
	
	

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", hp=" + hp + ", xp=" + xp + ", envenenado=" + envenenado + ", x=" + x
				+ ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void mover(int x, int y);
	
}
