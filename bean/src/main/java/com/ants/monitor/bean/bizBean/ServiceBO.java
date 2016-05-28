package com.ants.monitor.bean.bizBean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * services 的biz bean类
 * Created by zxg on 15/11/16.
 */
@Data
public class ServiceBO {

    private String serviceName;

    private Set<String> methods;

    private String owner;

    private Boolean isConsumer = false;

    // 若同个service 存在的方法不一样，则此service 出错
    private Boolean isWrong = false;

    //错误原因
    private String wrongReason;

    // ==================services.ftl 使用====================

    // 所属团队
    private String  organization ;

    // 所属的application
    private Set<String> ownerApp;

    //使用的app
    private Set<String> usedApp;

    //本地起了测试或线上，测试起了线上
    private Boolean isHostWrong = false;

    //每个method提供的host地址
    private Map<String,Set<HostBO>> methodsHost;

    //最后消费时间
    private String finalConsumerTime = "2011-04-10 00:00:00";

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Set<String> getMethods() {
		return methods;
	}

	public void setMethods(Set<String> methods) {
		this.methods = methods;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Boolean getIsConsumer() {
		return isConsumer;
	}

	public void setIsConsumer(Boolean isConsumer) {
		this.isConsumer = isConsumer;
	}

	public Boolean getIsWrong() {
		return isWrong;
	}

	public void setIsWrong(Boolean isWrong) {
		this.isWrong = isWrong;
	}

	public String getWrongReason() {
		return wrongReason;
	}

	public void setWrongReason(String wrongReason) {
		this.wrongReason = wrongReason;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Set<String> getOwnerApp() {
		return ownerApp;
	}

	public void setOwnerApp(Set<String> ownerApp) {
		this.ownerApp = ownerApp;
	}

	public Set<String> getUsedApp() {
		return usedApp;
	}

	public void setUsedApp(Set<String> usedApp) {
		this.usedApp = usedApp;
	}

	public Boolean getIsHostWrong() {
		return isHostWrong;
	}

	public void setIsHostWrong(Boolean isHostWrong) {
		this.isHostWrong = isHostWrong;
	}

	public Map<String, Set<HostBO>> getMethodsHost() {
		return methodsHost;
	}

	public void setMethodsHost(Map<String, Set<HostBO>> methodsHost) {
		this.methodsHost = methodsHost;
	}

	public String getFinalConsumerTime() {
		return finalConsumerTime;
	}

	public void setFinalConsumerTime(String finalConsumerTime) {
		this.finalConsumerTime = finalConsumerTime;
	}
    
    

}
