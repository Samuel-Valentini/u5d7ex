package samuelvalentini.u5d7ex.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import samuelvalentini.u5d7ex.Autore;
import samuelvalentini.u5d7ex.exception.NotFoundException;
import samuelvalentini.u5d7ex.playload.AutorePlayload;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AutoreService {

    private List<Autore> autoreDB = new ArrayList<>();

    public List<Autore> findAll() {
        return autoreDB;
    }

    public Autore saveNewAutore(AutorePlayload autorePlayload) {
        Autore autore = new Autore(autorePlayload.getNome(), autorePlayload.getCognome(), autorePlayload.getEmail(), autorePlayload.getDataDiNascita());
        this.autoreDB.add(autore);
        return autore;
    }

    public Autore findById(long autoreId) {
        Autore found = null;
        for (Autore autore : autoreDB) {
            if (autore.getId() == autoreId) {
                found = autore;
            }
        }

        if (found == null) throw new NotFoundException(String.valueOf(autoreId));

        return found;
    }

    public void deleteAutore(long autoreId) {
        Autore found = null;
        for (Autore autore : autoreDB) {
            if (autore.getId() == autoreId) {
                found = autore;
            }
        }

        if (found == null) throw new NotFoundException(String.valueOf(autoreId));

        String nome = found.getNome();
        String cognome = found.getCognome();
        this.autoreDB.remove(found);
        log.info("Autore {} {} rimosso", nome, cognome);
    }
}
