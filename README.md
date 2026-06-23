# Contact Management System

A Full Stack Web Application built using Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript. This project allows users to submit contact information through a form and provides an admin dashboard to view all saved contacts.

## 🚀 Features

* Responsive Contact Form
* Store Contact Details in MySQL Database
* Spring Boot REST API
* Spring Data JPA Integration
* Contact Management Dashboard
* Dynamic Data Fetching using JavaScript Fetch API
* Display Contacts in Table Format
* JSON Response Support

## 🛠 Tech Stack

### Frontend

* HTML
* CSS
* JavaScript

### Backend

* Java
* Spring Boot
* Spring Data JPA

### Database

* MySQL

## 📂 Project Structure

```text
src
 └── main
      ├── java
      │     ├── controller
      │     ├── model
      │     ├── repository
      │     └── FirstTaskApplication.java
      │
      └── resources
            ├── static
            │      ├── index.html
            │      ├── style.css
            │      ├── contacts.html
            │      └── script.js
            │
            └── application.properties
```

## 📌 API Endpoint

### Get All Contacts

```http
GET /contacts
```

Returns all stored contacts in JSON format.

## 📸 Functionality

* Users can submit Name, Email, and Message through the contact form.
* Submitted data is stored in a MySQL database.
* Admin can view all saved contacts through a dashboard page.
* Data is fetched dynamically from the backend using the JavaScript Fetch API.

## 💻 Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* HTML
* CSS
* JavaScript

## 🌟 Future Enhancements

* Update Contact Information
* Delete Contacts
* Search Contacts
* Pagination
* Authentication and Authorization

