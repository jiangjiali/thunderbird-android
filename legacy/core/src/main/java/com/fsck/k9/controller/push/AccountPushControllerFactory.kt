package com.fsck.k9.controller.push

import app.k9mail.legacy.account.Account
import app.k9mail.legacy.mailstore.FolderRepository
import com.fsck.k9.Preferences
import com.fsck.k9.backend.BackendManager
import com.fsck.k9.controller.MessagingController

internal class AccountPushControllerFactory(
    private val backendManager: BackendManager,
    private val messagingController: MessagingController,
    private val folderRepository: FolderRepository,
    private val preferences: Preferences,
) {
    fun create(account: Account): AccountPushController {
        return AccountPushController(
            backendManager,
            messagingController,
            preferences,
            folderRepository,
            account = account,
        )
    }
}
