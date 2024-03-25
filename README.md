# Proyecto Automatización de Pruebas API Con Serenity Rest y Screenplay - ReqRes

Este proyecto de automatizacion API hecho en Java-Gradle con Serenity-BDD/REST-Assured y Screenplay-pattern, 
refleja los scripts de pruebas automatizadas sobre el catalogo de servicios API que se describe en 
https://reqres.in/

<br>

<div id='menu'/>


## 📚 Tabla de contenido: 
1. [Arquitectura](#arquitectura)
   1. [Diagrama General](#arquitectura_diagrama_general)
   2. [Patron de Diseño](#patron_diseno)
   3. [Estructura de Proyecto](#arquitectura_estructura_proyecto)
2. [Tecnologias / Herramientas](#tecnologias_herramientas)
3. [Pre-requisitos](#pre_requisitos) 
4. [Instalación](#instalacion) 
5. [Ejecución](#ejecucion) 
6. [Informe](#informe)
7. [Ambiente](#ambientes)
8. [Personalización](#personalización)
9. [Documentación Adicional](#documentacionadicional)
10. [Autores](#autores) 

<br>

<div id='arquitectura'/>

##   Arquitectura [📚](#menu)

<br>

<div id='arquitectura_diagrama_conceptual'/>

### Diagrama Conceptual [📚](#menu) 

![Diagrama Conceptual](/diagrama/DiagramaGeneral.drawio.png)
[Generado en draw.io](https://app.diagrams.net/)

<br>

<div id='patron_diseno'/>

### Patron de Diseño [📚](#menu)
**Screenplay**


>"Screenplay es un patrón de diseño de automatización de prueba moderno que 
pretende facilitar la escritura de código de prueba escalable y mantenible 
(segun los principios SOLID)
> > En Screenplay modelamos actores que interactúan con una aplicación de varias maneras 
para realizar tareas que les ayuden a lograr sus objetivos. Los actores tienen 
habilidades , como la capacidad de interactuar con un navegador web o consultar una 
base de datos, que los ayudan a realizar estas tareas. Los actores también pueden 
responder preguntas sobre el estado del sistema, de modo que podamos verificar si 
una función se está comportando de la manera que esperamos"


<div id='arquitectura_estructura_proyecto'/>

## 📂 Estructura de Proyecto [📚](#menu) 

### 📁 features: [./src/test/resources/.../]
>Los escenarios y sus casos de prueba en lenguaje Gherkin (Given-When-Then), con narrativa declarativa en términos de negocio.
### 📁 runners: [./src/test/java/.../]
>Clases que permiten ejecutar las pruebas (lanzadores)
### 📁 helpers: [./src/main/java/.../]
>Clases de preparacion y configuracion que se activan al inicio, durante y finalizando un caso de prueba (ideal para Hooks) y clase de constantes que contiene un conjunto de constantes agrupadas y organizadas con base a su comportamiento/proposito.
### 📁 stepdefinitions: [./src/test/java/.../]
>Clases que traducen tecnicamente los escenarios de los features, orquestando y delegando los pasos necesarios que satisfacen los enunciados Gherkin, a traves de tareas (tasks) o preguntas (questions).
### 📁 tasks: [./src/main/java/.../]
>Clases que describen las actividades que el actor realizara sobre el sistema al interpretar un caso de prueba.
### 📁 questions: [./src/main/java/.../]
>Clases que evaluaran el comportamiento debido o esperado, posterior a las actividades de un actor en un caso de prueba,a traves de validaciones y/o verificaciones
### 📁 models: [./src/main/java/.../]
>Contiene la representación de los objetos de negocio identificados y sus caracteristicas.

<br>

<div id='tecnologias_herramientas'/>

## 🛠️ Tecnologias / Herramientas [📚](#menu) 

| Proposito                  | Tecnologias  | Herramientas      |
|----------------------------|--------------|-------------------|
| BDD                        | Cucumber     | Gherkin           |      
| Pruebas Automatizadas      | REST-Assured | Serenity-BDD      |
| Pruebas                    | JUnit        |                   |
| Lenguaje de programación   | Java         | JDK/JRE           |
| Gestor de dependencias     | Maven        | Gradle            |
| Versionamiento             | Git          | GitHub, GUI/Bash  |
| Calidad de codigo          | Sonar        | SonarLint         |
| IDE                        |              | IntelliJ IDEA     |


<br>

<div id='pre_requisitos'/>

## 📋 Pre requisitos - local [📚](#menu) 

1. Java 11 (JDK) o superior
2. IDE IntelliJ IDEA
   1. Con plugins:
      * Cucumber for Java
      * Gherkin 
      * HOCON 
      * SonarLint 
3. Git (GUI/Bash)
4. Gradle


<br>

<div id='instalacion'/>

## 📦 Instalación [📚](#menu)
1. Clonar/descargar proyecto
* Via HTTPS:
```
git clone https://github.com/Genny21/Gestionar_Usuarios_F2X.git
```
* Via SSH:
```
git clone git@github.com:Genny21/Gestionar_Usuarios_F2X.git
```
2. Abrir proyecto en IDE (IntelliJ o de su preferencia)
3. Gestionar dependencias con gradle
   - Limpiar (clean task)
   - Recargar (reload all gradle project)
   
<br>

<div id='ejecucion'/>

### 🤺 **Ejecución** [📚](#menu) 
> Para ejecutar las pruebas automatizadas, dirijase a la seccion de runners en el proyecto, elija el runner que mas se 
> ajuste a su necesidad 
* src/test/java/.../runners
  * /features: encuentre aqui, lanzadores dedicados por funcionalidad 
  * /general: encuentre aqui, lanzadores generales, que representan un grupo de test de interes, como por ejemplo: Regresion o Todos

**Desde shell / terminal dentro del proyecto**
* **De todos los test**
```
./gradlew clean test --tests "runners.GeneralRunner"
```

* **De un test particular**
```
./gradlew clean test --tests "runners.usuarios.actualizar.ActualizarUsuariosRunner"
```
```
./gradlew clean test --tests "runners.usuarios.consultar.ConsultarUsuariosRunner"
```
```
./gradlew clean test --tests "runners.usuarios.crear.CrearUsuariosRunner"
```
```
./gradlew clean test --tests "runners.usuarios.eliminar.EliminarUsuariosRunner"
```

**Desde IDE**
* **De todos los test**
```
GeneralRunner
```
* **De un test particular**
```
ActualizarUsuariosRunner
```
```
ConsultarUsuariosRunner
```
```
CrearUsuariosRunner
```
```
EliminarUsuariosRunner
```

<br>

<div id='informe'/>

### 📋 **Informe** [📚](#menu)

>Despues de terminar una ejecución de pruebas, puede consultar el informe completo en:
/target/site/serenity/index.html 
> <br><br>Abriendo el archivo desde su navegador de preferencia

<br>

<div id='ambientes'/>

### 📬 Ambientes [📚](#menu) 
	
* Publico
    + Ambiente 
      + 📦 https://reqres.in/

<br>

<div id='personalización'/>

###  Personalización [📚](#menu) 
	
* Este proyecto el libre de personalizar, ajustar, mejores según tus necesidades. Puedes agregar más pruebas, escenarios, configuraciones, y adaptarlo para tu aplicación o API específica.


<br>

<div id='documentacionadicional'/>

### 📋 Documentacion Adicional [📚](#menu) 
	
* Para más detalles sobre Serenity BDD y el patrón Screenplay, consulta la documentación oficial:
- [Serenity BDD](http://www.thucydides.info/docs/serenity-staging/)
- [Screenplay Pattern](http://www.thucydides.info/docs/serenity-staging/#_the_screenplay_pattern)


<br>

<div id='autores'/>

##  ✍️️ Autores [📚](#menu)️
**QA Automation / Test Analyst **
<br>**Genny Alejandra Castañeda Casallas** - genny21cas@gmail.com
<br>www.linkedin.com/in/genny-castañeda-qa-enginner-automation-testing-qa-analyst
    

<br>
