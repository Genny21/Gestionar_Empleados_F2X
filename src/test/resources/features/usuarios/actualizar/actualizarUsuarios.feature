# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: en

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@ActualizarUsuarios

Feature: Crear usuarios
Yo como usuario administrador de la plataforma ReqRes
Quiero poder actualizar los usuarios de la plataforma
Para mantener la informacion actualizada en la plataforma

# @HP               # Etiqueta para el Tipo de prueba [Happy Path]
# @SP               # Etiqueta para el Tipo de prueba [Sad Path]
# @AP               # Etiqueta para el Tipo de prueba [Altern Path]

Background: Acceder al servicio principal
  Given Que Genny se encuentra en la plataforma de gestion de usuarios


@HP
@ActualizarUsuario
@CP-005
Scenario Outline: Actualizar un usuario registrado especifico

   When  Realiza la actualizacion del usuario con <id>
   Then Se respondera exitosamente con los resultados esperados
   And Se confirmara la actualizacion exitosa
  Examples:
    | id |
    | 1  |
    | 3  |
    | 5  |


