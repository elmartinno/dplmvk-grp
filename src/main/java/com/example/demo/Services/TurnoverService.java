package com.example.demo.Services;

import com.example.demo.model.Account;
import com.example.demo.model.Turnover;
import com.example.demo.repository.TurnoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoverService {
    @Autowired
    private TurnoverRepository turnoverRepository;

    public List<Turnover> getTests() {

        return turnoverRepository.findAll();
    }
    /*public void sendToDB(Turnover turnover) {
        turnoverRepository.insert(turnover);
    }*/

    /*public String getTestName(String name) {
        Account t = testRepository.findByName(name);
        return t.getIban();
    }*/
}
