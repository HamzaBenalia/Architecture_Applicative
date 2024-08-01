package org.epsi.web_interface_flowerstore.controller;
import org.epsi.web_interface_flowerstore.domain.Catalogue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PanierController {


    private List<Catalogue> panier = new ArrayList<>();

//    @GetMapping("/panier")
//    public String panier(Model model) {
//        model.addAttribute("panier", panier);
//        double total = panier.stream().mapToDouble(Catalogue::getPrice).sum();
//        model.addAttribute("total", total);
//        return "panier";
//    }
}
