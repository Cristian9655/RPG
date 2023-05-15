package Programa;


public class Jogo {

	public static void main(String[] args) {
		Mago mago = new Mago("g214");
		Guerreiro guerreiro = new Guerreiro("f3421");
		Dragao dragao = new Dragao();
		BolaDeFogo fogo = new BolaDeFogo();
		mago.mover(5, 7);
		guerreiro.mover(9, 10);
		dragao.mover(16, 6);
		fogo.mover(12, 34);
		guerreiro.carregar();
		mago.carregar();
		dragao.carregar();
		fogo.carregar();
		System.out.println(mago);
		System.out.println(guerreiro);
		System.out.println(dragao);
		System.out.println(fogo);
	}

}
