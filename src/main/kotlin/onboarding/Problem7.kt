package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
//    TODO("프로그램 구현")

    val scoreMap = mutableMapOf<String,Int>()
    val friendMap = mutableMapOf<String,MutableSet<String>>()

    for (e in friends) {
        friendMap.computeIfAbsent(e[0]) { mutableSetOf() }.add(e[1])
        friendMap.computeIfAbsent(e[1]) { mutableSetOf() }.add(e[0])
    }

    val userFriendsSet = friendMap[user] ?: mutableSetOf()

    for(e in friendMap){
        if (e.key == user) continue
        val friendsSet = e.value
        scoreMap[e.key] = userFriendsSet.intersect(friendsSet).size*10
    }

    for(visitor in visitors){
        scoreMap[visitor] = scoreMap.getOrDefault(visitor,0)+1
    }


    return scoreMap.toList().filter {
        it.second >0 && it.first !in userFriendsSet
    }.sortedWith(compareBy<Pair<String, Int>> { -it.second }.thenBy { it.first })
    .take(5).map {it.first}



}


//fun main(){
//    println(solution7("mrko", listOf(listOf("donut", "andole"),listOf("donut", "jun"),listOf("donut", "mrko"),listOf("shakevan", "andole")
//   ,listOf("shakevan", "jun"),listOf("shakevan", "mrko")), listOf("bedi", "bedi", "donut", "bedi", "shakevan")
//    ))

    //["andole", "jun", "bedi"] |
//}