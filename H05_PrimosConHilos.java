import java.util.ArrayList;
import java.util.Scanner;

public class H05_PrimosConHilos {
	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de hilos que calcularan los numeros primos del 1 al 100.000: ");
		Scanner sc = new Scanner(System.in);
		int numHilos = sc.nextInt();
		int rango = 100000 / numHilos;
		int inicio = 0;
		int fin = rango;

		ArrayList<H05_hilos> hilos = new ArrayList<>();
		
		for(int x = 0; x < numHilos; x++) {
			hilos.add(new H05_hilos(inicio, fin));
			inicio += rango; //De esta forma cada hilo empieza donde acababa el siguiente
			fin += (rango + 1);
		}
		hilos.forEach(H05_hilos::start);
	}
}
