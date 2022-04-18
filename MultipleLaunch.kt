import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ThreadAndCoroutine
{

}
fun main(){

    runBlocking{
        println("start")
        multipleLaunch()
        println("end")
    }
}

 fun multipleLaunch()= runBlocking{
    launch(){
        delay(1000)
        println("first ")
    }
    launch(){
        delay(100)
        println("second ")
    }
    launch(){
        delay(2000)
        println("third ")
    }
    delay(2000)
}
