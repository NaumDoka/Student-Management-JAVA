package compito.scuola;

import java.util.List;
import java.util.Optional;

import compito.eccezioni.StudenteDuplicatoEccezione;
import compito.eccezioni.StudenteEccezione;
import compito.eccezioni.StudenteNonValidoEccezione;
import compito.studente.Studente;

public class Scuola {
	private final List<Studente> studenti;

	public Scuola(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}
	
	public void aggiungiStudente(Studente e) throws StudenteEccezione {
			controllaEta(e);
			controllaDuplicato(e);
			studenti.add(e);
	}

	private void controllaDuplicato(Studente e) throws StudenteDuplicatoEccezione {
		Optional<Studente> esistente = studenti.stream()
				                     .filter(x -> x.getNome().equals(e.getNome()))
				                     .findFirst();
		if(esistente.isPresent()) {
			throw new StudenteDuplicatoEccezione("studente esistente" + esistente.get());
		}
	}

	private void controllaEta(Studente e) throws StudenteNonValidoEccezione {
		if(e.getEta() <= 0) {
			throw new StudenteNonValidoEccezione("valore non valido per eta: " + e.getEta());
		}
	}
	
	public void aggiungiPermissivoStudente(Studente e) throws StudenteEccezione {
		try {
			controllaEta(e);
			controllaDuplicato(e);
		} finally {
			studenti.add(e);
		}
	}

}
