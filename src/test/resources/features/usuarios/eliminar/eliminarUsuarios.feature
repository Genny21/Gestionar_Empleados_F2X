# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: en

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@EliminarUsuarios

Feature: Actualizar usuarios
Yo como usuario administrador de la plataforma ReqRes
Quiero poder eliminar los usuarios de la plataforma
Para mantener el privilegio de la informacion en la plataforma

# @HP               # Etiqueta para el Tipo de prueba [Happy Path]
# @SP               # Etiqueta para el Tipo de prueba [Sad Path]
# @AP               # Etiqueta para el Tipo de prueba [Altern Path]

Background: Acceder al servicio principal
  Given Que Genny se encuentra en la plataforma de gestion de usuarios


@HP
@EliminarUsuario
@CP-009
Scenario Outline: Eliminar un usuario registrado especifico

   When  Realiza la eliminacion del usuario con <id>
   Then Se respondera exitosamente con la confirmacion correspondiente
  Examples:
    | id |
    | 1  |
    | 3  |
    | 5  |


