package cat.institutmvm.application.entities;

public class Persona {
	private String nom;

	public Persona(String nom) {
		this.nom = getNom();
	}


	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
