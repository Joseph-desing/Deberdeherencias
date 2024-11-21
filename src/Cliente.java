class Cliente {
    // Atributos privados
    private String nombre;
    private String identificacion;

    // Constructor
    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    // Método para mostrar información del cliente
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + ", Identificación: " + identificacion);
    }
}

// Clase base CuentaBancaria
abstract class CuentaBancaria {
    // Atributos privados
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    // Constructor
    public CuentaBancaria(String numeroCuenta, Cliente cliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    // Métodos getter
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    // Método  para retirar dinero
    public abstract void retirar(double monto);

    // Método para mostrar información
    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroCuenta + ", Saldo: $" + saldo);
    }

    // Método protegido para actualizar el saldo
    protected void actualizarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }
}

// Subclase CuentaCorriente
class CuentaCorriente extends CuentaBancaria {
    // Constructor
    public CuentaCorriente(String numeroCuenta, Cliente cliente, double saldoInicial) {
        super(numeroCuenta, cliente, saldoInicial);
    }

    // Método para retirar dinero con una comisión del 2%

    public void retirar(double monto) {
        double comision = monto * 0.02;
        double totalARetirar = monto + comision;
        if (totalARetirar <= getSaldo()) {
            actualizarSaldo(getSaldo() - totalARetirar);
            System.out.println("Retiro exitoso. Comisión aplicada: $" + comision + ". Saldo actual: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
}

// Subclase CuentaAhorro
class CuentaAhorro extends CuentaBancaria {
    // Constructor
    public CuentaAhorro(String numeroCuenta, Cliente cliente, double saldoInicial) {
        super(numeroCuenta, cliente, saldoInicial);
    }

    // Método para retirar dinero si el saldo es mayor a $100
    public void retirar(double monto) {
        if (monto <= getSaldo() && getSaldo() - monto >= 100) {
            actualizarSaldo(getSaldo() - monto);
            System.out.println("Retiro exitoso. Saldo actual: $" + getSaldo());
        } else {
            System.out.println("No se puede retirar. El saldo debe ser mayor a $100 después del retiro.");
        }
    }
}


