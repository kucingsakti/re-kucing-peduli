package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements e {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public g(Enum r10, String str, Object... objArr) {
        this._errorCategory = r10;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public abstract String getDomain();

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
