package com.hs.s1.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import com.hs.s1.interceptor.MessageLocaleInterceptor;

@Configuration
public class MessageLocaleConfig implements WebMvcConfigurer {
	
	@Autowired
	private MessageLocaleInterceptor messageLocaleInterceptor;

	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
		cookieLocaleResolver.setDefaultLocale(Locale.KOREA);
		cookieLocaleResolver.setCookieName("lang");
		
		return cookieLocaleResolver;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(messageLocaleInterceptor)
				.addPathPatterns("/**");
	}
	
}
