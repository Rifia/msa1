package com.example.msa1.service;

import com.example.msa1.domain.PersonInfo;
import com.example.msa1.repository.PersonInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{
    private final PersonInfoRepository personInfoRepository;

    public PersonInfoServiceImpl(PersonInfoRepository personInfoRepository) {
        this.personInfoRepository = personInfoRepository;
    }

    @Override
    public PersonInfo create(PersonInfo personInfo) {
        return personInfoRepository.save(personInfo);
    }

    @Override
    public PersonInfo getById(Integer id) {
        Optional<PersonInfo> result = personInfoRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<PersonInfo> getAll() {
        return personInfoRepository.findAll();
    }

    @Override
    public PersonInfo update(PersonInfo personInfo) {
        return personInfoRepository.save(personInfo);
    }

    @Override
    public void deleteById(Integer id) {
        personInfoRepository.deleteById(id);
    }
}
