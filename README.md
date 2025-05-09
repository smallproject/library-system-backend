# **Library System Backend**
Een backend-project voor een bibliotheeksysteem, gebouwd met Spring Boot en ontworpen om boeken, gebruikers, recensies en reserveringen te beheren.

---

## **Inhoud**
1. [Beschrijving](#beschrijving)
2. [Technologieën](#technologieën)
3. [Functies](#functies)
4. [Installatie](#installatie)
5. [Gebruik](#gebruik)
6. [Structuur van de projectmap](#structuur-van-de-projectmap)
7. [Link naar GitHub Repository](#link-naar-github-repository)

---

## **Beschrijving**
Dit project biedt een REST API-backend voor een bibliotheeksysteem. Het ondersteunt functies zoals:
- Beheer van boeken, auteurs, en recensies.
- Gebruikersauthenticatie en autorisatie.
- Reserveringen en beschikbaarheidscontrole.
- CRUD-functionaliteiten voor alle belangrijke entiteiten in het systeem.

---

## **Technologieën**
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (voor ontwikkeling/testen)
- **PostgreSQL** (voor productie)
- **Maven**
- **Spring Security**

---

## **Functies**
- **Boekenbeheer**: Voeg boeken toe, bewerk en verwijder ze.
- **Gebruikersbeheer**: Registreer gebruikers, beheer rollen, en implementeer login-functionaliteit.
- **Recensies**: Beheer recensies met functies zoals het markeren van spoilers of het signaleren van ongepaste inhoud.
- **Reserveringen**: Reserveringen van boeken en controle van beschikbaarheid.
- **Zoekfunctionaliteit**: Zoek op boeken, auteurs, of genres.

---

## **Installatie**

### Vereisten:
- Java 17+
- Maven 3.8+
- PostgreSQL

### Stappen:
1. **Clone de repository:**
   ```bash
   git clone <repository-link>
   cd library-system-backend


2. **Database instellen:**

- Voor ontwikkeling gebruik je de meegeleverde H2-database (standaardconfiguratie).
- Voor productie pas je de application.properties aan om je PostgreSQL-gegevens in te voeren.

3. **Afhankelijkheden installeren:**
    ```bash
   mvn clean install
   

4. **Applicatie starten:**
    ```bash
   mvn spring-boot:run

---

# Gebruik

- Voor toegang tot de API gebruik je tools zoals Postman of Swagger UI.
- Maak een beheerdersaccount om gebruikersrollen en rechten te beheren.
- Voeg boeken, auteurs, en recensies toe via de API's.

    ```bash
    library-system-backend/
    │  
    ├── src/
    │   ├── main/
    │   │   ├── java/nl/smallproject/www/librarysystembackend/
    │   │   │   ├── controllers/      # REST Controllers
    │   │   │   ├── models/           # Entity-klassen
    │   │   │   ├── repositories/     # JPA Repository-interacties
    │   │   │   ├── services/         # Business-logica
    │   │   └── resources/
    │   │       ├── application.properties  # Configuratie
    │   │       └── data.sql                
    │
    ├── test/                  # Eenheidstesten
    ├── pom.xml                # Maven-buildbestand
    └── README.md


# Link naar GitHub Repository
Library System Backend Repository  
https://github.com/smallproject/library-system-backend/tree/EN-5-Broncode-backend

---
## Endpoints

Wanneer deze server draait is hij benaderbaar op [http://localhost:8080](http://localhost:3000). Dis is de **basis url**, welke aan te vullen is middels de onderstaande endpoints.

### Registreren
`POST /register`

De keys `username` en `password` zijn vereist in de request body. Andere parameters mogen ook meeverstuurd worden, maar worden verder niet gevalideerd:

```javascript
{
  username: "klaasie",
  password: "123456"
}
```

Het wachtwoord wordt vervolgens versleuteld opgeslagen (met _bcryptjs_). De response bevat de JWT token die **na één uur expireert**.

### Inloggen
`POST /login`

De keys `username` en `password` zijn vereist om mee in te kunnen loggen. In de request body vinden we dus alleen het username en wachtwoord van de gebruiker, er mogen geen andere gegevens meegestuurd worden:

```javascript
{
  username: "klaasnl",
  password: "123456",
}
```

De response bevat de JWT token in de headers.

### Gebruikersdetails opvragen
`GET /api/v1/users/:id`

Alleen een ingelogde gebruiker kan zijn **eigen** gebruikersinformatie opvragen. Geef in het endpoint de `id` van gebruiker mee waarvan je de gegevens wil opvragen (dus bijvoorbeeld `/api/v1/users/1` of `/api/v1/users/2`). In de request body moet de JWT token worden meegestuurd om te checken of de ingelogde gebruiker wel toegang heeft tot deze resource. Gebruikers mogen immers alleen hun **eigen** gegevens opvragen.

```javascript
{
  "Content-Type": "application/json",
  Authorization: "Bearer xxx.xxx.xxx",
}
```

### Afgeschermde data opvragen
`GET /api/v1/private-content`

Alleen ingelogde gebruikers kunnen deze algemene afgeschermde content opvragen. Hierbij is de JWT token vereist in de request body:

```javascript
{
  "Content-Type": "application/json",
  Authorization: "Bearer xxx.xxx.xxx",
}
```

### Andere endpoints
Boeken

```http request
http://localhost:8080/api/v1/books
http://localhost:8080/api/v1/books/:id
```

Author

```http request
http://localhost:8080/api/v1/authors
http://localhost:8080/api/v1/authors/:id
```
Inventories

```http request
http://localhost:8080/api/v1/inventories
http://localhost:8080/api/v1/inventories/:id
```

User Reviews

```http request
http://localhost:8080/api/v1/userreviews
http://localhost:8080/api/v1/userreviews/:id
```