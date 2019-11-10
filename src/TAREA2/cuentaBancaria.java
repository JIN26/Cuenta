package TAREA2;

import java.util.Scanner;

public class cuentaBancaria {
	private int numeroCuenta, dia, mes, anio;
	private String nombres,apellidos;
	private double saldo;

	public	cuentaBancaria() {
		numeroCuenta=(int) Math.floor(Math.random()*(100000000-999999999+1)+999999999);
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresar Nombres: ");
		nombres=in.next();
		System.out.println("Ingresar Apellidos: ");
		apellidos=in.next();
		saldo=0.00;
		dia=8;
		mes=11;
		anio=2019;
		mostrarInicial();
	}
	public void mostrarInicial() {
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Titular: "+nombres+" "+apellidos);
		System.out.println("Fecha de apertura: "+dia+"/"+mes+"/"+anio);
		System.out.println("Saldo Inicial: "+saldo);
		System.out.println(" ");
	}
	public void Deposito() {
		double x;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el monto a depositar: ");
		x=in.nextInt();
		if(x>0) {
			System.out.println("Saldo Actual: " + (saldo+=x));
		}else {
			System.out.println("El valor no es valido intente de nuevo");
		}
		
	}
	public void Retiro() {
		double x;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el monto que desea retirar: ");
		x=in.nextInt();
		if(x>saldo) {
			System.out.println("El Monto excede el saldo en la cuenta");
		}else {
			if(saldo==0) {
				System.out.println("Su saldo actual es $0.00");
			}
			System.out.println("Saldo actual: "+(saldo-=x));
		}
	}
	public void Interes() {
		double interes=0,i=0;
		for(int j=0;j<=saldo;j+=100,i+=0.05) {
			interes=saldo*i;
		}
		System.out.println("Saldo Actual: "+saldo);
		System.out.println("Capitalizacion de Intereses: " + interes);
		System.out.println("Saldo Final: "+(saldo+interes));
	}
}
