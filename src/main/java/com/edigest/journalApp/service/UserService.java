package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repository.JournalEntryRepository;
import com.edigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.logging.ErrorManager;

@Component
public class UserService {


    @Autowired
    private UserRepository UserRepository;


    public void saveEntry(User user){
        try {

            UserRepository.save(user);
        }
        catch(Exception e){
            ErrorManager log = null;
            log.error("Exception ", e, 404);
        }
    }

    public List<User> getAll(){
        return UserRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return UserRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        UserRepository.deleteById(id);
    }

    public User findByUserName(String userName) {
        return UserRepository.findByUserName(userName);
    }
}

