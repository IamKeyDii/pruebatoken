# Usar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR de tu aplicación al contenedor
COPY target/pruebatoken-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que tu aplicación usará
EXPOSE 8081

# Definir el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]