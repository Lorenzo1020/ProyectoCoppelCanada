package LogicaInterface;

import java.util.ArrayList;
import java.util.List;

import Dominio.Zapatos;
import Interface.Metodos;

public class Implementacion implements Metodos{
	
	
	private List<Zapatos> lista = new ArrayList<Zapatos>();

	@Override  //Polimorfismo de sobreescritura
	public void guardar(Zapatos zapato) {
		// TODO Auto-generated method stub
		lista.add(zapato);
	}

	@Override
	public List<Zapatos> mostrar() {
		// TODO Auto-generated method stub
		List<Zapatos> listaNueva = lista;
		
		return listaNueva;
	}

	@Override
	public Zapatos buscar(int indice) {
		// TODO Auto-generated method stub
		Zapatos zapatoEn = lista.get(indice);
		
		return zapatoEn;
	}

	@Override
	public void editar(int indice, Zapatos zapato) {
		// TODO Auto-generated method stub
		lista.set(indice, zapato);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
