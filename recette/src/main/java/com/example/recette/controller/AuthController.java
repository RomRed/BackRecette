package com.example.recette.controller;

import com.example.recette.entity.Role;
import com.example.recette.entity.Utilisateur;
import com.example.recette.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AuthController {
private AccountService accountService;

    public AuthController(AccountService accountService) {
        this.accountService = accountService;
    }
@GetMapping(path="/users")
    public List<Utilisateur> utilisateurs(){
        return accountService.getUtilisateurs();
    }

    @PostMapping(path="/users")
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur){
return accountService.addNewUtilisateur(utilisateur);
}

    @PostMapping(path="/roles")
    public Role saveRole(@RequestBody Role role){
        return accountService.addNewRole(role);
    }



}


