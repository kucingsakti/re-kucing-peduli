package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/kcstream/cing/model/SeriesInfoMeta;", "", "", "aliases", "episode", "status", "tayang", "produser", "", "Lcom/kcstream/cing/model/SeriesInfoMetaGenre;", "genre", "durasi", "skor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAliases", "()Ljava/lang/String;", "b", "f", "getTayang", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", a.PUSH_ADDITIONAL_DATA_KEY, "e", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeriesInfoMeta {

    @b("aliases")
    private final String aliases;

    @b("durasi")
    private final String durasi;

    @b("episode")
    private final String episode;

    @b("genre")
    private final List<SeriesInfoMetaGenre> genre;

    @b("produser")
    private final String produser;

    @b("skor")
    private final String skor;

    @b("status")
    private final String status;

    @b("tayang")
    private final String tayang;

    public SeriesInfoMeta(String str, String str2, String str3, String str4, String str5, List<SeriesInfoMetaGenre> list, String str6, String str7) {
        i.f(list, "genre");
        this.aliases = str;
        this.episode = str2;
        this.status = str3;
        this.tayang = str4;
        this.produser = str5;
        this.genre = list;
        this.durasi = str6;
        this.skor = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDurasi() {
        return this.durasi;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEpisode() {
        return this.episode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getGenre() {
        return this.genre;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProduser() {
        return this.produser;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSkor() {
        return this.skor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesInfoMeta)) {
            return false;
        }
        SeriesInfoMeta seriesInfoMeta = (SeriesInfoMeta) obj;
        return i.a(this.aliases, seriesInfoMeta.aliases) && i.a(this.episode, seriesInfoMeta.episode) && i.a(this.status, seriesInfoMeta.status) && i.a(this.tayang, seriesInfoMeta.tayang) && i.a(this.produser, seriesInfoMeta.produser) && i.a(this.genre, seriesInfoMeta.genre) && i.a(this.durasi, seriesInfoMeta.durasi) && i.a(this.skor, seriesInfoMeta.skor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final int hashCode() {
        String str = this.aliases;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.episode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tayang;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.produser;
        int iHashCode5 = (this.genre.hashCode() + ((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.durasi;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.skor;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeriesInfoMeta(aliases=");
        sb.append(this.aliases);
        sb.append(", episode=");
        sb.append(this.episode);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", tayang=");
        sb.append(this.tayang);
        sb.append(", produser=");
        sb.append(this.produser);
        sb.append(", genre=");
        sb.append(this.genre);
        sb.append(", durasi=");
        sb.append(this.durasi);
        sb.append(", skor=");
        return AbstractC0487g.j(sb, this.skor, ')');
    }

    public /* synthetic */ SeriesInfoMeta(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, list, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7);
    }
}
