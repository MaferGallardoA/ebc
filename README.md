Proyecto Microservicio - Secuencias de Collatz y FizzBuzz
Descripción
Este proyecto implementa un microservicio en Spring Boot que incluye dos métodos principales:
      •	Collatz: Genera la secuencia de Collatz para un número dado.
      •	FizzBuzz: Implementa la lógica de FizzBuzz para un número dado.
Requisitos previos
  1.	Java: JDK 11 o superior instalado en tu sistema o	Descargar JDK
  2.	Maven: Instalado y configurado correctamente
  3.	IDE (opcional): IntelliJ IDEA, Eclipse o cualquier editor que soporte Java.
Instrucciones de instalación y ejecución
  Paso 1: Clonar el repositorio
      Clona el repositorio en tu máquina local utilizando el siguiente comando:
      git clone <https://github.com/MaferGallardoA/ebc.git>
     cd < EBC>
  Paso 2: Compilar el proyecto
      Ejecuta el siguiente comando para compilar el proyecto con Maven:
      mvn clean install
  Paso 3: Ejecutar el microservicio
      Inicia la aplicación ejecutando el siguiente comando:
      mvn spring-boot:run
  Paso 4: Acceder a la aplicación
  El servidor estará disponible en el puerto 8080. Los endpoints disponibles son:
  1.	Collatz:
    o	Path: /api/secuence/collatz/<input>
    o	Método: PUT
    o	Ejemplo de llamada:	curl -X PUT http://localhost:8080/api/secuence/collatz/7
  2.	FizzBuzz:
    o	Path: /api/fizzbuzz/<input>
    o	Método: POST
    o	Ejemplo de llamada: curl -X POST http://localhost:8080/api/fizzbuzz/15
  Paso 5: Consola de H2 (opcional)
  Si necesitas verificar la base de datos en memoria H2:
  1.	Accede a la consola de H2 en http://localhost:8080/h2-console
  2.	Configura los siguientes parámetros: 
     o	JDBC URL: jdbc:h2:mem:testdb
Configuración adicional
Puedes personalizar el puerto o las configuraciones generales en el archivo src/main/resources/application.properties. Por ejemplo:
server.port=8080
spring.datasource.url=jdbc:h2:mem:testdb
Dependencias principales
•	Spring Boot
•	H2 Database
•	Maven
