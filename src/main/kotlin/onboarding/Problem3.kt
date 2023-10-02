package onboarding

fun solution3(number: Int): Int {
//    TODO("프로그램 구현")

    //369
    var answer : Int  = 0
    val set369 = setOf<Char>('3','6','9')
    for(num  in 1..number){
        for(char in num.toString()){
            if(char in set369){
                answer+=1
            }
        }
    }
    return answer

}

//fun main(){
//    println(solution3(13)) //4
//    println(solution3(33)) //14
//}