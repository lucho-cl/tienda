package cl.tcgplanet.config;

import javax.servlet.Registration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(AppConfig.class);  
        ctx.setServletContext(servletContext);    
        servletContext.addListener(new ContextLoaderListener(ctx));
        servletContext.addListener(new RequestContextListener());
        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        ((ServletRegistration) dynamic).addMapping("/");  
        ((javax.servlet.ServletRegistration.Dynamic) dynamic).setLoadOnStartup(1);  
}
//public class WebAppInitializer implements WebApplicationInitializer {
//	@Override
//	public void onStartup(ServletContext container) {
//		// Create the 'root' Spring application context
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//		rootContext.register(ServiceConfig.class, JPAConfig.class, SecurityConfig.class);
//		
//		// Manage the lifecycle of the root application context
//		container.addListener(new ContextLoaderListener(rootContext));
//		
//		// Create the dispatcher servlet's Spring application context
//		AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
//		dispatcherServlet.register(MvcConfig.class);
//		
//		// Register and map the dispatcher servlet
//		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher",
//				new DispatcherServlet(dispatcherServlet));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
//	}
}