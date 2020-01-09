package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Gs;

public interface EmpMapper {

	public List<Gs> select(Map<String, Object> map);

	public int insert(Gs gs);
}
