package com.taotao.controller;
 
//import java.util.List;
// 
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
// 
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.taotao.mapper.TbItemMapper;
//import com.taotao.pojo.TbItem;
//import com.taotao.pojo.TbItemExample;
 
/**
 * 
  * @ClassName: TestPageHelper  
  * @Description: TODO(测试PageHelper)  
  * @author 汪本成  
  * @date 2016年8月7日 下午10:07:00  
  *
 */
public class TestPageHelper {
	/**	
	@Test
	public void testPageHelper() {
		
		//创建一个spring容器
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		//从spring容器中获得Mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
 
		//执行查询并分页
		TbItemExample example = new TbItemExample();
		
		//分页处理
		PageHelper.startPage(2, 10);
		List<TbItem> list = mapper.selectByExample(example);
		
		//取得商品列表
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		
		//取得分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		//获取所有商品
		long total = pageInfo.getTotal();
		System.out.println("共有商品： " + total);
	}
  */
}