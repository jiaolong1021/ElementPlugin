package com.element.language;

import com.intellij.lang.PsiParser;
import com.intellij.lang.html.HTMLParserDefinition;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import org.jetbrains.annotations.NotNull;

public class ElementParserDefinition extends HTMLParserDefinition {
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return super.createLexer(project);
    }

    @Override
    public IFileElementType getFileNodeType() {
        return super.getFileNodeType();
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return super.createFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return super.createParser(project);
    }
}
