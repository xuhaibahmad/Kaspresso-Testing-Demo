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
    fun onCorrectScoreSubmit_shouldDisplayCorrectGroade() = before {
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

    @Test
    fun whenGradeIsLessThan60GradeFMustBeShown() = run {
        screen {
            step("Grade Calculator Screen Opens") {
                rule.launchActivity(null)
            }
            step("In TextField 59 Entered") {
                inputMarks.replaceText("59")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is F") {
                labelGrade.hasText("Your Grade is: F")
            }
        }
    }
    @Test
    fun whenGradeIsGreaterThan60GradeDMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 61 Entered") {
                inputMarks.replaceText("61")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is D") {
                labelGrade.hasText("Your Grade is: D")
            }
        }
    }
    @Test
    fun whenGradeIs69GradeDMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 69 Entered") {
                inputMarks.replaceText("69")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is D") {
                labelGrade.hasText("Your Grade is: D")
            }
        }
    }
    @Test
    fun whenGradeIsGreaterThan70GradeDMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 71 Entered") {
                inputMarks.replaceText("71")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is C") {
                labelGrade.hasText("Your Grade is: C")
            }
        }
    }
    @Test
    fun whenGradeIs79GradeDMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 79 Entered") {
                inputMarks.replaceText("79")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is C") {
                labelGrade.hasText("Your Grade is: C")
            }
        }
    }
    @Test
    fun whenGradeIsGreatedThan80GradeBMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 81 Entered") {
                inputMarks.replaceText("81")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is B") {
                labelGrade.hasText("Your Grade is: B")
            }
        }
    }
    @Test
    fun whenGradeIs89GradeBMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 89 Entered") {
                inputMarks.replaceText("89")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is B") {
                labelGrade.hasText("Your Grade is: B")
            }
        }
    }
    @Test
    fun whenGradeIsGreaterThan90GradeBMustBeShown()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 91 Entered") {
                inputMarks.replaceText("91")
            }
            step("Submit Button Pressed") {
                buttonSubmit.click()
            }
            step("Verify the displayed grade is A") {
                labelGrade.hasText("Your Grade is: A")
            }
        }
    }
  /*  @Test
    fun whenGradeNullWarningMessageShouldNeDisplayed()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("Submit Button Pressed Without Any Value Entered") {
                buttonSubmit.click()
            }
            step("Verify the Warning Message Displayed") {
                labelGrade.hasText("Your Grade is: Please Enter a Number to Mark Text")
            }
        }
    }*/
    @Test
    fun whenGradeIsGreaterThan100WarningMessageShouldNeDisplayed()= run{
        screen{
            step("Grade Calculator Screen Opens"){
                rule.launchActivity(null)
            }
            step("In TextField 101 Entered") {
                inputMarks.replaceText("101")
            }
            step("Submit Button Pressed ") {
                buttonSubmit.click()
            }
            step("Verify the Warning Message Displayed") {
                labelGrade.hasText("Your Grade is: The Mark Value must be in between 0 to 100")
            }
        }
    }
}

