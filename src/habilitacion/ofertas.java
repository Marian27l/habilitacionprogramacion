package habilitacion;

public class ofertas {
	
	// ATRIBUTOS 
	
	public double precio;
	public int descuento;

	
	public void oferta(int precio, int descuento) {
		this.precio = precio;
		this.descuento = descuento;
		
	}

public int precio() {
    return (int) precio;
}


public void precio(int precio) {
    this.precio = precio;
}


public int getcdescuento() {
    return descuento;
}


public void getdescuento(int descuento) {
    this.descuento= descuento;
}
}


