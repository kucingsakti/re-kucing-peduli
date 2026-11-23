package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TraceChain implements BodyContent, JsonSerializable {
    private static final long serialVersionUID = 3682426713701825483L;
    private final List<Trace> traces;

    public static final class Builder {
        private List<Trace> traces;

        public Builder() {
        }

        public TraceChain build() {
            return new TraceChain(this);
        }

        public Builder traces(List<Trace> list) {
            this.traces = list;
            return this;
        }

        public Builder(TraceChain traceChain) {
            this.traces = traceChain.traces;
        }
    }

    public TraceChain(Builder builder) {
        this.traces = builder.traces != null ? Collections.unmodifiableList(new ArrayList(builder.traces)) : null;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        return this.traces;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            List<Trace> list = this.traces;
            List<Trace> list2 = ((TraceChain) obj).traces;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.rollbar.api.payload.data.body.BodyContent
    public String getKeyName() {
        return "trace_chain";
    }

    public List<Trace> getTraces() {
        return this.traces;
    }

    public int hashCode() {
        List<Trace> list = this.traces;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TraceChain{traces=" + this.traces + '}';
    }

    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public BodyContent truncateStrings2(int i10) {
        List<Trace> list = this.traces;
        if (list == null || list.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Trace> it = this.traces.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().truncateStrings2(i10));
        }
        return new Builder(this).traces(arrayList).build();
    }
}
