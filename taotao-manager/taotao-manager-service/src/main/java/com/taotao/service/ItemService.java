package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * 
  * @ClassName: ItemService  
  * @Description: TODO(商品管理的itemService接口)  
  * @author 汪本成  
  * @date 2016年8月6日 下午10:31:12  
  *
 */
public interface ItemService {
	
	
	TbItem getItemById(long itemId);
	/**
	 * 查询商品列表
	 */
	public EUDataGridResult getItemList(Integer page,Integer rows);
	
	//新增商品，提交表单数据时，
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
	

}
