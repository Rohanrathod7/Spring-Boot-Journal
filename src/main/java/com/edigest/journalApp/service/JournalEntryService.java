package com.edigest.journalApp.service;
import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {


    @Autowired
    private JournalEntryRepository JournalEntryRepository;


    public void saveEntry(JournalEntry journalEntry){
        JournalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return JournalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return JournalEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        JournalEntryRepository.deleteById(id);


    }
}

