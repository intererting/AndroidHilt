package com.yly.androidhilt

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MyFragment : Fragment() {

    @Inject
    lateinit var people: People

    @Inject
    lateinit var scopedPerson: ScopedPerson

    @Inject
    lateinit var scopedPersonB: ScopedPerson

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.text = people.name
        println(scopedPerson.hashCode())
        println("scopedPerson === scopedPersonB   ${scopedPerson === scopedPersonB}")
    }

}