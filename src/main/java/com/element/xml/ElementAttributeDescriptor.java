package com.element.xml;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.meta.PsiPresentableMetaData;
import com.intellij.psi.xml.XmlElement;
import com.intellij.util.ArrayUtil;
import com.intellij.xml.impl.BasicXmlAttributeDescriptor;
import com.intellij.xml.impl.XmlAttributeDescriptorEx;
import com.element.ElementIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author sjl
 */
public class ElementAttributeDescriptor extends BasicXmlAttributeDescriptor implements XmlAttributeDescriptorEx, PsiPresentableMetaData {
    protected final Project project;
    private final String attributeName;
    private String[] attributeValues = null;

    public ElementAttributeDescriptor(final Project project, String attributeName, String[] attributeValues) {
        this.project = project;
        this.attributeName = attributeName;
        this.attributeValues = attributeValues;
    }

    @Override
    public PsiElement getDeclaration() {
        return null;
    }

    @Override
    public PsiElement getValueDeclaration(XmlElement xmlElement, String value) {
        return super.getValueDeclaration(xmlElement, value);
    }

    @Override
    public String getName() {
        return attributeName;
    }

    @Override
    public void init(PsiElement element) {}

    @Override
    public Object @NotNull [] getDependencies() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public boolean hasIdType() {
        return false;
    }

    @Override
    public boolean hasIdRefType() {
        return false;
    }

    @Override
    public boolean isEnumerated() {
        return false;
    }

    @Override
    public boolean isFixed() {
        return false;
    }

    @Override
    public String getDefaultValue() {
        return null;
    }

    @Override
    public String[] getEnumeratedValues() {
        return attributeValues;
    }

    @Override
    protected PsiElement getEnumeratedValueDeclaration(XmlElement xmlElement, String value) {
        return xmlElement;
    }

    @Nullable
    @Override
    public String handleTargetRename(@NotNull @NonNls String newTargetName) {
        return newTargetName;
    }

    @Override
    public String getTypeName() {
        return null;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ElementIcons.FILE;
    }
}
