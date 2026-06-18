package com.Task1.FirstTask.Contoller;
import  com.Task1.FirstTask.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import  com.Task1.FirstTask.Repository.ContactRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Contact contact) {

        repository.save(contact);

        return "Data Stored Successfully!";
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {

        return repository.findAll();
    }
}

