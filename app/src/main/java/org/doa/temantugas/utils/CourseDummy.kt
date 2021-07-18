package org.doa.temantugas.utils

import androidx.lifecycle.LiveData
import org.doa.temantugas.data.source.local.entity.AssignmentEntity
import org.doa.temantugas.data.source.local.entity.CourseEntity

object CourseDummy {
    fun generateCourseDummy(): List<CourseEntity> {
        val courses = ArrayList<CourseEntity>()

        courses.add(
            CourseEntity(
                "Course1",
                "Algoritma Dasar",
                "Ibu Darniati",
            )
        )

        courses.add(
            CourseEntity(
                "Course2",
                "Statistika",
                "Bapak Doni",
            )
        )

        courses.add(
            CourseEntity(
                "Course3",
                "Matematika",
                "Bapak Sulo",
            )
        )

        courses.add(
            CourseEntity(
                "Course4",
                "Kimia",
                "Bapak janah",
            )
        )

        courses.add(
            CourseEntity(
                "Course5",
                "Fisika",
                "Bapak Salim",
            )
        )

        return courses
    }

    fun generateAssignmentDummy(courseId: LiveData<String>): ArrayList<AssignmentEntity> {
        val assignments = ArrayList<AssignmentEntity>()

        assignments.add(
            AssignmentEntity(
                "{$courseId}a1",
                courseId,
                "Tugas 1",
                "25/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "{$courseId}a2",
                courseId,
                "Tugas 2",
                "26/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "{$courseId}a3",
                courseId,
                "Tugas 3",
                "27/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "{$courseId}a4",
                courseId,
                "Tugas 4",
                "28/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "{$courseId}a5",
                courseId,
                "Tugas 5",
                "29/07/2021"
            )
        )

        return assignments
    }
}