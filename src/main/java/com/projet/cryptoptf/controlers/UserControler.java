package com.projet.cryptoptf.controlers;

import com.projet.cryptoptf.modeles.Users;
import com.projet.cryptoptf.services.UsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserControler {

    private static final Logger logger = LogManager.getLogger(UserControler.class);

    private final UsersService usersService;
        public UserControler(UsersService usersService) {
            this.usersService = usersService;
        }

    @GetMapping("/list")
    public List<Users> listUsers() {
        logger.info("Liste de tous les Utilisateurs récupérée");
        return usersService.listAll();
    }

    @PostMapping("/add")
    public void addPatient(@RequestBody Users user) {
        usersService.save(user);
        logger.info("Element User ajouté");
    }

    @GetMapping("/id")
    public Users showUser(Integer id) {
        return usersService.get(id);
    }

    @PostMapping("/update")
    public void updatePatient(@RequestBody Users user) {
        usersService.save(user);
        logger.info("Element User mis a jour en BDD");
    }

    @DeleteMapping("/delete")
    public void deletePatient(Integer id) {
        usersService.delete(id);
        logger.info("Element User supprimé");
    }

}
