# 🧾 Medical Invoice Billing System (Spring Boot + MySQL + Thymeleaf)

## 📌 Project Overview
This project is a **Medical Invoice Billing System** built using **Spring Boot, MySQL, Thymeleaf, and JDBC**.  
The system fetches **pre-stored medicine details** from a MySQL database and displays them in a **bill format**.  

⚡️ Key Highlights:  
- Users do **not insert data via browser**.  
- All medicine details are **already stored in MySQL**.  
- Visiting **`/invoice`** will fetch the data and generate a **medical bill**.  

---

## 🏗️ Tech Stack
- **Backend**: Spring Boot (Java)  
- **Frontend**: Thymeleaf (HTML, CSS)  
- **Database**: MySQL  
- **ORM/DB Layer**: Spring JDBC (JdbcTemplate)  

---

## 📂 Project Structure
<img width="615" height="266" alt="Project Structure" src="https://github.com/user-attachments/assets/31ef1105-7bde-4015-be66-2101bfd50dbb" />

---

## ⚙️ Database Setup

**1️⃣ Create Database**
```sql
CREATE DATABASE medical_shop;
USE medical_shop;

2️⃣ Create Table

CREATE TABLE invoice_item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    quantity INT,
    description VARCHAR(255),
    packing VARCHAR(255),
    gst DOUBLE,
    trade_price DOUBLE,
    retail_price DOUBLE,
    discount DOUBLE,
    expiry_date DATE,
    net_amount DOUBLE
);

3️⃣ Insert Sample Medicines

INSERT INTO invoice_item (quantity, description, packing, gst, trade_price, retail_price, discount, expiry_date, net_amount)
VALUES
(10, 'Paracetamol', '10x10', 5.0, 20.0, 25.0, 10.0, '2026-05-10', 237.50),
(5, 'Amoxicillin', '5x10', 12.0, 50.0, 60.0, 5.0, '2025-12-01', 318.00);

⚙️ Application Properties

Configure MySQL in application.properties:

spring.application.name=MedicalInvoiceApp
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/medical_shop
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

🚀 Running the Project

1️⃣ Clone the repository

git clone https://github.com/yourusername/medical-invoice-billing.git
cd medical-invoice-billing


2️⃣ Build and run

mvn spring-boot:run


3️⃣ Open in browser

http://localhost:8081/invoice

## 📸 Screenshots  

**Invoice View (Outputs):**

<img width="1248" height="538" alt="Screenshot 2025-08-31 171502" src="https://github.com/user-attachments/assets/df8d7833-2959-4ee2-9a67-d9153e891344" />





📌 Features

✅ Fetches medicines directly from MySQL database.

✅ Displays invoice table with medicine details.

✅ Shows Total Amount, GST, and Receivable.

✅ Clean UI built with Thymeleaf + CSS.

✨ Author

👨‍💻 N Smily
B.Tech CSE (4th Year) @Aditya College of Engineering & Technology (ACET)
