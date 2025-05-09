```mermaid
sequenceDiagram
    actor Customer
    participant Web Browser
    participant Server
    participant Database
    participant Payment Gateway
    
    Customer ->> Web Browser: Open Library Website
    Web Browser ->> Server: Request Home Page
    Server ->> Web Browser: Send Home Page
    Web Browser ->> Customer: Display Home Page

    Customer ->> Web Browser: Search for Book
    Web Browser ->> Server: Request Book Search Results <br/> searchBooks(String title)
    activate Server
    Server ->> Web Browser: Send Book Search Results <br/> return List<BooksOutputDto>
    deactivate Server
    Web Browser ->> Customer: Display Search Results
    
    Customer ->> Web Browser: Add Book to Cart
    Web Browser ->> Server: Add Book to Cart <br> reservationList.add(book)
    activate Server
    Server ->> Database: Update Cart Data <br> updateReservation(reservationUpdateDto)
    Server ->> Web Browser: Confirm Book Added to Cart
    deactivate Server
    Web Browser ->> Customer: Display Cart with Book
    
    Customer ->> Web browser: Proceed to Checkout 
    Web Browser ->> Server: Request Checkout Page <br/> createReservation(reservationInputDto)
    Server ->> Database: Fetch Cart and Customer Data
    Database ->> Server: Return Cart and Customer Data
    Server ->> Payment Gateway: Request Payment Authorization
    Payment Gateway ->> Server: Confirm Payment Authorization
    Server ->> Web Browser: Send Checkout Confirmation <br> return Object
    Web Browser ->> Customer: Display Checkout Confirmation
    
    Customer ->> Web Browser: Logout
    Web Browser ->> Server: Request Logout
    Server ->> Web Browser: Confirm Logout
    Web Browser ->> Customer: Display Logout Confirmation
```
