package com.github.chiknrice.codeartifactenvintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.chiknrice.codeartifactenvintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
