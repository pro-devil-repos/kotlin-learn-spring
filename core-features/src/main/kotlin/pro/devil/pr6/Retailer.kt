package pro.devil.pr6

interface Retailer<out T> {
    fun sell(): T
}