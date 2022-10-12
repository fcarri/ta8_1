package project8;

public class Persona {

		//atributs
		protected String nombre;
		protected int edad;
		protected String DNI;
		protected sexo sexo;
		protected double peso;
		protected double altura;
		
		enum sexo {H,M};
				
		//constructors
		public Persona() {
			this.nombre = "";
			this.edad = 0;
			this.DNI = "12345678A";
			this.sexo = sexo.H;
			this.peso = 0;
			this.altura = 0;
		}
		
		public Persona(String nombre, int edad, sexo sexo) {
			this.DNI = "12345678A";
			this.peso = 0;
			this.altura = 0;
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
		}
		
		public Persona(String nombre, int edad, String DNI, sexo sexo, double peso, double altura) {
			this.nombre = nombre;
			this.edad = edad;
			this.DNI = "12345678A";
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
}


