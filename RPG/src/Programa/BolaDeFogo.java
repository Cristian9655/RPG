package Programa;

public class BolaDeFogo implements Fase {
	private int poder;	
	private int x;
    private int y;
    
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
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}

	public BolaDeFogo() {
		this.x = 0;
		this.y = 0;
		this.poder = 20;
	}
	public void mover(int x, int y) {
		setX(x);
		setY(y);
        System.out.println("Bola de Fogo movido para a posição (" + x + ", " + y + ")");
	}
	
	@Override
    public void carregar() {
        System.out.println("Exibindo Bola de Fogo na tela");
    }
	@Override
	public String toString() {
		return "BolaDeFogo [poder=" + poder + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
