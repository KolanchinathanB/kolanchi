import kotlinx.coroutines.*
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

class ThreadClass {
}
//fun main(){
//    println("start")
//    thread{                                          // thread
//        println("starting")
//        Thread.sleep(1000)
//        println("processing")
//    }
//    println("ended")
//}


//fun main() {
//    println("start")
//    runBlocking {                       // runblocking
//      println("processing")
//        delay(5000)
//    }
//
//    println("end")
//}

fun main(){
    var i=0

    runBlocking {
    val time= measureTimeMillis {                 // launch coroutine
           launch {
           repeat(1000000){
              // delay(5000)
               println("i--->${i++}")

           }
       }

    }
      println(time)
       }


    ////////////////////        Thread
//
//    thread {
//
//        val time=measureTimeMillis {
//            repeat(1000000){
//                println("i--->${i++}")
//                //Thread.sleep(10)
//            }
//        }
//        println(time)
//
//    }

}

