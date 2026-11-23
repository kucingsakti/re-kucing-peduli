package c2;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7439t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Y1.c cVar, int i10) {
        super(0);
        this.f7438s = i10;
        this.f7439t = cVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f7438s) {
            case 0:
                String[] locales = ((AssetManager) this.f7439t.f5671u).getLocales();
                p210v8.i.e(locales, "assetManager.locales");
                return locales;
            case 1:
                String country = ((Configuration) this.f7439t.f5672v).locale.getCountry();
                p210v8.i.e(country, "configuration.locale.country");
                return country;
            default:
                String string = ((RingtoneManager) this.f7439t.f5670t).getRingtoneUri(0).toString();
                p210v8.i.e(string, "ringtoneManager.getRingtoneUri(0).toString()");
                return string;
        }
    }
}
