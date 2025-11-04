package ex04;

public interface Action {
	public abstract void attack();

	void defend();

}

class Warrior implements Action{

	@Override
	public void attack() {
		System.out.println("Attack to WArrior's sword");
	}

	@Override
	public void defend() {
		System.out.println("전사의 방패로 막습니다.");
	}
	
	
}

class Archer implements Action{

	@Override
	public void attack() {
		System.out.println("궁수가 활을 쏩니다.");
	}

	@Override
	public void defend() {
		System.out.println("궁수가 방어합니다. 뭘로?");
	}
	
	
}