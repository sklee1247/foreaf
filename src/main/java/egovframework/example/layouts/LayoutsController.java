/**
 * 
 */
package egovframework.example.layouts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.SampleDefaultVO;

/**
 * @FileName : LayoutsController.java
 * @Project : foreaf
 * @Date : 2021. 5. 14
 * @작성자 : forea
 * @변경이력 :
 * @프로그램 설명 :
 */
@Controller
public class LayoutsController {

    /**
     * @Method Name : content2View
     * @작성일 : 2021. 5. 14
     * @작성자 : forea
     * @변경이력 :
     * @Method 설명 :
     * @param searchVO
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/layout-static.do")
    public String layoutStaticView(@ModelAttribute("searchVO") SampleDefaultVO searchVO, Model model) throws Exception {
	model.addAttribute("url", "/layout-static.do");
	return "pages/layout-static";
    }

    @RequestMapping(value = "/layout-sidenav-light.do")
    public String layoutSidenavLightView(@ModelAttribute("searchVO") SampleDefaultVO searchVO, Model model)
	    throws Exception {
	model.addAttribute("url", "/layout-static.do");
	return "pages/layout-static";
    }
}
