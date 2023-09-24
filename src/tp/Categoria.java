package tp;

public class Categoria {
	private String genero;
	
	public Categoria(String genero){
		this.genero = genero;
	}
	public Categoria() {}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return genero;
	} 
}
