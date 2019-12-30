package com.example.demo.Services;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /*public String getTestName(String name) {
        Account t = testRepository.findByName(name);
        return t.getIban();
    }*/

    public List<Account> getTests() {
        return accountRepository.findAll();
    }
    public void sendToDB(Account account) {
        accountRepository.insert(account);
    }
}
