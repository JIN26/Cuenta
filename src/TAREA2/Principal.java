/**
 * 
 */
package TAREA2;

import java.util.Scanner;

/**
 * @author Mario Luzardo
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cuentaBancaria cuenta = new cuentaBancaria();
		Scanner in = new Scanner(System.in);
		for(;;) {			
			System.out.println("¿Qué transacción desea realizar? ");
			System.out.println("1.Deposito \n"+"2.Retiro \n"+"3.Intereses");
		    int x=in.nextInt();
			do{
			switch(x) {
				case 1:
					cuenta.Deposito();
				break;
				case 2:
					cuenta.Retiro();
				break;
				case 3:
					cuenta.Interes();
				break;
				default:
					System.out.println("¡La opcion ingresada no es correcta!");
				break;		
			}
			}while(x<1||x>3);
			System.out.println("¿Desea realizar otra transaccion?     1.SI     2. NO");
			int y=in.nextInt();
			if(y==2) {
				break;
			}
		}
	}
}
