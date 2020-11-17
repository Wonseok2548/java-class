package myobj.monster;

import myobj.item.Sword;
import myobj.item.Weapon;
import myobj.item.Gun;

public class Monster {
	public String name;
	public int hp;
	
	public Monster() {
		name = "������ ����ƺ�";
		hp = 99999;
	}
	
	public void attacked(Sword sword) {
		int dmg = sword.damage();
		hp -= dmg;
		System.out.printf("%s���� %d�� ������!\n", name, dmg);
		System.out.printf("%s�� ���� ü�� : %d\n", name, hp);
	}
	
	// WeaponŸ������ ��ĳ���õ� Gun �ν��Ͻ���
	// damage()�� ����� �� Gun�� damage()�� ����Ѵ�
	public void attacked(Weapon weapon) {
		int dmg = weapon.damage();
		hp -= dmg;
		System.out.printf("%s���� %d�� ������!\n", name, dmg);
		System.out.printf("%s�� ���� ü�� : %d\n", name, hp);
	}
	
	public static void main(String[] args) {
		Sword steel_sword = new Sword(30);
		
		Monster mon = new Monster();
		
		for (int i = 0; i < 10; ++i) {
			steel_sword.upgrade_weapon();
		}
		
		// mon.attacked(steel_sword);
		mon.attacked(steel_sword);
		mon.attacked(new Gun());
		mon.attacked(new Weapon(10));
	}
}














