fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { (a, b) -> a < b }
    }

    //solved with the help of kotlin youtube channel
    fun part2(input: List<Int>): Int {
        return input.windowed(4).count {
            it[0] < it[3]
        }
    }


    val input = readInputInt("Day01")
    println(part1(input))
    println(part2(input))
}
