package br.com.corenotes.repositories;

import br.com.corenotes.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Integer> {

}
