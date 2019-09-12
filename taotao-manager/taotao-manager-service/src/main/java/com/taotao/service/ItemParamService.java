package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItemParam;

public interface ItemParamService {

	//查询规格模板
	TaotaoResult getItemParamByCid(long id);
    //存储规格模板
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
