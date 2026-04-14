package samuelvalentini.u5d7ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import samuelvalentini.u5d7ex.Autore;
import samuelvalentini.u5d7ex.playload.AutorePlayload;
import samuelvalentini.u5d7ex.playload.UpdateAutorePlayload;
import samuelvalentini.u5d7ex.service.AutoreService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    private final AutoreService autoreService;

    public AutoreController(AutoreService autoreService) {
        this.autoreService = autoreService;
    }

    @GetMapping
    public List<Autore> findAll() {
        return autoreService.findAll();
    }

    @GetMapping("/{autoreId}")
    public Autore findById(@PathVariable long autoreId) {
        return autoreService.findById(autoreId);
    }

    @PostMapping
    public Autore createNewAutore(AutorePlayload autorePlayload) {
        return autoreService.saveNewAutore(autorePlayload);
    }

    @PutMapping("/{autoreId}")
    public Autore updateAutore(@PathVariable long autoreId, @RequestBody UpdateAutorePlayload updateAutorePlayload) {
        return this.autoreService.findByIdAndUpdate(autoreId, updateAutorePlayload);
    }

    @DeleteMapping("/{autoreId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAutore(@PathVariable long autoreId) {
        autoreService.deleteAutore(autoreId);
    }

}
