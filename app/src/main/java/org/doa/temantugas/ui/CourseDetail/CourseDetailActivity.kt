package org.doa.temantugas.ui.CourseDetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavArgument
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.doa.temantugas.R
import org.doa.temantugas.databinding.ActivityCourseDetailBinding

class CourseDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COURSE_TITLE = "extra_course_title"
        const val EXTRA_COURSE_COURSEID = "extra_course_courseid"
    }

    private lateinit var binding: ActivityCourseDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCourseDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
        setSupportActionBar(binding.toolbarCourseDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (intent.extras != null) {
            val courseTitle = intent.extras!!.getString(EXTRA_COURSE_TITLE)
            supportActionBar?.title = courseTitle
        }
    }

    private fun setupBottomNavigation() {
        val navView: BottomNavigationView = binding.bottomNavigationViewCourseDetail

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerViewCourseDetail) as NavHostFragment
        val navController = navHostFragment.navController

        // passing data to fragment with navController and graph
        val navInflater = navController.navInflater
        val graph = navInflater.inflate(R.navigation.course_detail_navigation)

        val navArgument = NavArgument.Builder().setDefaultValue(
            intent.extras!!.getString(
                EXTRA_COURSE_COURSEID
            )
        ).build()

        graph.addArgument("courseId", navArgument)
        navController.graph = graph

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.tugasFragment -> {
                    //Log.d("CourseDetailActivity", "Bottom Navbar Tugas Pressed")
                    destination.addArgument("courseId", navArgument)
                }
                R.id.kelompokFragment -> {
                    //Log.d("CourseDetailActivity", "Bottom Navbar Kelompok Pressed")
                    destination.addArgument("courseId", navArgument)
                }
            }
        }

        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}