package org.doa.temantugas.ui.Assignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.doa.temantugas.data.source.local.entity.AssignmentEntity
import org.doa.temantugas.databinding.ItemsAssignmentBinding

class AssignmentAdapter : RecyclerView.Adapter<AssignmentAdapter.AssignmentViewHolder>() {
    private lateinit var binding: ItemsAssignmentBinding

    private val listAssignment = ArrayList<AssignmentEntity>()

    fun setAssignment(courses: List<AssignmentEntity>?) {
        if (courses.isNullOrEmpty()) return
        this.listAssignment.clear()
        this.listAssignment.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssignmentViewHolder {
        binding = ItemsAssignmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AssignmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AssignmentViewHolder, position: Int) {
        val assignment = listAssignment[position]
        holder.bind(assignment)
    }

    override fun getItemCount(): Int = listAssignment.size

    class AssignmentViewHolder(private val binding: ItemsAssignmentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(assignment: AssignmentEntity) {
            with(binding) {
                tvAssignmentTitle.text = assignment.assignmentTitle
                tvAssignmentDeadline.text = assignment.assignmentDeadline
            }
        }
    }
}