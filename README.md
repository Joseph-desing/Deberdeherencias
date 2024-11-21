TAREA HERENCIA
Ejercicio 1: Herencia y atributos privados

 Descripción:

Crea un sistema donde se represente una jerarquía de animales. Todos los animales tienen un nombre y una edad (atributos privados). Algunos animales tienen un método adicional que describe su acción característica.

Crea una clase base llamada Animal:
Atributos privados: nombre (String), edad (int).

Métodos:

getNombre(), getEdad(), setNombre(String nombre), setEdad(int edad).

hacerSonido() (método que será sobrescrito por las subclases).

Crea dos subclases:
Perro:

Sobrescribe el método hacerSonido() para que devuelva "El perro ladra: ¡Guau, guau!".

Gato:

Sobrescribe el método hacerSonido() para que devuelva "El gato maúlla: ¡Miau!".

Crea una clase principal:
Crea instancias de Perro y Gato.

Muestra su nombre, edad y sonido usando los métodos heredados.

 

Ejercicio 2: Simulación de Transacciones Bancarias con Información del Cliente

Objetivo:
Desarrollar un sistema bancario que utilice herencia para representar diferentes tipos de cuentas bancarias, asociadas a clientes. Se incluirá un menú interactivo que permita realizar operaciones como ver el saldo, realizar transferencias, retiros y depósitos. Además, se implementará sobreescritura de métodos para manejar características específicas de cada tipo de cuenta.

 

EJERCICIO 2

 

Clase base: CuentaBancaria

Atributos privados:

saldo (double): Representa el monto disponible en la cuenta.

numeroCuenta (String): Identificador único de la cuenta.
cliente (Cliente): Representa al titular de la cuenta.
Métodos:

getSaldo(): Retorna el saldo disponible.
getNumeroCuenta(): Retorna el número de cuenta.
getCliente(): Retorna la información del cliente.
depositar(double monto): Incrementa el saldo según el monto ingresado.
retirar(double monto): Realiza un retiro verificando si hay fondos suficientes. Este método será sobrescrito por las subclases.
mostrarInformacion(): Muestra la información del cliente, el número de cuenta y el saldo actual.
Clase Cliente
Atributos privados:

nombre (String): Nombre del cliente.
identificacion (String): Identificación única del cliente.
Métodos:

getNombre(): Retorna el nombre del cliente.
getIdentificacion(): Retorna la identificación del cliente.
mostrarInformacion(): Muestra el nombre y la identificación del cliente.
Subclases de CuentaBancaria:
CuentaCorriente:

Incluye una comisión del 2% para cada retiro.
Sobrescribe el método retirar(double monto) para aplicar la comisión.
CuentaAhorro:

No permite realizar retiros si el saldo es menor a $100.
Sobrescribe el método retirar(double monto) para verificar esta condición.
Valores iniciales:
La CuentaCorriente debe ser creada con un saldo inicial de $1000.

La CuentaAhorro debe ser creada con un saldo inicial de $500.

Clase principal:
Crea instancias de clientes con la información requerida (nombre e identificación).

Asocia cada cliente con una cuenta bancaria (CuentaCorriente o CuentaAhorro).

Implementa un menú interactivo con las siguientes opciones:

1.                  Ver información del cliente y saldo: Muestra los datos del cliente y el saldo actual de la cuenta.

2.                  Transferir entre cuentas: Permite transferir un monto entre dos cuentas, verificando las reglas específicas de cada tipo.

3.                  Retirar dinero: Realiza un retiro aplicando las reglas de la cuenta correspondiente.

4.                  Depositar dinero: Aumenta el saldo de la cuenta.

5.                  Salir: Finaliza el programa.

 

Cada transacción debe mostrar la información del cliente y el saldo actualizado inmediatamente después de la operación.
