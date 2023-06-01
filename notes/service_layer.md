# Service Layer - Best Practices
- Apply transactinonal boundaries at the services layer <!-- Aplicar límites transaccionales en la capa de servicios -->
- Is the service layer's responsibility to manage transactional boundaries <!-- Es responsabilidad de la capa de servicio gestionar los límites transaccionales -->
- Implemntation code
    - Apply @Transactional on service methods
    - @Transactional on DAO methods if they already exist.
