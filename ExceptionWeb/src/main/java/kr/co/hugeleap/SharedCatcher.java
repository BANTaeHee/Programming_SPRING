package kr.co.hugeleap;

import java.io.FileNotFoundException;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

//@ControllerAdvice("kr.co.hugeleap.sub")
@ControllerAdvice								//모든 컨트롤러에서 발생하는 예외를 다 처리하게 됨 (모든 
public class SharedCatcher {
	
	//@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String catcher(Exception ex, Model m) {		
		System.out.println("catcher() in SharedCatcher");
		System.out.println("m = " + m.getAttribute("msg"));		//다른 모델을 사용하고 있음.
		
		m.addAttribute("ex", ex);					//예외정보가 모델에 담겨서 뷰에 전달된 것. 
		return "error";
	}
	
	//@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String catcher2(Exception ex, Model m) {
		
		m.addAttribute("ex", ex);
		return "error";
	}
}
