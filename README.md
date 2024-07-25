# Desafio de Projeto - API RESTful
## Diagrama de Classes

````mermaid
classDiagram
    class User {
        +String name
    }
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }
    class Feature {
        +String icon
        +String description
    }
    class Card {
        +String cardNumber
        +float limit
    }
    class News {
        +String newsIcon
        +String description
    }

    User --> "1..*" Account
    User --> "1..*" Feature
    User --> "1..*" Card
    User --> "1..*" News
```
