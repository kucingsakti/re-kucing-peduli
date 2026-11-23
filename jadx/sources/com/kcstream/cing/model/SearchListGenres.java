package com.kcstream.cing.model;

import R5.a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/kcstream/cing/model/SearchListGenres;", "", "", "total", "", "Lcom/kcstream/cing/model/SearchListGenresData;", JsonStorageKeyNames.DATA_KEY, "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "getTotal", "()Ljava/lang/Integer;", "Ljava/util/List;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/List;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SearchListGenres {

    @b(JsonStorageKeyNames.DATA_KEY)
    private final List<SearchListGenresData> data;

    @b("total")
    private final Integer total;

    public SearchListGenres(Integer num, List<SearchListGenresData> list) {
        i.f(list, JsonStorageKeyNames.DATA_KEY);
        this.total = num;
        this.data = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getData() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchListGenres)) {
            return false;
        }
        SearchListGenres searchListGenres = (SearchListGenres) obj;
        return i.a(this.total, searchListGenres.total) && i.a(this.data, searchListGenres.data);
    }

    public final int hashCode() {
        Integer num = this.total;
        return this.data.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchListGenres(total=" + this.total + ", data=" + this.data + ')';
    }

    public /* synthetic */ SearchListGenres(Integer num, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, list);
    }
}
