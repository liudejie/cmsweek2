package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Gs;
import com.bw.mapper.EmpMapper;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper emp;

	public int insert(Gs gs) {
		// TODO Auto-generated method stub
		return emp.insert(gs);
	}

	public List<Gs> select(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return emp.select(map);
	}

}
