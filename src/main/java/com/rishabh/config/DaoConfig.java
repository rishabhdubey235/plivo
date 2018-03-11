package com.rishabh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.rishabh.models.Contact;

@Configuration
public class DaoConfig extends RepositoryRestConfigurerAdapter {
    
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Contact.class);
    }
}
