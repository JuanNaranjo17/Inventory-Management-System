# Inventory Management System

## Overview

This project implements an **Inventory Management System** developed in **Java** using **NetBeans**. The system allows users to efficiently manage inventory through a **Graphical User Interface (GUI)**, providing essential features for stock management. The system is backed by a **MySQL database** to store and retrieve inventory data.

### Key Features:

- **Roles**: Admins and employees, with specific privileges for managing user roles.
- **CRUD Operations**: Both admins and employees can add products, purchases, and orders to manage inventory.
- **Intuitive GUI**: A user-friendly interface for seamless interaction with the system.
  
## Technologies Used

- **Java**: Programming language used to develop the system.
- **NetBeans IDE**: IDE for the development and debugging of the system.
- **MySQL**: Database used for storing the inventory, orders, and user data.
- **JDBC**: Java Database Connectivity for interaction between the application and MySQL database.
- **ojdbc7.jar**: Required JDBC driver for Oracle database connectivity.

## Installation

1. Clone this repository to your local machine: git clone https://github.com/yourusername/inventory-management-system.git
2. Make sure you have **Java** and **NetBeans IDE** installed.
3. Install **MySQL** and create a database for the system.
4. Add the `ojdbc7.jar` JDBC driver to your project dependencies. This is necessary for MySQL connectivity.
5. Set up the MySQL database by importing the provided **SQL scripts** for creating the required tables.

## Running the Application

1. Open the project in **NetBeans IDE**.
2. Connect the system to your MySQL database by configuring the `dbConfig.properties` file with your MySQL credentials.
3. Run the project, and the application will launch the Inventory Management System.

## Features

### Admin Role:

- Manage users: Add, edit, or delete employees.
- View and manage products, orders, and purchases.
- Grant roles to employees for limited access.

### Employee Role:

- View available products and their details.
- Add new products, purchases, and orders.
- View and manage their own orders.

### Database Interaction:

- Data for products, orders, purchases, and users is stored and managed in the MySQL database.
- Supports adding, deleting, and modifying entries via the GUI.

## Setup Instructions

1. **Database Configuration**: Configure MySQL with the provided scripts to set up tables for products, orders, purchases, and user roles.
2. **Adding JDBC Driver**: Ensure that the `ojdbc7.jar` file is added to the NetBeans project dependencies for seamless database interaction.
