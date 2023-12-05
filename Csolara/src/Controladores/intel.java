package Controladores;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class intel {

	/**
	 * Metodo principal de la aplicacion
	 * csl - 051223
	 * @param args
	 */
	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		boolean cerrarMenu = false;		
		long DineroTotal = 0;
		
		while(!cerrarMenu) {
			
			int opcionseleccionada = mi.MostrarMenu();
			
			switch(opcionseleccionada){
			
			case 0:
				System.out.println("Su dinero Total es: " + DineroTotal);
				System.out.println("Se cerrara la aplicacion");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("&=======================&");
				System.out.println("Has elegido añadir venta");
				System.out.println("&=======================&");
				DineroTotal = oi.AñadirVenta();				
				break;
				
			case 2:
				System.out.println("&=======================&");
				System.out.println("Has elegido añadir gasto");
				System.out.println("&=======================&");
				DineroTotal = oi.AñadirGasto();
				break;
				
			default:
				System.out.println("La opcion que ha seleccionado es incorrecta");				
			}
		}
	}
}
