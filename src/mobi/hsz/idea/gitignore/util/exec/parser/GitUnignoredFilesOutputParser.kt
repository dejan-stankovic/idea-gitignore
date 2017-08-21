/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.gitignore.util.exec.parser

import com.intellij.openapi.util.text.StringUtil
import org.jetbrains.annotations.NonNls

/**
 * Parser for the [mobi.hsz.idea.gitignore.util.exec.ExternalExec.GIT_UNIGNORED_FILES] command that
 * returns unignored files entries list.
 *
 * @author Jakub Chrzanowski <jakub></jakub>@hsz.mobi>
 * @since 1.5
 */
class GitUnignoredFilesOutputParser : ExecutionOutputParser<String>() {

    /**
     * Parses single entries and removes git output prefixes.
     *
     * @param text input data
     * @return single unignored entry
     */
    override fun parseOutput(text: String): String? =
            StringUtil.trim(StringUtil.trimStart(text, GIT_UNIGNORED_FILES_PREFIX))

    companion object {
        /** Prefix to remove from the command's result.  */
        @NonNls
        private val GIT_UNIGNORED_FILES_PREFIX = "Would remove"
    }
}