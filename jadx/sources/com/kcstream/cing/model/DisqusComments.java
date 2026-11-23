package com.kcstream.cing.model;

import R5.a;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/kcstream/cing/model/DisqusComments;", "", "", "thread", "", "hasNext", "hasPrev", "", "total", "", "Lcom/kcstream/cing/model/DisqusCommentsResult;", "result", "<init>", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/String;", "getThread", "()Ljava/lang/String;", "Z", "getHasNext", "()Z", "getHasPrev", "Ljava/lang/Integer;", "getTotal", "()Ljava/lang/Integer;", "Ljava/util/List;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisqusComments {

    @b("hasNext")
    private final boolean hasNext;

    @b("hasPrev")
    private final boolean hasPrev;

    @b("result")
    private List<DisqusCommentsResult> result;

    @b("thread")
    private final String thread;

    @b("total")
    private final Integer total;

    public DisqusComments(String str, boolean z6, boolean z10, Integer num, List<DisqusCommentsResult> list) {
        i.f(list, "result");
        this.thread = str;
        this.hasNext = z6;
        this.hasPrev = z10;
        this.total = num;
        this.result = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getResult() {
        return this.result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisqusComments)) {
            return false;
        }
        DisqusComments disqusComments = (DisqusComments) obj;
        return i.a(this.thread, disqusComments.thread) && this.hasNext == disqusComments.hasNext && this.hasPrev == disqusComments.hasPrev && i.a(this.total, disqusComments.total) && i.a(this.result, disqusComments.result);
    }

    public final int hashCode() {
        String str = this.thread;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + (this.hasNext ? 1231 : 1237)) * 31) + (this.hasPrev ? 1231 : 1237)) * 31;
        Integer num = this.total;
        return this.result.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DisqusComments(thread=" + this.thread + ", hasNext=" + this.hasNext + ", hasPrev=" + this.hasPrev + ", total=" + this.total + ", result=" + this.result + ')';
    }

    public /* synthetic */ DisqusComments(String str, boolean z6, boolean z10, Integer num, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, z6, z10, (i10 & 8) != 0 ? null : num, list);
    }
}
