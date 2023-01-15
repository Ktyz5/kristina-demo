package com.example.kristinademo.controler;

import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.service.ClientService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor

public class ControlClient {
   private final ClientService clientService;


    @GetMapping(value = "/clientAll")
    public List<ClientDto> getClientListAll(){
        return clientService.readAll();
    }

    @GetMapping(value = "/client/{id}")
    public ResponseEntity< ClientDto > getEntity(@PathVariable("id") Long id ){
       var clientId = clientService.readId(id);
        return ResponseEntity.ok(clientId);
    }

    @GetMapping(value = "/clientSorted/{name}")
    public List<ClientDto> getClientSortedName(@NonNull @PathVariable("name") String name){
    return clientService.sorted(name);
    }

    @PostMapping(value = "/clients")
    public ResponseEntity<ClientDto> create(@NonNull @RequestBody ClientDto clientDto) {
    clientService.create(clientDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "client/{id}")
    public ResponseEntity<ClientDto> updateClientId(@NonNull @RequestBody Long id) {
       clientService.update(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("client/{id}")
    public ResponseEntity<ClientDto> delete(@PathVariable("id") Long id) {
        clientService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
