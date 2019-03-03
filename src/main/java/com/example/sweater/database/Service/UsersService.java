package com.example.sweater.database.Service;

import com.example.sweater.database.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sweater.database.repos.UsersRepo;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersRepo usersRepo;
    void delete (long id) {
        usersRepo.deleteById(id);
    }

    void editUsers(Long id, String username){
        Users users = usersRepo.getOne(id);
        users.setUsersurname(username);
        usersRepo.saveAndFlush(users);
    }
    void editUsers1(Long id, String usersurname){
        Users users = usersRepo.getOne(id);
        users.setUsersurname(usersurname);
        usersRepo.saveAndFlush(users);
    }
    void editUsers2(Long id, String userlogin){
        Users users = usersRepo.getOne(id);
        users.setUserlogin(userlogin);
        usersRepo.saveAndFlush(users);
    }
    void editUsers3(Long id, String usercountry){
        Users users = usersRepo.getOne(id);
        users.setUsercountry(usercountry);
        usersRepo.saveAndFlush(users);
    }
    void editUsers4(Long id, String userpassword){
        Users users = usersRepo.getOne(id);
        users.setUserpassword(userpassword);
        usersRepo.saveAndFlush(users);
    }
    void editUsers5(Long id, String useremail){
        Users users = usersRepo.getOne(id);
        users.setUseremail(useremail);
        usersRepo.saveAndFlush(users);
    }
    }

