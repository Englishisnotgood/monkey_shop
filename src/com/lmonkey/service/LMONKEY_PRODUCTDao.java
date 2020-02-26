package com.lmonkey.service;

import com.lmonkey.dao.Basedao;
import com.lmonkey.entity.LMONKEY_PRODUCT;

public class LMONKEY_PRODUCTDao {
	public static int insert(LMONKEY_PRODUCT p) {
		String sql = "insert into LMONKEY_PRODUCT values(null, ?, ?, ?, ?, ?, ?, ?)";
		
		Object[] params = {
				p.getPRODUCT_NAME(),
				p.getPRODUCT_DESCRIPTION(),
				p.getPRODUCT_PRICE(),
				p.getPRODUCT_STOCK(),
				p.getPRODUCT_FID(),
				p.getPRODUCT_CID(),
				p.getpRODUCT_FILENAME()
		};
		
		return Basedao.exectuIUD(sql, params);
	}
}
