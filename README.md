# Juego de Memoria (Búsqueda de Pares)

Este repositorio contiene el código para el juego de búsqueda de pares en un tablero de 20x20.  
El proyecto está desarrollado con **Java (Spring Boot) para el backend** y **React con TypeScript para el frontend**.

## 🛠️ Tecnologías utilizadas
- **Backend**: Java 17, Spring Boot, MySQL, WebSockets / REST API
- **Frontend**: React, TypeScript, HTML, CSS

## 📌 Objetivos del Proyecto
1. Generar un tablero aleatorio de 20x20 con cartas emparejadas.
2. Crear un sistema de turnos entre los jugadores.
3. Almacenar en la base de datos información sobre el juego, los jugadores y sus movimientos.
4. Implementar una interfaz gráfica en la web para jugar en tiempo real.

## 📋 Tareas a realizar

### 🏗️ Fase 1: Configuración del Proyecto
✅ 1.1 Crear un repositorio en GitHub y añadir este README.  
✅ 1.2 Configurar el entorno de desarrollo con Spring Boot y React.  
✅ 1.3 Configurar una base de datos MySQL para almacenar partidas y jugadores.  

### 🎲 Fase 2: Backend (Java + Spring Boot)
🟡 2.1 Crear un modelo de base de datos con tablas para jugadores, partidas y movimientos.  
🟡 2.2 Implementar la lógica de generación del tablero de 20x20 con cartas aleatorias.  
🟡 2.3 Crear controladores REST para gestionar partidas y movimientos de jugadores.  
🟡 2.4 Implementar WebSockets para actualizar el estado del juego en tiempo real.  

### 🎨 Fase 3: Frontend (React + TypeScript)
🔵 3.1 Crear una interfaz gráfica para mostrar el tablero y las cartas.  
🔵 3.2 Implementar interacciones para seleccionar cartas y realizar movimientos.  
🔵 3.3 Conectar el frontend con el backend mediante API REST/WebSockets.  

### 🏁 Fase 4: Optimización y Mejora
🔴 4.1 Mejorar el diseño de la interfaz de usuario.  
🔴 4.2 Implementar estadísticas de juego para los jugadores.  
🔴 4.3 Agregar animaciones y efectos visuales para mejorar la experiencia.  

---

## 🚀 Cómo compilar y ejecutar el proyecto

### **1. Requisitos previos**
Antes de compilar el proyecto, asegúrate de tener instalado:
- **Java 17**  
- **Maven**  
- **MySQL** (base de datos alojada en Railway)

### **2. Configuración de la base de datos**
1. Conéctate a MySQL con el siguiente comando:
   ```sh
   mysql -h switchyard.proxy.rlwy.net -u root -p XuOjzdHFqvMubzWjZlbDrYuTDvFRoLic --port 35723 --protocol=TCP railway
   ```
2. Configura las credenciales en `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://switchyard.proxy.rlwy.net:35723/railway
   spring.datasource.username=root
   spring.datasource.password=XuOjzdHFqvMubzWjZlbDrYuTDvFRoLic
   spring.jpa.hibernate.ddl-auto=update
   ```

### **3. Compilar el proyecto**
Ejecuta el siguiente comando en la raíz del proyecto:
```sh
mvn clean install
```

### **4. Ejecutar el servidor**
Inicia el servidor con:
```sh
mvn spring-boot:run
```
El servidor se ejecutará en `http://localhost:8088`.

### **5. Probar la API**
Puedes probar la API con las siguientes rutas:
- **Obtener jugadores:** `GET http://localhost:8088/players`
- **Agregar jugador:** `POST http://localhost:8088/players?name=Juan`
- **Crear una nueva partida:** `POST http://localhost:8088/games`

---

## 📌 Contribuciones
Si deseas contribuir, por favor abre un **issue** o haz un **pull request**.

📧 Contacto: [Tu email o redes sociales]
