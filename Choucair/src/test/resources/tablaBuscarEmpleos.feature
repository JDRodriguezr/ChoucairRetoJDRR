Feature: Validación de filtro de empleos disponibles
#Precondiciones: El usuario debe estar en la página de Choucair testing

  Scenario: Realizar busqueda en los empleos disponibles
    Given que Julian se encuentra en la pagina de empleos de Choucair testing
    When Julian ingrese texto en la textbox de palabras clave
    Then se visualizan los trabajos relacionados con la palabra clave