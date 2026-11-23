package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Frame implements JsonSerializable, StringTruncatable<Frame> {
    private static final long serialVersionUID = 8146147181798580520L;
    private final List<Object> args;
    private final String className;
    private final String code;
    private final Integer columnNumber;
    private final CodeContext context;
    private final String filename;
    private final Map<String, Object> keywordArgs;
    private final Integer lineNumber;
    private final Map<String, Object> locals;
    private final String method;

    public static final class Builder {
        private List<Object> args;
        private String className;
        private String code;
        private Integer columnNumber;
        private CodeContext context;
        private String filename;
        private Map<String, Object> keywordArgs;
        private Integer lineNumber;
        private Map<String, Object> locals;
        private String method;

        public Builder() {
        }

        public Builder args(List<Object> list) {
            this.args = list;
            return this;
        }

        public Frame build() {
            return new Frame(this);
        }

        public Builder className(String str) {
            this.className = str;
            return this;
        }

        public Builder code(String str) {
            this.code = str;
            return this;
        }

        public Builder columnNumber(Integer num) {
            this.columnNumber = num;
            return this;
        }

        public Builder context(CodeContext codeContext) {
            this.context = codeContext;
            return this;
        }

        public Builder filename(String str) {
            this.filename = str;
            return this;
        }

        public Builder keywordArgs(Map<String, Object> map) {
            this.keywordArgs = map;
            return this;
        }

        public Builder lineNumber(Integer num) {
            this.lineNumber = num;
            return this;
        }

        public Builder locals(Map<String, Object> map) {
            this.locals = map;
            return this;
        }

        public Builder method(String str) {
            this.method = str;
            return this;
        }

        public Builder(Frame frame) {
            this.filename = frame.filename;
            this.lineNumber = frame.lineNumber;
            this.columnNumber = frame.columnNumber;
            this.method = frame.method;
            this.code = frame.code;
            this.className = frame.className;
            this.context = frame.context;
            this.args = frame.args;
            this.keywordArgs = frame.keywordArgs;
            this.locals = frame.locals;
        }
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        HashMap map = new HashMap();
        String str = this.filename;
        if (str == null) {
            str = "[unknown]";
        }
        map.put("filename", str);
        Integer num = this.lineNumber;
        if (num != null) {
            map.put("lineno", num);
        }
        Integer num2 = this.columnNumber;
        if (num2 != null) {
            map.put("colno", num2);
        }
        String str2 = this.method;
        if (str2 != null) {
            map.put("method", str2);
        }
        String str3 = this.code;
        if (str3 != null) {
            map.put("code", str3);
        }
        String str4 = this.className;
        if (str4 != null) {
            map.put("class_name", str4);
        }
        CodeContext codeContext = this.context;
        if (codeContext != null) {
            map.put("context", codeContext);
        }
        List<Object> list = this.args;
        if (list != null) {
            map.put("args", list);
        }
        Map<String, Object> map2 = this.keywordArgs;
        if (map2 != null) {
            map.put("kwargs", map2);
        }
        Map<String, Object> map3 = this.locals;
        if (map3 != null) {
            map.put("locals", map3);
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Frame frame = (Frame) obj;
            String str = this.filename;
            if (str == null ? frame.filename != null : !str.equals(frame.filename)) {
                return false;
            }
            Integer num = this.lineNumber;
            if (num == null ? frame.lineNumber != null : !num.equals(frame.lineNumber)) {
                return false;
            }
            Integer num2 = this.columnNumber;
            if (num2 == null ? frame.columnNumber != null : !num2.equals(frame.columnNumber)) {
                return false;
            }
            String str2 = this.method;
            if (str2 == null ? frame.method != null : !str2.equals(frame.method)) {
                return false;
            }
            String str3 = this.code;
            if (str3 == null ? frame.code != null : !str3.equals(frame.code)) {
                return false;
            }
            String str4 = this.className;
            if (str4 == null ? frame.className != null : !str4.equals(frame.className)) {
                return false;
            }
            CodeContext codeContext = this.context;
            if (codeContext == null ? frame.context != null : !codeContext.equals(frame.context)) {
                return false;
            }
            List<Object> list = this.args;
            if (list == null ? frame.args != null : !list.equals(frame.args)) {
                return false;
            }
            Map<String, Object> map = this.keywordArgs;
            if (map == null ? frame.keywordArgs != null : !map.equals(frame.keywordArgs)) {
                return false;
            }
            Map<String, Object> map2 = this.locals;
            Map<String, Object> map3 = frame.locals;
            if (map2 != null) {
                return map2.equals(map3);
            }
            if (map3 == null) {
                return true;
            }
        }
        return false;
    }

    public List<Object> getArgs() {
        return this.args;
    }

    public String getClassName() {
        return this.className;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getColumnNumber() {
        return this.columnNumber;
    }

    public CodeContext getContext() {
        return this.context;
    }

    public String getFilename() {
        return this.filename;
    }

    public Map<String, Object> getKeywordArgs() {
        return this.keywordArgs;
    }

    public Integer getLineNumber() {
        return this.lineNumber;
    }

    public Map<String, Object> getLocals() {
        return this.locals;
    }

    public String getMethod() {
        return this.method;
    }

    public int hashCode() {
        String str = this.filename;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.lineNumber;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.columnNumber;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.method;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.code;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.className;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        CodeContext codeContext = this.context;
        int iHashCode7 = (iHashCode6 + (codeContext != null ? codeContext.hashCode() : 0)) * 31;
        List<Object> list = this.args;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, Object> map = this.keywordArgs;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.locals;
        return iHashCode9 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "Frame{filename='" + this.filename + "', lineNumber=" + this.lineNumber + ", columnNumber=" + this.columnNumber + ", method='" + this.method + "', code='" + this.code + "', className='" + this.className + "', context=" + this.context + ", args=" + this.args + ", keywordArgs=" + this.keywordArgs + ", locals=" + this.locals + '}';
    }

    private Frame(Builder builder) {
        this.filename = builder.filename;
        this.lineNumber = builder.lineNumber;
        this.columnNumber = builder.columnNumber;
        this.method = builder.method;
        this.code = builder.code;
        this.className = builder.className;
        this.context = builder.context;
        this.args = builder.args != null ? Collections.unmodifiableList(new ArrayList(builder.args)) : null;
        this.keywordArgs = builder.keywordArgs != null ? Collections.unmodifiableMap(new HashMap(builder.keywordArgs)) : null;
        this.locals = builder.locals != null ? Collections.unmodifiableMap(new HashMap(builder.locals)) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public Frame truncateStrings2(int i10) {
        return new Builder(this).filename(TruncationHelper.truncateString(this.filename, i10)).method(TruncationHelper.truncateString(this.method, i10)).code(TruncationHelper.truncateString(this.code, i10)).className(TruncationHelper.truncateString(this.className, i10)).context((CodeContext) TruncationHelper.truncateStringsInObject(this.context, i10)).args(TruncationHelper.truncateStringsInObjectList(this.args, i10)).keywordArgs(TruncationHelper.truncateStringsInMap(this.keywordArgs, i10)).locals(TruncationHelper.truncateStringsInMap(this.locals, i10)).build();
    }
}
