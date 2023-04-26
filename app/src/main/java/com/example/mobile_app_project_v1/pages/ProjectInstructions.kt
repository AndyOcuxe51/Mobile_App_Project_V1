package com.example.mobile_app_project_v1.pages

import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.mobile_app_project_v1.R
import com.example.mobile_app_project_v1.databinding.FragmentGalleryBinding
import com.example.mobile_app_project_v1.databinding.FrameBinding
import com.example.mobile_app_project_v1.databinding.ProjectFragmentBinding
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class ProjectInstructions : Fragment() {
    private lateinit var binding: ProjectFragmentBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProjectFragmentBinding.inflate(inflater, container, false)

        val textView = binding.textView
        textView.text = getString(R.string.ProjectInstructions)

        val buttonDownloadProjectInstructions = binding.buttonDownloadProjectInstructions
        val buttonDownloadProjectProposal = binding.buttonDownloadProjectProposal
        buttonDownloadProjectInstructions.setOnClickListener {
            // Handle button click event
            downloadWordDocFromAssets()
        }
        buttonDownloadProjectProposal.setOnClickListener {
            // Handle button click event
            downloadPdfFromAssets()
        }
        return binding.root
    }
    private fun downloadPdfFromAssets() {
        // Get the AssetManager to access the assets folder
        val assetManager = requireContext().assets


        try {
            // Open the PDF file from the assets folder
            val inputStream = assetManager.open("Project_Proposal.pdf")

            // Create a ByteArray to read the PDF data
            val byteArray = ByteArray(inputStream.available())
            inputStream.read(byteArray)

            // Save the PDF file to external storage or other desired location
            // Example: Save to external storage
            val file = File(requireContext().getExternalFilesDir(null), "CS_4322_2_Sp_23_Syllabus.pdf")
            val outputStream = FileOutputStream(file)
            outputStream.write(byteArray)

            // Close the input and output streams
            outputStream.flush()
            inputStream.close()
            outputStream.close()

            // Show a toast indicating the PDF download is complete
            Toast.makeText(requireContext(), "PDF downloaded successfully", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun downloadWordDocFromAssets(){
        // Get the AssetManager to access the assets folder
        val assetManager = requireContext().assets

        try {
            // Open the PDF file from the assets folder
            val inputStream = assetManager.open("Project_Instruction.pdf")

            // Create a ByteArray to read the PDF data
            val byteArray = ByteArray(inputStream.available())
            inputStream.read(byteArray)

            // Save the PDF file to external storage or other desired location
            // Example: Save to external storage
            val file = File(requireContext().getExternalFilesDir(null), "CS_4322_2_Sp_23_Syllabus.pdf")
            val outputStream = FileOutputStream(file)
            outputStream.write(byteArray)

            // Close the input and output streams
            outputStream.flush()
            inputStream.close()
            outputStream.close()

            // Show a toast indicating the PDF download is complete
            Toast.makeText(requireContext(), "PDF downloaded successfully", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}