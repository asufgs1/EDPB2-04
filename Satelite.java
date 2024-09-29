package practica_introduccion;

public class Satelite implements FicheroSecuencial{
	
	String nombre_objeto;
	String id_objeto;
	char epoca;
	double inclinacion, raan, excentricidad, argumento_perigeo, movimiento_medio;
	
	
	public Satelite(String nombre_objeto, String id_objeto, char epoca, double inclinacion, double raan,
			double excentricidad, double argumento_perigeo, double movimiento_medio) {
		super();
		this.nombre_objeto = nombre_objeto;
		this.id_objeto = id_objeto;
		this.epoca = epoca;
		this.inclinacion = inclinacion;
		this.raan = raan;
		this.excentricidad = excentricidad;
		this.argumento_perigeo = argumento_perigeo;
		this.movimiento_medio = movimiento_medio;
	}

	
	public String getNombre_objeto() {
		return nombre_objeto;
	}

	public void setNombre_objeto(String nombre_objeto) {
		this.nombre_objeto = nombre_objeto;
	}

	public String getId_objeto() {
		return id_objeto;
	}

	public void setId_objeto(String id_objeto) {
		this.id_objeto = id_objeto;
	}

	public char getEpoca() {
		return epoca;
	}

	public void setEpoca(char epoca) {
		this.epoca = epoca;
	}

	public double getInclinacion() {
		return inclinacion;
	}

	public void setInclinacion(double inclinacion) {
		this.inclinacion = inclinacion;
	}

	public double getRaan() {
		return raan;
	}

	public void setRaan(double raan) {
		this.raan = raan;
	}

	public double getExcentricidad() {
		return excentricidad;
	}

	public void setExcentricidad(double excentricidad) {
		this.excentricidad = excentricidad;
	}

	public double getArgumento_perigeo() {
		return argumento_perigeo;
	}

	public void setArgumento_perigeo(double argumento_perigeo) {
		this.argumento_perigeo = argumento_perigeo;
	}

	public double getMovimiento_medio() {
		return movimiento_medio;
	}

	public void setMovimiento_medio(double movimiento_medio) {
		this.movimiento_medio = movimiento_medio;
	}


	public void leerDatos(String[] data) {
		String nombre_objeto = data[0];
		String id_objeto = data[1];
		char epoca = charAt(data[2]);
		double inclinacion = Double.parseDouble(data[3]);
		double raan = Double.parseDouble(data[4]);
		double excentricidad = Double.parseDouble(data[5]);
		double argumento_perigeo = Double.parseDouble(data[6]);
		double movimiento_medio = Double.parseDouble(data[7]);
	}

	public String toString() {
		return "Satelite [nombre_objeto=" + nombre_objeto + ", id_objeto=" + id_objeto + ", epoca=" + epoca
				+ ", inclinacion=" + inclinacion + ", raan=" + raan + ", excentricidad=" + excentricidad
				+ ", argumento_perigeo=" + argumento_perigeo + ", movimiento_medio=" + movimiento_medio + "]";
	}
	
}
