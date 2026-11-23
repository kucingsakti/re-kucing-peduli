package p054f5;

import com.onesignal.user.internal.properties.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p043e5.a {
    private final b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(b bVar) {
        i.f(bVar, "_propertiesModelStore");
        this._propertiesModelStore = bVar;
        this.deviceLanguageProvider = new b();
    }

    @Override // p043e5.a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // p043e5.a
    public void setLanguage(String str) {
        i.f(str, "value");
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(str);
    }
}
