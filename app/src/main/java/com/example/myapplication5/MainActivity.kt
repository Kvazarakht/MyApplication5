package com.example.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bc: ActivityMainBinding
    private var launcher: ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        bc = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bc.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result:ActivityResult ->
            if (result.resultCode == RESULT_OK){
                
            }
        }
    }



}