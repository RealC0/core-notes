package br.com.corenotes.controllers;

import br.com.corenotes.models.Notes;
import br.com.corenotes.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private NotesService service;

    @Autowired
    public NotesController(NotesService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Notes> addNotes(@RequestBody Notes notes) {
        return ResponseEntity.ok(service.addNotes(notes));
    }

    @GetMapping
    public ResponseEntity<List<Notes>> findNotes() {
        return ResponseEntity.ok(service.findNotes());
    }
}

