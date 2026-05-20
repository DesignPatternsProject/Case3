## Observer Design Pattern – Product Availability Notification System

---

# Project Overview

This project demonstrates the implementation of the **Observer Design Pattern** in Java using an online store product notification system.

The system allows users to subscribe to a product and automatically receive notifications whenever the product availability changes.

This approach improves:

* System flexibility
* Communication between objects
* Maintainability
* Scalability

---

# Design Pattern Used

## Observer Pattern

The **Observer Pattern** is a behavioral design pattern where:

* A **Subject** maintains a list of observers.
* Observers are automatically notified whenever the subject’s state changes.

### In This Project

| Role               | Class      |
| ------------------ | ---------- |
| Subject Interface  | `Subject`  |
| Concrete Subject   | `Product`  |
| Observer Interface | `Observer` |
| Concrete Observer  | `User`     |

---

# Problem Statement

In online shopping systems, many users may wait for a product to become available again after being out of stock.

Without the Observer Pattern:

* Users must repeatedly check product availability manually.
* The system becomes tightly coupled.
* Communication becomes inefficient.

Using the Observer Pattern:

* Users subscribe to products.
* Products automatically notify users when availability changes.

---

# Project Structure

```text id="osofpn"
Project Folder
│
├── Main.java
├── Product.java
├── User.java
├── Subject.java
└── Observer.java
```

---

# Class Description

## 1. Subject Interface

Defines methods for managing observers.

### Methods

```java
void subscribe(Observer observer);

void unsubscribe(Observer observer);

void notifyObservers();
```

---

## 2. Product Class

Represents the product being observed.

### Attributes

```java
private String productName;

private boolean available;

private List<Observer> observers;
```

### Responsibilities

* Store subscribed users
* Notify users when availability changes

---

## 3. Observer Interface

Defines the update method for observers.

### Method

```java
void update(String productName, boolean available);
```

---

## 4. User Class

Represents subscribed users.

### Attribute

```java
private String name;
```

### Responsibility

Receive notifications from products.

---

## 5. Main Class

Tests the complete system behavior.

### Responsibilities

* Create products
* Create users
* Subscribe users
* Change product availability
* Demonstrate notifications

---

# UML Diagram Description

The UML diagram shows:
<img width="399" height="604" alt="image" src="https://github.com/user-attachments/assets/b2923efb-db62-4868-b6ec-2cfbb8a322af" />


* `Product` implementing `Subject`
* `User` implementing `Observer`
* Communication between Product and Users through notifications

---

# How the System Works

## Step 1

Create a product.

```java
Product laptop = new Product("Gaming Laptop");
```

## Step 2

Create users.

```java
User user1 = new User("Ahmad");
User user2 = new User("Sara");
User user3 = new User("Lina");
```

## Step 3

Subscribe users to the product.

```java
laptop.subscribe(user1);
laptop.subscribe(user2);
laptop.subscribe(user3);
```

## Step 4

Change product availability.

```java
laptop.setAvailability(true);
```

## Step 5

All subscribed users receive notifications automatically.

---

# Example Output

```text id="l8u5oq"
User subscribed to Gaming Laptop notifications.
User subscribed to Gaming Laptop notifications.
User subscribed to Gaming Laptop notifications.

--- Product becomes available ---

Product status changed!

Ahmad received notification: Gaming Laptop is now AVAILABLE!
Sara received notification: Gaming Laptop is now AVAILABLE!
Lina received notification: Gaming Laptop is now AVAILABLE!

--- One user unsubscribes ---

User unsubscribed from Gaming Laptop notifications.

--- Product goes out of stock ---

Product status changed!

Ahmad received notification: Gaming Laptop is OUT OF STOCK!
Lina received notification: Gaming Laptop is OUT OF STOCK!
```

---

# Advantages of Observer Pattern

* Loose coupling between objects
* Easier maintenance
* Better scalability
* Automatic real-time notifications
* Flexible subscription system

---

# Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Observer Design Pattern

---

# Conclusion

The Observer Design Pattern provides an efficient solution for implementing notification systems in e-commerce applications.

In this project:

* Users subscribe to product updates.
* Products notify all users automatically when availability changes.
* The system becomes more organized, scalable, and maintainable.

---
#### 👥 Team Members & Responsibilities

| Name          |  Responsibilities                     |
| -----------   |  ------------------------------------ |
| Asmaa Elaywi  |  Team Leader, GitHub Manager & README & UML diagram |
| Bylasan Hamdan     |Presentation & Media Specialist        |
| Fatima alzhraa Aljnaidah  | Lead Developer & Technical Presenter        |
|Ruba Alkum     | System Analyst & Concept Presenter |


