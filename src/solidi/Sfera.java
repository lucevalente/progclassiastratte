package solidi;

public class Sfera extends Solido {
	private double raggio;
	public Sfera(double raggio, double pesoSpecifico) {
		super(pesoSpecifico);
		this.raggio=raggio;
	}
	
	@Override
	public double volume() {
		return 4/3*Math.PI*raggio*raggio;
	}
	
	@Override
	public double superficie() {
		return raggio*2*Math.PI;
	}

	@Override
	public String toString() {
		return "Sfera [raggio=" + raggio + "]" +super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(raggio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sfera other = (Sfera) obj;
		if (Double.doubleToLongBits(raggio) != Double.doubleToLongBits(other.raggio))
			return false;
		return true;
	}
	
	
	
}
