package com.element;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ElementFileType extends LanguageFileType {
    public static final ElementFileType INSTANCE = new ElementFileType();

    private ElementFileType() {
        super(ElementLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Shen file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Shen language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "element";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ElementIcons.FILE;
    }
}
