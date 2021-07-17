package org.doa.temantugas.ui.Home

import androidx.lifecycle.ViewModel
import org.doa.temantugas.data.source.local.entity.CourseEntity
import org.doa.temantugas.utils.CourseDummy

class HomeViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = CourseDummy.generateCourseDummy()
}