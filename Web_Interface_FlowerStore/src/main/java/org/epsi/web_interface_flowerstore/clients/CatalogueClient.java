package org.epsi.web_interface_flowerstore.clients;
import org.epsi.web_interface_flowerstore.domain.Catalogue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "catalogue-service", url = "${catalogue-service.url}")
public interface CatalogueClient {

    @GetMapping
    List<Catalogue> getAllCatalogues();

    @GetMapping("/{id}")
    Catalogue getCatalogueById(@PathVariable("id") Long id);
}
