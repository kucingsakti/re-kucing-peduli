package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/kcstream/cing/model/Updater;", "", "", "latestVersion", "", "latestVersionCode", "", "releaseNotes", "updateUrl", "adFilterUrl", "adMainUrl1", "adMainUrl2", "bda", "oneLi", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setLatestVersion", "(Ljava/lang/String;)V", "I", "f", "()I", "setLatestVersionCode", "(I)V", "Ljava/util/List;", "h", "()Ljava/util/List;", "setReleaseNotes", "(Ljava/util/List;)V", "i", "setUpdateUrl", a.PUSH_ADDITIONAL_DATA_KEY, "setAdFilterUrl", "b", "setAdMainUrl1", "c", "setAdMainUrl2", "d", "setBda", "g", "setOneLi", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Updater {

    @b("adFilterUrl")
    private String adFilterUrl;

    @b("adMainUrl1")
    private String adMainUrl1;

    @b("adMainUrl2")
    private String adMainUrl2;

    @b("adEnabled")
    private String bda;

    @b("latestVersion")
    private String latestVersion;

    @b("latestVersionCode")
    private int latestVersionCode;

    @b("oneLi")
    private String oneLi;

    @b("releaseNotes")
    private List<String> releaseNotes;

    @b("updateUrl")
    private String updateUrl;

    public Updater(String str, int i10, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7) {
        i.f(str, "latestVersion");
        i.f(list, "releaseNotes");
        i.f(str2, "updateUrl");
        this.latestVersion = str;
        this.latestVersionCode = i10;
        this.releaseNotes = list;
        this.updateUrl = str2;
        this.adFilterUrl = str3;
        this.adMainUrl1 = str4;
        this.adMainUrl2 = str5;
        this.bda = str6;
        this.oneLi = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdFilterUrl() {
        return this.adFilterUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdMainUrl1() {
        return this.adMainUrl1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAdMainUrl2() {
        return this.adMainUrl2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBda() {
        return this.bda;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Updater)) {
            return false;
        }
        Updater updater = (Updater) obj;
        return i.a(this.latestVersion, updater.latestVersion) && this.latestVersionCode == updater.latestVersionCode && i.a(this.releaseNotes, updater.releaseNotes) && i.a(this.updateUrl, updater.updateUrl) && i.a(this.adFilterUrl, updater.adFilterUrl) && i.a(this.adMainUrl1, updater.adMainUrl1) && i.a(this.adMainUrl2, updater.adMainUrl2) && i.a(this.bda, updater.bda) && i.a(this.oneLi, updater.oneLi);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLatestVersionCode() {
        return this.latestVersionCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOneLi() {
        return this.oneLi;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getReleaseNotes() {
        return this.releaseNotes;
    }

    public final int hashCode() {
        int iA = p231y.a.a((this.releaseNotes.hashCode() + (((this.latestVersion.hashCode() * 31) + this.latestVersionCode) * 31)) * 31, this.updateUrl, 31);
        String str = this.adFilterUrl;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adMainUrl1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adMainUrl2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bda;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oneLi;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Updater(latestVersion=");
        sb.append(this.latestVersion);
        sb.append(", latestVersionCode=");
        sb.append(this.latestVersionCode);
        sb.append(", releaseNotes=");
        sb.append(this.releaseNotes);
        sb.append(", updateUrl=");
        sb.append(this.updateUrl);
        sb.append(", adFilterUrl=");
        sb.append(this.adFilterUrl);
        sb.append(", adMainUrl1=");
        sb.append(this.adMainUrl1);
        sb.append(", adMainUrl2=");
        sb.append(this.adMainUrl2);
        sb.append(", bda=");
        sb.append(this.bda);
        sb.append(", oneLi=");
        return AbstractC0487g.j(sb, this.oneLi, ')');
    }

    public /* synthetic */ Updater(String str, int i10, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i11, e eVar) {
        this(str, i10, list, str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
