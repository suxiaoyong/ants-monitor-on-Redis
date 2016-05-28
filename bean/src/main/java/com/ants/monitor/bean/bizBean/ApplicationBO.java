package com.ants.monitor.bean.bizBean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * app 的基础bizBean类
 * Created by zxg on 15/11/16.
 */
@Data
public class ApplicationBO {

    private String applicationName;

    private String owner = "";

    // 所属团队
    private String  organization;

    //提供服务的ip列表
    private Set<HostBO> hostList;

    //Service:online-test-local-wrong 四种类型
    private Map<String,Set<ServiceBO>> serviceMap;
//    private Set<ServiceBO> serviceSet;

    //providers
    private Set<String> providersSet;

    //consumers
    private Set<String> consumersSet;


    private Boolean isProvider = false;

    private Boolean isConsumer = false;


    //=========为前端服务
    private Integer serviceSum = 0;
    private Integer providerSum = 0;
    private Integer consumerSum = 0;
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public Set<HostBO> getHostList() {
		return hostList;
	}
	public void setHostList(Set<HostBO> hostList) {
		this.hostList = hostList;
	}
	public Map<String, Set<ServiceBO>> getServiceMap() {
		return serviceMap;
	}
	public void setServiceMap(Map<String, Set<ServiceBO>> serviceMap) {
		this.serviceMap = serviceMap;
	}
	public Set<String> getProvidersSet() {
		return providersSet;
	}
	public void setProvidersSet(Set<String> providersSet) {
		this.providersSet = providersSet;
	}
	public Set<String> getConsumersSet() {
		return consumersSet;
	}
	public void setConsumersSet(Set<String> consumersSet) {
		this.consumersSet = consumersSet;
	}
	public Boolean getIsProvider() {
		return isProvider;
	}
	public void setIsProvider(Boolean isProvider) {
		this.isProvider = isProvider;
	}
	public Boolean getIsConsumer() {
		return isConsumer;
	}
	public void setIsConsumer(Boolean isConsumer) {
		this.isConsumer = isConsumer;
	}
	public Integer getServiceSum() {
		return serviceSum;
	}
	public void setServiceSum(Integer serviceSum) {
		this.serviceSum = serviceSum;
	}
	public Integer getProviderSum() {
		return providerSum;
	}
	public void setProviderSum(Integer providerSum) {
		this.providerSum = providerSum;
	}
	public Integer getConsumerSum() {
		return consumerSum;
	}
	public void setConsumerSum(Integer consumerSum) {
		this.consumerSum = consumerSum;
	}


}
