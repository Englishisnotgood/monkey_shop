package com.lmonkey.entity;

public class LMONKEY_CATEGORY {
	private int CATE_ID;
	private String cATE_NAME;
	private int CATE_PARENT_ID;
	public LMONKEY_CATEGORY(int cATE_ID, String cATE_NAME, int cATE_PARENT_ID) {
		super();
		CATE_ID = cATE_ID;
		this.cATE_NAME = cATE_NAME;
		CATE_PARENT_ID = cATE_PARENT_ID;
	}
	public int getCATE_ID() {
		return CATE_ID;
	}
	public void setCATE_ID(int cATE_ID) {
		CATE_ID = cATE_ID;
	}
	public String getcATE_NAME() {
		return cATE_NAME;
	}
	public void setcATE_NAME(String cATE_NAME) {
		this.cATE_NAME = cATE_NAME;
	}
	public int getCATE_PARENT_ID() {
		return CATE_PARENT_ID;
	}
	public void setCATE_PARENT_ID(int cATE_PARENT_ID) {
		CATE_PARENT_ID = cATE_PARENT_ID;
	}
	

}
