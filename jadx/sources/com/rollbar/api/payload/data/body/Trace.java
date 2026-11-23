package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Trace implements BodyContent, JsonSerializable {
    private static final long serialVersionUID = 7477061203488507566L;
    private final ExceptionInfo exception;
    private final List<Frame> frames;

    public static final class Builder {
        private ExceptionInfo exception;
        private List<Frame> frames;

        public Builder() {
        }

        public Trace build() {
            return new Trace(this);
        }

        public Builder exception(ExceptionInfo exceptionInfo) {
            this.exception = exceptionInfo;
            return this;
        }

        public Builder frames(List<Frame> list) {
            this.frames = list;
            return this;
        }

        public Builder(Trace trace) {
            this.frames = trace.frames;
            this.exception = trace.exception;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Trace trace = (Trace) obj;
            List<Frame> list = this.frames;
            if (list == null ? trace.frames != null : !list.equals(trace.frames)) {
                return false;
            }
            ExceptionInfo exceptionInfo = this.exception;
            ExceptionInfo exceptionInfo2 = trace.exception;
            if (exceptionInfo != null) {
                return exceptionInfo.equals(exceptionInfo2);
            }
            if (exceptionInfo2 == null) {
                return true;
            }
        }
        return false;
    }

    public ExceptionInfo getException() {
        return this.exception;
    }

    public List<Frame> getFrames() {
        return this.frames;
    }

    @Override // com.rollbar.api.payload.data.body.BodyContent
    public String getKeyName() {
        return "trace";
    }

    public int hashCode() {
        List<Frame> list = this.frames;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        ExceptionInfo exceptionInfo = this.exception;
        return iHashCode + (exceptionInfo != null ? exceptionInfo.hashCode() : 0);
    }

    public String toString() {
        return "Trace{frames=" + this.frames + ", exception=" + this.exception + '}';
    }

    private Trace(Builder builder) {
        this.frames = Collections.unmodifiableList(new ArrayList(builder.frames));
        this.exception = builder.exception;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        List<Frame> list = this.frames;
        if (list != null) {
            map.put("frames", list);
        }
        ExceptionInfo exceptionInfo = this.exception;
        if (exceptionInfo != null) {
            map.put("exception", exceptionInfo);
        }
        return map;
    }

    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public BodyContent truncateStrings2(int i10) {
        ArrayList arrayList;
        List<Frame> list = this.frames;
        if ((list == null || list.isEmpty()) && this.exception == null) {
            return this;
        }
        if (this.frames != null) {
            arrayList = new ArrayList();
            Iterator<Frame> it = this.frames.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().truncateStrings2(i10));
            }
        } else {
            arrayList = null;
        }
        ExceptionInfo exceptionInfo = this.exception;
        return new Builder(this).frames(arrayList).exception(exceptionInfo != null ? exceptionInfo.truncateStrings2(i10) : null).build();
    }
}
