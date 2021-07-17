package org.doa.temantugas.ui.CourseDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.doa.temantugas.R
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

        setupBottomNavigation()
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

        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}