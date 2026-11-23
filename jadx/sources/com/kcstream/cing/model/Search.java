package com.kcstream.cing.model;

import R5.a;
import java.util.ArrayList;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR2\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kcstream/cing/model/Search;", "", "", "total", "totalPages", "Ljava/util/ArrayList;", "Lcom/kcstream/cing/model/SearchResult;", "Lkotlin/collections/ArrayList;", "result", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "Ljava/lang/Integer;", "getTotal", "()Ljava/lang/Integer;", "b", "Ljava/util/ArrayList;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/ArrayList;", "setResult", "(Ljava/util/ArrayList;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Search {

    @b("result")
    private ArrayList<SearchResult> result;

    @b("total")
    private final Integer total;

    @b("totalPages")
    private final Integer totalPages;

    public Search(Integer num, Integer num2, ArrayList<SearchResult> arrayList) {
        i.f(arrayList, "result");
        this.total = num;
        this.totalPages = num2;
        this.result = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ArrayList getResult() {
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
        if (!(obj instanceof Search)) {
            return false;
        }
        Search search = (Search) obj;
        return i.a(this.total, search.total) && i.a(this.totalPages, search.totalPages) && i.a(this.result, search.result);
    }

    public final int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalPages;
        return this.result.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Search(total=" + this.total + ", totalPages=" + this.totalPages + ", result=" + this.result + ')';
    }

    public /* synthetic */ Search(Integer num, Integer num2, ArrayList arrayList, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, arrayList);
    }
}
