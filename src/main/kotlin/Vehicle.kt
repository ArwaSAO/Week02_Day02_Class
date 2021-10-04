/*
class Vehicle {

    var name: String = "Toyota"
    var seatsNumbers: Int = 5
    var vehicleType: String = "Bus"
    var doorStatus: Boolean = false

    fun openTheDoor() {
        doorStatus = true
    }

    fun closeTheDoor() {
        doorStatus = false
    }
}*/

// class with primary constructor
// class ClassName(paramOne: DataType, paramTwo: DataType)
/*class Vehicle(_name: String) {

    var name: String = _name
    var seatsNumbers: Int = 5
    var vehicleType: String = "Bus"
        // Custom getter
    get() = "Type:$field"
            // Custom set
    set(value) {
        field = value.lowercase()
    }


    var doorStatus: Boolean = false

    fun openTheDoor() {
        doorStatus = true
    }

    fun closeTheDoor() {
        doorStatus = false
    }
}*/

// class with secondary constructor
/*class Vehicle {

    var name: String
    var seatsNumbers: Int = 5
    var vehicleType: String = "Bus"

    var doorStatus: Boolean = false


    constructor(_name: String) {
       name = _name
    }

    fun openTheDoor() {
        doorStatus = true
    }

    fun closeTheDoor() {
        doorStatus = false
    }
}*/

/*class Vehicle(
    var name: String,
    var seatsNumber: Int ,
    var vehicleType: String ,
   private var doorStatus: Boolean = false
    ) {



    fun openTheDoor() {
        doorStatus = true
        name = ""
    }

    fun closeTheDoor() {
        doorStatus = false
    }
}*/

// class initializer
class Vehicle(
    var name: String,
    private var doorStatus: Boolean = false
) {

    lateinit var vehicleType: String
    var seatsNumber: Int = 0
    init {
        seatsNumber = seatsNumber.times(2)
       // println("Vehicle type is: $vehicleType")
    }

    fun openTheDoor() {
        doorStatus = true
        name = ""
    }

    fun closeTheDoor() {
        doorStatus = false
    }
}


