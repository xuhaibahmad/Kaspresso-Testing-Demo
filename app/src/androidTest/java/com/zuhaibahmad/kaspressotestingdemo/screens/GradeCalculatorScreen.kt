package com.zuhaibahmad.kaspressotestingdemo.screens

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.zuhaibahmad.kaspressotestingdemo.R

class GradeCalculatorScreen: Screen<GradeCalculatorScreen>() {
    val inputMarks = KEditText { withId(R.id.etMarks) }
    val buttonSubmit = KButton { withId(R.id.btSubmit) }
    val labelGrade = KTextView { withId(R.id.tvGrade) }
}