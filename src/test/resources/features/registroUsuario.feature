#Autor: Camilo Nuñez Torres
@stories
  Feature: Registro de usuario en Utest

  @Scenario1
  Scenario:Registro de Camilo en la pagina Utest
    Given : Camilo quiere registrarse en Utest
    When : El  usuario ingresa los datos requeridos por el sistema
    |strNombre|strApellido|strCorreo       |strMes |strDia|strAno|strCiudad|strZip|strPais |strDispositivoMovil|strModeloMovil|strSoMovil|strClave  |
    |Camilo   |Nunez      |iuaas343445sd343a4@gmail.com|January|11    |1996  |Palmira     |12345 |Colombia|Apple              |iphone 5s     |iOS 11.0  |Camilo123.|
    Then : El registro se completa al ver el boton de Complete Setup


