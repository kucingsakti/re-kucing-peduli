package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CodeContext implements JsonSerializable, StringTruncatable<CodeContext> {
    private static final long serialVersionUID = 1271972843983198079L;
    private final List<String> post;
    private final List<String> pre;

    public static final class Builder {
        private List<String> post;
        private List<String> pre;

        public Builder() {
        }

        public CodeContext build() {
            return new CodeContext(this);
        }

        public Builder post(List<String> list) {
            this.post = list;
            return this;
        }

        public Builder pre(List<String> list) {
            this.pre = list;
            return this;
        }

        public Builder(CodeContext codeContext) {
            this.pre = codeContext.pre;
            this.post = codeContext.post;
        }
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        HashMap map = new HashMap();
        List<String> list = this.pre;
        if (list != null) {
            map.put("pre", list);
        }
        List<String> list2 = this.post;
        if (list2 != null) {
            map.put("post", list2);
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CodeContext codeContext = (CodeContext) obj;
            List<String> list = this.pre;
            if (list == null ? codeContext.pre != null : !list.equals(codeContext.pre)) {
                return false;
            }
            List<String> list2 = this.post;
            List<String> list3 = codeContext.post;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
        }
        return false;
    }

    public List<String> getPost() {
        return this.post;
    }

    public List<String> getPre() {
        return this.pre;
    }

    public int hashCode() {
        List<String> list = this.pre;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.post;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "CodeContext{pre=" + this.pre + ", post=" + this.post + '}';
    }

    private CodeContext(Builder builder) {
        this.pre = builder.pre != null ? Collections.unmodifiableList(new ArrayList(builder.pre)) : null;
        this.post = builder.post != null ? Collections.unmodifiableList(new ArrayList(builder.post)) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public CodeContext truncateStrings(int i10) {
        return new Builder(this).pre(TruncationHelper.truncateStringsInList(this.pre, i10)).post(TruncationHelper.truncateStringsInList(this.post, i10)).build();
    }
}
