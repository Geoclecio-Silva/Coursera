
public class Paciente {
	
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaIMC(){
		return (this.peso / (this.altura * this.altura)); 
			
	}
	
	public double getCalculaIMC(){
		return this.calculaIMC();
	}
	
	public String diagnostico(){
		
		if(this.getCalculaIMC() < 16){
			return "Baixo peso muito grave";
			
		}
		
		else if(this.getCalculaIMC() >= 16 && this.getCalculaIMC() < 17  ) {
			return "Baixo peso grave";
			
		}
		
		else if(this.getCalculaIMC() >= 17 && this.getCalculaIMC() < 18.5 ){
			return "Baixo peso";
			
		}
		else if(this.getCalculaIMC() >= 18.5 && this.getCalculaIMC() < 25 ){
			return "Peso normal";
			
		}
		else if(this.getCalculaIMC() >= 25 && this.getCalculaIMC() < 30 ){
			return "Sobrepeso";
			
		}
		else if(this.getCalculaIMC() >= 30 && this.getCalculaIMC() < 35 ){
			return "Obesidade grau I";
			
		}
		else if(this.getCalculaIMC() >= 35 && this.getCalculaIMC() < 40 ){
			return "Obesidade grau II";
			
		}
		else if(this.getCalculaIMC() >= 40 ){
			return "Obesidade grau III (obesidade morbida)";
			
		}
		else {
			return null;
		}
		
		
	}

}
