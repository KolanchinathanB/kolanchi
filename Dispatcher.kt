import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Dispatcher {
}
fun main(){
    runBlocking {
        launch {
           println("Default Name is ----${Thread.currentThread().name}")
            delay(1000)
            println("Defalut Name is ----${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default){
            println("Default Name is ----${Thread.currentThread().name}")
            delay(1000)
            println("default Name is ----${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO){
            println("IO Name is ----${Thread.currentThread().name}")
            delay(1000)
            println("IO Name is ----${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined){
            println("Unconfined Name is ----${Thread.currentThread().name}")
            delay(1000)
            println("Unconfined Name is ----${Thread.currentThread().name}")
        }
    }
}