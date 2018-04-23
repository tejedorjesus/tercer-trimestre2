
public class Articulo {

	private Integer codigo;
	private String descripcion;
	private Integer stockMinimo;
	private Integer stockActual;
	private Integer pvp;
	private Integer acumVentas;
	private static Integer siguiente =0;


	public Articulo(String descripcion, Integer stockMinimo,Integer stockActual,
			Integer pvp) {
		siguiente++;
		codigo = siguiente;
		this.descripcion = descripcion;
		this.stockMinimo = stockMinimo;
		this.stockActual = stockActual;
		this.pvp = pvp;
		acumVentas=0;
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



	public Integer getStockActual() {
		return stockActual;
	}



	public Integer getPvp() {
		return pvp;
	}



	public Integer getAcumVentas() {

		return acumVentas;
	}

	public void setAcumVentas(Integer acumVentas) {
		this.acumVentas = acumVentas;
	}


	public Integer vender (Integer unidades){// devuelve el numero de unidades que se pueden vender
		Integer unidadesVendidas;
		if(stockActual >= unidades){
			stockActual = stockActual - unidades;
			unidadesVendidas = unidades;
		}else{// me piden mas unidades de las que tengo
			unidadesVendidas = stockActual;
			stockActual = 0;			
		}
		acumVentas=acumVentas+(unidadesVendidas*pvp);
		return unidadesVendidas;
	}

	public Boolean bajoStock (){

		if (stockActual<stockMinimo){
			return true;
		}
		else{
			return false;	
		}	
	}


	public void comprar(Integer unidades){//

		if (stockActual<stockMinimo){
			stockActual = stockActual + unidades;
		}

		else {//No permito que compren a no ser que este bajo stock minimo

			Leer.mostrarEnPantalla("\n******Stock Actual NO inferior a Stock Minimo********");
		}

	}

	public String muestraArticulo() {
		return "Tienda [codigo=" + codigo + ", descripcion=" + descripcion + ", stockMinimo=" + stockMinimo
				+ ", stockActual=" + stockActual + ", pvp=" + pvp + ", acumVentas=" + acumVentas + "]";
	}








}
