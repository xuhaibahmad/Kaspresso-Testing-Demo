package com.zuhaibahmad.kaspressotestingdemo

import kotlin.math.roundToInt

class GradeCalculator {

    var totalMarks = 0

    fun getGrade(obtainedMarks: Int, totalMarks: Int): String {
        val percentage = getPercentage(obtainedMarks, totalMarks)
        return when {
            percentage > 100 -> "The Mark Value must be in between 0 to 100"
            percentage == null -> "Please Enter a Number to Mark Text"
            percentage >= 90 -> "A"
            percentage in 80..89 -> "B"
            percentage in 70..79 -> "C"
            percentage in 60..69 -> "D"
            else -> "F"
        }
    }

    private fun getPercentage(obtainedMarks: Int, totalMarks: Int): Int {
        return  (obtainedMarks / totalMarks.toFloat() * 100).roundToInt()
    }
}