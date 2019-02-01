package Cuenta;

import java.util.Calendar;
import java.util.Date;

public class Movimientos {
	
	private Date fechaMov;
	private String tipoMovimiento;
	
	
	public Movimientos(String tipoMovimiento) {
		this.fechaMov = Calendar.getInstance().getTime();
		this.tipoMovimiento = tipoMovimiento;
	}

	
	
	
	

	public Date getFechaMov() {
		return fechaMov;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}


	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}






	@Override
	public String toString() {
		return "Movimientos fechaMov=" + fechaMov + ", tipoMovimiento=" + tipoMovimiento;
	}
	
	
	
	

}
