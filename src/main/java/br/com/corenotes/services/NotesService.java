package br.com.corenotes.services;

import br.com.corenotes.models.Notes;
import br.com.corenotes.repositories.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;

@Service
public class NotesService {
    private NotesRepository repository;

    @Autowired
    public NotesService(NotesRepository repository) {
        this.repository = repository;
    }

    public Notes addNotes (Notes notes) {
        return repository.save(notes);
    }

    public List<Notes> findNotes() {
        return repository.findAll();
    }

//    public Notes findNotesByFavorite() {
//        return repository.findAll();
//    }
}

