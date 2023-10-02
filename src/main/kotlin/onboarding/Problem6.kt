package onboarding
fun isOverlap(nick1 : String,nick2 : String) : Boolean {
    for(i in 0 until nick1.length-1){
        val str  = nick1.substring(i,i+2)
        if (str in nick2){
            return  true
        }
    }
    return  false
}
fun solution6(forms: List<List<String>>): List<String> {
//    TODO("프로그램 구현")
    //["jm@email.com", "제이엠"]
    return buildSet{
        for(i in forms.indices){
            val email1 = forms[i][0]
            val nick1 = forms[i][1]
            for(j in i+1 until forms.size){
                val email2 = forms[j][0]
                val nick2 = forms[j][1]
                if (isOverlap(nick1,nick2)){
                    add(email1)
                    add(email2)
                }
            }
        }
    }.toList().sorted()
}

//fun  main(){
//    println(solution6(listOf(listOf("jm@email.com", "제이엠"), listOf("jason@email.com", "제이슨"),listOf("woniee@email.com", "워니"),
//        listOf("mj@email.com", "엠제이"), listOf("nowm@email.com", "이제엠"))))
//
//    //["jason@email.com", "jm@email.com", "mj@email.com"]
//}