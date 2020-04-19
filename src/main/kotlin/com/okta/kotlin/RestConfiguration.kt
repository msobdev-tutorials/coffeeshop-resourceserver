package com.okta.kotlin

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config?.exposeIdsFor(CoffeeShop::class.java)
        config?.setBasePath("api")
    }
}