package org.epsi.catalogue.controller;
import org.epsi.catalogue.domain.Catalogue;
import org.epsi.catalogue.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catalogues")
public class CatalogueController {



    @Autowired
    private CatalogueService catalogueService;

    // Create or Update
    @PostMapping
    public ResponseEntity<Catalogue> createOrUpdateCatalogue(@RequestBody Catalogue catalogue) {
        Catalogue savedCatalogue = catalogueService.saveOrUpdateCatalogue(catalogue);
        return new ResponseEntity<>(savedCatalogue, HttpStatus.OK);
    }

    // Get all
    @GetMapping
    public ResponseEntity<List<Catalogue>> getAllCatalogues() {
        List<Catalogue> catalogues = catalogueService.getAllCatalogues();
        return new ResponseEntity<>(catalogues, HttpStatus.OK);
    }

    // Get by id
    @GetMapping("/{id}")
    public ResponseEntity<Catalogue> getCatalogueById(@PathVariable Long id) {
        Optional<Catalogue> catalogue = catalogueService.getCatalogueById(id);
        return catalogue.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCatalogue(@PathVariable Long id) {
        catalogueService.deleteCatalogue(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
