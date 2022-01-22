
public class Proveedores {

	private Vehiculo vehiculo;
	private String nombreEmpresa;
	private String rut;
	private int telefono;
	
	public Proveedores(Vehiculo vehiculo, String nombreEmpresa, String rut, int telefono) {
		
		this.vehiculo = vehiculo;
		this.nombreEmpresa = nombreEmpresa;
		this.rut = rut;
		this.telefono = telefono;
		
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
}
