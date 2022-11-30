package src;

public class AjouterVilleExistanteException extends Exception {

	public AjouterVilleExistanteException(String nomVille) {
		super("La ville '" + nomVille + "' existe déjà. Elle ne peut pas être ajoutée");
	}

}
