package problems.easy

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 19.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class ValidParenthesesKtTest {
    @Test
    fun isValidTestBasic() {
        assertTrue(isValid("()"))
        assertTrue(isValid("()[]{}"))
        assertFalse(isValid("(]"))
        assertFalse(isValid("([)]"))
        assertTrue(isValid("{[]}"))
        assertFalse(isValid("(])"))
        assertFalse(isValid("()])"))
    }
}
