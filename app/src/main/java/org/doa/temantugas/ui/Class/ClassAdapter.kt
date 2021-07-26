package org.doa.temantugas.ui.Class

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.doa.temantugas.data.source.local.entity.CourseEntity
import org.doa.temantugas.databinding.ItemsCourseBinding

class ClassAdapter : RecyclerView.Adapter<ClassAdapter.ClassViewHolder>() {

    private lateinit var binding: ItemsCourseBinding

    private val listCourse = ArrayList<CourseEntity>()

    fun setCourses(courses: List<CourseEntity>?) {
        if (courses.isNullOrEmpty()) return
        this.listCourse.clear()
        this.listCourse.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        binding = ItemsCourseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClassViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {
        val course = listCourse[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourse.size
    
    class ClassViewHolder(private val binding: ItemsCourseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(course: CourseEntity) {
            with(binding) {
                tvCourseTitle.text = course.courseTitle
                tvCourseTeacher.text = course.courseTeacher
            }
        }
    }
}