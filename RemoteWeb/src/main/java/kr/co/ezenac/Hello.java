package kr.co.ezenac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. ¿ø°Ý È£­Œ°¡´ÉÇÑ ÇÁ·Î±×·¥À¸·Î µî·Ï
@Controller
public class Hello {
	int iv = 10;			//ÀÎ½ºÅÏ½º º¯¼ö
	static int cv = 20;		//static º¯¼ö
	
	//2. URL°ú ¸Þ¼­µå¸¦ ¿¬°á 
	@RequestMapping("/hello")
	private void main1() {			//ÀÎ½ºÅÏ½º ¸Þ¼­µå - ¾È½ºÅÏ½º º¯¼ö, static º¯¼ö µÑ ´Ù »ç¿ë°¡´É
		System.out.println("Hello - private");
		System.out.println(iv);
		System.out.println(cv);
	}
}
