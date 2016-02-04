
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class EDatosDiaDeLaSemana {


    public static void main(String[] args) {
        
        int c=1, e=1; //se asignan en 1(no puedes multiplicarlo por 0)
		int a, m, d;
		boolean verdadero = true; //lo uso para poder salir del do while

		Scanner leer = new Scanner(System.in);

		//2005, 5, 23
		do{
			System.out.print("Ingresa año: ");
			a = leer.nextInt();
			System.out.print(("Ingresa mes: "));
			m = leer.nextInt();
			System.out.print("Ingresa dia: ");
			d = leer.nextInt();

			if( (a < 0) || (a > 10000) || m < 1 || m > 12 || d < 1 || d > 31 ){
				System.out.println("No es una fecha valida.");
				verdadero = false; //con esto se asegura el bucle
			}
			else{
				verdadero = true; //si es una fecha valida salimos
			}

		}while(!(verdadero)); //si es falso se repite
		
		//algoritmo
		if (m > 2){
			m = m - 2; 
		}
		else{
			m = m +10;
			a = a - 1;
			c = a / 100;
			e = a % 100;
		}

		int b = ( ( (13 * m) -1) / 5 ) + (e / 4) + (c / 4);

		int f = ( b + e + d -(2*c) ) % 7;


		if (f == 0) {
			System.out.println((f+6)+" "+f+" "+(f+1));
		}
		else{
			System.out.println((f-1)+" "+f+" "+(f+1));//impresion en pantalla
		}
        
    }
    
}
