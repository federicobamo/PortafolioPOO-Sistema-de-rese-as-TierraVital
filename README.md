 Sistema de Gestión de Huéspedes - Tierra Vital 

Sistema desarrollado en Java para el Airbnb "Tierra Vital" ubicado en Atenas, Costa Rica. 
Permite registrar visitas, reservas y reseñas de huéspedes de todo el mundo.

Estructura del proyecto

- PortafolioPOO/SistemasResenas → Capa de negocio (entidades, lógica, datos)
- PortafolioPOOUI/PortafolioPOOUI → Capa de presentación (interfaz de consola)

Conceptos POO aplicados
- **Abstracción** → Clases - Huesped, Reserva, Resena
- **Encapsulamiento** → Atributos privados con getters/setters
- **Modularidad** → Arquitectura por capas (UI, BL, DL)
- **Agregación** → Huesped tiene una Reserva
- **Composición** → Reserva contiene una Resena
- **Enums** → Casa y Anfitrion

Cómo ejecutar
1. Abrir ambos proyectos en IntelliJ IDEA
2. Ejecutar Main.java
