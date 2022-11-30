package src;

public class NombreHabitantSup20000Exception extends NombreHabitantIncorrectException {

	public NombreHabitantSup20000Exception() {
		super("Un village doit avoir moins de 20 000 habitants");
	}
}
