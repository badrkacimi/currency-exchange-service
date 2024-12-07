# Currency Exchange Service

This service is part of a microservices architecture, providing currency exchange rates and facilitating currency conversions.

## Prerequisites

- **Java Development Kit (JDK) 8 or higher**: Ensure that JDK is installed on your system.
- **Maven**: Required for building the application.

## Getting Started

### Clone the Repository

```
git clone https://github.com/badrkacimi/currency-exchange-service.git
cd currency-exchange-service
```

### API Endpoints

Retrieve Exchange Value: /currency-exchange/from/{from}/to/{to}
Method: GET
Description: Retrieves the exchange rate from one currency to another.

Parameters:
from: Currency code to convert from (e.g., USD).
to: Currency code to convert to (e.g., INR).
Example: /currency-exchange/from/USD/to/INR

### Acknowledgements
This project is inspired by the "Mastering Microservices" series.

