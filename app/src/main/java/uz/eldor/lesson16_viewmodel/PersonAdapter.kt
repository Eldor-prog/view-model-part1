package uz.eldor.lesson16_viewmodel

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter :RecyclerView.Adapter<PersonAdapter.ViewHolder>() {

    private var data : MutableList<PersonData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(parent.inflate(R.layout.item_person))

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  = holder.bind()

    override fun getItemCount() = data.size

    fun submitList(ls: MutableList<PersonData>) {
        data = ls
    }

    fun addPerson(personData: PersonData) {
        data.add(personData)
        notifyItemInserted(data.lastIndex)
    }

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bind() {
            val d  = data[adapterPosition]
            itemView.apply {
                tv_first_name.text = d.firstName
                tv_last_name.text = d.lastName
            }

        }

    }
}