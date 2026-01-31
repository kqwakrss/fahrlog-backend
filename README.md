# Fahrlog Backend

Fahrlog is a backend system for drivers that provides relevant
fuel stations, charging points and service centers based on
the user's vehicle data.

The system is designed to think in terms of the vehicle,
not manual filters.

---

## Scope

This project is intentionally limited in scope.

- Country: Ukraine  
- Initial release city: Kyiv  

These limitations are technical decisions to keep the system
simple, maintainable and focused.

The architecture allows adding more cities in the future
without redesigning the core domain.

---

## Core Idea

A user registers and adds their vehicle.
Based on vehicle data (fuel type, brand, etc.) the backend:

- determines what type of infrastructure is relevant
- filters out incompatible locations
- returns only meaningful results for the given vehicle

The user does not manually select fuel types.
The system derives this information from the vehicle itself.

---

## Planned Features

- Vehicle-based search for:
  - fuel stations
  - EV charging stations
  - service centers (STO)
- Integration with external APIs to retrieve fuel prices
- User comments and feedback for fuel stations
- Local caching of infrastructure data

This project is backend-first and API-oriented.
UI and frontend are out of scope for the initial phase.

---

## Tech Stack

- Java 17
- Spring Boot
- REST API
- Maven

Additional components (database, caching, security logic)
will be introduced incrementally as the domain evolves.

---

## Current Status

Early development stage.

At this point the project focuses on:
- project structure
- domain modeling
- architectural decisions

Business logic and persistence are added step by step.

---

## Philosophy

This is not a startup and not a commercial product (yet).
It is an engineering project focused on building
clean, realistic backend systems.

Scope control and simplicity are considered features.
