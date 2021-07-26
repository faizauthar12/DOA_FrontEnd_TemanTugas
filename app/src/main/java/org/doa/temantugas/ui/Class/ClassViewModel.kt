package org.doa.temantugas.ui.Class

import androidx.lifecycle.ViewModel
import org.doa.temantugas.data.source.local.entity.CourseEntity
import org.doa.temantugas.utils.CourseDummy

class ClassViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = CourseDummy.generateCourseDummy()
}