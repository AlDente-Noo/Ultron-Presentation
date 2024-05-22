package com.atiurin.sampleapp.test.compose.list

import com.atiurin.sampleapp.activity.ComposeListActivity
import com.atiurin.sampleapp.data.repositories.ContactStorage
import com.atiurin.sampleapp.screens.ultron.PersonPage
import com.atiurin.sampleapp.screens.ultron.ComposeListPage
import com.atiurin.sampleapp.test.base.UltronBaseTest
import com.atiurin.ultron.core.compose.createUltronComposeRule
import org.junit.Rule
import org.junit.Test

class ListTest : UltronBaseTest() {
    @get:Rule
    val composeRule = createUltronComposeRule<ComposeListActivity>()

    @Test
    fun openChatTest(){
        val position = 8
        val contact = ContactStorage.getContact(position)
        ComposeListPage {
            assertListItem(contact)
            openPersonPage(contact)
        }
        PersonPage {
            assertPersonStatus(contact)
        }
    }
}