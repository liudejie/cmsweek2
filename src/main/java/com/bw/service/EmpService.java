package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Gs;

public interface EmpService {
	public List<Gs> select(Map<String, Object> map);

	public int insert(Gs gs);
}
