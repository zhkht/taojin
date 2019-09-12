package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * 因为不能直接访问WEB-INF下面的资源，所以先写一个controller进行页面跳转展示首页。
 * 并且后台首页是easyUI开发的。
 * @author kht
 *
 */
@Controller
public class PageController {
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}	
	/**
	 * 实现首页点击菜单显示对应的页面
	 * @param page
	 * @return
	 */
	//通过 @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“) 
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}
}
