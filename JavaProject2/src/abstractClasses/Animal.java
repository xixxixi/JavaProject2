package abstractClasses;

public abstract class Animal {
	String species;
	
	public Animal() {
		
	}
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo()	{
		System.out.println("������ " + this.species + "�Դϴ�.");
	}
	
	public void breathe() {
		System.out.println("���� ����.");
	}
	public abstract void sound();	// �߻� �޼ҵ�
}
