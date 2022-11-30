package src;

/**
 * Créer une classe Ident permettant de :
 * • stocker un identifiant (id) unique pour chaque objet créé (à partir d’un compteur),
 * • renvoyer l’id d’un objet
 * • renvoyer l’id du dernier objet créé.
 *
 * @author lph
 *
 */
public class Ident {

	private int id;
	
	private static int numero = 0;
	
	public Ident() {
		this.id = numero;
		numero++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public static int getDernierId() {
		return numero - 1;
	}
	
}
