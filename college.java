package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class College {
	
	@Id
    private long cid;
	private String Csvfile;
	
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCsvfile() {
		return Csvfile;
	}
	public void setCsvfile(String csvfile) {
		Csvfile = csvfile;
	}
	


}
