package Cuenta;

public class CuentaAhorro extends Cuenta {

	private Double interes;

	public CuentaAhorro(Titular titular, String numeroCuenta, Double saldo, Double interes) {
		super(titular, numeroCuenta, saldo);
		this.setInteres(interes);

	}

	public CuentaAhorro(Titular titular, String numeroCuenta, Double saldo) {
		super(titular, numeroCuenta,saldo);
		this.setInteres(1.2d);
	}

	public CuentaAhorro(Titular titular, String numeroCuenta) {
		super(titular, numeroCuenta, 1.2d);
		this.setInteres(2.1d);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}
	
	public void calcularInteres() {
		
		 System.out.println(this.getSaldo() + " * " + this.interes + "= " + this.getSaldo()*this.interes);
	}

	@Override
	public String toString() {
		return "CuentaAhorro interes= " + interes + " Titular" + getTitular() + " NumeroCuenta"
				+ getNumeroCuenta() + " Saldo= " + getSaldo() + " FechaApertura= " + getFechaApertura();
	}

	
	

}
