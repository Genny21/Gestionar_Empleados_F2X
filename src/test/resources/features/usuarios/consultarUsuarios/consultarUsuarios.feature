# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: en

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Usuarios

Feature: Consultar usuarios
Yo como usuario administrador de la plataforma ReqRes
Quiero poder ejecutar los servicios de busqueda de usuarios de la plataforma
Para la identificacion y uso dentro en las funcionalidades de la plataforma

# @HP               # Etiqueta para el Tipo de prueba [Happy Path]
# @AP               # Etiqueta para el Tipo de prueba [Altern Path]

Background: Acceder al servicio principal
  Given Que Genny se encuentra en la plataforma de gestion de usuarios


@HP
@ConsultarUsuarios
@CP-001
Scenario: Consultar lista de usuarios registrados

When  Realiza la busqueda de la lista de usuarios
Then Se respondera exitosamente con los resultados esperados
