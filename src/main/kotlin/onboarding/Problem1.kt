package onboarding
import java.lang.Math.max
fun isInvalid(pobi: List<Int>, crong: List<Int>) : Boolean{
    return pobi[1] - pobi[0] !=1 || crong[1] - crong[0] !=1
}
fun getMaxSumOrProduct(page : String) : Int{
    var plusNum = 0
    var multiplyNum = 1
    for(e in page){
        val num = e.toString().toInt()
        plusNum+=num
        multiplyNum*=num
    }
    return max(plusNum,multiplyNum)
}
fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    TODO("프로그램 구현")
//    포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1

    if (isInvalid(pobi,crong)) return  -1
    val pobiScore : Int = max(getMaxSumOrProduct(pobi[0].toString()),getMaxSumOrProduct(pobi[1].toString()))
    val crongScore : Int = max(getMaxSumOrProduct(crong[0].toString()),getMaxSumOrProduct(crong[1].toString()))


    return when{
        pobiScore > crongScore ->1
        pobiScore < crongScore ->2
        else ->0
    }


}
//fun main() {
//    println(solution1(listOf(97, 98), listOf(197, 198))) // 0
//    println(solution1(listOf(131, 132), listOf(211, 212))) // 1
//    println(solution1(listOf(99, 102), listOf(211, 212))) // -1
//}
