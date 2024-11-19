package Singleton;

public class mainProva {

	public static void main(String[] args) {
		Dispositivo dispositivo = Dispositivo.getIntancia(0);
		System.out.println(dispositivo);
		System.out.println(dispositivo.getId());

		Dispositivo outroDispositivo = Dispositivo.getIntancia(1);
		System.out.println(outroDispositivo);
		System.out.println(outroDispositivo.getId());
	}

}
