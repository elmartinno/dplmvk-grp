package com.example.demo.Controllers;

import com.example.demo.Services.AccountService;
import com.example.demo.model.Account;
import com.example.demo.Services.TurnoverService;
import com.example.demo.model.Turnover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TestController {/*
    @Autowired
    private AccountService accountService;
    @Autowired
    private TurnoverService turnoverService;

    @GetMapping("/accounts")
    private Account getAllAccounts() {
        return accountService.getTests().get(0);
    }

    @GetMapping("/version")
    private String version() {
        return "v1";
    }

    /*
    @PostMapping("newTest")
    private void sendNewTest(@RequestBody Account account) {
        accountService.sendToDB(account);
    }

    @GetMapping("/turnovers")
    private List<Turnover> getAllTurnovers() {
        return turnoverService.getTests();
    }*/
}
