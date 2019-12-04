package year2019

import java.io.File

abstract class Day(day: Int) {

    val input: List<String> = File("input/day$day").readLines()


    abstract fun solveP1()
    abstract fun solveP2()
}