package Interface;

import java.util.List;

import Dominio.Zapatos;

//interface es una plantilla para declarar metodos abstractos
public interface Metodos {
	
	//Metodos
	//1---Procedimientos(no tienen valor de retorno---salida)
		//modificadorAcceso void nombreProcd(parametros o argumentos---valores de entrada)
	//2---Funciones(siempre tienen valor de retorno)
		//modificadorAcceso tipoRetorno nombreFunc(parametros o argumentos---valores de entrada)
	
	public void guardar(Zapatos zapato);
	
	public List<Zapatos> mostrar();
	
	public Zapatos buscar(int indice);
	
	public void editar(int indice, Zapatos zapato);
	
	public void eliminar(int indice);
}
