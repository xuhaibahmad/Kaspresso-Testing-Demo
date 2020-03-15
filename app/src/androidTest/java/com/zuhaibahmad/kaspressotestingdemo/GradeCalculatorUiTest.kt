package com.zuhaibahmad.kaspressotestingdemo

import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.zuhaibahmad.kaspressotestingdemo.screens.GradeCalculatorScreen
import org.junit.Rule
import org.junit.Test

class GradeCalculatorUiTest : TestCase() {

    @Rule
    @JvmField
    var rule = ActivityTestRule(GradeCalculatorActivity::class.java, false, false)

    val screen = GradeCalculatorScreen()

    @Test
    fun onCorrectScoreSubmit_shouldDisplayCorrectGrade() = before {
        // No-op
    }.after {
        // No-op
    }.run {
        screen {
            step("Open grade calculator screen") {
                rule.launchActivity(null)
            }

            step("Submit obtained marks") {
                inputMarks.replaceText("90")
                buttonSubmit.click()
            }

            step("Verify the displayed grade is correct") {
                labelGrade.hasText("Your Grade is: A")
            }
        }
    }
}
