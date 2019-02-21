package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息授权接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 19:56:26
 */
public class AlipayUserAuthUserinfoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4886981983376193277L;

	/**
	 * 业务号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展数据
	 */
	@ApiField("ext_data")
	private String extData;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

}
