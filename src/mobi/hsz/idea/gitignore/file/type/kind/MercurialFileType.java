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

package mobi.hsz.idea.gitignore.file.type.kind;

import mobi.hsz.idea.gitignore.file.type.IgnoreFileType;
import mobi.hsz.idea.gitignore.lang.kind.MercurialLanguage;

/**
 * Describes Mercurial file type.
 *
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.8
 */
public class MercurialFileType extends IgnoreFileType {
    /** Contains {@link MercurialFileType} singleton. */
    public static final MercurialFileType INSTANCE = new MercurialFileType();

    /** Private constructor to prevent direct object creation. */
    private MercurialFileType() {
        super(MercurialLanguage.INSTANCE);
    }
}