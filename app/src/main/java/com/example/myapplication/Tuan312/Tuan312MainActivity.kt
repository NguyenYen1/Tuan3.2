package com.example.myapplication.Tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter? = null
    var ls: ArrayList<Tuan312Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main2)
        var lv=findViewById<ListView>(R.id.tuan312lv)
        ls.add(Tuan312Contact("Nguyen Van A", "18", R.drawable.android))
        ls.add(Tuan312Contact("Tran Van B", "20", R.drawable.android))
        ls.add(Tuan312Contact("Vu Văn C", "17", R.drawable.android))
        ls.add(Tuan312Contact("Nguyen Thi D", "21", R.drawable.android))
        ls.add(Tuan312Contact("Nguyen Van A", "18", R.drawable.android))
        adap=Tuan312Adapter(this.ls)
        lv.adapter=adap
    }
}