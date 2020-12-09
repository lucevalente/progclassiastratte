package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import comparatori.ComparatoreDiPeso;
import comparatori.ComparatoreDiSuperfici;
import solidi.Cubo;
import solidi.Sfera;
import solidi.Solido;

interface A {
	void f();
}

interface B {
	void g();
}

interface AB extends A, B { // estende entrambe le interfacce ma non deve prenderne i metodi

}

class C1 implements AB {

	@Override
	public void f() {

	}

	@Override
	public void g() {

	}

}

class C2 {

}

class C3 extends C1 { // non può estendere due classi

}

public class TestSolido {

	public static void main(String[] args) {
		Solido solid = new Cubo(34, 45);
		System.out.println(solid);
		Solido solida = new Sfera(34, 45);
		System.out.println(solida);

		Solido[] solidi = new Solido[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			if (r.nextInt(2) == 0) {
				solidi[i] = new Sfera(r.nextInt(30), r.nextInt(50));
			} else {
				solidi[i] = new Cubo(r.nextInt(30), r.nextInt(50));
			}
		}
		System.out.println("Pre order " + Arrays.toString(solidi));

		// cambio ordine per superficie
		Arrays.sort(solidi, new ComparatoreDiSuperfici());
		System.out.println("Post order superfici " + Arrays.toString(solidi));

		// cambio ordine per peso
		Arrays.sort(solidi, new ComparatoreDiPeso());
		System.out.println("Post order peso " + Arrays.toString(solidi));

		// array to list
		List<Solido> list_arr = Arrays.asList(solidi);
		System.out.println("Arrays to list" + list_arr);

		// liste
		List<Solido> list = new ArrayList<Solido>();
		for (int i = 0; i < 10; i++) {
			list.add(solidi[i]);
		}
		System.out.println("Stampo la lista: " + list);

		// adesso funziona perchè abbiamo stabilito un compareTo nella classe soldio
		Collections.sort(list);
		System.out.println("Stampo la lista ordinata in base al compare to: " + list);

		// funziona anche se nella classe non c'è nessun metodo di comparazione
		// specifico
		Collections.sort(list, new ComparatoreDiSuperfici());
		System.out.println("Stampo la lista ordinata in base alle superfici: " + list);

		// lista al contrario
		Collections.reverse(list);
		System.out.println("Stampo la lista ordinata invertita: " + list);

		// set di solidi
		Set<Solido> solidi_set = new HashSet<Solido>();
		Solido cubo = new Cubo(34, 45);
		Solido sfera = new Sfera(34, 45);
		Solido sfera_identica = new Sfera(34, 45);

		solidi_set.add(cubo);
		solidi_set.add(sfera);
		solidi_set.add(sfera_identica);
		System.out.println("Stampo il set: " + solidi_set);

		for (int i = 0; i < solidi.length; i++) {
			Solido val = solidi[i];
			System.out.println("Elemento " + solidi[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			Solido val_list = list.get(i);
			System.out.println("Elemento " + list.get(i));
		}

		// for each
		for (Solido val : solidi) {
//			val.setPesoSpecifico(0);
			System.out.println("Array nel for each " + val);
		}

		for (Solido val_list : list) {
			System.out.println("Lista nel for each" + val_list);
		}

		for (Solido val_set : solidi_set) {
			System.out.println("set nel for each" + val_set);
		}
	}

}
