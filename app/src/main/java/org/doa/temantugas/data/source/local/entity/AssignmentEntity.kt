package org.doa.temantugas.data.source.local.entity

import androidx.lifecycle.LiveData

data class AssignmentEntity(
    var assignmentId: String?,
    var courseId: LiveData<String>,
    var assignmentTitle: String?,
    var assignmentDeadline: String?,
)
