package src;

public class Capitale extends Ville {

	private String monument;

	public Capitale(String nomCapital, String pays, int nbHabitants, String monument)
			throws NombreHabitantIncorrectException {
		super(nomCapital, pays, nbHabitants);
		this.monument = monument;
	}

	/**
	 * @return the monument
	 */
	public String getMonument() {
		return monument;
	}

	/**
	 * @param monument the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	protected TypeVille getType() {
		return TypeVille.capitale;
	}

	@Override
	public String toString() {
		return super.toString() + ". Je possède le monument " + monument;
	}

}
