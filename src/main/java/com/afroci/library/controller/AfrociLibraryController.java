package com.afroci.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.afroci.library.model.History;
import com.afroci.library.service.HistoryServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class AfrociLibraryController {

	@Autowired
	private HistoryServiceImpl historyService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/history")
	public ModelAndView greeting(ModelAndView mv, @RequestParam(name = "userId", required = false, defaultValue = "000001")
	    String userId, @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
	    @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<History> histories=  historyService.selectHistoryByBorrowUser(userId);
		PageInfo<History> historiesPage = new PageInfo<History>(histories);
		mv.addObject("histories", histories);
		mv.addObject("historiesPage", historiesPage);
		mv.setViewName("history");
		return mv;
	}
	
	@RequestMapping("/users/{username}")
	public String userProfile(@PathVariable("username") String username) {
		return String.format("user %s", username);
	}

	@RequestMapping("ids/{id}")
	public String post(@PathVariable("id") int id) {
		return String.format("post %d", id);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		return "Login page";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logetPost() {
		return "Login request";
	}
}
