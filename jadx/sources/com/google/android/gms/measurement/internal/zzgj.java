package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzgj {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f9065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f9066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0313w f9067d;

    public zzgj(C0313w c0313w, String str) {
        this.f9067d = c0313w;
        Preconditions.e(str);
        this.a = str;
        this.f9065b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    public final Bundle a() {
        byte b3;
        if (this.f9066c == null) {
            C0313w c0313w = this.f9067d;
            String string = c0313w.f1().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(R5.a.PUSH_MINIFIED_BUTTON_TEXT);
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b3 = 3;
                                        } else {
                                            b3 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b3 = 2;
                                } else {
                                    b3 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b3 = 1;
                            } else {
                                b3 = -1;
                            }
                            if (b3 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b3 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b3 != 2) {
                                zzhj zzhjVar = (zzhj) c0313w.f577s;
                                if (b3 == 3) {
                                    zzpg.a();
                                    if (zzhjVar.f9146y.h1(null, zzbf.f8928A0)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                        int length = jSONArray2.length();
                                        int[] iArr = new int[length];
                                        for (int i11 = 0; i11 < length; i11++) {
                                            iArr[i11] = jSONArray2.optInt(i11);
                                        }
                                        bundle.putIntArray(string2, iArr);
                                    }
                                } else if (b3 != 4) {
                                    c0313w.i().f9056x.a(string3, "Unrecognized persisted bundle type. Type");
                                } else {
                                    zzpg.a();
                                    if (zzhjVar.f9146y.h1(null, zzbf.f8928A0)) {
                                        JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                        int length2 = jSONArray3.length();
                                        long[] jArr = new long[length2];
                                        for (int i12 = 0; i12 < length2; i12++) {
                                            jArr[i12] = jSONArray3.optLong(i12);
                                        }
                                        bundle.putLongArray(string2, jArr);
                                    }
                                }
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            c0313w.i().f9056x.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f9066c = bundle;
                } catch (JSONException unused2) {
                    c0313w.i().f9056x.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f9066c == null) {
                this.f9066c = this.f9065b;
            }
        }
        return this.f9066c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0313w c0313w = this.f9067d;
        SharedPreferences.Editor editorEdit = c0313w.f1().edit();
        int size = bundle.size();
        String str = this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(R5.a.PUSH_MINIFIED_BUTTON_TEXT, str2);
                        zzpg.a();
                        if (((zzhj) c0313w.f577s).f9146y.h1(null, zzbf.f8928A0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                c0313w.i().f9056x.a(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                c0313w.i().f9056x.a(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        c0313w.i().f9056x.a(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f9066c = bundle;
    }
}
