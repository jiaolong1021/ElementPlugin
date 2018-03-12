package element.document;

import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;

/**
 * @author sjl
 */
public class DocumentProvider extends AbstractDocumentationProvider {
    @Override
    @Nullable
    public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
        if (element instanceof IProperty) {
            return "\"" + renderPropertyValue((IProperty)element) + "\"" + getLocationString(element);
        }
        return null;
    }

    private static String getLocationString(PsiElement element) {
        PsiFile file = element.getContainingFile();
        return file != null ? " [" + file.getName() + "]" : "";
    }

    @NotNull
    private static String renderPropertyValue(IProperty prop) {
        String raw = prop.getValue();
        if (raw == null) {
            return "<i>empty</i>";
        }
        return StringUtil.escapeXml(raw);
    }

    @Override
    public String generateDoc(final PsiElement element, @Nullable final PsiElement originalElement) {
        // 相关处理，不处理返回null
        String text = element.getText();

        if (null != text) {
            String split = text.split(">")[0];
            /* 必须是标签 */
            if (!split.contains("<")) {
                return null;
            }

            String handleText = split.replaceAll("<", "").split(" ")[0];

            try {
                String textHandle = handleText.replaceAll("-", "").replaceAll("\n|\r\n", "");
                String doc = "";
                Class clazz = Class.forName("document.DocumentConstant");
                Field[] fields = clazz.getFields();
                for (Field field : fields) {
                    if (textHandle.equals(field.getName()) && field.getType().toString().endsWith("java.lang.String")) {
                        doc = (String) field.get(DocumentConstant.class);
                        break;
                    }
                }

                if ("".equals(doc)) {
                    return null;
                }else{
                    return doc;
                }
            } catch (ClassNotFoundException | IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }

        return null;
    }
}
