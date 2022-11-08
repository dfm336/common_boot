package com.dfm.boot.example.mappers;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @date: 2022/6/6 4:29 下午
 * @description:
 **/
@RegisterMapper
public interface IMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
