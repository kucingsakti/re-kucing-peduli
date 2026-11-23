package com.kcstream.cing.model;

import R5.a;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/kcstream/cing/model/Series;", "", "", "id", "", "date", "title", "description", "image", "Lcom/kcstream/cing/model/SeriesInfoMeta;", "info_meta", "", "Lcom/kcstream/cing/model/SeriesEpisode;", "ListEpisode", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kcstream/cing/model/SeriesInfoMeta;Ljava/util/List;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "f", a.PUSH_ADDITIONAL_DATA_KEY, "c", "Lcom/kcstream/cing/model/SeriesInfoMeta;", "d", "()Lcom/kcstream/cing/model/SeriesInfoMeta;", "Ljava/util/List;", "e", "()Ljava/util/List;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Series {

    @b("episode")
    private final List<SeriesEpisode> ListEpisode;

    @b("date")
    private final String date;

    @b("description")
    private final String description;

    @b("id")
    private final Integer id;

    @b("image")
    private final String image;

    @b("info_meta")
    private final SeriesInfoMeta info_meta;

    @b("title")
    private final String title;

    public Series(Integer num, String str, String str2, String str3, String str4, SeriesInfoMeta seriesInfoMeta, List<SeriesEpisode> list) {
        i.f(seriesInfoMeta, "info_meta");
        i.f(list, "ListEpisode");
        this.id = num;
        this.date = str;
        this.title = str2;
        this.description = str3;
        this.image = str4;
        this.info_meta = seriesInfoMeta;
        this.ListEpisode = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SeriesInfoMeta getInfo_meta() {
        return this.info_meta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getListEpisode() {
        return this.ListEpisode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Series)) {
            return false;
        }
        Series series = (Series) obj;
        return i.a(this.id, series.id) && i.a(this.date, series.date) && i.a(this.title, series.title) && i.a(this.description, series.description) && i.a(this.image, series.image) && i.a(this.info_meta, series.info_meta) && i.a(this.ListEpisode, series.ListEpisode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        return this.ListEpisode.hashCode() + ((this.info_meta.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Series(id=" + this.id + ", date=" + this.date + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", info_meta=" + this.info_meta + ", ListEpisode=" + this.ListEpisode + ')';
    }

    public /* synthetic */ Series(Integer num, String str, String str2, String str3, String str4, SeriesInfoMeta seriesInfoMeta, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, seriesInfoMeta, list);
    }
}
