package org.doa.temantugas.ui.CourseDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.doa.temantugas.data.source.local.entity.AssignmentEntity
import org.doa.temantugas.utils.CourseDummy

class CourseDetailViewModel : ViewModel() {
    private var _courseId = MutableLiveData<String>()
    val courseId: LiveData<String> = _courseId

    fun setCourseId(courseId: String) {
        _courseId.value = courseId
    }

    fun getAssignment(): List<AssignmentEntity> = CourseDummy.generateAssignmentDummy(courseId)
}