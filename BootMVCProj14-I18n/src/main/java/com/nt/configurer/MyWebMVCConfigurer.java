package com.nt.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Component
public class MyWebMVCConfigurer implements WebMvcConfigurer {
	@Autowired
	private LocaleChangeInterceptor lci;
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(lci);
	}

}
