package Main;

import Dominio.Zapatos;
import LogicaInterface.Implementacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola mundo");

		// Crear mi coleccion de objeto
		Zapatos zapato1 = new Zapatos("Flexi", 27, 2500, "Formal");
		Zapatos zapato2 = new Zapatos("Addidas", 26.5f, 2000, "Casual");
		Zapatos zapato3 = new Zapatos("Nike", 26, 24000, "Casual");

		// Crear objeto o instanciar -- Ya tenemos acceso a todo lo que conetga esa
		// clase
		Implementacion imp = new Implementacion();

		// Metodos del crud ---- guardar
		imp.guardar(zapato1);
		imp.guardar(zapato2);
		imp.guardar(zapato3);

		// Mostrar
		System.out.println(imp.mostrar());

		// Buscar
		Zapatos zapatoEncontra = imp.buscar(0);
		System.out.println("Se encontro el registro " + zapatoEncontra);

		// Editar --- primero hay que buscar

		// Actualizar el objeto
		zapatoEncontra.setPrecio(3000);
		zapatoEncontra.setTalla(27.5f);

		// Actualizar objeto en la lista
		imp.editar(0, zapatoEncontra);

		// Mostrar
		System.out.println("Registros actualizados");
		System.out.println(imp.mostrar());

		// Eliminar
		imp.eliminar(1);

		// Mostrar
		System.out.println("Datos despues de la eliminacion");
		System.out.println(imp.mostrar());
				

	}

}
