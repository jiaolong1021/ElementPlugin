package com.element.xml;

import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sjl
 */
public class ElementAttributesProvider implements XmlAttributeDescriptorsProvider {
    /**
     * 给特定标签添加属性
     * @param xmlTag
     * @return
     */
    @Override
    public XmlAttributeDescriptor[] getAttributeDescriptors(XmlTag xmlTag) {
        final Project project = xmlTag.getProject();
        for (Map.Entry<String, HashMap<String, String[]>> next : ElementTagConstant.TAG_CONSTANT.entrySet()) {
            if (next.getKey().equals(xmlTag.getName())) {
                HashMap<String, String[]> attrMap = next.getValue();
                XmlAttributeDescriptor[] attributeDescriptors = new ElementAttributeDescriptor[attrMap.size()];
                int i = 0;
                for(Map.Entry<String, String[]> attr : attrMap.entrySet()){
                    attributeDescriptors[i] = new ElementAttributeDescriptor(project, attr.getKey(), attr.getValue());
                    i++;
                }
                return attributeDescriptors;
            }
        }
        return XmlAttributeDescriptor.EMPTY;
    }

    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(String s, XmlTag xmlTag) {
        return null;
    }
}
