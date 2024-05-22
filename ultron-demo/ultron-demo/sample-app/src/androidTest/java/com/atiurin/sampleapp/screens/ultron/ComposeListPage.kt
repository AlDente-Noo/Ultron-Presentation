package com.atiurin.sampleapp.screens.ultron

import androidx.compose.ui.test.hasAnyDescendant
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasTextExactly
import com.atiurin.sampleapp.compose.LazyListItemPosition
import com.atiurin.sampleapp.compose.contactNameTestTag
import com.atiurin.sampleapp.compose.contactStatusTestTag
import com.atiurin.sampleapp.compose.contactsListTestTag
import com.atiurin.sampleapp.compose.getContactItemTestTagById
import com.atiurin.sampleapp.data.entities.Contact
import com.atiurin.ultron.allure.step.step
import com.atiurin.ultron.core.compose.list.UltronComposeListItem
import com.atiurin.ultron.core.compose.list.composeList
import com.atiurin.ultron.page.Screen

object ComposeListPage : Screen<ComposeListPage>() {
    private val contactsList = composeList(hasTestTag(contactsListTestTag), positionPropertyKey = LazyListItemPosition)

    private fun getContactItem(contact: Contact): ContactListItem {
        return contactsList.getItem(hasAnyDescendant(hasTextExactly(contact.name)))
    }
    private fun getContactItemById(contact: Contact): ContactListItem {
        return contactsList.getItem(hasTestTag(getContactItemTestTagById(contact)))
    }


    fun openPersonPage(contact: Contact): PersonPage {
        return step("Open chat with $contact") {
            getContactItemById(contact).click()
            PersonPage.assertPageDisplayed()
        }
    }
    fun openFirstChat(): PersonPage {
        return step("Open chat with 1st contact") {
            contactsList.firstItem().click()
            PersonPage.assertPageDisplayed()
        }
    }

    fun assertListItem(contact: Contact) = apply {
        step("Assert Item ui") {
            getContactItem(contact).apply {
                name.assertIsDisplayed().assertTextEquals(contact.name)
                status.assertIsDisplayed().assertTextEquals(contact.status)
                avatar.assertIsDisplayed()
            }
        }
    }
    private fun getContactItemByPosition(position: Int): ContactListItem {
        return contactsList.getItem(position)
    }
    private class ContactListItem : UltronComposeListItem() {
        val name by lazy { getChild(hasTestTag(contactNameTestTag)) }
        val status by lazy { getChild(hasTestTag(contactStatusTestTag)) }
        val avatar by lazy { getChild(hasContentDescription("avatar")) }
    }
}


