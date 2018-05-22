package com.hcmus.fetel.nhnhan.musicstore.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MusicStoreWebAppInitializer implements WebApplicationInitializer {

    private static final String DISPATCHER = "SpringDispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationConfig.class);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER,
                new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        servletContext.addListener(new ContextLoaderListener(appContext));
    }
}