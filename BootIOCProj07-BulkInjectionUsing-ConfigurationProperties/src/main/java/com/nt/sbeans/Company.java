package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("Comp")
@Setter
@ToString
@ConfigurationProperties(prefix="org.nit")
@PropertySource("application.properties")
public class Company {
	private String name;
	private String addrs;
	private Long pincode;
	private Long contact;
	
	
	@Value("${nit.size}")
	private Integer size;

}
