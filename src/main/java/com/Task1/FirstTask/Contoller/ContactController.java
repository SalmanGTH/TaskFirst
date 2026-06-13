package com.Task1.FirstTask.Contoller;
import  com.Task1.FirstTask.model.Contact;
import org.springframework.web.bind.annotation.*;

    @RestController
    public class ContactController {

        @PostMapping("/submit")
        public String submitForm(@ModelAttribute Contact contact) {

            System.out.println("Name : " + contact.getName());
            System.out.println("Email : " + contact.getEmail());
            System.out.println("Message : " + contact.getMessage());

            return "Form Submitted Successfully!";
        }
    }

