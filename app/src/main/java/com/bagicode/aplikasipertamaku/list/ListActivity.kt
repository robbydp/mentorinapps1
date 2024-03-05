package com.bagicode.aplikasipertamaku.list

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bagicode.aplikasipertamaku.R
import com.bagicode.aplikasipertamaku.list.adapter.HorizontalAdapter
import com.bagicode.aplikasipertamaku.list.adapter.HorizontalItem
import com.bagicode.aplikasipertamaku.list.adapter.VerticalAdapter
import com.bagicode.aplikasipertamaku.list.adapter.VerticalItem

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val rvList = this.findViewById<RecyclerView>(R.id.rv_list)

        val verticalAdapter = VerticalAdapter(
            onVerticalClicked = {
                showToast(it)
            }
        )

        val dataDummy = listOf<VerticalItem>(
            VerticalItem(1, "Robby", "Jalan Cinta Kamu", 0),
            VerticalItem(2, "Putra", "Jalan Kepada Kamu", 0),
            VerticalItem(3, "Dian", "Jalan Disini Kamu", 0),
            VerticalItem(4, "Luffy", "Jalan Mana Kamu", 0),
        )
        verticalAdapter.submitList(dataDummy)

        //======================
        val horizontalAdapter = HorizontalAdapter()
        val dataDummyHorizontal = listOf<HorizontalItem>(
            HorizontalItem(1, "Robby", "Jalan Cinta Kamu", 0),
            HorizontalItem(2, "Putra", "Jalan Kepada Kamu", 0),
            HorizontalItem(3, "Dian", "Jalan Disini Kamu", 0),
            HorizontalItem(4, "Luffy", "Jalan Mana Kamu", 0),
        )
        horizontalAdapter.submitList(dataDummyHorizontal)

        val concatAdapter = ConcatAdapter(verticalAdapter, horizontalAdapter)
        rvList.adapter = concatAdapter
    }

    private fun showToast(data : VerticalItem) {
        Toast.makeText(this, "Nama ${data.name}", Toast.LENGTH_LONG).show()
    }
}