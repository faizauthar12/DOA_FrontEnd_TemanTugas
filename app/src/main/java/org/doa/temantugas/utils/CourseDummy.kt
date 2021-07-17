package org.doa.temantugas.utils

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
}