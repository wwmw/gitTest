package gitPrac;

class Calculator{
	int x;
	int y;
	
	public void setNumber(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void plus() {
		System.out.println("x + y = " + (x+y));
	}
	public void minus() {
		System.out.println("x - y = " + (x-y));
	}
	public void run() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		plus();
		minus();
	}
}

public class PracGit_Cal extends Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.x = 10;
		cal.y = 20;
		cal.run();
	}

}

//클래스 상속의 사용이유?