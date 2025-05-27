package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource({"com/nt/commons/info.properties","com/nt/commons/info1.properties"})
public class personalInfo {
	//injecting the values of properties file to spring bean properties
	@Value("${per.id}")
	private Integer pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.address}")
	private String address;
	//injecting direct values to spring bean properties
	@Value("8909890987")
	private Long mobileno;
	
	//injecting the system property values
	@Value("${os.name}")
	private String os_name;
	@Value("${os.version}")
	private String os_ver;
	
	//injecting environment variable values
	@Value("${path}")
	private String path_data;
	
	//toString()
	@Override
	public String toString() {
		return "personalInfo[pid="+ pid+",pname="+pname+",address="+address+",mobileno="+mobileno+",os_name="+os_name+",os_ver="+os_ver+",path_data="+path_data+"]";

	}
}
