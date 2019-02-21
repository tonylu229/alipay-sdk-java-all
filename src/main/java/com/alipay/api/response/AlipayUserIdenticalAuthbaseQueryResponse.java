package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.identical.authbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserIdenticalAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2355234965331644118L;

	/** 
	 * 是否是同人账号
	 */
	@ApiField("identical")
	private Boolean identical;

	public void setIdentical(Boolean identical) {
		this.identical = identical;
	}
	public Boolean getIdentical( ) {
		return this.identical;
	}

}
