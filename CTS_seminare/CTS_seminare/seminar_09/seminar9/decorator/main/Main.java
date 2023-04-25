package seminar4.decorator.main;

import seminar4.decorator.clase.Decorator;
import seminar4.decorator.clase.DecoratorNotaDePlataLMA;
import seminar4.decorator.clase.DecoratorNotaPlataPasteFericit;
import seminar4.decorator.clase.INotaDePlata;
import seminar4.decorator.clase.NotaDePlata;

public class Main {
	public static void main(String[] args) {
		INotaDePlata notaDePlata= new NotaDePlata("2023-04-05");
		INotaDePlata notaDePlata2= new NotaDePlata("2023-04-06");
		
		notaDePlata.printeazaTotalDePlata(250);
		notaDePlata2.printeazaTotalDePlata(300);
		System.out.println();
		
		Decorator notaDePlataLMA= new DecoratorNotaDePlataLMA(notaDePlata);
		notaDePlataLMA.printeazaTotalDePlata(250);
		notaDePlataLMA.printeazaFelicitare();
		System.out.println();
		
		
		Decorator notaDePlataPaste= new DecoratorNotaPlataPasteFericit(notaDePlata2);
		notaDePlataPaste.printeazaTotalDePlata(250);
		notaDePlataPaste.printeazaFelicitare();
		System.out.println();
	}

}
