package nl.jaysh.hpbuddy.core.domain.model.failure

sealed interface Failure

data object UnknownFailure : Failure

sealed interface StorageFailure : Failure {
    data object IO : StorageFailure

    data object NotFound : StorageFailure
}
