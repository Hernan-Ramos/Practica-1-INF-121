package Agregacion;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	public Vehiculo(String marca, String modelo, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Conductor [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
	}
	
	
}
