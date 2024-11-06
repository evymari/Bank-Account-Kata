# Account Kata

Este es un proyecto simple de Java para gestionar una cuenta bancaria, creado como ejercicio de práctica. La clase `Account` permite realizar operaciones básicas como consultar el saldo y realizar depósitos.

## Estructura del Proyecto

- `Account`: Clase principal que representa una cuenta bancaria con las siguientes funcionalidades:
    - Consultar el saldo.
    - Realizar un depósito.

- `AccountTest`: Clase de prueba para verificar el comportamiento de la clase `Account` utilizando el framework de pruebas JUnit 5.

## Funcionalidades

### 1. Crear una Cuenta
La clase `Account` permite crear una cuenta bancaria con un saldo inicial especificado. Si no se especifica un saldo inicial, el saldo será de $0.

### 2. Consultar el Saldo
Puedes consultar el saldo actual de la cuenta con el método `getBalance`.

### 3. Realizar un Depósito
Puedes depositar una cantidad en la cuenta con el método `deposit`. Solo los valores positivos afectarán el saldo. Si intentas depositar una cantidad negativa, el saldo permanecerá sin cambios.

## Instalación

1. Asegúrate de tener **Java** y **Maven** instalados en tu máquina.
2. Clona este repositorio:
   ```bash
   git clone https://github.com/tu_usuario/account-kata.git
Navega al directorio del proyecto:
bash

cd account-kata
Ejecución de Pruebas
Este proyecto utiliza JUnit 5 para realizar pruebas unitarias. Para ejecutar las pruebas, usa el siguiente comando de Maven:

bash
Copiar código
mvn test
Casos de Prueba Incluidos
Saldo inicial en 0 al crear una cuenta vacía.
Crear una cuenta con un saldo inicial específico.
Realizar un depósito y actualizar el saldo.
Intentar depositar un monto negativo y mantener el saldo sin cambios.

Tecnologías Utilizadas
Java: Lenguaje de programación principal.
JUnit 5: Framework de pruebas.
Maven: Herramienta de gestión de dependencias y construcción de proyectos