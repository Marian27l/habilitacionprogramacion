package habilitacion;

public class inventario {
	// ATRIBUTOS 
	
	public String nombre;
	public int cantidad;
	public String tipo;
	
	
	public inventario (String nombre,int cantidad,String tipo) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.tipo = tipo;
		
}

public inventario() {
		// TODO Auto-generated constructor stub
	}

public String nombre() {
    return nombre;
}


public void getnombre(String nombre) {
    this.nombre = nombre;
}


public int getcantidad() {
    return cantidad;
}


public void cantidad(int cantidad) {
    this.cantidad = cantidad;
}


public String gettipo() {
    return tipo;
}


public void gettipo(String tipo) {
    this.tipo = tipo;
}
}