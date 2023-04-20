## Titulo: bancatlan-template
***

Plantilla para microservicios con framework Spring Boot
# 🚀 Comenzando 
***

[Instrucciones que permitirán obtener una copia del proyecto en funcionamiento en máquina local para propósitos de desarrollo y pruebas]
# 🛅 Tecnología 
***

Git - Repositorio Git

SonarQube – Calidad y seguridad de código

OpenShift - Plataforma para desarrollar contenedores

Nexus – Administrador de repositorios, almacena artefactos

Apicuro - Diseño, mocking y testing de APIs

3Scale - Gestión de API

# 📋 Pre-requisitos  
***

Acceso al repositorio Git
Debe de tener instalado

git-scm

openjdk 1.8 LTS

Spring Tool Suite

Apache Maven 3.x

Configuración de variable de entorno %JAVA_HOME%

Configuracion de variable de entorno %M2_HOME%
# 🔧 Instalación 
***

1. Crear un carpeta local donde sera el área de trabajo del proyecto.

2. Ubicarse en la carpeta local

3. Clonar el repositorio en rama dev del proyecto

git clone --branch dev http://xxxxxxxxxx/admin-templates/templates-projects.git

4. Copiar el archivo zip bancatlan-template y descomprimir en su carpeta local

5. Renombrar la carpeta bancatlan-template por el nombre de su requerimiento

6. Cambiar el valor que se encuentra en la etiqueta <groupId></groupId> por el nombre del paquete definido en su requerimiento del archivo pom.xml

7. Cambiar el valor que se encuentra en la etiqueta <artifactId></artifactId> por el nombre asignado en el paso 5 de este archivo en el pom.xml

8. Cambiar el valor que se encuentra en la etiqueta <name></name> por el valor que se encuentra en la etiqueta <artifactId></artifactId> en el archivo pom.xml

9. Agregar el proposito del aplicativo en la etiqueta <description></description> que se encuentra en el archivo pom.xml

10. Importar carpeta del proyecto en Spring Tool Suite

11. Seleccionar el aplicativo y ejecutar la siguiente combinación de teclas en STS: Alt + Shift + X, B

12. Ingresar a la siguiente url: http://localhost:8080
# 📖 WIKI 
***
[Lineamientos de Base Datos]-
Las configuraciones de conexion a base de datos deben quedar definidas en variables de ambientes dentro del pod que se crea al momento de desplegar la aplicación dentro de la plataforma de Openshift.

[//]:# (Área para colocar los links y referencias a ser utilizadas)

[GitLab]: <http://xxxxxxxxxxxxx/>
[SonarQube]: <https://sonarqube-xxxxxxxxxxxx/>
[OpenShift]: <https://console-openshift-console.apps.xxxxxxxxxx/>
[Nexus ]: <http://nexus.apps.xxxxxxxxxxxxxx/>
[Apicuro]: <https://apicurio-studio-ui-xxxxxxxxxxxxxxxx>
[3Scale]: <https://3scale-admin.apps.xxxxxxxxxxxxxxx/>"# BA-util-microservicios-logs-backend" 
