package com.softfdyze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.softfdyze.entity.SoftDyzeData;
import com.softfdyze.repo.ImplementationClass;

@Service
public class ServiceClass {
	@Autowired
	private ImplementationClass imp;

	public void save(SoftDyzeData sd) {
		SoftDyzeData bk = imp.findByEmail(sd.getEmail());
		if (bk == null)
			imp.save(sd);
		else {
			bk.setName(sd.getName());
			bk.setEmail(sd.getEmail());
			bk.setSubject(sd.getSubject());
			bk.setMessage(sd.getMessage());
			imp.save(bk);
		}

	}

}
