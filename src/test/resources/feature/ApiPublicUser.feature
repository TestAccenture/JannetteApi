#Author: j.yarleque.flores@accenture.com
#Feature: Validate_Login_Body
#Given: que Accenture Test Automation abre Google Chrome
#When: Se crea un archivo tipo Documento en Google Drive
#Then: la respuesta es igual a X y el parametro Key Token tenga un valor

@Feature1
Feature: Validate_Login_Body

COMO un usuario testaccenturedrive@gmail.com
QUIERO hacer uso de Api Public User
PARA presentar prueba


@tag1
Scenario: Validate_Login_Body_Caso_Exitoso
Given que Accenture Test Automation consume el Api
When se ingresa el usuario testaccenturedrive@gmail.com y contrasena testaccenturedrive2019
Then la respuesta es igual a 200 y el parametro Key Token tenga un valor

@tag2
Scenario: Validate_Login_Body_Caso_Incorrecto
Given que Accenture Test Automation consume el Api
When se ingresa el usuario testaccenturedrive@gmail.com y contrasena testaccenturedrive
Then la respuesta es igual a 404 y el parametro Key Token tenga un valor