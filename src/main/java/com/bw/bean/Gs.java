package com.bw.bean;

public class Gs {
	private int id;
	private String keywords;
	private String description;
	private String name;
	private String cp;

	private String dz;
	private Double zb;
	private String cltime;
	private String njtime;
	private String zt;

	private String bz;

	public Gs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gs(int id, String keywords, String description, String name, String cp, String dz, Double zb, String cltime,
			String njtime, String zt, String bz) {
		super();
		this.id = id;
		this.keywords = keywords;
		this.description = description;
		this.name = name;
		this.cp = cp;
		this.dz = dz;
		this.zb = zb;
		this.cltime = cltime;
		this.njtime = njtime;
		this.zt = zt;
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Gs [id=" + id + ", keywords=" + keywords + ", description=" + description + ", name=" + name + ", cp="
				+ cp + ", dz=" + dz + ", zb=" + zb + ", cltime=" + cltime + ", njtime=" + njtime + ", zt=" + zt
				+ ", bz=" + bz + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public Double getZb() {
		return zb;
	}

	public void setZb(Double zb) {
		this.zb = zb;
	}

	public String getCltime() {
		return cltime;
	}

	public void setCltime(String cltime) {
		this.cltime = cltime;
	}

	public String getNjtime() {
		return njtime;
	}

	public void setNjtime(String njtime) {
		this.njtime = njtime;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

}
