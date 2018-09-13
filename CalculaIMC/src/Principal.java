
public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(65, 1.87);
		Paciente paciente2 = new Paciente(150, 1.60);
		Paciente paciente3 = new Paciente(80, 1.69);
		
		System.out.println(paciente1.diagnostico());
		System.out.println(paciente2.diagnostico());
		System.out.println(paciente3.diagnostico());
		
	}

}
