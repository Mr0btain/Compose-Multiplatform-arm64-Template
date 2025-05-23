package org.example.project.injection

import org.example.project.MainViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    // Main view model
    viewModelOf(::MainViewModel)
}