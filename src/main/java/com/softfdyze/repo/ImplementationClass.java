package com.softfdyze.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softfdyze.entity.SoftDyzeData;

@Repository
public interface ImplementationClass extends JpaRepository<SoftDyzeData, String> {
	public SoftDyzeData findByEmail(String str);
}
