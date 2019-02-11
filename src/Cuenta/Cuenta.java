package Cuenta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cuenta implements Comparable {

	private Titular titular;
	private String numeroCuenta;
	private Double saldo;
	private Date fechaApertura;
	private ArrayList<Movimientos> movimiento;

	public Cuenta(Titular titular, String numeroCuenta, Double saldo, Date fechaApertura) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.fechaApertura = Calendar.getInstance().getTime();
		this.movimiento = new ArrayList<Movimientos>();
	}

	public Cuenta(Titular titular, String numeroCuenta) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0d;
		this.fechaApertura = Calendar.getInstance().getTime();
		this.movimiento = new ArrayList<Movimientos>();
	}
	public Cuenta(Titular titular, String numeroCuenta,Double saldo) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.fechaApertura = Calendar.getInstance().getTime();
		this.movimiento = new ArrayList<Movimientos>();
	}

	public Titular getTitular() {
		return titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void ingreso(Double dinero) {
		this.movimiento.add(new Movimientos("ingreso"));
		if (dinero > 0)
			this.saldo += dinero;

	}

	public Double reintrego(Double dinero) {

		movimiento.add(new Movimientos("reintegro"));
		if (dinero <= this.saldo) {
			this.saldo -= dinero;
			return dinero;
		}

		return 0d;

	}

	public void enviarTransferencia(Cuenta c, Double importe) {

		movimiento.add(new Movimientos("enviarTrans"));

		c.saldo += this.reintrego(importe);

	}

	public void recibirTranferencia(Cuenta c, Double importe) {

		movimiento.add(new Movimientos("recibirTrans"));

		this.saldo += c.reintrego(importe);

	}

	public String imprimirPorPantalla() {

		return " su cuenta " + this.numeroCuenta + " dispone de " + this.saldo + "$";

	}

	public boolean CuentasIguales(Cuenta c) {

		if (this.numeroCuenta.equals(c.numeroCuenta))
			return true;
		else
			return false;

	}

	public void visualizarMovimientos() {

		for (Movimientos movimientos : movimiento) {
			System.out.println(movimientos);
		}
	}

	@Override
	public String toString() {
		return "Cuenta=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", fechaApertura="
				+ fechaApertura;
	}
	
	
//compareTo sobreescrito de la interfaz Comparable	-------------------------------------------------------------------------------------------------------

	@Override
	public int compareTo(Object otra) {
		Cuenta x=(Cuenta) otra;
	
		return this.saldo.compareTo(x.saldo);
	}

}