# FunTravels - Real Estate and Vacation Management Platform

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Introduction
**FunTravels** is a comprehensive real estate and vacation management platform developed as part of my PFE (Projet de Fin d'Études) project for my professional license at **FST Settat**. The platform aims to simplify the processes involved in property listing, booking, and management for both property owners and travelers. Using a combination of modern web technologies, FunTravels provides a seamless user experience while ensuring efficient backend operations.

## Features
- **Property Listings**: Users can browse and search for available properties based on various criteria.
- **Booking System**: A straightforward booking system that allows users to reserve properties with ease.
- **User Management**: Secure user registration and login functionalities.
- **Admin Interface**: A dedicated dashboard for managing property listings and user accounts.
- **Responsive Design**: An intuitive interface optimized for both desktop and mobile devices.

## Technologies Used

### Frontend:
- **Angular**: Framework for building dynamic single-page applications (SPA).
- **Bootstrap**: For responsive design and styling.

### Backend:
- **Java**: Primary programming language for backend development.
- **Spring Boot**: Framework for building RESTful APIs and managing server-side logic.
- **MySQL**: Database management system for storing user and property data.
- **JWT (JSON Web Tokens)**: For secure user authentication and authorization.

### Development Methodology:
- **UML**: Used for designing the system architecture.
- **SCRUM**: Agile methodology employed to manage project development and ensure timely delivery.

## Installation

### Prerequisites:
- **Java JDK 11+**: Install from [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **MySQL**: Install and configure MySQL for the backend
- **Node.js** and **npm**: Install from [Node.js](https://nodejs.org)

### Frontend Setup (Angular):
1. Clone the repository:
   ```bash
   git clone https://github.com/walidchrif/funtravels.git
   cd funtravels/frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the Angular development server:
   ```bash
   ng serve
   ```

### Backend Setup (Spring Boot):
1. Navigate to the backend directory:
   ```bash
   cd funtravels/backend
   ```
2. Configure your database settings in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/funtravels
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build and run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

### Frontend:
- Access the application at `http://localhost:4200` to explore property listings and make bookings.

### Backend:
- The backend REST API will be running on `http://localhost:8000`.

## Contributing
1. Fork the project
2. Create your feature branch: `git checkout -b feature/my-feature`
3. Commit your changes: `git commit -m 'Add my feature'`
4. Push to the branch: `git push origin feature/my-feature`
5. Open a pull request
