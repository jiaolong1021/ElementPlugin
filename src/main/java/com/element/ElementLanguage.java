package com.element;

import com.intellij.lang.Language;

public class ElementLanguage extends Language {
    public static final ElementLanguage INSTANCE = new ElementLanguage();
    private ElementLanguage() {
        super("Shen");
    }
}
