package com.example.kotinbasics

data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
    )



fun main(){
    val coffeeForDenis=CoffeeDetails(sugarCount = 0, name = "Denis", size = "xxl", creamAmount = 0)
    makeCoffee(coffeeForDenis)


}


fun askCoffeeDetails(){
    println("who is this coffee for?")
    val name= readln()
    println("How many pieces of sugar do you want?")
    val sugarCount= readln()
    val sugarCountInt=sugarCount.toInt()
    //makeCoffee(sugarCountInt,name)
}



fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount==1){
        println("Coffee with ${coffeeDetails.sugarCount} "+
                "spoon of sugar for ${coffeeDetails.name} + and cream:"+
                "${coffeeDetails.creamAmount}")
    }
    else if(coffeeDetails.sugarCount==0){
        println("coffee with no sugar for ${coffeeDetails.name} + and cream:" +
                "${coffeeDetails.creamAmount}")
    }
    else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} + and cream:" +
                "${coffeeDetails.creamAmount}")
    }
}






























/*
fun main(){
    println("who is this coffee for?")
    val name= readln()
    println("How many pieces of sugar do you want?")
    val sugarCount= readln()
    val sugarCountInt=sugarCount.toInt()
    makeCoffee(sugarCountInt,name)
}
fun makeCoffee(sugarCount:Int, name:String){
    if(sugarCount==1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
    else if(sugarCount==0){
        println("coffee with no sugar for $name")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}
*/





/*
fun main() {
    // Call Function
    makeCoffee(name="jimmy",sugarCount = 1)
    makeCoffee(name="nikki",sugarCount = 2)
    makeCoffee(name="any",sugarCount = 30)
    makeCoffee(name="maya",sugarCount = 0)
}

// Define Function
fun makeCoffee(name:String,sugarCount: Int) {
    if(sugarCount==1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
    else if(sugarCount==0){
        println("coffee with no sugar for $name")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}
*/
