package com.testdata.testdatabackend.api;

import com.testdata.testdatabackend.db.ClientRepository;
import com.testdata.testdatabackend.db.ClientSitesRepository;
import com.testdata.testdatabackend.db.models.Client;
import com.testdata.testdatabackend.db.models.ClientSites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientSitesRepository clientSitesRepository;

    @GetMapping("/client")
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @GetMapping("/client/site")
    public List<ClientSites> getClientSites() {
        return clientSitesRepository.findAll();
    }

    @GetMapping("/client/email/{email}")
    public Client findByEmail(@PathVariable("email") String clientEmail) {
        return clientRepository.findByEmail(clientEmail);
    }

    @GetMapping("/client/firstname/{firstname}")
    public List<Client> findAllByFirstName(@PathVariable("firstname") String firstname) {
        return clientRepository.findAllByFirstName(firstname);
    }

    @GetMapping("/client/lastname/{lastname}")
    public List<Client> findAllByLastName(@PathVariable("lastname") String lastname) {
        return clientRepository.findAllByLastname(lastname);
    }

    @GetMapping("/client/by/firstname/ends/with/{ending}")
    public List<Client> findByFirstnameEndsWith(@PathVariable("ending") String ending) {
        return clientRepository.findByFirstnameEndsWith(ending);
    }

    @GetMapping("/client/count/by/firstname/ends/with/{ending}")
    public long countByFirstnameEndsWith(@PathVariable("ending") String ending) {
        return clientRepository.countByFirstnameEndsWith(ending);
    }

    @GetMapping("/client/count/by/firstname/like/{likeString}")
    public long countByFirstnameLike(@PathVariable("likeString") String likeString) {
        return clientRepository.countByFirstnameLike(likeString);
    }
}
