package com.testdata.testdatabackend.db;

import com.testdata.testdatabackend.db.models.ClientSites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientSitesRepository extends JpaRepository<ClientSites, Integer> {
}
