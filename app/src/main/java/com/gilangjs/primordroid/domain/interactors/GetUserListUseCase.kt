package com.gilangjs.primordroid.domain.interactors

import com.gilangjs.primordroid.domain.model.User
import com.gilangjs.primordroid.domain.repositorycontract.IUserRepository
import kotlinx.coroutines.CoroutineScope

class GetUserListUseCase(
    private val userRepository: IUserRepository
): UseCase<Unit, List<User>>() {

    override suspend fun run(params: Unit, scope: CoroutineScope): Result<List<User>> =
        userRepository.getUsers()
}
