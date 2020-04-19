package com.okta.kotlin

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Pattern

@Entity
class CoffeeShop (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = -1,
    var name: String = "",
    var address: String = "",
    @Pattern(regexp = "[0-9]{9}")
    var phone: String = "",
    var priceOfCoffee: Double = 0.0,
    var powerAccessible: Boolean = true,
    var internetReliability: Short = 3
) {}