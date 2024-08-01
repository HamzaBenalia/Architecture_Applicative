# Flower Marketplace Application

Bienvenue dans le projet **Flower Marketplace** ! Ce projet est une application de marché en ligne pour la vente de fleurs, construite avec **Spring Boot 3** et **Java JDK 17**. L'application utilise une architecture basée sur les microservices, avec une passerelle (Gateway) et un service de découverte Eureka.

## Architecture

L'application se compose des éléments suivants :

- **Gateway Service** : Gère le routage des requêtes entre les différents microservices.
- **Eureka Service** : Utilisé pour l'enregistrement et la découverte des microservices.
- **User Microservice** : Gère les utilisateurs (création, lecture, mise à jour, suppression).
- **Catalogue Microservice** : Gère les informations sur les fleurs disponibles dans le catalogue.
- **Web Interface Microservice** : Fournit une interface utilisateur web pour interagir avec les autres microservices.

## Prérequis

- Java JDK 17
- Spring Boot 3
- PostgreSQL ou autre base de données relationnelle
- Maven (ou autre outil de gestion de projet Java)

## Installation

### Cloner le dépôt

```bash
git clone https://github.com/votre-utilisateur/flower-marketplace.git
cd flower-marketplace

```
### Tester les API avec Postman
User Microservice :

POST http://localhost:8082/api/users
GET http://localhost:8082/api/users
GET http://localhost:8082/api/users/{id}
DELETE http://localhost:8082/api/users/{id}
Catalogue Microservice :

POST http://localhost:8081/api/catalogues
GET http://localhost:8081/api/catalogues
GET http://localhost:8081/api/catalogues/{id}
DELETE http://localhost:8081/api/catalogues/{id}
Accéder à l'interface web
Accédez à l'interface web via http://localhost:8083 pour voir les fleurs en catalogue et interagir avec l'interface utilisateur.



