package egovframework.example.otherPages.BlankPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : BlankPagesController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class BlankPagesController {
		
	/**
	  * @Method Name : BlankPagesView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/blank.do")
	public ModelAndView BlankPagesView(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/blank");
		return mv;
	}
}
