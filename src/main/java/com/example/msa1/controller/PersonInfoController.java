package com.example.msa1.controller;

import com.example.msa1.domain.PersonInfo;
import com.example.msa1.service.PersonInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person-info")
public class PersonInfoController {

    private final PersonInfoService service;

    public PersonInfoController(PersonInfoService service) {
        this.service = service;
    }

    @PostMapping
    public PersonInfo create(@RequestBody PersonInfo personInfo){
        return service.create(personInfo);
    }
    @GetMapping("{id}")
    public PersonInfo getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping
    List<PersonInfo> getAll() {
        return service.getAll();
    }
    @PutMapping
    PersonInfo update(@RequestBody PersonInfo personInfo) {
        return service.update(personInfo);
    }

    @DeleteMapping("{id}")
    void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
