# E-Commerce Spring Boot Application

A simple E-Commerce backend application built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.  
This project loads product data from a CSV file and stores it in a MySQL database automatically during application startup.

---

## 🚀 Features

- Spring Boot REST Application
- MySQL Database Integration
- Spring Data JPA & Hibernate
- CSV File Data Loading
- Product Entity Management
- Lombok Integration
- Maven Project Structure

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

---

## 📂 Project Structure

```bash
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ com.stschool.ecommerce
 ┃ ┃    ┣ entity
 ┃ ┃    ┣ repository
 ┃ ┃    ┗ EcommerceApplication.java
 ┃ ┗ resources
 ┃    ┣ application.properties
 ┃    ┗ products.csv
```

---

## ⚙️ Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
```

---

## 📄 CSV File Format

Place `products.csv` inside the `resources` folder.

Example:

```csv
name,maxRetailPrice,discountPercentage,isAvailable,company,category,manufacturedYear
iPhone 15,85000,10.5,true,Apple,Mobile,2025
Samsung S24,75000,8.0,true,Samsung,Mobile,2025
Laptop Pro,120000,15.0,true,Dell,Laptop,2024
```

---

## ▶️ Run the Project

Clone the repository:

```bash
git clone https://github.com/Saddalayogesh/ecommerce-springboot.git
```

Open the project in IntelliJ IDEA or Eclipse.

Run the application:

```bash
mvn spring-boot:run
```

---

## ✅ Output

- Products are loaded from CSV file
- Data is stored in MySQL database
- Spring Boot server runs on:

```bash
http://localhost:8080
```

---

## 👨‍💻 Author

Saddala Yogesh
