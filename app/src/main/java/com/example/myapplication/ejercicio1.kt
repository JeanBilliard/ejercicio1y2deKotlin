package com.example.myapplication


fun main(){
    imprimirNombreCompleto("Cristian", "Vidal", 35)

}

fun getNombre() : String {
    return "Cristian"
}

fun imprimirNombreCompleto(nombre: String, apellido: String, edad: Int){
    println("Minombre es $nombre $apellido y miedad es $edad")
}