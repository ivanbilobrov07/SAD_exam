package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/notes")
public class NoteController {
    private NoteRepository noteRepository;

    public NoteController() {
        this.noteRepository = new NoteRepository();
    }

    @GetMapping("")
    public String viewNotes(Model model) {
        model.addAttribute("notes", noteRepository.getNotes());
        return "notes";
    }

    @GetMapping("/add")
    public String addNewNoteView(Model model) {
        model.addAttribute("note", new Note());
        return "add-note";
    }

    @PostMapping("")
    public RedirectView addNewNote(@ModelAttribute("note") Note note, RedirectAttributes redirectAttributes) {
        RedirectView redirectView = new RedirectView("/notes", true);

        noteRepository.addNote(new Note(note.getTitle(), note.getContent()));
        return redirectView;
    }
}