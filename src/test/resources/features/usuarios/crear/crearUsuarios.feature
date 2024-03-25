# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: en

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@CrearUsuarios

Feature: Crear usuarios
Yo como usuario administrador de la plataforma ReqRes
Quiero poder ejecutar los servicios de creacion de usuarios de la plataforma
Para garantizar el uso de las funcionalidades de la plataforma

# @HP               # Etiqueta para el Tipo de prueba [Happy Path]
# @SP               # Etiqueta para el Tipo de prueba [Sad Path]
# @AP               # Etiqueta para el Tipo de prueba [Altern Path]

Background: Acceder al servicio principal
  Given Que Genny se encuentra en la plataforma de gestion de usuarios


@HP
@CrearUsuario
@CP-004
Scenario: Crear un usuario correctamente

  When  Envia la informacion requerida para su registro
  Then Se respondera con los resultados esperados

