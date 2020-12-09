package comparatori;

import java.util.Comparator;

import solidi.Solido;

public class ComparatoreDiPeso implements Comparator<Solido>{

	@Override
	public int compare(Solido o1, Solido o2) {
		double d = o1.peso() - o2.peso();
		return d > 0 ? 1 : -1; 
	}

}
