package org.techtown.practicehiltcodelab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import timber.log.Timber

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setupTimber()
        Timber.d("하이룽키")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }
}
