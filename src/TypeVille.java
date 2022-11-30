package src;

public enum TypeVille {
	ville("une Ville"), village("un Village"), capitale("une Capitale");

	private String description;

	private TypeVille(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}
