package org.epsi.catalogue.repository;

import org.epsi.catalogue.domain.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {
}
