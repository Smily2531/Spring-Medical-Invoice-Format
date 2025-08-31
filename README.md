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
