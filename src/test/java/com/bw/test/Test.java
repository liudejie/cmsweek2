package com.bw.test;

import java.util.Arrays;
import java.util.List;

import javax.swing.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.Gs;
import com.bw.mapper.EmpMapper;
import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpMapper mapper = context.getBean(EmpMapper.class);

		List<Object[]> list = IOUtils.readFile("cms附件-机械设备公司年检信息.txt", "\t");
		for (Object[] object : list) {
			int id = 0;
			String keywords = (object[1] + "");
			String description = (object[2] + "");
			String name = (object[3] + "");
			String cp = (object[4] + "");
			String dz = (object[5] + "");
			Double zb = (double) 0;
			String cltime = (object[7] + "");
			String njtime = (object[8] + "");
			String zt = (object[9] + "");
			String bz = (object[10] + "");

			if (StringUtil.isNumber(object[0] + "")) {

				if (!StringUtil.isEmpty(object[1] + "")) {
					if (!StringUtil.isEmpty(object[2] + "")) {
						if (!StringUtil.isEmpty(object[3] + "")) {

							if (!StringUtil.isEmpty(object[4] + "")) {

								if (!StringUtil.isEmpty(object[5] + "")) {

									System.out.println(Arrays.toString(object));
									Gs gs = new Gs(id, keywords, description, name, cp, dz, zb, cltime, njtime, zt, bz);
									mapper.insert(gs);
									if (StringUtil.isNumber(object[5] + "")) {

									}
								}

							}
						}
					}
				}

			}
		}
	}
}
