package com.projet.cryptoptf.repositories;

import com.projet.cryptoptf.modeles.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {



}
