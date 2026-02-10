# E-commerce Backend API

## Project Overview
This is a simple Java backend application for an **E-commerce platform** (similar to Flipkart/Amazon). It implements a RESTful API to manage the product inventory.

The application allows administrators to:
1.  **Add new products** to the catalog.
2.  **Retrieve product details** by ID.
3.  **View all products** currently available.

## Technical Requirements Met
- **Item Model:** Defined with properties `id`, `name`, and `description`.
- **Data Storage:** Implemented using in-memory `ArrayList` for efficiency.
- **RESTful API:** Standard HTTP methods (`GET`, `POST`) for item management.
- **Input Validation:** Ensures product names are present and descriptions meet length requirements.

## Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot (Web, Validation)
- **Build Tool:** Maven

## How to Run the Application

1.  **Clone the repository:**
    ```bash
    git clone <your-repo-url>
    ```
2.  **Build the project:**
    ```bash
    mvn clean install
    ```
3.  **Run the server:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

---

## API Documentation

### 1. Add a Product to Inventory
Adds a new item to the e-commerce catalog.

* **Endpoint:** `/api/items`
* **Method:** `POST`
* **Content-Type:** `application/json`

**Request Body Example:**
```json
{
  "name": "Gaming Laptop - ASUS TUF",
  "description": "High-performance laptop with RTX 3050, 16GB RAM, 512GB SSD."
}