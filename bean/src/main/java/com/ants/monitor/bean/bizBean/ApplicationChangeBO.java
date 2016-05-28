package com.ants.monitor.bean.bizBean;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * Created by zxg on 15/12/9.
 * 变更的app bo 类
 */
@Data
@ToString
public class ApplicationChangeBO implements Serializable {

    private String host;

    private String port;

    private String appName;

    private String time;

    //类型
    private String category;

    // 所属团队
    private String  organization;

    private String hostString;

    /**执行的操作；insert／delete**/
    private String doType;

    public ApplicationChangeBO(){}
    public ApplicationChangeBO(String host,String port,String appName,String category,String organization){
        this.host = host;
        this.port = port;
        this.appName = appName;
        this.category = category;
        this.organization = organization;
    }

    public String getHostString(){
        if(port == null || port.equals("0")){
            return host;
        }
        return host+":"+port;
    }
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getDoType() {
		return doType;
	}
	public void setDoType(String doType) {
		this.doType = doType;
	}
	public void setHostString(String hostString) {
		this.hostString = hostString;
	}

    
}
