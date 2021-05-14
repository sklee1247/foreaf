package egovframework.example.otherPages.notFoundPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : NotFoundPagesController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class NotFoundPagesController {
	
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
	@RequestMapping(value="/401.do")
	public ModelAndView NotFoundPagesView1(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/401");
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
	@RequestMapping(value="/404.do")
	public ModelAndView NotFoundPagesView2(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/404");
		return mv;
	}
	
	/**
	  * @Method Name : NotFoundPagesView3
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/500.do")
	public ModelAndView NotFoundPagesView3(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/500");
		return mv;
	}
}
