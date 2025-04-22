🌐 Microservicios con Spring Cloud, Eureka y API Gateway

Este proyecto es una demostración funcional de una arquitectura basada en **microservicios** utilizando **Spring Boot**, **Eureka Server** y **API Gateway**. Permite enrutar peticiones a diferentes servicios registrados bajo distintas **IP's** a través de un único punto de entrada.

---


🚀 Características
📡 Eureka Server: Descubrimiento de servicios dinámico.

🔀 API Gateway: Enrutamiento inteligente y gestión centralizada de llamadas a servicios.

🔗 Comunicación entre servicios a través de IPs distintas.

🧩 Arquitectura extensible para nuevos servicios.

🛡️ Preparado para implementar control de acceso, filtros y seguridad

🛠️ Tecnologías
Java + Spring Boot

Spring Cloud Eureka

Spring Cloud Gateway

REST APIs

Docker (opcional para despliegue) pero se implementara...

Maven/Gradle


## 📦 Estructura del Proyecto

```text
micro-elastic/
├── eureka-server/        # Registro de servicios
├── gateway-server/       # Puerta de enlace (API Gateway)
├── servicio1/            # Servicio independiente 1
└── servicio2/            # Servicio independiente 2
🚀 Tecnologías Utilizadas
Java 17

Spring Boot

Spring Cloud Eureka

Spring Cloud Gateway

Maven

REST APIs

⚙️ ¿Qué hace este proyecto?
🔎 Registra servicios automáticamente con Eureka Server

🌐 Centraliza el acceso a través de API Gateway

🧭 Permite enrutar solicitudes a servicios en distintas IPs

💬 Facilita la escalabilidad y comunicación entre microservicios


💡 Casos de uso
Proyectos distribuidos en diferentes servidores o nubes.

Integración de servicios legacy.

Pruebas de balanceo y fallos entre servicios distribuidos.

📞 Contribuciones
¡Pull requests bienvenidos! Si tienes ideas o mejoras, no dudes en colaborar.


▶️ Cómo ejecutar
Clona este repositorio:

bash
Copiar
Editar
git clone https://github.com/frankgraya/micro-elastic.git
cd micro-elastic
Inicia Eureka Server:

bash
Copiar
Editar
cd eureka-server
mvn spring-boot:run
Inicia API Gateway:

bash
Copiar
Editar
cd ../gateway-server
mvn spring-boot:run
Inicia los servicios (pueden estar en diferentes máquinas o IPs si así se configura):

bash
Copiar
Editar
cd ../servicio1
mvn spring-boot:run

cd ../servicio2
mvn spring-boot:run
🔀 Rutas de ejemplo
http://localhost:8080/servicio1/hello

http://localhost:8080/servicio2/hello

(Asumiendo que están correctamente mapeadas en el archivo application.yml del Gateway)

📌 Notas
Asegúrate de que todos los servicios se registren correctamente en Eureka.

Configura las direcciones IP de los servicios si no están en localhost.

Puedes adaptar este proyecto para incluir autenticación, filtros, logs distribuidos o balanceo de carga.