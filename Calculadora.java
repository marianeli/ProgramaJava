package application;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o Valor investido? ");
		double investimento = sc.nextDouble();
		
		int pessoas = 0;
		int pessoasCompar = 0;
		int pessoasClicam = 0;
		int pessoasComparRedes = 0;
		int pessoasVisualRedes = 0;
	    int x = 1;
		while (x <= investimento) {
		   pessoas = pessoas + 30;
		   pessoasCompar = pessoasCompar + 4;
		   x = x + 1;
		}
		
		System.out.println("Pessoas que visualizaram o anúncio original: " + pessoas);
		System.out.println("Pessoas que compartilharam o anúncio original: " + pessoasCompar);
		
		int y = 100;
		if (pessoas >= 100) {
			while (y <= pessoas) {
				   pessoasClicam = pessoasClicam + 12;
				   y = y + 100;
				}
		    System.out.println("Pessoas que clicaram no anúncio: " + pessoasClicam);
			
		    y = 20;
		    if (pessoasClicam >= 20) {
				while (y <= pessoasClicam) {
					pessoasComparRedes = pessoasComparRedes + 3;
					   y = y + 20;
					}
			    System.out.println("Pessoas que compartilharam nas redes sociais: " + pessoasComparRedes);
			}
		    
		    y = 1;
		    if (pessoasComparRedes >= 1) {
				while (y <= pessoasComparRedes) {
					pessoasVisualRedes = pessoasVisualRedes + 40;
					   y = y + 1;
					}
			    System.out.println("Pessoas que Visualizaram nas redes sociais: " + pessoasVisualRedes);
			}
		}
		
		System.out.println("Total de Pessoas que visualizarão o mesmo anúncio: " + (pessoas + pessoasCompar + pessoasComparRedes + pessoasVisualRedes));
		sc.close();
	}
}
