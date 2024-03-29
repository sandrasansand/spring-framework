package com.arquitecturajava;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringInicializador implements WebApplicationInitializer {

	// de alguna manera define la aplicacion web por completo
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		   AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		   // registra los beans de sprign
		   contexto.register(ConfiguradorSpring.class);
		   // esta nos liga el contexto o la aplicacion web al configurador
		   
		   contexto.setServletContext(servletContext);
		   
		   // carga dinamicamente el servlet de Spring Framework
		   // que es el servlet controlador con el cual manejamos la aplicacion
		   // por completo
		   ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(contexto));

			servlet.setLoadOnStartup(1);
			servlet.addMapping("/");
			// en la aplicacion
			// a�adimos un filtro
			// queda protegida por el filtro
			
			// a nivel interno son varios filtros que se asocian a cada peticion
			// para securizarla
			servletContext.addFilter("springSecurityFilterChain", new DelegatingFilterProxy("springSecurityFilterChain"))
			.addMappingForUrlPatterns(null, false, "/*");
		
		   
		
	}

	
}
