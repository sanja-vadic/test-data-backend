package com.testdata.testdatabackend.db;

import com.testdata.testdatabackend.db.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query("FROM Client WHERE email = ?1")
    Client findByEmail(String email);

    @Query("FROM Client WHERE firstname = :firstname")
    List<Client> findAllByFirstName(@Param("firstname") String firstname);


    List<Client> findAllByLastname(String lastname);
    List<Client> findByFirstnameEndsWith(String ending);
    long countByFirstnameEndsWith(String ending);
    long countByFirstnameLike(String likeString);

}
