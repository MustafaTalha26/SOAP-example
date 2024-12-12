package com.mtmert.item_service;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	@Bean(name = "countries")
	public DefaultWsdl11Definition defaultWsdl11DefinitionCounties(XsdSchema peopleSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("CountriesPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://spring.com/mtmert/people-service");
		wsdl11Definition.setSchema(peopleSchema);
		return wsdl11Definition;
	}

	@Bean(name = "people")
	public DefaultWsdl11Definition defaultWsdl11DefinitionPeople(XsdSchema peopleSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("PeoplePort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://spring.com/mtmert/people-service");
		wsdl11Definition.setSchema(peopleSchema);
		return wsdl11Definition;
	}

	@Bean(name = "deniz")
	public DefaultWsdl11Definition defaultWsdl11DefinitionSea(XsdSchema seaSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SeaPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://spring.com/mtmert/people-service");
		wsdl11Definition.setSchema(seaSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema peopleSchema() {
		return new SimpleXsdSchema(new ClassPathResource("people.xsd"));
	}

	@Bean
	public XsdSchema seaSchema() {return new SimpleXsdSchema(new ClassPathResource("deniz.xsd"));}
}