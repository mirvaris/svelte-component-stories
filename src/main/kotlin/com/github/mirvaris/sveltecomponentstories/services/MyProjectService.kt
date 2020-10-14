package com.github.mirvaris.sveltecomponentstories.services

import com.intellij.openapi.project.Project
import com.github.mirvaris.sveltecomponentstories.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
