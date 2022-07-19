package com.haydar.toastdansnackbar

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.haydar.toastdansnackbar.databinding.ActivityMainBinding
import io.github.muddz.styleabletoast.StyleableToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // snackbar
        binding.btnSnackbar.setOnClickListener {

            // ini snackbarnya
            val snackbar = Snackbar.make(binding.root,"berhasil muncul",Snackbar.LENGTH_INDEFINITE)

            // ini yang ditampilkan snackbarnya dan ini actionnya
            snackbar.setAction("Retry"){
                // jika tidak ada .show() tidak akan muncul
                Snackbar.make(binding.root,"Retry di tekan",Snackbar.LENGTH_SHORT).show()
            }.show()
        }
        // toast
        binding.btnToast.setOnClickListener {
            StyleableToast.Builder(this)
                .text("updating profile")
                .textColor(Color.WHITE)
                .backgroundColor(Color.BLUE)
                .show()
            // jika tidak ada .show() tidak akan muncul
            StyleableToast.makeText(this,"update success",Toast.LENGTH_SHORT,R.style.mytoast).show()
        }
    }
}
