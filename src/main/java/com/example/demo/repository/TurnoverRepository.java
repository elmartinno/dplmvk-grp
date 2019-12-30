package com.example.demo.repository;

import com.example.demo.model.Turnover;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoverRepository extends MongoRepository<Turnover, String>{
}
