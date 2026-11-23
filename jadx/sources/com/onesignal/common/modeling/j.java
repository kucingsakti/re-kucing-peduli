package com.onesignal.common.modeling;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private final i model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public j(i iVar, String str, String str2, Object obj, Object obj2) {
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "path");
        p210v8.i.f(str2, "property");
        this.model = iVar;
        this.path = str;
        this.property = str2;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final i getModel() {
        return this.model;
    }

    public final Object getNewValue() {
        return this.newValue;
    }

    public final Object getOldValue() {
        return this.oldValue;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }
}
