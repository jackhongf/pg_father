package com.vincent.hong.core;

import java.util.List;

/**
 * @author frank
 * 
 * @param <T>
 * @param <PK>
 */
public interface GenericMapper<T, PK> {

	int insert(T record);

	int insertSelective(T record);

	int deleteByPrimaryKey(PK id);

	T selectByPrimaryKey(PK id);

	List<T> selectByExample(Criteria c);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}
