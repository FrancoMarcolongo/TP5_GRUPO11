package tp;

public class Pelicula {
	private int id;
	private Categoria cat;
	private String titulo;
	
	public Pelicula(int id, Categoria cat,String titulo) {
		this.id	= id;
		this.titulo = titulo;
		this.cat = cat;
	}
	
	public Pelicula(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria cat) {
		this.cat = cat;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", titulo: " + titulo  + ", género: " + cat.toString();
	}
	
	
}
