package onboarding

fun solution2(cryptogram: String): String {
    TODO("프로그램 구현")

    val stack = ArrayDeque<Char>()
    for(e : Char in cryptogram){
        if(stack.isNotEmpty() && stack.last()==e){
            stack.removeLast()
        }else{
            stack.addLast(e)
        }
    }
    return buildString {
        for(e : Char  in stack){
            append(e)
        }
    }

}


//fun main(){
//    println(solution2("browoanoommnaon")) // "brown"
//    println(solution2("zyelleyz"))  // ""
//}