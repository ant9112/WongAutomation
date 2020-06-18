CANAL - SUCURSAL VIRTUAL EMPRESAS - WEB

# Introducción 🚀
Automatización de pruebas funcionales para la experiencia web de la sucursal virual empresas (SVE) siguiendo el patrón de diseño Screenplay con Serenity BDD y Cucumber.


# Pre-requisitos📋
1.   Java v1.8 update 151 o superior y JDK (variables de entorno configuradas)
2.   Eclipse IDE (Oxigen o Neon) o IntelliJ IDEA (2019)
3.   Gradle v5.2.1 o superior(variables de entorno configuradas)
4.   Cucumber
5.   ChromeDriver 80.0
6.   Geckodriver 74.1
 

# Instalación 🔧
- Clonar el repositorio con el siguiente comando: git clone https://banistmo@dev.azure.com/banistmo/OLA%201/_git/chl-emp-webapp-sve-test
- Importar el proyecto desde Eclipse o Intellij IDE bajo la estructura de un proyecto Gradle existente.
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado.


# Compilar el proyecto y generar Wrapper 🔨
- Para compilar el proyecto se debe ejecutar el comando: gradle clean build -x test
- Para generar los archivos wrapper del proyecto se debe ejecutar el comando: gradle wrapper --gradle-distribution-url https://services.gradle.org/distributions/gradle-5.2.1-all.zip


# Para Ejecutar Las Pruebas ⚙️
- Para correr el proyecto se necesita Java JDK 1.8 y Gradle con la versión 5.2.1 o superior.
- Tener usuario de pruebas para la sucursal virtual empresas.
- Tener presente la preparación de los datos que serán necesarios en la automatización, los cuales se encuentran en archivos planos csv, txt y JSON.

El proyecto esta distribuido, en la forma en como está estructurada la página web, es decir, por cada modulo que encuentre en el menú de navegación de la página encontrará una carpeta que contendrá las funcionalidades que deberían probarse para cada caso.

En la página el ménu, está distribuido de la siguiente manera...
1. Productos
2. Transacciones
3. Planilla
4. Administración
5. Aprobaciones 
6. Perfil

### Comencemos por desglozar el apartado de Productos
1.1 Saldos Consolidados: Para este sub menú, tendremos a su similar en el proyecto de automatización, debemos tener las siguientes consideraciones en cuestión de "data" para que la automatización funcione como debería hacerlo...
Para el caso de consulta_de_plazos_fijos.feature debemos cambiar la data en el escenario @50178-2, con lo que concuerde en la página para el número de cuenta 111800001100003.




# Pruebas End-To-End 🔛
Esta automatización se realiza de modo que se puedan cubrir el mayor número de funcionalidades en los diferentes escenarios teniendo presente validaciones a nivel del Front con pruebas E2E.
Dentro del alcance de estas no se realizan validaciones de campos, tooltips u otro tipo de pruebas unitarias.


Detalles Generales De La Implementación 💻

🚧 La estructura completa del proyecto es la siguiente:

src/main/java
+ com.banistmo.certificacion.sve.exceptions
    Clases que capturan excepciones personalizadas cuando falla la automatización.
  
+ com.banistmo.certificacion.sve.interactions
    Clases que realizan las acciones de bajo nivel, como lo es escribir texto en campos, hacer clicks, entre otros.

+ com.banistmo.certificacion.sve.models
    Clases con las que se construyen los modelos de datos, usando un builder cuando es necesario.
    
+ com.banistmo.certificacion.sve.persistencia

+ com.banistmo.certificacion.sve.questions
    Clases con las que se realizan las validaciones de las pruebas, se hace en forma de pregunta para conocer el resultado o estado en que se encuentra luego de haber ejecutado las tareas.

+ com.banistmo.certificacion.sve.tasks    
    Clases que realizan las acciones de alto nivel (proceso de negocio), se componen de llamados a interacciones u otras tareas.

+ com.banistmo.certificacion.sve.userinterface
    Clases donde se mapean los elementos y objetos de la interfaz de usuario para la interacción con cada uno de estos elementos.

+ com.banistmo.certificacion.sve.util
    Clases que contienen funcionalidades comunes.
  
    
src/test/java
+ co.com.banistmo.certificacion.runners
    Clases para ejecutar la automatización con los escenarios indicados en el feature. 

+ co.com.banistmo.certificacion.stepdefinitions
    Clases donde se acopla el lenguaje Gherkin con que se escriben los escenarios y el código java que va a ser ejecutado para la automatización. 


src/test/resources
+ datadriven
    Datos de prueba utilizados por la automatización.

+ features
    Se encuentran los features del proyecto que es donde se escriben los escenarios o historias que lleva a cabo el usuario a nivel de negocio.  



# Construido Con 🛠️
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo
- Screenplay (Patrón de diseño enfocado a desarrollo de pruebas automatizadas)
- Gradle
- Selenium Web Driver
- Cucumber
- Serenity BDD - Biblioteca de código abierto para la generación de reportes
- Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

# Versionado 📌
Se utiliza GIT para el control de versiones, aplicando GitFlow 🔀
    
