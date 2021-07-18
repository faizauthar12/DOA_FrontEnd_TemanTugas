package org.doa.temantugas.ui.CourseDetail

import androidx.lifecycle.ViewModel
import org.doa.temantugas.data.source.local.entity.AssignmentEntity
import org.doa.temantugas.utils.CourseDummy

class CourseDetailSharedViewModel : ViewModel() {
    fun getAssignments(): List<AssignmentEntity> = CourseDummy.generateAssignmentDummy()
}