
import myobj.animal.Animal;

public class C10_AnonymousClass {
	
	// # �͸� Ŭ����
	//	- Ŭ������ �ٷ� �����Ͽ� ����ϴ� ���
	//	- ���� ������� �ʰ� �ѹ��� ����Ѵ�.
	
	public static void useAnimal(Animal animal) {
		animal.breath();
		animal.eat();		
	}
	
	
	public static void main(String[] args) {
		
		Animal animal01 = new Animal();
		
		
		// �̷��� ������ Ŭ������ �ٽô� ����� �� ���� ������ �͸� Ŭ������� �θ���.
		Animal animal02 = new Animal() {
			@Override
			public void breath() {
				System.out.println("������� ������");
			}
			
			@Override
			public void eat() {
				System.out.println("������� ���� �Ա�");
			}
			
			
			
		};
		
		// �͸����� ������ ���ο� Ŭ������ �Լ��� ���ڷ� ����
		useAnimal(new Animal() {
			@Override
			public void breath() {
				System.out.println("����̰� ���� ���ϴ�.");
			}
			
			@Override
			public void eat() {
				System.out.println("����̰� ��ġĵ�� �Խ��ϴ�.");
			}
		});
		
		
		useAnimal(animal01);
		System.out.println("-----------------------------");
		useAnimal(animal02);
		
		// # ���� �߻�Ŭ������ �ν��Ͻ�ȭ�� �Ұ����ϴ�.
		abstract class Monster {
			int attack;
			int hp;
			
			public Monster(int attack, int hp) {
				this.attack = attack;
				this.hp = hp;
			}
			
			abstract void attack();
			abstract void attacked();
		}
		
		Monster monster = new Monster(50, 300) {
			
			@Override
			void attack() {
				System.out.printf("%d�� ���ݷ����� �����մϴ�.\n", attack * 150);
			}

			@Override
			void attacked() {
				System.out.println("ü���� 1 �����߽��ϴ�.");
				
			}
			
		};
		
		monster.attack();
		monster.attacked();
		
		
		animal01.eat();
		animal01.breath();	
		
		
		
		animal02.breath();
		animal02.eat();
	}

}




























