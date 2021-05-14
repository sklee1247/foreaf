package egovframework.example.pages.forgotPassword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : ForgotPasswordController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class ForgotPasswordController {
		
	/**
	  * @Method Name : NotFoundPagesView1
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/password.do")
	public ModelAndView NotFoundPagesView1(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/password");
		return mv;
	}
		
	/**
	  * @Method Name : NotFoundPagesView2
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/forgotpassword.do")
	public ModelAndView NotFoundPagesView2(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/forgot-password");
		return mv;
	}
	
}
