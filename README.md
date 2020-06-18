PÁGINA WONG.PE - WEB

# Introducción 🚀
Automatización de una prueba funcional para la experiencia web de la página https://wong.pe siguiendo el patrón de diseño Page factory con Serenity BDD y Cucumber.


# Pre-requisitos📋
1.   Java v1.8 update 151 o superior y JDK (variables de entorno configuradas)
2.   Eclipse IDE (Oxigen o Neon) o IntelliJ IDEA (2019)
3.   Gradle v5.2.1 o superior(variables de entorno configuradas)
4.   Cucumber
5.   ChromeDriver 80.0
 

# Instalación 🔧
- Clonar el repositorio con el siguiente comando: git clone https://github.com/ant9112/WongAutomation.git
- Importar el proyecto desde Eclipse o Intellij IDE bajo la estructura de un proyecto Gradle existente.
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado.


# Compilar el proyecto y generar Wrapper 🔨
- Para compilar el proyecto se debe ejecutar el comando: gradle clean build -x test
- Para generar los archivos wrapper del proyecto se debe ejecutar el comando: gradle wrapper --gradle-distribution-url https://services.gradle.org/distributions/gradle-5.2.1-all.zip


# Para Ejecutar Las Pruebas ⚙️
- Para correr el proyecto se necesita Java JDK 1.8 y Gradle con la versión 5.2.1 o superior.


# Construido Con 🛠️
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo
- Page Factory (Patrón de diseño enfocado a desarrollo de pruebas automatizadas)
- Gradle
- Selenium Web Driver
- Cucumber
- Serenity BDD - Biblioteca de código abierto para la generación de reportes
- Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

# Versionado 📌
Se utiliza GIT para el control de versiones.
    
