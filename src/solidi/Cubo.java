package solidi;

public class Cubo extends Solido{
	private double lato;
	
	public Cubo(double pesoSpecifico, double lato) {
		super(pesoSpecifico);
		this.lato = lato;
	}

	@Override
	public double volume() {
		return lato*lato*lato;
	}

	@Override
	public double superficie() {
		return lato*lato*6;
	}

	@Override
	public String toString() {
		return "Cubo [lato=" + lato + "]" + super.toString();
	}

	
}
