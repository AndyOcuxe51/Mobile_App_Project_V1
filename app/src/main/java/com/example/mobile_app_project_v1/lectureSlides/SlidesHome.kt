//package com.example.mobile_app_project_v1.lectureSlides
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.ViewModelProvider
//import androidx.navigation.findNavController
//import com.example.mobile_app_project_v1.MainActivity
//import com.example.mobile_app_project_v1.R
//import com.example.mobile_app_project_v1.databinding.FragmentLearningModulesBinding
//import com.example.mobile_app_project_v1.databinding.FragmentLectureSlidesBinding
//import com.example.mobile_app_project_v1.databinding.FragmentSubmoduleBinding
//import com.example.mobile_app_project_v1.databinding.FrameBinding
//import com.example.mobile_app_project_v1.ui.learning_modules.LearningModulesViewModel
//
//class SlidesHome : Fragment(R.layout.fragment_lecture_slides){
//    //private var _binding: ActivityMainBinding = null
//    private lateinit var binding: FragmentLectureSlidesBinding
//    //private val STORAGE_PERMISSION_CODE: Int = 1000
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    //private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentLectureSlidesBinding.inflate(inflater, container, false)
//
//        binding.l1.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideOneFragment)
//        }
//        binding.l2.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideTwoFragment)
//        }
//        binding.l3.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideThreeFragment)
//        }
//        binding.l4.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideFourFragment)
//        }
//        binding.l5.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideFiveFragment)
//        }
//        binding.l6.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideSixFragment)
//        }
//        binding.l7.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideSevenFragment)
//        }
//        binding.l8.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideEightFragment)
//        }
//        binding.l9.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideNineFragment)
//        }
//        binding.l10.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideTenFragment)
//        }
//        binding.l11.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideElevenFragment)
//        }
//        binding.l12.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideTwelveFragment)
//        }
//        binding.l3.setOnClickListener() {view : View ->
//            //MainActivity.submoduleNumber = 1
//            view.findNavController().navigate(R.id.lectureSlideThirteenFragment)
//        }
//
//        return binding.root
//    }
//    /*override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }*/
//}