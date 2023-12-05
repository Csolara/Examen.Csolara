package Servicios;

import java.util.Scanner;

/**
 * Metodo que implementa la interfaz de las operaciones.
 * csl - 051223
 */
public class OperativaImplementacion implements OperativaInterfaz {

	int resultado = 0;
	
	public int AñadirVenta() {
		
		System.out.println("Solicite el importe de la nueva venta: ");
		Scanner sc1 = new Scanner(System.in);
		
		int dineroAñadido;
		dineroAñadido = sc1.nextInt();
		resultado = dineroAñadido + resultado;
		
		System.out.println("Su cantidad total es de: " + resultado);
		
		return 0;
	}
	
	public int AñadirGasto() {
		
		System.out.println("Solicite el gasto que desea realizar: ");
		Scanner sc2 = new Scanner(System.in);
		
		int dineroGastado;
		dineroGastado = sc2.nextInt();
		resultado = resultado - dineroGastado;
		
		System.out.println("Su cantidad total es de: " + resultado);
		
		if (resultado < 0) {
			
			System.out.println("Debe Dinero :(");
			
		}else if(resultado == 0) {
			
			System.out.println("Su saldo actual es 0 :/");
			
		}else if(resultado > 0) {
			
			System.out.println(":D");
			
		}
		
		return 0;
	}
}