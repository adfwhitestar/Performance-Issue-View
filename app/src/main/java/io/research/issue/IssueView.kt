package io.research.issue

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class IssueView @kotlin.jvm.JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null) : ConstraintLayout(context, attrs){

    private val view = LayoutInflater.from(context).inflate(R.layout.view_issue_creator, this, true)

    init{

    }

}