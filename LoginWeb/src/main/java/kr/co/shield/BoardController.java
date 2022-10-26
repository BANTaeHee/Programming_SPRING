package kr.co.shield;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/list")
	public String list(HttpServletRequest request) {
		
		if(!logincheck(request))		// 로그인 안했으면 로그인 화면으로 이동
			return "redirect:/login/login?toURL="+request.getRequestURL();
			
		return "boardlist";				// 로그인 한 상태이면, 게시판 목록 화면으로 이동
	}
	@PostMapping("/board/list")
	private boolean logincheck(HttpServletRequest request) {
		// 세션을 얻어서
		HttpSession session = request.getSession();
		// 세션에 id가 있는 지 확인, 있으면 true가 반환
		return session.getAttribute("id") != null;			// true 반환, null이면 false 반환
		
	}
}














