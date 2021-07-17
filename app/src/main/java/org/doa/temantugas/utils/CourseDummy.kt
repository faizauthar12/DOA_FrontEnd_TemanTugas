package org.doa.temantugas.utils

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

    fun generateAssignmentDummy(): List<AssignmentEntity> {
        val assignments = ArrayList<AssignmentEntity>()

        assignments.add(
            AssignmentEntity(
                "Course1a1",
                "Course1",
                "Tugas 1",
                "25/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "Course1a2",
                "Course1",
                "Tugas 2",
                "26/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "Course1a3",
                "Course1",
                "Tugas 3",
                "27/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "Course1a4",
                "Course1",
                "Tugas 4",
                "28/07/2021"
            )
        )

        assignments.add(
            AssignmentEntity(
                "Course1a5",
                "Course1",
                "Tugas 5",
                "29/07/2021"
            )
        )
        
        return assignments
    }
}