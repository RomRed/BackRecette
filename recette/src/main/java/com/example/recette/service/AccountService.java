package com.example.recette.service;

import com.example.recette.model.entity.Role;
import com.example.recette.model.entity.Utilisateur;
import java.util.List;

public interface AccountService {
    Utilisateur addNewUtilisateur(Utilisateur utilisateur);
    Role addNewRole(Role role);
    void addRoleToUser(String nomUtilisateur, String libRole);
    Utilisateur getUtilisateur(String nomUtilisateur);
    List<Utilisateur> getUtilisateurs();
}
