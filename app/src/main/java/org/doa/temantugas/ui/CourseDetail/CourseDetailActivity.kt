package org.doa.temantugas.ui.CourseDetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.doa.temantugas.databinding.ActivityCourseDetailBinding

class CourseDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COURSE_TITLE = "extra_course_title"
    }

    private lateinit var binding: ActivityCourseDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCourseDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarCourseDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (intent.extras != null) {
            val courseTitle = intent.extras!!.getString(EXTRA_COURSE_TITLE)
            supportActionBar?.title = courseTitle
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}