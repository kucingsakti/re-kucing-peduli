package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/kcstream/cing/model/SeriesInfoMetaGenre;", "", "", "term_id", "", MediationMetaData.KEY_NAME, "slug", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "getSlug", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeriesInfoMetaGenre {

    @b(MediationMetaData.KEY_NAME)
    private final String name;

    @b("slug")
    private final String slug;

    @b("term_id")
    private final Integer term_id;

    public SeriesInfoMetaGenre() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTerm_id() {
        return this.term_id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesInfoMetaGenre)) {
            return false;
        }
        SeriesInfoMetaGenre seriesInfoMetaGenre = (SeriesInfoMetaGenre) obj;
        return i.a(this.term_id, seriesInfoMetaGenre.term_id) && i.a(this.name, seriesInfoMetaGenre.name) && i.a(this.slug, seriesInfoMetaGenre.slug);
    }

    public final int hashCode() {
        Integer num = this.term_id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slug;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeriesInfoMetaGenre(term_id=");
        sb.append(this.term_id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", slug=");
        return AbstractC0487g.j(sb, this.slug, ')');
    }

    public SeriesInfoMetaGenre(Integer num, String str, String str2) {
        this.term_id = num;
        this.name = str;
        this.slug = str2;
    }

    public /* synthetic */ SeriesInfoMetaGenre(Integer num, String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
