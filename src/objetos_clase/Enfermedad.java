package objetos_clase;

public class Enfermedad {

	public Enfermedad() {
		// TODO Auto-generated constructor stub
	}
	public boolean contagius(Lamadre person){
		
		double factor=person.getHealt()*(person.getAge()*0.0001);
				
		return factor <0.5 ? false:true;
	};

}
