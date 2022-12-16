Feature: Búsqueda en Saucedemo

  @test
  Scenario: logeo exitoso en Saucedemo

    When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Then valido que debería aparecer el título de "PRODUCTS"
    And también valido que al menos exista un item