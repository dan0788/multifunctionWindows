package com.example.navigatewindows.classes

import com.example.navigatewindows.interfaces.SeriesInterface

class SeriesClass : SeriesInterface {
    override fun isPairOrNotPair(getValue: Int) : String{
        if (getValue%2 == 0){
            return "Par"
        } else {
            return "Impar"
        }
    }

    override fun primesNumbers(startValue: Int, finalValue: Int) : MutableList<Int> {//hallar los primos hasta un valor final
        var listInt=(startValue..finalValue).toMutableList()
        var listPrimos : MutableList<Int> = mutableListOf()

        for (item in listInt){
            if (isPrime(item)){
                listPrimos.add(item)
            }
        }
        return listPrimos
    }

    override fun perfectNumbers(mutableList: MutableList<Int>, startValue: Int, finalValue: Int) : MutableList<Int> {
        val perfectList : MutableList<Int> = mutableListOf()
        for (i in mutableList){
            var mersenneNumber = (Math.pow(2.0, i.toDouble()) - 1).toInt()
            if (isPrime(mersenneNumber)){
                var perfectNumber = Math.pow(2.0, (i - 1).toDouble()).toInt() * mersenneNumber
                if (perfectNumber >= startValue && perfectNumber <= finalValue){
                    perfectList.add(perfectNumber)
                }
            }
        }
        return perfectList
    }

    override fun isPrime(number: Int): Boolean {
        if (number <= 1){
            return false
        }

        if (number == 2){
            return true
        }

        if(number > 2 && number%2 == 0){
            return false
        }

        if(number > 2 && number%2 != 0){
            var raiz = Math.pow(number.toDouble(), 0.5)//calcular raiz
            var d = raiz.toInt()
            var listaPrimos = primesNumbers(3, d)

            for (i in listaPrimos){
                if (number%i != 0){
                    d = d + 2
                } else {
                    return false
                }
            }
        }
        return true
    }
}