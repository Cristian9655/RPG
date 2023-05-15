package Programa;

public class Guerreiro extends Jogador implements Fase {
	
	
	public Guerreiro(String nome) {
		super(nome);
	}

	
	@Override
	public void mover(int x, int y){
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
		System.out.println("Guerreiro movido para a posição (" + x + ", " + y + ")");
	}
	@Override
    public void carregar() {
        System.out.println("Exibindo Guerreiro na tela");
    }
}
