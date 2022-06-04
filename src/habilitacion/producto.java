package habilitacion;

public class producto {
	
		// ATRIBUTOS 
		
		public int cantidaddeproducto;
		public String categoriadeproducto;
		public String selecciondeproducto;
		
		public producto(int cantidaddeproducto, String cateogoriadeproducto, String selecciondeproducto){
			this.cantidaddeproducto = cantidaddeproducto;
			this.categoriadeproducto = cateogoriadeproducto;
			this.selecciondeproducto = selecciondeproducto;

		}
		    public producto() {
			// TODO Auto-generated constructor stub
		}
			public int cantidaddeproducto() {
		        return cantidaddeproducto;
		    }
		    

		    public void getcantidaddeproducto(int cantidaddeproducto) {
		        this.cantidaddeproducto = cantidaddeproducto;
		    }


		    public String getcategoriadeproducto() {
		        return categoriadeproducto;
		    }


		    public void getcategoriadeproducto(String categoriadeproducto) {
		        this.categoriadeproducto = categoriadeproducto;
		    }


		    public String getselecciondeproducto() {
		        return selecciondeproducto;
		    }


		    public void getselecciondeproducto(String selecciondeproducto) {
		        this.selecciondeproducto = selecciondeproducto;
		    }

}
