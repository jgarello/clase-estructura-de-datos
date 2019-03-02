package objetos_clase;

public abstract class Lamadre {

	public final int age=10;
	public int getAge() {
		return age;
	}

	public final int Healt =10;
	
	public int getHealt() {
		return Healt;
	}

	public final int limit_age=100;
	
	public Lamadre() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void walk();
	
	public abstract boolean isDead();
	
	public abstract boolean isDead(String  diseasse);
	
	public abstract boolean isDead(char  diseasse);

	public int getLimit_age() {
		return limit_age;
	}

}
