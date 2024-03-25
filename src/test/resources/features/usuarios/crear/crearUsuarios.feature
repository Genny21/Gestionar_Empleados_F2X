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
Scenario Outline: Crear un usuario correctamente

  When  Envia la informacion requerida con <id> para su registro
  Then Se respondera exitosamente la creacion del usuario
  And Se mostrara la informacion del usuario creado

  Examples:
    | id   |
    | 257  |


@SP
@UsuarioNoValido
@CP-005
Scenario Outline: Intentar crear un usuario con error

  When  No envia la informacion valida requerida con <id> para su registro
  Then Se respondera con los resultados esperados

  Examples:
    | id   |
    | register  |


@AP
@CrearUsuarioVacio
@CP-006
Scenario Outline: Crear un usuario sin informacion

    When  No envia la informacion requerida con <id> para su registro
    Then Se respondera exitosamente la creacion del usuario

    Examples:
      | id   |
      | 258  |