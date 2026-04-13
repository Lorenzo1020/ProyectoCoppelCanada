package Dominio;

public class Zapatos {

	private String marca;
	private float talla;
	private float precio;
	private String tipo;

	public Zapatos(String marca, float talla, float precio, String tipo) {
		this.marca = marca;
		this.talla = talla;
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Zapatos [marca=" + marca + ", talla=" + talla + ", precio=" + precio + ", tipo=" + tipo + "]\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getTalla() {
		return talla;
	}

	public void setTalla(float talla) {
		this.talla = talla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
