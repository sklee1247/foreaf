package egovframework.example.pages.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : LoginController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class LoginController {
		
	/**
	  * @Method Name : LoginView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/login.do")
	public ModelAndView LoginView(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/login");
		return mv;
	}
}
