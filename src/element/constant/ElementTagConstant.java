package element.constant;

import java.util.HashMap;

/**
 * @author sjl
 */
public class ElementTagConstant {
    public static HashMap<String, String[]> TAG_CONSTANT = new HashMap<>();

    static {
        /* 所有的标签属性添加 */
        /* element */
        TAG_CONSTANT.put("el-row", new String[]{":gutter", "type", "justify", "align", "tag"});
        TAG_CONSTANT.put("el-col", new String[]{":span", ":offset", ":push", ":pull", ":xs", ":sm", ":md", ":lg", ":xl", "tag"});
        TAG_CONSTANT.put("el-container", new String[]{"direction"});
        TAG_CONSTANT.put("el-header", new String[]{"height"});
        TAG_CONSTANT.put("el-aside", new String[]{"width"});
        TAG_CONSTANT.put("el-footer", new String[]{"height"});
        TAG_CONSTANT.put("el-button", new String[]{"size", "type", ":plain", ":round", "loading", ":disabled", "icon", ":autofocus", "native-type"});
        TAG_CONSTANT.put("el-radio", new String[]{"label", ":disabled", ":border", "size", "name", "@change"});
        TAG_CONSTANT.put("el-radio-group", new String[]{"size", ":disabled", "text-color", "fill", "@change"});
        TAG_CONSTANT.put("el-radio-button", new String[]{"label", ":disabled", "name"});
        TAG_CONSTANT.put("el-checkbox", new String[]{"label", "true-label", "false-label", ":disabled", ":border", "size", "name", ":checked", ":indeterminate", "@change"});
        TAG_CONSTANT.put("el-checkbox-group", new String[]{"size", ":disabled", ":min", ":max", "text-color", "fill", "@change"});
        TAG_CONSTANT.put("el-checkbox-button", new String[]{"label", "true-label", "false-label", ":disabled", "name", ":checked"});
        TAG_CONSTANT.put("el-input", new String[]{"type", "value", ":maxlength", ":minlength", "placeholder", ":clearable", ":disabled", "size", "prefix-icon", "suffix-icon", ":rows", ":autosize", "auto-complete", "name",
        ":readonly", "max", "min", "step", "resize", ":autofocus", "form", "label", "tabindex", "@blur", "@focus", "@change", "focus"});
        TAG_CONSTANT.put("el-autocomplete", new String[]{"placeholder", ":disabled", "value-key", "value", ":debounce", ":fetch-suggestions", "popper-class", ":trigger-on-focus", "name", ":select-when-unmatched", "label", "prefix-icon", "suffix-icon", "@select"});
        TAG_CONSTANT.put("el-input-number", new String[]{":value", ":min", ":max", ":step", "size", ":disabled", ":controls", "controls-position", "name", "label", "@change", "@blur", "@focus", ":focus"});
        TAG_CONSTANT.put("el-select", new String[]{":multiple", ":disabled", "value-key", "size", ":clearable", ":collapse-tags", ":multiple-limit", "name", "auto-complete", "placeholder", ":filterable", ":allow-create",
        ":allow-create", ":filter-method", ":remote", ":remote-method", ":loading", "loading-text", "no-match-text", "no-data-text", "popper-class", ":reserve-keyword", ":default-first-option", ":popper-append-to-body",
        "@change", "@visible-change", "@remove-tag", "@clear", "@blur", "@focus"});
        TAG_CONSTANT.put("el-option-group", new String[]{"label", ":disabled"});
        TAG_CONSTANT.put("el-option", new String[]{"value", "label", ":disabled", ":focus"});
        TAG_CONSTANT.put("el-cascader", new String[]{":options", ":props", ":value", "separator", "popper-class", "placeholder", ":disabled", ":clearable", "expand-trigger", ":show-all-levels", ":filterable", ":debounce", ":change-on-select",
        "size", "before-filer", "@change", "@active-item-change", "@blur", "@focus"});
        TAG_CONSTANT.put("el-switch", new String[]{":disabled", ":width", "active-icon-class", "inactive-icon-class", "active-text", "inactive-text", ":active-value", ":inactive-value", "active-color", "inactive-color", "name", "@change"});
        TAG_CONSTANT.put("el-slider", new String[]{":min", ":max", ":disabled", ":step", ":show-input", ":show-input-controls", ":show-stops", ":show-tooltip", ":format-tooltip", ":range", ":vertical", "height", "label", ":debounce", "tooltip-class", "@change"});
        TAG_CONSTANT.put("el-time-picker", new String[]{":readonly", ":disabled", ":editable", "size", "placeholder", "start-placeholder", "end-placeholder", ":is-range", ":arrow-control", ":value", "align", "popper-class", ":picker-options", "range-separator", "value-format",
        ":default-value", "name", "prefix-icon", "clear-icon", ":picker-options", "@change", "@blur", "@focus"});
        TAG_CONSTANT.put("el-time-select", new String[]{"start", "end", "step", "minTime", "maxTime", ":picker-options", "@change", "@blur", "@focus"});
        TAG_CONSTANT.put("el-date-picker", new String[]{":readonly", ":disabled", ":editable", ":clearable", "size", "placeholder", "star-placeholder", "end-placeholder", "type", "format", "align", "popper-class", ":picker-options",
        "range-separator", ":default-value", ":default-time", "value-format", "name", ":unlink-panels", "prefix-icon", "clear-icon", "@change", "@blur", "@focus"});
        TAG_CONSTANT.put("el-upload", new String[]{"action", ":headers", ":multiple", ":data", "name", ":with-credentials", ":show-file-list", ":drag", "accept", ":on-preview", ":on-remove", ":on-success", ":on-error", ":on-progress",
        ":on-change", ":before-upload", ":before-remove", "list-type", ":auto-upload", ":file-list", ":http-request", ":disabled", ":limit", ":on-exceed"});
        TAG_CONSTANT.put("el-rate", new String[]{":max", ":disabled", ":allow-half", ":low-threshold", ":high-threshold", ":colors", "void-color", "disabled-void-color", ":icon-classes", "void-icon-class", "disabled-void-icon-class",
        ":show-text", ":show-score", "text-color", ":texts", "score-template", "@change"});
        TAG_CONSTANT.put("el-color-picker", new String[]{":disabled", "size", ":show-alpha", "color-format", "popper-class", "@change", "@active-change"});
        TAG_CONSTANT.put("el-transfer", new String[]{":data", ":filterable", "filter-placeholder", ":filter-method", "target-order", ":titles", ":button-texts", ":render-content", ":format", ":props",
        ":left-default-checked", ":right-default-checked", "@change"});
        TAG_CONSTANT.put("el-form", new String[]{":model", ":rules", ":inline", "label-position", "label-width", "label-suffix", ":show-message", ":inline-message", ":status-icon", ":validate-on-rule-change", "size", ":disabled"});
        TAG_CONSTANT.put("el-form-item", new String[]{"prop", "label", "label-width", ":required", ":rules", "error", ":show-message", ":inline-message", "size"});
        TAG_CONSTANT.put("el-table", new String[]{":data", "height", "max-height", ":stripe", ":border", "size", ":fit", ":show-header", ":highlight-current-row", ":current-row-key", ":row-class-name", ":row-style", ":cell-class-name", ":cell-style", ":header-row-class-name", ":header-row-style",
        "header-cell-class-name", ":header-cell-style", ":row-key", "empty-text", ":default-expand-all", ":expand-row-keys", ":default-sort", "tooltip-effect", ":show-summary", "sum-text", ":summary-method", ":span-method",
        "@select", "@select-all", "@selection-change", "@cell-mouse-enter", "@cell-mouse-leave", "@cell-click", "@cell-dblclick", "@row-click", "@row-contextmenu", "@row-dblclick", "@header-click", "@header-contextmenu", "@sort-change", "@filter-change", "@current-change", "@header-dragend", "@wxpand-change"});
        TAG_CONSTANT.put("el-table-column", new String[]{"type", "index", "column-key", "label", "prop", "width", "min-width", "fixed", ":render-header", ":sortable", ":sort-method", ":sort-by", ":resizable", ":formatter", ":show-overflow-tooltip", "align", "header-align", "class-name",
        "label-class-name", ":selectable", ":reserve-selection", ":filters", "filter-placement", ":filter-multiple", ":filter-method", ":filtered-value"});
        TAG_CONSTANT.put("el-tag", new String[]{"type", ":closable", ":disable-transitions", ":hit", "color", "size", "@close"});
        TAG_CONSTANT.put("el-progress", new String[]{":percentage", "type", ":stroke-width", ":text-inside", "status", ":width", ":show-text"});
        TAG_CONSTANT.put("el-tree", new String[]{":data", "empty-text", "node-key", ":props", ":render-after-expand", ":load", ":render-content", ":highlight-current", ":default-expand-all", ":expand-on-click-node", ":auto-expand-parent", ":default-expanded-keys", ":show-checkbox",
        ":check-strictly", ":default-checked-keys", ":filter-node-method", ":accordion", ":indent", ":lazy", "@node-click", "@node-contextmenu", "@check-change", "@check", "@current-change", "@node-expand", "@node-collapse"});
        TAG_CONSTANT.put("el-pagination", new String[]{":small", ":background", ":page-size", ":total", ":page-count", ":current-page", "layout", ":page-sizes", "popper-class", "prev-text", "next-text", "@size-change", "@current-change"});
        TAG_CONSTANT.put("el-badge", new String[]{"value", ":max", ":is-dot", ":hidden"});
        TAG_CONSTANT.put("el-alert", new String[]{"title", "type", "description", ":closeable", ":center", "close-text", ":show-icon", "@close"});
        TAG_CONSTANT.put("el-menu", new String[]{"mode", ":collapse", "background-color", "text-color", "active-text-color", "default-active", ":default-opened", "menu-trigger", ":router", "@open", "@close", "@select"});
        TAG_CONSTANT.put("el-submenu", new String[]{"index", "popper-class", ":show-timeout", ":hide-timeout", ":disabled"});
        TAG_CONSTANT.put("el-menu-item", new String[]{"index", ":route", ":disabled"});
        TAG_CONSTANT.put("el-menu-group", new String[]{"title"});
        TAG_CONSTANT.put("el-tabs", new String[]{"type", ":closeable", ":addable", ":editable", "value", "tab-position", "@tab-click", "@tab-remove", "@tab-add", "@edit"});
        TAG_CONSTANT.put("el-tab-pane", new String[]{"label", ":disabled", "name", ":closeable"});
        TAG_CONSTANT.put("el-breadcrumb", new String[]{"separator", "separator-class"});
        TAG_CONSTANT.put("el-breadcrumb-item", new String[]{":to", ":replace"});
        TAG_CONSTANT.put("el-dropdown", new String[]{"type", "size", ":split-button", "placement", "trigger", ":hide-on-click", ":show-timeout", ":hide-timeout", "@click", "@command", "@visible-change"});
        TAG_CONSTANT.put("el-dropdown-menu", new String[]{"command", ":disabled", ":divided"});
        TAG_CONSTANT.put("el-steps", new String[]{"space", "direction", ":active", "process-status", "finish-status", ":align-center", ":simple"});
        TAG_CONSTANT.put("el-step", new String[]{"title", "description", "icon", "status"});
        TAG_CONSTANT.put("el-dialog", new String[]{":visible", "title", "width", ":fullscreen", "top", ":modal", ":modal-append-to-body", ":append-to-body", ":lock-scroll", "custom-class", ":close-on-click-modal", ":close-on-press-escape",
        ":show-close", ":before-close", ":center", "@close", "@open"});
        TAG_CONSTANT.put("el-tooltip", new String[]{"effect", "content", "placement", ":value", ":disabled", ":offset", "transition", ":visible-arrow", ":popper-options", ":open-delay", ":manual", "popper-class", ":enterable", ":hide-after"});
        TAG_CONSTANT.put("el-popover", new String[]{"trigger", "title", "content", "width", "placement", ":disabled", ":value", ":offset", "transition", ":visible-arrow", ":popper-options", ":open-delay", "@show", "@hide"});
        TAG_CONSTANT.put("el-card", new String[]{"header", ":body-style"});
        TAG_CONSTANT.put("el-carousel", new String[]{"height", ":initial-index", "trigger", ":autoplay", ":interval", "indicator-position", "arrow", "type", "@change"});
        TAG_CONSTANT.put("el-carousel-item", new String[]{"name", "label"});
        TAG_CONSTANT.put("el-collapse", new String[]{":accordion", ":value", "@change"});
        TAG_CONSTANT.put("el-collapse-item", new String[]{"name", "title"});
    }
}
