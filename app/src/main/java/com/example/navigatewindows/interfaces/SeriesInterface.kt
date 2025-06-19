package com.example.navigatewindows.interfaces

interface SeriesInterface {
    fun isPairOrNotPair(getValue: Int) : String
    fun primes(startValue: Int, finalValue: Int) : MutableList<Int>
    fun perfectNumbers(mutableList: MutableList<Int>, startValue: Int, finalValue: Int) : MutableList<Int>
    fun isPrime(number: Int) : Boolean
}