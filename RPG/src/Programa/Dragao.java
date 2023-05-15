package Programa;

public class Dragao implements Fase{
	private int x;
    private int y;
    public int getY() {
    	return y;
    }
    public void setY(int y) {
    	this.y = y;
    }
    public int getX() {
    	return x;
    }
    public void setX(int x) {
    	this.x = x;
    }
	
  
	public Dragao() {
		this.x = 0;
		this.y = 0;
	}
	public void mover(int x, int y) {
		setX(x);
		setY(y);
		System.out.println("Dragao movido para a posição (" + x + ", " + y + ")");
	}
    @Override
    public void carregar() {
        System.out.println("Exibindo Dragão na tela");
    }
	@Override
	public String toString() {
		return "Dragao [x=" + x + ", y=" + y + "]";
	}
    
    
}
