package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.register.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-15 15:34:36
 */
public class AlipayEbppInvoiceRegisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5885746453866118639L;

	/** 
	 * 入驻工单ID，发票中台生成
	 */
	@ApiField("register_id")
	private String registerId;

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	public String getRegisterId( ) {
		return this.registerId;
	}

}
