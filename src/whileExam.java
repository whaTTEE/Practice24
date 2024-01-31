import java.util.Scanner; //스캐너를 사용하기 위해서 필요한거임


public class whileExam {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //입력값을 받는다는 의미임
	
    int i = sc.nextInt(); // 정수형을 받겠단 의미 그리고 그 숫자 부터 10아래까지 
    
	while(i<10) {
	System.out.println(i);	
	i++;

	}

}
}
