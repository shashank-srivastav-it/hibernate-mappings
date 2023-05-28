package com.backend.hibernateadvance.config;

import com.backend.hibernateadvance.attributeConverter.StringToManagerPKIdConverter;
import com.backend.hibernateadvance.compositeKey.model.entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    private final ConversionService conversionService;

    public RestConfiguration(@Qualifier("mvcConversionService") ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public void configureConversionService(ConfigurableConversionService configurableConversionService) {
        configurableConversionService.addConverter(new StringToManagerPKIdConverter());
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.getExposureConfiguration()
                .forDomainType(Person.class)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PUT, HttpMethod.PATCH, HttpMethod.DELETE))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PUT, HttpMethod.PATCH, HttpMethod.DELETE));
    }


    @Bean(name = "mvcConversionService")
    public ConversionService getConversionService() {
        return new DefaultFormattingConversionService();
    }
}
