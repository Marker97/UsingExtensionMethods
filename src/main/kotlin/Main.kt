fun main(){
    val numbers = listOf(949,236,28,590,208,230,206,460,647,397)
    numbers.filter {it -> it < 500}.forEach{it -> println("$it")}
}
