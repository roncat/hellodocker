package com.javaee.dwstart;

import com.javaee.dwstart.resources.HelloResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dwgettingstartedApplication extends Application<dwgettingstartedConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dwgettingstartedApplication().run(args);
    }

    @Override
    public String getName() {
        return "dwgettingstarted";
    }

    @Override
    public void initialize(final Bootstrap<dwgettingstartedConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dwgettingstartedConfiguration configuration,
                    final Environment environment) {
    	environment.jersey().register(new HelloResource());
    }

}
