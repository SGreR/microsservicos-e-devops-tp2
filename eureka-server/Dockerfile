FROM openjdk:21-jdk-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR gerado para o contêiner
COPY target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar

# Exponha a porta 8080
EXPOSE 8761

# Defina o comando de inicialização
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]