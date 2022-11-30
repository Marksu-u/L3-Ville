package src;

public class Pays {

	private String nom;
	private Ville[] listeVille = new Ville[1];

	public Pays(String nom) {
		this.nom = nom;
	}

	public void ajouterVille(Ville ville) throws AjouterVilleExistanteException {
//		if (ville != null && ville instanceof Ville && existe(ville))
		if (ville != null && ville.getType() == TypeVille.ville && existe(ville))
			throw new AjouterVilleExistanteException(ville.getNomVille());

		Ville[] tmp = listeVille;
		int pos = tmp.length;
		listeVille = new Ville[pos + 1];
		for (int i = 0; i < pos; i++)
			listeVille[i] = tmp[i];

		listeVille[pos] = ville;
	}

	private boolean existe(Ville ville) {
		boolean trouve = false;
		for (int i = 0; i < listeVille.length && !trouve; i++) {
			trouve = listeVille[i].equals(ville);
		}
		return trouve;
	}

	public int calculerNombreHabitants() {
		int nbHab = 0;
		for (Ville v : listeVille)
			nbHab += v.getNombreHabitants();
		return nbHab;
	}

	public void ajouterCapitale(Capitale cap) {
		listeVille[0] = cap;
	}

	@Override
	public String toString() {
		String desc = "Le Pays " + nom + " comporte les Villes suivantes : ";
		for (int i = 0; i < listeVille.length; i++)
			desc += "\n\t" + listeVille[i];
		return desc;
	}

}
