
public class Vehiculo {
 
	private String Tipo;
	private String Patente;
	private String Color;
	private String Marca;
	
	public Vehiculo(String tipo, String patente, String color, String marca) {
		
		
		Tipo = tipo;
		Patente = patente;
		Color = color;
		Marca = marca;
		
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}
	
}