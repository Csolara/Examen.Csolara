package Servicios;

import java.util.Scanner;

/**
 * Metodo que implementa la interfaz del menu.
 * csl - 051223
 */
public class MenuImplementacion implements MenuInterfaz{
	
	
	Scanner sc1 = new Scanner(System.in);
	public int MostrarMenu() {
		
		int SeleccionUsuario;
		
		System.out.println("###########################");
		System.out.println("0. Mostrar total");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("###########################");
		
		SeleccionUsuario=sc1.nextInt();
		return SeleccionUsuario;
	}	

}
