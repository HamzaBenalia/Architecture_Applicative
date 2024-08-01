package org.epsi.web_interface_flowerstore.controller;
import org.epsi.web_interface_flowerstore.clients.CatalogueClient;
import org.epsi.web_interface_flowerstore.domain.Catalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CatalogueController {


    @Autowired
    private CatalogueClient catalogueClient;

    @GetMapping("/catalogues")
    public String getCatalogues(Model model) {
        List<Catalogue> catalogues = catalogueClient.getAllCatalogues();
        model.addAttribute("catalogues", catalogues);
        return "catalogues";
    }

    @GetMapping("/catalogue/{id}")
    public String getCatalogueById(@PathVariable Long id, Model model) {
        Catalogue catalogue = catalogueClient.getCatalogueById(id);
        model.addAttribute("catalogue", catalogue);
        return "catalogue-detail";
    }
}
