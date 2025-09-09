package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//    private  Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntity){
//        journalEntries.put(myEntity.getId(), myEntity);
//        return true;
//    }
//
//    @GetMapping("/id/{myid}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myid){
//        return journalEntries.get(myid);
//
//    }
//
//    @DeleteMapping("/id/{myid}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myid){
//        return journalEntries.remove(myid);
//
//    }
//
//    @PutMapping("/id/{myid}")
//    public JournalEntry UpdateJournalEntryById(@PathVariable Long myid ,@RequestBody JournalEntry myEntity){
//        return journalEntries.put(myid, myEntity);
//
//    }
//}
