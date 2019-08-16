package com.example.lvmlaskuri

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var finLvm : Double = 0.0

    var euroLvm : Double = 0.0

    var rlkLvm : Double = 0.0

    var dolLvm : Double = 0.0

    var tehoLvm: Double = 0.0

    var varttiLvm: Double = 0.0

    var mrlkLvm: Double = 0.0

    var pa240Lvm : Double = 0.0

    var pa600Lvm : Double = 0.0

    var kukkaLvm : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        finArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time

                calculateLVM()
            }
        })
        euroArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        rlkArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        dolArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        tehoArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        varttiArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        mrlkArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        pa240Arvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        pa600Arvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        kukkaArvo.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                // Do something after text changed
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something before text changed on EditText
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // Do something on text changed in EditText
                // Display the EditText change text on TextView real time
                calculateLVM()
            }
        })
        resetButton.setOnClickListener {
            resetValues()
        }
    }

    fun resetValues(){
        finLvm = 0.0
        euroLvm = 0.0
        rlkLvm = 0.0
        dolLvm = 0.0
        euroLvm = 0.0
        tehoLvm = 0.0
        varttiLvm = 0.0
        mrlkLvm = 0.0
        pa240Lvm = 0.0
        pa600Lvm = 0.0
        kukkaLvm = 0.0
        finArvo.setText("")
        euroArvo.setText("")
        rlkArvo.setText("")
        dolArvo.setText("")
        tehoArvo.setText("")
        varttiArvo.setText("")
        mrlkArvo.setText("")
        pa240Arvo.setText("")
        pa600Arvo.setText("")
        kukkaArvo.setText("")

    }
    fun calculateLVM(){

        try {
             finLvm = (finArvo.getText().toString().toDouble()) * 0.5
        }
        catch (e: Exception){
             finLvm = 0.0
        }
        try {
            euroLvm = (euroArvo.getText().toString().toDouble()) *0.4
        }
        catch (e: Exception){
            euroLvm = 0.0
        }
        try {
            rlkLvm = (rlkArvo.getText().toString().toDouble()) * 0.25
        }
        catch (e: Exception){
            rlkLvm = 0.0
        }
        try {
            dolLvm = (dolArvo.getText().toString().toDouble()) * 0.15
        }
        catch (e: Exception){
            dolLvm = 0.0
        }
        try {
            tehoLvm = (tehoArvo.getText().toString().toDouble()) * 0.2
        }
        catch (e: Exception){
            tehoLvm = 0.0
        }
        try {
            varttiLvm = (varttiArvo.getText().toString().toDouble()) * 0.15
        }
        catch (e: Exception){
            varttiLvm = 0.0
        }
        try {
            mrlkLvm = (mrlkArvo.getText().toString().toDouble()) *0.2
        }
        catch (e: Exception){
            mrlkLvm = 0.0
        }
        try {
            pa240Lvm = (pa240Arvo.getText().toString().toDouble()) *0.3
        }
        catch (e: Exception){
            pa240Lvm = 0.0
        }
        try {
            pa600Lvm = (pa600Arvo.getText().toString().toDouble()) *0.5
        }
        catch (e: Exception){
            pa600Lvm = 0.0
        }
        try {
            kukkaLvm = (kukkaArvo.getText().toString().toDouble()) *0.3
        }
        catch (e: Exception){
            kukkaLvm = 0.0
        }



        var yhtLvm : Double = finLvm + euroLvm + rlkLvm + dolLvm + tehoLvm + varttiLvm + mrlkLvm + pa240Lvm + pa600Lvm + kukkaLvm


        tulosLvm.text = getString(R.string.lvmalku) + yhtLvm.toString()



    }


}
