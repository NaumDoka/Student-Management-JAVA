package compito.studente;

public class Studente {
	private final String nome;
	private final int eta;

	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[nome=" + nome + "]" + "[eta=" + eta + "]";
	}

}
