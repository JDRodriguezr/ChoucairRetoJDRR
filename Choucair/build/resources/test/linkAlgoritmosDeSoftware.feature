
Feature: Validación de hipervínculo de “Algoritmos de software”
#Precondiciones: El usuario debe estar en la página de Choucair testing

  Scenario: Aprender sobre los Algoritmos de software
    Given que Oscar se encuentra en la pagina de empleos de Choucair testing
    When seleccione Algoritmos de software
    Then debe ser dirigido a la pagina de Algoritmos de software
