package habilitacion;

public class provedores {
	// ATRIBUTOS 
	
	public String nombre;
	public int edad;
	public String sexo;
	public String cuidad;
	public String tipodeprovedor;
	
	public provedores(String nombre,int edad, String sexo, String cuidad, String tipodeprovedor) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.cuidad = cuidad;
		this.tipodeprovedor = tipodeprovedor;
		
}

public String nombre() {
    return nombre;
}


public void getnombre(String nombre) {
    this.nombre = nombre;
}


public int getedad() {
    return edad;
}


public void getedad(int edad) {
    this.edad = edad;
}


public String getsexo() {
    return sexo;
}


public void getsexo(String sexo) {
    this.sexo = sexo;
}


public String getcuidad () {
    return cuidad ;
}


public void setcuidad (String cuidad ) {
    this.cuidad  = cuidad ;
}


public String gettipodeprovedor() {
    return tipodeprovedor ;
}


public void settipodeprovedor(String tipodeprovedor ) {
    this.tipodeprovedor  = tipodeprovedor ;
}
}
