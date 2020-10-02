package com.lalsoft.navigationwithresocoder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_camera.*
import java.util.*

class CameraFragment:Fragment(R.layout.fragment_camera) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_photos.setOnClickListener {
            val random = Random()
            val nextAction =CameraFragmentDirections.nextAction()
            nextAction.numOfPhotos = random.nextInt(100)

            Navigation.findNavController(it).navigate(nextAction)
        }
    }
}