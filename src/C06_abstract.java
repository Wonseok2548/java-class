public class C06_abstract {

	// # 추상 클래스 : 클래스 내부에 추상 메서드를 지닌 클래스
	
		
	// # 추상 클래스
	//	- 함수의 형태만 정해놓고 자식 클래스에서 오버라이드를 구현하게 만든다.
	//	- 자식 클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생한다.
	//	- 자식 클래스에 같은 형태의 해당 메서드가 100% 존재하는 것을 보장한다.
	//	- 업캐스팅 했을 때 자식 클래스에서 구현된 코드를 사용하게 된다.
		
	// 자식 클래스들의 형태를 미리 결정 
	// 자식 클래스들이 메서드를 오버라이드 하여 사용하게 만든다
	
	public static void main(String[] args) {
		
		// abstract 클래스와 그것을 상속받는 케이스를 설계하세요.
		// (추상 메서드가 반드시 존재해야 함.)
		
		
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
        System.out.println("숨쉬는 중");
    }
    
    public abstract void sound();
}



class Dog extends Animal{
    
    public Dog(){
        this.kind = "포유류";
    }
     
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("멍멍!");
    }
 
}

class Cat extends Animal{
	 
    public Cat(){
        this.kind = "포유류";
    }
    
    @Override
    public void sound() {
    	// TODO Auto-generated method stub
    	 System.out.println("야옹~");
    }
}





























