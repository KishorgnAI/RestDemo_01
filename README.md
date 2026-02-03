File: `README.md`

# Product Service

## Overview
Simple Spring Boot service exposing product data via REST endpoints. Controller: `com.hsbc.controller.ProductController`.

## Existing ReST Endpoints
\- `GET /products`  
\- Handler: `ProductController.findAllProducts()`  
\- Description: Returns a list of all products as JSON.  
\- Response: `200 OK` with `application/json` body (array of `Product` objects).

### Sample response
```json
[
  {
    "id": 1,
    "name": "Sample Product",
    "description": "Short description",
    "price": 19.99,
    "createdAt": "2024-01-01T12:00:00"
  }
]
