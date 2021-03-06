package no.bakkenbaeck.pppshared.view

import no.bakkenbaeck.pppshared.interfaces.IndefiniteLoadingIndicating

/**
 * Interface to be implemented per platform.
 */
interface CreateAccountView: IndefiniteLoadingIndicating {

    /// The text the user has input as their email address.
    var email: String?

    /// The text the user has input as their password.
    var password: String?

    /// The confirmed password for the user (which should match `password`).
    var confirmPassword: String?

    fun emailErrorUpdated(toString: String?)
    fun passwordErrorUpdated(toString: String?)
    fun confirmPasswordErrorUpdated(toString: String?)
    fun apiErrorUpdated(toString: String?)

    fun setSubmitButtonEnabled(enabled: Boolean)

    /// Called when an account has been successfully created.
    fun accountSuccessfullyCreated()
}