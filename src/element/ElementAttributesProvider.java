package element;

import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import element.constant.ElementTagConstant;
import org.jetbrains.annotations.Nullable;

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
        for (Map.Entry<String, String[]> next : ElementTagConstant.TAG_CONSTANT.entrySet()) {
            if (next.getKey().equals(xmlTag.getName())) {
                String[] attrArray = next.getValue();
                if (attrArray.length > 0) {
                    XmlAttributeDescriptor[] attributeDescriptors = new ElementAttributeDescriptor[attrArray.length];
                    for(int i=0; i<attrArray.length; i++) {
                        attributeDescriptors[i] = new ElementAttributeDescriptor(project, attrArray[i]);
                    }
                    return attributeDescriptors;
                }
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
