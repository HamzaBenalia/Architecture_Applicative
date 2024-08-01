package org.epsi.catalogue.service;

import org.epsi.catalogue.domain.Catalogue;
import org.epsi.catalogue.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;

    // Create or Update
    public Catalogue saveOrUpdateCatalogue(Catalogue catalogue) {
        return catalogueRepository.save(catalogue);
    }

    // Read all
    public List<Catalogue> getAllCatalogues() {
        List<Catalogue> catalogues = catalogueRepository.findAll();
        if (catalogues.isEmpty()) {
            System.out.println("No catalogues found.");
        } else {
            System.out.println("Catalogues retrieved: " + catalogues.size());
        }
        return catalogues;
    }

    // Read by id
    public Optional<Catalogue> getCatalogueById(Long id) {
        return catalogueRepository.findById(id);
    }

    // Delete
    public void deleteCatalogue(Long id) {
        catalogueRepository.deleteById(id);
    }
}
