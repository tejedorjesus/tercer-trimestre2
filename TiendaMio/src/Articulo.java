
public class Articulo {

	private Integer codigo;
	private String descripcion;
	private Integer  stockMinimo;
	private Integer stockActual;
	private Integer pvp;
	private Integer acumVentas;
	static private Integer siguiente=0;
	public Articulo( String descripcion, Integer stockMinimo, Integer stockActual, Integer pvp) {
		siguiente++;
		codigo = siguiente;
		this.descripcion = descripcion;
		this.stockMinimo = stockMinimo;
		this.stockActual = stockActual;
		this.pvp = pvp;
		acumVentas = 0;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public Integer getStockActual() {
		return stockActual;
	}
	public void setStockActual(Integer stockActual) {
		this.stockActual = stockActual;
	}
	public Integer getPvp() {
		return pvp;
	}
	public void setPvp(Integer pvp) {
		this.pvp = pvp;
	}
	public Integer getAcumVentas() {
		return acumVentas;
	}
	public void setAcumVentas(Integer acumVentas) {
		this.acumVentas = acumVentas;
	}

	public Integer vender (Integer unidades){
		

		if (stockMinimo<=(stockActual -unidades)){
			stockActual= stockActual-unidades;
			acumVentas= acumVentas +(unidades*pvp);
			
			Leer.mostrarEnPantalla("se han vendido" + unidades + "unidades ");
			Leer.mostrarEnPantalla("hemos facturado " + unidades + " x " + pvp + "=" +(unidades*pvp));
			


		}else {Leer.mostrarEnPantalla("no se puede vender si no tienes suficiente stock");
	}
	return unidades;
}
	
	
	public Integer comprar(Integer unidades){
		if(stockActual<stockMinimo){
		stockActual=stockActual+unidades;
		}else{Leer.mostrarEnPantalla("no se puede comprar hasta que no se llega al minimo de stock");
		}
		
		
		return unidades;
	}




@Override
public String toString() {
	return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", stockMinimo=" + stockMinimo
			+ ", stockActual=" + stockActual + ", pvp=" + pvp + ", acumVentas=" + acumVentas + "]";
}
public String muestraArticulo() {
	return "Tienda [codigo=" + codigo + ", descripcion=" + descripcion + ", stockMinimo=" + stockMinimo
			+ ", stockActual=" + stockActual + ", pvp=" + pvp + ", acumVentas=" + acumVentas + "]";
}






}


