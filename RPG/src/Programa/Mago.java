package Programa;

public class Mago extends Jogador implements Fase{
	private int mp;
	
	
	
	
	public Mago(String nome) {
		super(nome);
	}


	@Override
	public void mover(int x, int y){
		setX(x);
		setY(y);
		System.out.println("Mago movido para a posição (" + x + ", " + y + ")");
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}
	
	@Override
    public void carregar() {
        System.out.println("Exibindo Mago na tela");
	}
}
	