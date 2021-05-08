
Feature: Validación de información de contacto del footer de Choucair testing
#Precondiciones: El usuario debe estar en la página de Choucair testing

  Scenario: Contacto por teléfono en Bogotá
    Given que Andres se encuentra en la pagina de empleos de Choucair testing
    When busque la informacion de contacto de la empresa en la pagina
    Then se mostrara la informacion correcta para cada forma de contacto con la empresa