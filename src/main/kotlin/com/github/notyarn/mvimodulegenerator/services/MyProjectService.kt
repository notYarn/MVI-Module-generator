package com.github.notyarn.mvimodulegenerator.services

import com.intellij.openapi.project.Project
import com.github.notyarn.mvimodulegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
