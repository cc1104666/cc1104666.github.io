package com.github.baobao110.kitdev.services

import com.intellij.openapi.project.Project
import com.github.baobao110.kitdev.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
