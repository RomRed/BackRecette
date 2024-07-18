package com.example.recette.service;

import com.example.recette.entity.Role;
import com.example.recette.entity.Utilisateur;
import com.example.recette.repository.RoleRepository;
import com.example.recette.repository.UtilisateurRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    private UtilisateurRepository utilisateurRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public AccountServiceImpl(UtilisateurRepository utilisateurRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.utilisateurRepository = utilisateurRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Utilisateur addNewUtilisateur(Utilisateur utilisateur) {
        String pw = utilisateur.getMdpUtilisateur();
        utilisateur.setMdpUtilisateur(passwordEncoder.encode(pw));
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String nomUtilisateur, String libRole) {
        Utilisateur utilisateur = utilisateurRepository.findByNomUtilisateur(nomUtilisateur);
        Role role = roleRepository.findByLibRole(libRole);

        if (utilisateur != null && role != null) {
            utilisateur.getRoleId();
            utilisateurRepository.save(utilisateur);
        }
    }


    @Override
    public Utilisateur getUtilisateur(String nomUtilisateur) {
        return utilisateurRepository.findByNomUtilisateur(nomUtilisateur);
    }

    @Override
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}
