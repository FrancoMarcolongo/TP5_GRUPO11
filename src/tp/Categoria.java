package tp;

public class Categoria {
	private int ID;
	private String Nombre;
	private String Genero;
	
	public Categoria(){
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return "Peliculas ID:" + ID + " Nombre:" + Nombre + " Genero:" + Genero + "";
	} 
}
