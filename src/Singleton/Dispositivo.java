package Singleton;

public class Dispositivo {
	
	static Dispositivo instancia;
	private int id;
	private String nome;
	private String tipo;
	
	
	private Dispositivo(int id) {
		this.setId(id);
	}
	
	public static Dispositivo getIntancia(int id) {
		if(instancia == null) {
			instancia = new Dispositivo(id);
		}
		return instancia;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
