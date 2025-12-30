# Design Reasoning

Validation belongs in the service layer because it represents business rules that must be enforced consistently regardless of how the application is accessed. Keeping validation in the service layer ensures controllers remain lightweight and maintains a clear separation of concerns.
