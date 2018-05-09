import java.util.Random;

import javax.swing.JOptionPane;

public class Questao06 {

	public static void main(String[] args) {

		int numeros[] = new int[10], numeroPar = 0, numeroImpar = 0, numerosNeutros = 0, numerosPositivos = 0,
				numerosNegativos = 0;
		double mediaNumeros = 0, somaNumeros = 0;
		Random aleatorio = new Random();
		String texto = "Números gerados aleatóriamente:\n";

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio.nextInt(100)-50;
			texto += numeros[i]+"\n";
			somaNumeros += numeros[i];

			if (numeros[i] == 0) {
				numerosNeutros++;
			} else if (numeros[i] % 2 == 0) {
				numeroPar++;
			} else {
				numeroImpar++;
			}

			if (numeros[i] < 0) {
				numerosNegativos++;
			} else if (numeros[i] > 0) {
				numerosPositivos++;
			}

		}
		
		mediaNumeros = somaNumeros / numeros.length;
		texto+="Soma dos números: " + somaNumeros+
			   "\nMédia dos números: " +mediaNumeros + 
			   "\nNúmeros pares: " + numeroPar + " números ímpares: " + numeroImpar+ 
			   "\nNumeros positivos: " + numerosPositivos + " Números negativos: " + numerosNegativos	+ " Números neutros:" + numerosNeutros
		;
		
		JOptionPane.showMessageDialog(null, texto, "Números aleatórios", JOptionPane.PLAIN_MESSAGE);

	}

}
