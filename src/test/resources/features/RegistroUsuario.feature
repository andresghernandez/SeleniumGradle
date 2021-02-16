# language: en
# encoding: iso-8859-1
Feature: Registro de usuario
  yo como usuario de guru
  deseo poder realizar el registro en la pagina
  para poder acceder a las diferentes opciones

  @registro
  Scenario Outline: Registro de usuario
    Given que estoy en la pagina de registro <fila>
      | Ruta Excel                         | Pestaña  |
      | src/test/resources/data/Datos.xlsx | registro |
    When realizo el registro de los datos
    Then puedo finalizar la creacion del usuario

    Examples: 
      | fila |
      |    1 |
