package src;

import java.util.Objects;

public class Ville {

	// Variables de classe : communes à tous les objets
	// public static int NbObjetsVille = 0;
	private static int NbObjetsVillePrivate = 0;

	// Variables d'instance : spécifiques à chaque objet
	protected String nomVille; // null
	protected String nomPays;
	protected int nombreHabitants;
	protected char category;

	/**
	 * Méthode de classe : commune à tous les objets
	 * 
	 * @return the nbObjetsVillePrivate
	 */
	public static int getNombreVilles() {
		return NbObjetsVillePrivate;
	}

	/**
	 * Constructeur par défaut
	 */
	public Ville() {
		super();
	}

	/**
	 * Constructeur avec toutes les propriétés
	 * 
	 * @param nomVille
	 * @param nomPays
	 * @param nombreHabitants
	 * @throws NombreHabitantIncorrectException
	 */
	public Ville(String nomVille, String nomPays, int nombreHabitants) throws NombreHabitantIncorrectException {
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		setNombreHabitants(nombreHabitants);
		// NbObjetsVille++;
		NbObjetsVillePrivate++;
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @param nomPays the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @return the nombreHabitants
	 */
	public int getNombreHabitants() {
		return nombreHabitants;
	}

	/**
	 * @param nombreHabitants the nombreHabitants to set
	 * @throws NombreHabitantIncorrectException
	 */
	public void setNombreHabitants(int nombreHabitants) throws NombreHabitantIncorrectException {
		if (nombreHabitants <= 0)
			throw new NombreHabitantIncorrectException(nombreHabitants);
		else {
			this.nombreHabitants = nombreHabitants;
			setCategory();
		}
	}

	private void setCategory() {
		if (nombreHabitants < 10_000_000)
			category = 'A';
		else
			category = 'B';
	}

	@Override
	public String toString() {
		return "Je suis " + getType().getDescription() + " " + nomVille + " du pays " + nomPays + ", j'ai "
				+ nombreHabitants + " habitants (catégorie " + category + ")";
	}

	protected TypeVille getType() {
		return TypeVille.ville;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
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
		Ville other = (Ville) obj;
		return Objects.equals(nomVille, other.nomVille);
	}

}
