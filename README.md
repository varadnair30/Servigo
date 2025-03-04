## **Servigo**  
*A Full-Stack Service Booking Platform*  

### 📌 **Project Overview**  
Servigo is a **full-stack service booking platform** designed to connect service providers with clients, allowing businesses to list services and customers to book and review them. The platform ensures **secure authentication**, **scalability**, and **efficiency** using modern technologies like **Angular, Spring Boot, and MySQL**.  

---

## 🚀 **Features**  
### ✅ **User Management & Authentication**  
- Secure user authentication using **Spring Security & JWT**.  
- Role-based access control (RBAC) for **Clients** and **Service Providers**.  
- User registration and login with encrypted credentials.  

### ✅ **Service Listing & Booking**  
- Businesses can **list services** with descriptions, images, and pricing.  
- Clients can **search, filter, and book** services.  
- Service providers can **manage** their listed services.  

### ✅ **Reviews & Ratings**  
- Clients can leave **reviews and ratings** for booked services.  
- Average ratings are calculated and displayed for each service.  

### ✅ **Performance Optimization**  
- Used **Lombok** to reduce boilerplate code by **60%**.  
- Implemented **caching** strategies to improve query performance.  

### ✅ **Database & Scalability**  
- **MySQL** database for structured data storage.  
- Optimized queries and indexing for better performance.  

---

## 🛠 **Tech Stack**  
### **Frontend:**  
- Angular (TypeScript)  
- NgZorro UI Library  
- HTML, CSS, Bootstrap  

### **Backend:**  
- Spring Boot (Java)  
- Spring Security & JWT (Authentication)  
- Lombok (Code Optimization)  
- MySQL (Database)  

---

## ⚡ **Setup & Installation**  
### **Prerequisites**  
Ensure you have the following installed:  
- [Node.js & npm](https://nodejs.org/)  
- [Angular CLI](https://angular.io/cli)  
- [Java (JDK 17+)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [MySQL](https://dev.mysql.com/downloads/installer/)  
- [Spring Boot](https://spring.io/projects/spring-boot)  

### **Backend Setup (Spring Boot)**  
1. Clone the repository:  
   ```sh
   git clone https://github.com/your-username/Servigo.git
   cd Servigo/backend
   ```
2. Configure the database in `application.properties`:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/servigo_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run the Spring Boot application:  
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

### **Frontend Setup (Angular)**  
1. Navigate to the frontend directory:  
   ```sh
   cd ../frontend
   ```
2. Install dependencies:  
   ```sh
   npm install
   ```
3. Run the Angular development server:  
   ```sh
   ng serve
   ```
4. Open `http://localhost:4200` in your browser.  

---

## 🔥 **Future Enhancements**  
- Implement **payment gateway integration** (Stripe/PayPal).  
- Enhance **AI-driven recommendations** for users.  
- Introduce **admin dashboards** for analytics.  
