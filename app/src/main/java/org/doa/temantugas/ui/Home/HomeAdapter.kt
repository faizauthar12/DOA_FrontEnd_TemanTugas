package org.doa.temantugas.ui.Home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.doa.temantugas.data.source.local.entity.CourseEntity
import org.doa.temantugas.databinding.ItemsCourseBinding
import org.doa.temantugas.ui.CourseDetail.CourseDetailActivity

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private lateinit var binding: ItemsCourseBinding

    private val listCourse = ArrayList<CourseEntity>()

    fun setCourses(courses: List<CourseEntity>?) {
        if (courses.isNullOrEmpty()) return
        this.listCourse.clear()
        this.listCourse.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        binding = ItemsCourseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val course = listCourse[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourse.size

    class HomeViewHolder(private val binding: ItemsCourseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(course: CourseEntity) {
            with(binding) {
                tvCourseTitle.text = course.courseTitle
                tvCourseTeacher.text = course.courseTeacher
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, CourseDetailActivity::class.java)
                    intent.putExtra(CourseDetailActivity.EXTRA_COURSE_TITLE, course.courseTitle)
                    intent.putExtra(CourseDetailActivity.EXTRA_COURSE_ID, course.courseId)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}