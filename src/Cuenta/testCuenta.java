package Cuenta;

public class testCuenta {

	public static void main(String[] args) {

		Titular fran = new Titular("fran", "cabadas", "21828282", 15);
		Titular aitor = new Titular("aitor", "tilla", "217151118", 18);

		Cuenta cuentaFran = new Cuenta(fran, "66666666666");
		Cuenta cuentaAitor = new Cuenta(aitor, "7777777777");

		CuentaAhorro ahorroFran = new CuentaAhorro(fran, "66666666666");
		CuentaAhorro ahorroAitor = new CuentaAhorro(aitor,"777777777",30d);
		
		System.out.println(ahorroFran);
		ahorroFran.calcularInteres();
		
		System.out.println();
		System.out.println();
		
		System.out.println(ahorroAitor);
		ahorroAitor.calcularInteres();
		

		System.out.println();
		System.out.println();

		System.out.println(cuentaFran.toString());
		cuentaFran.ingreso(150d);
		System.out.println(cuentaFran.toString());
		System.out.println(cuentaFran.reintrego(200d));
		System.out.println(cuentaFran.toString());

		cuentaFran.enviarTransferencia(cuentaAitor, 100d);
		System.out.println(cuentaAitor.toString());
		System.out.println(cuentaFran.toString());
		System.out.println(cuentaFran.imprimirPorPantalla());
		System.out.println(cuentaFran.CuentasIguales(cuentaAitor));

		cuentaFran.visualizarMovimientos();

	}

}