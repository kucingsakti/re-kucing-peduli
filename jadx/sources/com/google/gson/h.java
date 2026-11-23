package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f10003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ h[] f10004t;

    static {
        a aVar = new a();
        f10003s = aVar;
        f10004t = new h[]{aVar, new h() { // from class: com.google.gson.b
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.h(field.getName());
            }
        }, new h() { // from class: com.google.gson.c
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.h(h.f(field.getName(), ' '));
            }
        }, new h() { // from class: com.google.gson.d
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.f(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.e
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.f(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.f
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.f(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: com.google.gson.g
            @Override // com.google.gson.h
            public final String g(Field field) {
                return h.f(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String f(String str, char c10) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String h(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f10004t.clone();
    }

    public abstract String g(Field field);
}
