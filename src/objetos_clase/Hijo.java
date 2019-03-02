package objetos_clase;

public class Hijo extends Lamadre{

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int age=20;
	public double healty_state=32.5;
	
	
	public double getHealty_state() {
		return healty_state;
	}

	public Hijo() {
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDead() {
		return age <limit_age ? true:false;
		
	}

	@Override
	public boolean isDead(String diseasse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDead(char diseasse) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		Hijo pepito=new Hijo();
		
		pepito.isDead();
		Enfermedad dis=new Enfermedad();
		System.out.println(dis.contagius(pepito));
	}

}
