class ClaseMina {




   fun sacarOro(): Int{

   while(minero.oro <3){
       Thread.sleep(1000)
        if(minero.oro<3) {
           minero.oro = minero.oro + 1
           minero.sed=minero.sed+1
           minero.fatiga=minero.fatiga+2
           println("Minero Bob: Recolectado una pepita de oro. Oro actual ${minero.oro} ")
       }
    }

   return minero.oro

   }



}
