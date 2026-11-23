package com.google.gson;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Serializable f10159s;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10159s = bool;
    }

    public static boolean f(o oVar) {
        Serializable serializable = oVar.f10159s;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number d() {
        Serializable serializable = this.f10159s;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.g((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String e() {
        Serializable serializable = this.f10159s;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        Serializable serializable = this.f10159s;
        Serializable serializable2 = oVar.f10159s;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (f(this) && f(oVar)) {
            return d().longValue() == oVar.d().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = d().doubleValue();
        double dDoubleValue2 = oVar.d().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f10159s;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.f10159s = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.f10159s = str;
    }
}
