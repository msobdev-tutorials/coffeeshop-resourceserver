package com.okta.kotlin

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ResourceServerApplication {

    @Bean
    fun run(repository: CoffeeRepository) = ApplicationRunner {
        repository.save(
                CoffeeShop(
                        name = "Oblique",
                        address = "3039 SE Stark St, Portland, OR 97214",
                        phone = "555111444",
                        priceOfCoffee = 1.50,
                        powerAccessible = true,
                        internetReliability = 5
                )
        )
        repository.save(
                CoffeeShop(
                        name = "Epoch Coffee",
                        address = "221 W N Loop Blvd, Austin, TX 78751",
                        phone = "555111444",
                        priceOfCoffee = 2.50,
                        powerAccessible = true,
                        internetReliability = 3
                )
        )
    }

}



fun main(args: Array<String>) {
	runApplication<ResourceServerApplication>(*args)
}
