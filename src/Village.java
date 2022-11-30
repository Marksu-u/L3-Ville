package src;

public class Village extends Ville {

	public Village(String nomVille, String nomPays, int nombreHabitants) throws NombreHabitantIncorrectException {
		super(nomVille, nomPays, nombreHabitants);
	}

	@Override
	public void setNombreHabitants(int nbreHabitants) throws NombreHabitantIncorrectException {
		if (nbreHabitants > 20_000)
			throw new NombreHabitantSup20000Exception();
		else
			super.setNombreHabitants(nbreHabitants);
	}

	@Override
	protected TypeVille getType() {
		return TypeVille.village;
	}

}