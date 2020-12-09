package solidi;

public abstract class Solido implements Comparable<Solido> {
	private double pesoSpecifico;

	public Solido(double pesoSpecifico) {
		this.pesoSpecifico = pesoSpecifico;
	}

	public double getPesoSpecifico() {
		return pesoSpecifico;
	}

	public void setPesoSpecifico(double pesoSpecifico) {
		this.pesoSpecifico = pesoSpecifico;
	}

	public double peso() {
		return this.pesoSpecifico * volume();
	}

	public abstract double volume();

	public abstract double superficie();

	//comparatore di default
	public int compareTo(Solido o) {
		double ris = peso() - o.peso();
		return ris > 0 ? 1 : -1;
	}

	@Override
	public String toString() {
		return "[peso()=" + peso() + ", volume()=" + volume() + ", superficie()=" + superficie() + "]";
	}

}
