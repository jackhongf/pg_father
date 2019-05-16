package com.vincent.hong.core;

import java.util.List;
import java.util.Map;

/**
 * @author frank
 * 
 * @param <T>
 * @param <PK>
 */
public interface GenericService<T, PK> {

	int insert(T record);

	T insertReturnObject(T record);

	int insertSelective(T record);

	T insertSelectiveReturnObject(T record);

	int deleteByPrimaryKey(PK id);

	T selectByPrimaryKey(PK id);

	List<T> selectByExample(Criteria c);

	List<T> selectByExample(Map<String, Object> params);

	T selectUniqueByExample(Map<String, Object> params);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
