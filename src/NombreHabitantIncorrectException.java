package src;

public class NombreHabitantIncorrectException extends Exception {

	public NombreHabitantIncorrectException(int nbreHabitants) {
		super("Le nombre d'habitants " + nbreHabitants + " est incorrect");
	}

	public NombreHabitantIncorrectException(String message) {
		super(message);
	}
}
