package pro.devil.pr6

class Vet<T : Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}