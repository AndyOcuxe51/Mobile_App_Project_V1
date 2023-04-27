package com.example.mobile_app_project_v1.lectureSlides

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FrameBinding

class LectureSlideThreeFragment : Fragment(R.layout.frame) {
    //private var _binding: ActivityMainBinding = null
    private lateinit var binding: FrameBinding
    private val STORAGE_PERMISSION_CODE: Int = 1000

    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrameBinding.inflate(inflater, container, false)

        val textView = binding.textView
//        textView.text = getString(R.string.lectureslide3)
        //getString(R.id.)

        val pdf = binding.pdfview
        pdf.fromAsset("Lesson 3_ Classes and objects.pdf").load()

        val buttonDownload = binding.buttonDownload
        buttonDownload.setOnClickListener {
            // Handle button click event

            //downloadPdfFromAssets()
        }
        return binding.root
    }
}