package com.github.gimlet2

import org.gradle.api.Plugin
import org.gradle.api.Project

class SealedPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val tree = project.fileTree("src/main/kotlin")
        tree.include("**/*.kt")
        tree.files
    }

}