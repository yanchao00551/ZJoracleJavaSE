package com.ebay.core.object;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

//TODO: 通用mapper
public interface BaseMapper<T extends AbstractDO> extends Mapper<T>, MySqlMapper<T> {
  // 特别注意，该接口不能被扫描到，否则会出错
}
