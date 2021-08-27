package com.projet.cryptoptf.services;

import com.projet.cryptoptf.modeles.Users;
import com.projet.cryptoptf.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UserRepository userRepository;
    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> listAll() {
        return userRepository.findAll();
    }

    public Users save(Users patients) {
        return userRepository.save(patients);
    }

    public Users get(Integer id) {
        return userRepository.findById(id).get();
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }


}
