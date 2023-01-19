package com.example.msa1.repository;

import com.example.msa1.domain.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepository extends JpaRepository<PersonInfo, Integer> {
}
