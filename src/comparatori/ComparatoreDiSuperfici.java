package comparatori;

import java.util.Comparator;

import solidi.Solido;

public class ComparatoreDiSuperfici implements Comparator<Solido> {

	@Override
	public int compare(Solido o1, Solido o2) {
		double d = o1.superficie() - o2.superficie();

		return d > 0 ? 1 : -1; //if ternario
	}

}
