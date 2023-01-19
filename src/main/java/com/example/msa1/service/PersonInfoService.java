package com.example.msa1.service;

import com.example.msa1.domain.PersonInfo;

import java.util.List;

public interface PersonInfoService {
    PersonInfo create(PersonInfo personInfo);
    PersonInfo getById(Integer id);
    List<PersonInfo> getAll();
    PersonInfo update(PersonInfo personInfo);
    void deleteById(Integer id);
}
