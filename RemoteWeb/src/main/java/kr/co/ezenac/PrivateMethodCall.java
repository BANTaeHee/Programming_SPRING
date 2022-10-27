package kr.co.ezenac;

public class PrivateMethodCall {

	public static void main(String[] args) {
		Hello hello = new Hello();
		//hello.main();			//private이라서 외부 호출 불가
		
		/*
		 * http://localhost:8080/ezenac/hello 실행시 main() 호출됨
		 * 	- reflection api를 사용했기 때문에 가능함
		 *  	- 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공
		 *  	- java.lang.reflect 패키지를 제공
		 *  
		 */
		
		try {
			/*
			 *  Hello 클래스의 Class객체(클래스의 정보를 담고있는 객체)를 얻어옴
			 *  	- 클래스 파일 (*.class)이 메모리에 올라갈 때, 클래스마다 Class 객체가 하나씩 생성됨
			 */
			Class helloClass = Class.forName("kr.co.ezenac.Hello");
			Hello hello2 = (Hello) helloClass.newInstance();
			
			helloClass.getDeclaredMethod("main1");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {e.printStackTrace();}
		
		
		
	}

}
