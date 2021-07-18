package org.doa.temantugas.ui.CourseDetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.doa.temantugas.R
import org.doa.temantugas.databinding.ActivityCourseDetailBinding

class CourseDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COURSE_TITLE = "extra_course_title"
        const val EXTRA_COURSE_ID = "extra_course_id"
    }

    private lateinit var binding: ActivityCourseDetailBinding
    private lateinit var courseId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCourseDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
        setSupportActionBar(binding.toolbarCourseDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[CourseDetailViewModel::class.java]

        if (intent.extras != null) {
            val courseTitle = intent.extras!!.getString(EXTRA_COURSE_TITLE)
            supportActionBar?.title = courseTitle

            courseId = intent.extras!!.getString(EXTRA_COURSE_ID).toString()
            viewModel.setCourseId(courseId!!)
        }
    }

    private fun setupBottomNavigation() {
        val navView: BottomNavigationView = binding.bottomNavigationViewCourseDetail

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerViewCourseDetail) as NavHostFragment
        val navController = navHostFragment.navController

        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}