package Cuenta;

public class testCuenta {

	public static void main(String[] args) {
	
		Titular x=new Titular("fran", "cabadas","21828282", 15);
		
		Cuenta c= new Cuenta(x,"66666666666");
		Cuenta f= new Cuenta(x,"6666666666");
		
		
		System.out.println(c.toString());
		c.ingreso(150d);
		System.out.println(c.toString());
		System.out.println(c.reintrego(200d));
		System.out.println(c.toString());
		
		c.enviarTransferencia(f, 100d);
		System.out.println(f.toString());
		System.out.println(c.toString());
		System.out.println(c.imprimirPorPantalla());
		System.out.println(c.CuentasIguales(f));
		
		c.visualizarMovimientos();
	
		
		
		
		
	}

}
