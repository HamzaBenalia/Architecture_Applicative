package org.epsi.web_interface_flowerstore.service;

import org.epsi.web_interface_flowerstore.clients.CatalogueClient;
import org.epsi.web_interface_flowerstore.domain.Catalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueService {


    @Autowired
    private CatalogueClient catalogueClient;

    public List<Catalogue> getAllFlowers() {
        return catalogueClient.getAllCatalogues();
    }
}
