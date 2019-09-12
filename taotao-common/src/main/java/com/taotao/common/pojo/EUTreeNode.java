package com.taotao.common.pojo;
/**
 * easyUI树形控件节点格式
 * <p>Title: EUTreeNode</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月4日上午9:13:14
 * @version 1.0
 */
public class EUTreeNode {

	private Long id;  //节点id
    private String text; //节点名称
    private String state; //如果不是叶子节点就是close，叶子节点就是open
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
