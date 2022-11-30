package src;

public class Test {

	public static void main(String[] args) {

		// System.out.println("Nombre de villes instanciées : " +
		// Ville.getNombreVilles());

		// instancie le Pays : France
		Pays france = new Pays("France");

		// instancie les villes : Lyon, Marseille, Lille
		try {
			Ville lyon = new Ville("Lyon", "France", 7_000_000);
			Ville marseille = new Ville("Marseille", "France", 5_000_000);
			Ville lille = new Ville("Lille", "France", 6_000_000);

			Village foujus = new Village("Foujus", "France", 20_000);
			foujus.setNombreHabitants(3_000);
			Village chatelet = new Village("Chatelet", "France", 5_000);
			Village sivry = new Village("Sivry", "France", 1_200);

			// instancie la Capitale : Paris
			Capitale paris = new Capitale("Paris", "France", 10_000_000, "Tour Eiffel");

			// Ajoute les villes au Pays
			france.ajouterCapitale(paris);
			france.ajouterVille(lyon);
			france.ajouterVille(marseille);
			france.ajouterVille(lille);
			france.ajouterVille(foujus);
			france.ajouterVille(chatelet);
			france.ajouterVille(sivry);

			Ville lille2 = new Ville("Lille", "France", 3_000_000);
			Village chatelet2 = new Village("Chatelet", "France", 15_000);

			france.ajouterVille(chatelet2);
			france.ajouterVille(lille2);

		} catch (NombreHabitantIncorrectException | AjouterVilleExistanteException e) {
			System.err.println(e.getMessage());
		}

		System.out.println(france);
		System.out.println("Ce pays contient " + france.calculerNombreHabitants() + " habitants");

	}

}
