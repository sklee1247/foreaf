package egovframework.example.pages.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : PagesRegisterController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class PagesRegisterController {
		
	/**
	  * @Method Name : RegisterView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/register.do")
	public ModelAndView RegisterView(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/register");
		return mv;
	}
}
