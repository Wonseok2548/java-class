public class C06_abstract {

	// # �߻� Ŭ���� : Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ����
	
		
	// # �߻� Ŭ����
	//	- �Լ��� ���¸� ���س��� �ڽ� Ŭ�������� �������̵带 �����ϰ� �����.
	//	- �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�.
	//	- �ڽ� Ŭ������ ���� ������ �ش� �޼��尡 100% �����ϴ� ���� �����Ѵ�.
	//	- ��ĳ���� ���� �� �ڽ� Ŭ�������� ������ �ڵ带 ����ϰ� �ȴ�.
		
	// �ڽ� Ŭ�������� ���¸� �̸� ���� 
	// �ڽ� Ŭ�������� �޼��带 �������̵� �Ͽ� ����ϰ� �����
	
	public static void main(String[] args) {
		
		// abstract Ŭ������ �װ��� ��ӹ޴� ���̽��� �����ϼ���.
		// (�߻� �޼��尡 �ݵ�� �����ؾ� ��.)
		
		
		Dog dobermann = new Dog();
		dobermann.breath();
		dobermann.sound();
		
		Cat americanShort = new Cat();
		americanShort.breath();
		americanShort.sound();
	}

}

abstract class Animal {
	
	public String kind;
    
    public void breath(){
        System.out.println("������ ��");
    }
    
    public abstract void sound();
}



class Dog extends Animal{
    
    public Dog(){
        this.kind = "������";
    }
     
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("�۸�!");
    }
 
}

class Cat extends Animal{
	 
    public Cat(){
        this.kind = "������";
    }
    
    @Override
    public void sound() {
    	// TODO Auto-generated method stub
    	 System.out.println("�߿�~");
    }
}





























