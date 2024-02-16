# Student-Management-JAVA
Questo progetto Java consiste in classi che modellano un ambiente scolastico e gestiscono le eccezioni relative alla gestione degli studenti.
Struttura:
Classe StudenteEccezione: È una classe di eccezione personalizzata che estende Exception. Serve come classe base per le eccezioni specifiche relative agli studenti.

Classe StudenteDuplicatoEccezione: Questa classe estende StudenteEccezione e rappresenta un'eccezione lanciata quando si tenta di aggiungere uno studente duplicato alla scuola. Fornisce un costruttore per impostare il messaggio dell'eccezione.

Classe StudenteNonValidoEccezione: Simile a StudenteDuplicatoEccezione, questa classe estende StudenteEccezione e rappresenta un'eccezione lanciata quando si tenta di aggiungere uno studente con un'età non valida (ad esempio, negativa o zero). Fornisce anche un costruttore per impostare il messaggio di eccezione.

Classe Studente: Questa classe rappresenta uno studente con gli attributi nome e età. Fornisce getter per questi attributi e sovrascrive il metodo toString().

Classe Scuola: Questa classe rappresenta una scuola e gestisce un elenco di studenti. Fornisce metodi per aggiungere studenti alla scuola, con una convalida per garantire che non vengano aggiunti duplicati e che l'età di ogni studente sia valida:
- aggiungiStudente(Studente e): Questo metodo tenta di aggiungere uno studente alla scuola. Per prima cosa controlla se l'età dello studente è valida (controllaEta(e)) e se lo studente non è un duplicato (controllaDuplicato(e)). Se entrambi i controlli sono superati, lo studente viene aggiunto all'elenco. Se viene lanciata un'eccezione durante una delle due convalide, questa viene propagata verso l'alto.

- controllaDuplicato(Studente e): Questo metodo controlla se uno studente con lo stesso nome esiste già nell'elenco degli studenti. Se viene trovato un duplicato, viene lanciata una StudenteDuplicatoEccezione.
- controllaEta(Studente e): Questo metodo controlla se l'età dello studente è valida (maggiore di 0). In caso contrario, viene lanciato uno StudenteNonValidoEccezione.
- aggiungiPermissivoStudente(Studente e): Questo metodo è una versione più permissiva di aggiungiStudente. Tenta di aggiungere uno studente alla scuola, ma anche se viene lanciata un'eccezione durante la convalida, assicura che lo studente venga comunque aggiunto all'elenco.
