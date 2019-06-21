package id.cashflow.android.util

class Calculator {
    fun sum(x: Int, y: Int): Int{
       return x + y
    }
    //Pengurangan
    fun sub(x: Int, y: Int): Int{
        return  x - y
    }

    //Perkalian
    fun times(x: Int, y: Int): Int {
        return x * y
    }

    fun div (x: Int, y: Int): Int {
        return x % y

    }
}