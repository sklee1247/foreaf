package egovframework.example.dashBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : DashBoardController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class DashBoardController {
		
	/**
	  * @Method Name : DashBoardView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/")
	public ModelAndView DashBoardView(ModelAndView mv) throws Exception {
		
		mv.setViewName("dashBoard/dashBoard");
		return mv;
	}
	
	/**
	  * @Method Name : IndexView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/index.do")
	public ModelAndView IndexView(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/index");
		return mv;
	}
	
}
