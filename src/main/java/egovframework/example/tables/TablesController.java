package egovframework.example.tables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
  * @FileName : TablesController.java
  * @Project : foreaf
  * @Date : 2021. 5. 14 
  * @작성자 : forea
  * @변경이력 :
  * @프로그램 설명 :
  */
@Controller
public class TablesController {
		
	/**
	  * @Method Name : TablesView
	  * @작성일 : 2021. 5. 14
	  * @작성자 : forea
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param mv
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/tables.do")
	public ModelAndView TablesView(ModelAndView mv) throws Exception {
		
		mv.setViewName("pages/tables");
		return mv;
	}
	
}
