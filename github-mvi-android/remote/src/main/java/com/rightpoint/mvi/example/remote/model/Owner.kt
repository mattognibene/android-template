package com.rightpoint.mvi.example.remote.model

data class Owner(
    val login: String,
    val id: Long,
    val avatar_url: String,
    val url: String,
    val html_url: String,
    val type: String
)