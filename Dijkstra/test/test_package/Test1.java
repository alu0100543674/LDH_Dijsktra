/* Nombre: Carla Hernández Díaz 
 * correo: alu0100543674@ull.edu.es
 * Laboratorio y Desarrollo de Herramientas
 * */

package test_package;
import static org.junit.Assert.*;
import operaciones.ListaNodo;

import org.junit.Test;

public class Test1 {
		@Test
		public void testListaVacia() { 
			ListaNodo Lista = new ListaNodo(); // Creamos un objeto Lista de tipo ListaNodo
			// Comprobamos si la lista esta vacia o no
			boolean resultado = Lista.isEmpty(); 
			assertTrue(resultado == true);
		}
}
