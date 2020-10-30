package com.github.amsharifian.chiselremotedevelopment.services

import com.intellij.openapi.project.Project
import com.github.amsharifian.chiselremotedevelopment.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
