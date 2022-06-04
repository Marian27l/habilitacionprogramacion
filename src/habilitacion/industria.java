package habilitacion;

public class industria {
	
	// ATRIBUTOS 
	
	public String nombre;
	public int telefono;
	public String email;
	public String provedores;
	public String inventario;
	
	public industria (String nombre,int telefono, String email, String provedores, String inventario) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.provedores = provedores;
		this.inventario = inventario;
	}
		

	    public industria() {
		// TODO Auto-generated constructor stub
	}


		public String nombre() {
	        return nombre;
	    }
	    

	    public void getnombre(String nombre) {
	        this.nombre = nombre;
	    }


	    public int gettelefono() {
	        return telefono;
	    }


	    public void gettelefono(int telefono) {
	        this.telefono = telefono;
	    }


	    public String getemail() {
	        return email;
	    }


	    public void getemail(String email) {
	        this.email = email;
	    }


	    public String getprovedores() {
	        return provedores;
	    }


	    public void setinventario(String inventario) {
	        this.inventario = inventario;
	    }


}
