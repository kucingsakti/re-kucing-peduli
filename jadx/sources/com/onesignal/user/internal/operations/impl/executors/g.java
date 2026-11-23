package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.Map;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();

    private g() {
    }

    public final p132n6.f createPropertiesFromOperation(p173r6.k kVar, p132n6.f fVar) {
        p210v8.i.f(kVar, "operation");
        p210v8.i.f(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap linkedHashMapC = tags != null ? y.C(tags) : null;
        if (linkedHashMapC == null) {
            linkedHashMapC = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapC;
        linkedHashMap.put(kVar.getKey(), kVar.getValue());
        return new p132n6.f(linkedHashMap, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    public final p132n6.f createPropertiesFromOperation(p173r6.d dVar, p132n6.f fVar) {
        p210v8.i.f(dVar, "operation");
        p210v8.i.f(fVar, "propertiesObject");
        Map<String, String> tags = fVar.getTags();
        LinkedHashMap linkedHashMapC = tags != null ? y.C(tags) : null;
        if (linkedHashMapC == null) {
            linkedHashMapC = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = linkedHashMapC;
        linkedHashMap.put(dVar.getKey(), null);
        return new p132n6.f(linkedHashMap, fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p132n6.f createPropertiesFromOperation(p173r6.j jVar, p132n6.f fVar) {
        String string;
        String string2;
        p210v8.i.f(jVar, "operation");
        p210v8.i.f(fVar, "propertiesObject");
        String property = jVar.getProperty();
        Object objValueOf = null;
        if (p210v8.i.a(property, "language")) {
            Map<String, String> tags = fVar.getTags();
            Object value = jVar.getValue();
            return new p132n6.f(tags, value != null ? value.toString() : null, fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
        }
        if (p210v8.i.a(property, "timezone")) {
            Map<String, String> tags2 = fVar.getTags();
            String language = fVar.getLanguage();
            Object value2 = jVar.getValue();
            return new p132n6.f(tags2, language, value2 != null ? value2.toString() : null, fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
        }
        if (p210v8.i.a(property, "country")) {
            Map<String, String> tags3 = fVar.getTags();
            String language2 = fVar.getLanguage();
            String timezoneId = fVar.getTimezoneId();
            Object value3 = jVar.getValue();
            return new p132n6.f(tags3, language2, timezoneId, value3 != null ? value3.toString() : null, fVar.getLatitude(), fVar.getLongitude());
        }
        if (p210v8.i.a(property, "locationLatitude")) {
            Map<String, String> tags4 = fVar.getTags();
            String language3 = fVar.getLanguage();
            String timezoneId2 = fVar.getTimezoneId();
            String country = fVar.getCountry();
            Object value4 = jVar.getValue();
            if (value4 != null && (string2 = value4.toString()) != null) {
                objValueOf = Double.valueOf(Double.parseDouble(string2));
            }
            return new p132n6.f(tags4, language3, timezoneId2, country, objValueOf, fVar.getLongitude());
        }
        if (p210v8.i.a(property, "locationLongitude")) {
            Map<String, String> tags5 = fVar.getTags();
            String language4 = fVar.getLanguage();
            String timezoneId3 = fVar.getTimezoneId();
            String country2 = fVar.getCountry();
            Double latitude = fVar.getLatitude();
            Object value5 = jVar.getValue();
            if (value5 != null && (string = value5.toString()) != null) {
                objValueOf = Double.valueOf(Double.parseDouble(string));
            }
            return new p132n6.f(tags5, language4, timezoneId3, country2, latitude, objValueOf);
        }
        return new p132n6.f(fVar.getTags(), fVar.getLanguage(), fVar.getTimezoneId(), fVar.getCountry(), fVar.getLatitude(), fVar.getLongitude());
    }
}
