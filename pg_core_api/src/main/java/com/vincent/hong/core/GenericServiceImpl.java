package com.vincent.hong.core;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author frank
 * 
 * @param <T>
 * @param <PK>
 */
public abstract class GenericServiceImpl<T extends Object, PK> implements
		GenericService<T, PK> {

	// protected abstract GenericMapper<T, PK> genericMapper;
	@Autowired
	protected GenericMapper<T, PK> genericMapper;

	public int insert(T entity) {
		return this.genericMapper.insert(entity);
	}

	public T insertReturnObject(T entity) {
		this.genericMapper.insert(entity);
		return entity;
	}

	public int insertSelective(T entity) {
		return this.genericMapper.insertSelective(entity);
	}

	public T insertSelectiveReturnObject(T entity) {
		this.genericMapper.insertSelective(entity);
		return entity;
	}

	public int deleteByPrimaryKey(PK id) {
		return this.genericMapper.deleteByPrimaryKey(id);
	}

	public T selectByPrimaryKey(PK id) {
		return this.genericMapper.selectByPrimaryKey(id);
	}

	public List<T> selectByExample(Criteria c) {
		return this.genericMapper.selectByExample(c);
	}

	public List<T> selectByExample(Map<String, Object> params) {
		Criteria c = new Criteria();
		c.setCondition(params);
		return selectByExample(c);
	}

	public T selectUniqueByExample(Map<String, Object> params) {
		Criteria c = new Criteria();
		c.setCondition(params);
		List<T> results = selectByExample(c);
		if (results != null && results.size() > 0) {
			return results.get(0);
		}
		return null;
	}

	public int updateByPrimaryKeySelective(T entity) {
		return this.genericMapper.updateByPrimaryKeySelective(entity);
	}

	public int updateByPrimaryKey(T entity) {
		return this.genericMapper.updateByPrimaryKey(entity);
	}
}
