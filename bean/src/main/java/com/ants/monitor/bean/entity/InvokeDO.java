package com.ants.monitor.bean.entity;

import lombok.Data;

import java.util.Date;

@Data
public class InvokeDO {
    private Integer autoId;

    private String id;

    private String application;

    private String service;

    private String method;

    private String consumerHost;

    private String consumerPort;

    private String providerHost;

    private String providerPort;

    private String appType;

    private Long invokeTime;

    private Integer success;

    private Integer failure;

    private Integer elapsed;

    private Integer concurrent;

    private Integer maxElapsed;

    private Integer maxConcurrent;

    private Date invokeDate;

    private Date gmtCreate;
    private Date gmtModified;

    private String invokeDateString;

	public Integer getAutoId() {
		return autoId;
	}

	public void setAutoId(Integer autoId) {
		this.autoId = autoId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getConsumerHost() {
		return consumerHost;
	}

	public void setConsumerHost(String consumerHost) {
		this.consumerHost = consumerHost;
	}

	public String getConsumerPort() {
		return consumerPort;
	}

	public void setConsumerPort(String consumerPort) {
		this.consumerPort = consumerPort;
	}

	public String getProviderHost() {
		return providerHost;
	}

	public void setProviderHost(String providerHost) {
		this.providerHost = providerHost;
	}

	public String getProviderPort() {
		return providerPort;
	}

	public void setProviderPort(String providerPort) {
		this.providerPort = providerPort;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public Long getInvokeTime() {
		return invokeTime;
	}

	public void setInvokeTime(Long invokeTime) {
		this.invokeTime = invokeTime;
	}

	public Integer getSuccess() {
		return success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
	}

	public Integer getFailure() {
		return failure;
	}

	public void setFailure(Integer failure) {
		this.failure = failure;
	}

	public Integer getElapsed() {
		return elapsed;
	}

	public void setElapsed(Integer elapsed) {
		this.elapsed = elapsed;
	}

	public Integer getConcurrent() {
		return concurrent;
	}

	public void setConcurrent(Integer concurrent) {
		this.concurrent = concurrent;
	}

	public Integer getMaxElapsed() {
		return maxElapsed;
	}

	public void setMaxElapsed(Integer maxElapsed) {
		this.maxElapsed = maxElapsed;
	}

	public Integer getMaxConcurrent() {
		return maxConcurrent;
	}

	public void setMaxConcurrent(Integer maxConcurrent) {
		this.maxConcurrent = maxConcurrent;
	}

	public Date getInvokeDate() {
		return invokeDate;
	}

	public void setInvokeDate(Date invokeDate) {
		this.invokeDate = invokeDate;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvokeDateString() {
		return invokeDateString;
	}

	public void setInvokeDateString(String invokeDateString) {
		this.invokeDateString = invokeDateString;
	}
    
    
}