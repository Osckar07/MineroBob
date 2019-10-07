val mina = ClaseMina()
val minero = ClasePersonaje()
val banco = ClaseBanco()
val taberna = ClaseTaberna()
val hogar =ClaseHogarDulceHogar()

fun main(args: Array<String>) {

    println(minero)

    while (minero.oro<=3){

            inicio()
            Thread.sleep(1000)

        if(minero.oro==3){
            banco.ahorro()
        Thread.sleep(1000)
        }

        if(minero.sed>=5){
            taberna.taberna()
            Thread.sleep(1000)
            println(minero)
        }
        if(minero.fatiga>=8){
           hogar.hogarDulceHogar()
            Thread.sleep(1000)
            println(minero)
        }
    }

}




    //Elegir si irá al banco o irá a la mina.
fun inicio() {
        if(minero.oro<3) {
        println("Minero Bob: De regreso a la mina de oro")
        mina.sacarOro()

        }

    }
