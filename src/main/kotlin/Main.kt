/*
fun main(args: Array<String>) {

    var bus = Vehicle("BMW")
    println(bus.name)
    bus.openTheDoor()

    println(bus.vehicleType)

    // car
    bus.vehicleType = "CAR"

    // RAC
    println(bus.vehicleType)
}*/

/*

fun main() {
    var bus = Vehicle("Toyota")

    println(bus.name)
}
*/

/*
fun main() {
    var bus = Vehicle("Toyota" , 4 ,"Bus")
    var car = Vehicle("BMW" , 4 ,"Bus")

    println(bus.name)
    println(car.name)

    bus.openTheDoor()
  //  bus.doorStatus = true
}*/

fun main(){
    var bus = Vehicle("Toyota" ).apply {
        vehicleType = "Bus"
    }

    println(bus.seatsNumber)
    println(bus.vehicleType)
}