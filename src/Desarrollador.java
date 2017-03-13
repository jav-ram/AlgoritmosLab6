
public class Desarrollador {
	private String name;
	private boolean java;
	private boolean web;
	private boolean movil;
	
	public Desarrollador(String name, boolean java, boolean web, boolean movil){
		this.name = name;
		this.java = java;
		this.web = web;
		this.movil = movil;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isJava() {
		return java;
	}

	public void setJava(boolean java) {
		this.java = java;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public boolean isMovil() {
		return movil;
	}

	public void setMovil(boolean movil) {
		this.movil = movil;
	}
}
