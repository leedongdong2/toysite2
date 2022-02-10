package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import service.HomeServiceImpl;
import vo.AboutImageVo;
import vo.HomeVo;

@RestController
public class HomeController {

@Autowired
HomeServiceImpl homeService;

	@RequestMapping(value = "home.main",method = {RequestMethod.GET,RequestMethod.POST}) 
	public ModelAndView mainView(ModelAndView mv,HttpServletRequest request) {
		request.setAttribute("hederTitle", "home");
		List<HomeVo> list = homeService.HomeVideoList();
		List<HomeVo> bannerList = homeService.homeBannerVideoList();
		mv.addObject("list",list);
		mv.addObject("bannerList",bannerList);
		mv.setViewName("board/home");
		return mv;
	}
	
	@RequestMapping(value = "contact.main",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView contactView(ModelAndView mv,HttpServletRequest request) {
		request.setAttribute("hederTitle", "contact");
		String contactImage = homeService.contactImage();
		mv.addObject("contactImage",contactImage);
		mv.setViewName("board/contact");
		return mv;
	}
	
	@RequestMapping(value = "about.main",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView aboutView(ModelAndView mv,HttpServletRequest request) {
		request.setAttribute("hederTitle", "aboutUs");
		List<AboutImageVo> aboutImageList = homeService.aboutImageList();
		int aboutImageZoneHeight = homeService.aboutImageZoneHeight();
		mv.addObject("aboutImageList", aboutImageList);
		mv.addObject("aboutImageZoneHeight", aboutImageZoneHeight);
		mv.setViewName("board/about");
		return mv;
	}
	
	@RequestMapping(value = "ourAct.main",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView ourAct(ModelAndView mv,HttpServletRequest request) {
		request.setAttribute("hederTitle", "ourAct");
		mv.setViewName("board/ourAct");
		return mv;
	}
	
	@RequestMapping(value="videoDetail.main",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView videoDetail(ModelAndView mv,@RequestParam("serial") String serial) {
		HomeVo videoDetail = homeService.videoDetail(serial);
		List<HomeVo> latestVideoList = homeService.latestVideoList(serial);
		mv.addObject("videoDetail",videoDetail);
		mv.addObject("latestVideoList",latestVideoList);
		mv.setViewName("board/videoDetail");
		return mv;
	}
}
