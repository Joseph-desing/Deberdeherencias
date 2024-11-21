public class mainbanco{
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "1234567890");
        Cliente cliente2 = new Cliente("Maria Lopez", "0987654321");

        // Crear cuentas bancarias
        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC123", cliente1, 1000);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("CA456", cliente2, 500);

        // Menú interactivo
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuentaCorriente.mostrarInformacion();
                    cuentaAhorro.mostrarInformacion();
                    break;
                case 2:
                    // Lógica para transferencia entre cuentas
                    System.out.println("Transferencia no implementada en este ejemplo.");
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar de la cuenta corriente: ");
                    double montoRetiroCC = scanner.nextDouble();
                    cuentaCorriente.retirar(montoRetiroCC);
                    System.out.print("Ingrese el monto a retirar de la cuenta de ahorro: ");
                    double montoRetiroCA = scanner.nextDouble();
                    cuentaAhorro.retirar(montoRetiroCA);
                    break;
                case 4:
                    System.out.print("Ingrese el monto a depositar en la cuenta corriente: ");
                    double montoDepositoCC = scanner.nextDouble();
                    cuentaCorriente.depositar(montoDepositoCC);
                    System.out.print("Ingrese el monto a depositar en la cuenta de ahorro: ");
                    double montoDepositoCA = scanner.nextDouble();
                    cuentaAhorro.depositar(montoDepositoCA);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema bancario. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción del menú.");
            }
        }

        scanner.close();
    }
}