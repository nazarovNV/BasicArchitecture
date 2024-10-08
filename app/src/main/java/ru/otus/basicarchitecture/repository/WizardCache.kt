package ru.otus.basicarchitecture.repository

import javax.inject.Inject

class WizardCache @Inject constructor() {
    var firstName: String? = null
    var lastName: String? = null
    var birthDate: String? = null
    var country: String? = null
    var city: String? = null
    var address: String? = null
    var interests: List<String> = emptyList()

    fun setInterests(interests: Set<String>) {
        this.interests = interests.toList()
    }

}