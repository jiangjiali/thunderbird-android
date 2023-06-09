package app.k9mail.feature.account.setup.ui.autoconfig

import app.k9mail.feature.account.setup.domain.input.StringInputField
import app.k9mail.feature.account.setup.ui.autoconfig.AccountAutoConfigContract.ConfigStep
import app.k9mail.feature.account.setup.ui.autoconfig.AccountAutoConfigContract.State
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class AccountAutoConfigStateTest {

    @Test
    fun `should set default values`() {
        val state = State()

        assertThat(state).isEqualTo(
            State(
                configStep = ConfigStep.EMAIL_ADDRESS,
                emailAddress = StringInputField(),
                password = StringInputField(),
                autoConfig = null,
                errorMessage = null,
                isLoading = false,
            ),
        )
    }
}