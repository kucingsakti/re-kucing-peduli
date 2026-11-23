package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.onesignal.inAppMessages.internal.display.impl.k;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016¨\u0006!"}, d2 = {"Lcom/kcstream/cing/model/SearchByGenreResult;", "", "", "id", "", "slug", "title", "date", "link", "image", k.EVENT_TYPE_KEY, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "d", "setTitle", "getDate", "setDate", "getLink", "setLink", "b", "setImage", "e", "setType", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SearchByGenreResult {

    @b("date")
    private String date;

    @b("id")
    private Integer id;

    @b("image")
    private String image;

    @b("link")
    private String link;

    @b("slug")
    private String slug;

    @b("title")
    private String title;

    @b(k.EVENT_TYPE_KEY)
    private String type;

    public SearchByGenreResult() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByGenreResult)) {
            return false;
        }
        SearchByGenreResult searchByGenreResult = (SearchByGenreResult) obj;
        return i.a(this.id, searchByGenreResult.id) && i.a(this.slug, searchByGenreResult.slug) && i.a(this.title, searchByGenreResult.title) && i.a(this.date, searchByGenreResult.date) && i.a(this.link, searchByGenreResult.link) && i.a(this.image, searchByGenreResult.image) && i.a(this.type, searchByGenreResult.type);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.slug;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchByGenreResult(id=");
        sb.append(this.id);
        sb.append(", slug=");
        sb.append(this.slug);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", type=");
        return AbstractC0487g.j(sb, this.type, ')');
    }

    public SearchByGenreResult(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = num;
        this.slug = str;
        this.title = str2;
        this.date = str3;
        this.link = str4;
        this.image = str5;
        this.type = str6;
    }

    public /* synthetic */ SearchByGenreResult(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
    }
}
