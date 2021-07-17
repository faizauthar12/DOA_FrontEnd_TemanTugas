package org.doa.temantugas.ui.Tugas

import androidx.lifecycle.ViewModel
import org.doa.temantugas.data.source.local.entity.AssignmentEntity
import org.doa.temantugas.utils.CourseDummy

class TugasViewModel : ViewModel() {
    fun getAssignments(): List<AssignmentEntity> = CourseDummy.generateAssignmentDummy()
}