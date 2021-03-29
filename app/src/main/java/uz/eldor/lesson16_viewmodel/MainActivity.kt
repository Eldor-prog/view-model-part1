package uz.eldor.lesson16_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = PersonAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel  = ViewModelProvider(this, PersonViewModelFactory("android"))[PersonViewModel::class.java]

        list.adapter = adapter
        /*list.layoutManager = LinearLayoutManager(this)*/
        adapter.submitList(viewModel.data)

        btn_add.setOnClickListener {
            adapter.addPerson(PersonData("Eldor","Poyanov"))
        }
    }
}