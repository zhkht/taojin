package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 
  * @ClassName: EUDataGridResult  
  * @Description: TODO(javaBean,方便提供其他工程使用EasyUI)  
  * @author 汪本成  
  * @date 2016年8月7日 下午10:18:00  
  *
 */

public class EUDataGridResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	private Integer total;
	
	private List<?> rows;
 
	public Integer getTotal() {
		return total;
	}
 
	public void setTotal(Integer total) {
		this.total = total;
	}
 
	public List<?> getRows() {
		return rows;
	}
 
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	

}
