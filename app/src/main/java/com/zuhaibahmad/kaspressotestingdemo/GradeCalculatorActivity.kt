package com.zuhaibahmad.kaspressotestingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grade_calculator.*

class GradeCalculatorActivity : AppCompatActivity() {

    companion object {
        private const val TOTAL_MARKS = 100
    }

    private val gradeCalculator = GradeCalculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade_calculator)
        btSubmit.setOnClickListener {
            val inputMarks = etMarks.text.toString().toInt()
            val grade = gradeCalculator.getGrade(inputMarks, TOTAL_MARKS)
            tvGrade.text = "Your Grade is: $grade"
        }
    }
}
