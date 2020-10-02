package com.lalsoft.navigationwithresocoder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_photos.*


class PhotosFragment:Fragment(R.layout.fragment_photos) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

        arguments?.let {
            val safeArgs=PhotosFragmentArgs.fromBundle(it)
            textView_num.text="Number of photos : ${safeArgs.numOfPhotos}"
        }
    }
}