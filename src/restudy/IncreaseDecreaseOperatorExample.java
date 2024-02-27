package restudy;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10; //변수선언 ljw
		int y = 10;
		int z;
		
		x++;  // 다른 연산 다 끝내고 1 더하기 연산자임
		++x;  // 1더하고 시작
		System.out.println("x=" + x);
		
		 System.out.println("-------------------------------------------"); //구분 목적
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		 
	}

}
