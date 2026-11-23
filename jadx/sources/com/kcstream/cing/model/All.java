package com.kcstream.cing.model;

import R5.a;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/kcstream/cing/model/All;", "", "", "total", "totalPages", "", "Lcom/kcstream/cing/model/AllListResult;", "result", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "b", "setTotalPages", "Ljava/util/List;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class All {

    @b("result")
    private List<AllListResult> result;

    @b("total")
    private Integer total;

    @b("totalPages")
    private Integer totalPages;

    public All(Integer num, Integer num2, List<AllListResult> list) {
        i.f(list, "result");
        this.total = num;
        this.totalPages = num2;
        this.result = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof All)) {
            return false;
        }
        All all = (All) obj;
        return i.a(this.total, all.total) && i.a(this.totalPages, all.totalPages) && i.a(this.result, all.result);
    }

    public final int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalPages;
        return this.result.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "All(total=" + this.total + ", totalPages=" + this.totalPages + ", result=" + this.result + ')';
    }

    public /* synthetic */ All(Integer num, Integer num2, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, list);
    }
}
