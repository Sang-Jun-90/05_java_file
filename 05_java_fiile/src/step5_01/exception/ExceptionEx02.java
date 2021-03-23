package step5_01.exception;

/*
 * 
 * # 예외 (Exception) 처리
 * 
 * 심각한 오류를 발생시킬수 있는 내용은
 * try , catch 구문안에 만들도록 강제한다.
 * 
 * try : 에러가 나지 않을 경우 정상적으로 실행 될 명령어
 * catch : try{} 안의 명령어가 실행되는 중 에러가 발생할 경우 분기되는 명령어
 * 
 *  - try 없이 catch가 단독으로 올 수 없고 , catch 없이 try가 단독으로 올 수 없다.
 * 
 * 
 * */

public class ExceptionEx02 {

	public static void main(String[] args) {

		try {
			int[] testArr = new int[5];
			System.out.println(testArr[999]);
//			System.out.println(testArr[0] / 0);
			
		}catch (Exception e) {
			System.out.println("에러");
		}finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 명령어를 적는다");
			System.out.println("주로 외부모듈과의 커넥션을 종료할 때 사용한다");
			
		}
		
	}

}
