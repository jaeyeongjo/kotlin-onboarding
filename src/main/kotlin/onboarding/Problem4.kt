package onboarding

fun solution4(word: String): String {


    return buildString {
        for(char in word){
            append(
                when{
                char.isUpperCase() ->  ('Z'-(char-'A'))
                char.isLowerCase() -> ('z'-(char-'a'))
                else -> char
            })

        }
    }
}

//fun main(){
//    println(solution4("I love you"))//"R olev blf"
//}
