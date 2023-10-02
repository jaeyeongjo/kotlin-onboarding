package onboarding

fun solution5(money: Int): List<Int> {

    //오만 원권, 만 원권, 오천 원권, 천 원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전
    var currentMoney = money
    val coins = listOf(50000,10000,5000,1000,500,100,50,10,1)
    return  buildList{
        for(coin in coins){
            add(currentMoney/coin)
            currentMoney %=coin
        }
    }
}
//fun main(){
//    println(solution5(50237)) // [1, 0, 0, 0, 0, 2, 0, 3, 7]
//}