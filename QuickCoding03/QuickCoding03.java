
import java.util.Scanner;

class MyException extends Exception{
    
    public MyException(){
        
    }
}

public class QuickCoding03 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력해주세요.");
		String num1 = sc.next();
		String num2 = sc.next();//형근 하이
		
		
		try{
			int result = Integer.parseInt(num1)/Integer.parseInt(num2);
			System.out.println(result);
			if(Integer.parseInt(num1)>=100 || Integer.parseInt(num2)>=100)
				throw new MyException();
		}
		catch(MyException e){
			System.out.println("입력된 숫자의 자릿수가 3자리를 넘어갑니다.");
		}
		catch(NumberFormatException e){
			System.out.println("dddd");
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	
	}

}
