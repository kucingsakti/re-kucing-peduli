package com.onesignal.common.modeling;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.onesignal.common.events.d {
    private i _parentModel;
    private final String _parentProperty;
    private final com.onesignal.common.events.b changeNotifier;
    private final Map<String, Object> data;

    public static final class a extends p210v8.k implements p200u8.b {
        final /* synthetic */ j $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$changeArgs = jVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.a) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.common.modeling.a aVar) {
            p210v8.i.f(aVar, "it");
            aVar.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getAnyProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getAnyProperty(str, aVar);
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getBigDecimalProperty(str, aVar);
    }

    public static /* synthetic */ boolean getBooleanProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getBooleanProperty(str, aVar);
    }

    public static /* synthetic */ double getDoubleProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getDoubleProperty(str, aVar);
    }

    public static /* synthetic */ float getFloatProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getFloatProperty(str, aVar);
    }

    public static /* synthetic */ int getIntProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getIntProperty(str, aVar);
    }

    public static /* synthetic */ List getListProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getListProperty(str, aVar);
    }

    public static /* synthetic */ long getLongProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getLongProperty(str, aVar);
    }

    public static /* synthetic */ h getMapModelProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getMapModelProperty(str, aVar);
    }

    public static /* synthetic */ Object getOptAnyProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptAnyProperty(str, aVar);
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptBigDecimalProperty(str, aVar);
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptBooleanProperty(str, aVar);
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptDoubleProperty(str, aVar);
    }

    public static /* synthetic */ Float getOptFloatProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptFloatProperty(str, aVar);
    }

    public static /* synthetic */ Integer getOptIntProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptIntProperty(str, aVar);
    }

    public static /* synthetic */ List getOptListProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptListProperty(str, aVar);
    }

    public static /* synthetic */ Long getOptLongProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptLongProperty(str, aVar);
    }

    public static /* synthetic */ h getOptMapModelProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptMapModelProperty(str, aVar);
    }

    public static /* synthetic */ String getOptStringProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getOptStringProperty(str, aVar);
    }

    public static /* synthetic */ String getStringProperty$default(i iVar, String str, p200u8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        return iVar.getStringProperty(str, aVar);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new j(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            i iVar = this._parentModel;
            p210v8.i.c(iVar);
            iVar.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z6, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setAnyProperty(str, obj, str2, z6);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setBigDecimalProperty(str, bigDecimal, str2, z6);
    }

    public static /* synthetic */ void setBooleanProperty$default(i iVar, String str, boolean z6, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setBooleanProperty(str, z6, str2, z10);
    }

    public static /* synthetic */ void setDoubleProperty$default(i iVar, String str, double d3, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setDoubleProperty(str, d3, str3, z6);
    }

    public static /* synthetic */ void setEnumProperty$default(i iVar, String str, Enum r10, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(r10, "value");
        p210v8.i.f(str2, "tag");
        iVar.setOptAnyProperty(str, r10.toString(), str2, z6);
    }

    public static /* synthetic */ void setFloatProperty$default(i iVar, String str, float f10, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setFloatProperty(str, f10, str2, z6);
    }

    public static /* synthetic */ void setIntProperty$default(i iVar, String str, int i10, String str2, boolean z6, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i11 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i11 & 8) != 0) {
            z6 = false;
        }
        iVar.setIntProperty(str, i10, str2, z6);
    }

    public static /* synthetic */ void setListProperty$default(i iVar, String str, List list, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setListProperty(str, list, str2, z6);
    }

    public static /* synthetic */ void setLongProperty$default(i iVar, String str, long j, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setLongProperty(str, j, str3, z6);
    }

    public static /* synthetic */ void setMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setMapModelProperty(str, hVar, str2, z6);
    }

    public static /* synthetic */ void setOptAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z6, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptAnyProperty(str, obj, str2, z6);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptBigDecimalProperty(str, bigDecimal, str2, z6);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(i iVar, String str, Boolean bool, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptBooleanProperty(str, bool, str2, z6);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(i iVar, String str, Double d3, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptDoubleProperty(str, d3, str2, z6);
    }

    public static /* synthetic */ void setOptEnumProperty$default(i iVar, String str, Enum r10, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        iVar.setOptAnyProperty(str, r10 != null ? r10.toString() : null, str2, z6);
    }

    public static /* synthetic */ void setOptFloatProperty$default(i iVar, String str, Float f10, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptFloatProperty(str, f10, str2, z6);
    }

    public static /* synthetic */ void setOptIntProperty$default(i iVar, String str, Integer num, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptIntProperty(str, num, str2, z6);
    }

    public static /* synthetic */ void setOptListProperty$default(i iVar, String str, List list, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptListProperty(str, list, str2, z6);
    }

    public static /* synthetic */ void setOptLongProperty$default(i iVar, String str, Long l4, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptLongProperty(str, l4, str2, z6);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptMapModelProperty(str, hVar, str2, z6);
    }

    public static /* synthetic */ void setOptStringProperty$default(i iVar, String str, String str2, String str3, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i10 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setOptStringProperty(str, str2, str3, z6);
    }

    public static /* synthetic */ void setStringProperty$default(i iVar, String str, String str2, String str3, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i10 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        iVar.setStringProperty(str, str2, str3, z6);
    }

    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        p210v8.i.f(str, "property");
        p210v8.i.f(jSONArray, "jsonArray");
        return null;
    }

    public i createModelForProperty(String str, JSONObject jSONObject) {
        p210v8.i.f(str, "property");
        p210v8.i.f(jSONObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        p210v8.i.d(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(str, aVar);
        p210v8.i.d(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Boolean optBooleanProperty = getOptBooleanProperty(str, aVar);
        p210v8.i.d(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Double optDoubleProperty = getOptDoubleProperty(str, aVar);
        p210v8.i.d(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final <T extends Enum<T>> T getEnumProperty(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            p210v8.i.m();
            throw null;
        }
        p210v8.i.m();
        throw null;
    }

    public final float getFloatProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Float optFloatProperty = getOptFloatProperty(str, aVar);
        p210v8.i.d(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Integer optIntProperty = getOptIntProperty(str, aVar);
        p210v8.i.d(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        List<T> optListProperty = getOptListProperty(str, aVar);
        p210v8.i.d(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Long optLongProperty = getOptLongProperty(str, aVar);
        p210v8.i.d(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> h getMapModelProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        h optMapModelProperty = getOptMapModelProperty(str, aVar);
        p210v8.i.d(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String str, p200u8.a aVar) {
        Object objInvoke;
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        synchronized (this.data) {
            try {
                if (this.data.containsKey(str) || aVar == null) {
                    objInvoke = this.data.get(str);
                } else {
                    objInvoke = aVar.invoke();
                    this.data.put(str, objInvoke);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objInvoke;
    }

    public final BigDecimal getOptBigDecimalProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return new BigDecimal(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Long) {
            return new BigDecimal(((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return new BigDecimal(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Double) {
            return new BigDecimal(((Number) optAnyProperty).doubleValue());
        }
        return optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return (Boolean) getOptAnyProperty(str, aVar);
    }

    public final Double getOptDoubleProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Double) {
            return (Double) optAnyProperty;
        }
        if (optAnyProperty instanceof Float) {
            return Double.valueOf(((Number) optAnyProperty).floatValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Double.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final <T extends Enum<T>> T getOptEnumProperty(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            return null;
        }
        p210v8.i.m();
        throw null;
    }

    public final Float getOptFloatProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Float) {
            return (Float) optAnyProperty;
        }
        if (optAnyProperty instanceof Double) {
            return Float.valueOf((float) ((Number) optAnyProperty).doubleValue());
        }
        if (optAnyProperty instanceof Integer) {
            return Float.valueOf(((Number) optAnyProperty).intValue());
        }
        return optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Integer) {
            return (Integer) optAnyProperty;
        }
        if (optAnyProperty instanceof Long) {
            return Integer.valueOf((int) ((Number) optAnyProperty).longValue());
        }
        if (optAnyProperty instanceof Float) {
            return Integer.valueOf((int) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return (List) getOptAnyProperty(str, aVar);
    }

    public final Long getOptLongProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        Object optAnyProperty = getOptAnyProperty(str, aVar);
        if (optAnyProperty == null) {
            return null;
        }
        if (optAnyProperty instanceof Long) {
            return (Long) optAnyProperty;
        }
        if (optAnyProperty instanceof Integer) {
            return Long.valueOf(((Number) optAnyProperty).intValue());
        }
        if (optAnyProperty instanceof Float) {
            return Long.valueOf((long) ((Number) optAnyProperty).floatValue());
        }
        return optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> h getOptMapModelProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return (h) getOptAnyProperty(str, aVar);
    }

    public final String getOptStringProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return (String) getOptAnyProperty(str, aVar);
    }

    public final String getStringProperty(String str, p200u8.a aVar) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        String optStringProperty = getOptStringProperty(str, aVar);
        p210v8.i.d(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return this.data.containsKey(str);
    }

    public final void initializeFromJson(JSONObject jSONObject) {
        boolean zA;
        Method method;
        p210v8.i.f(jSONObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> itKeys = jSONObject.keys();
                p210v8.i.e(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        p210v8.i.e(next, "property");
                        i iVarCreateModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (iVarCreateModelForProperty != null) {
                            this.data.put(next, iVarCreateModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        p210v8.i.e(next, "property");
                        List<?> listCreateListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (listCreateListForProperty != null) {
                            this.data.put(next, listCreateListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        p210v8.i.e(methods, "this.javaClass.methods");
                        int length = methods.length;
                        int i10 = 0;
                        while (true) {
                            zA = true;
                            if (i10 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i10];
                            if (!p210v8.i.a(method.getReturnType(), Void.class)) {
                                String name = method.getName();
                                p210v8.i.e(name, "it.name");
                                p210v8.i.e(next, "property");
                                if (L9.f.J(name, next, true)) {
                                    break;
                                }
                            }
                            i10++;
                        }
                        if (method == null) {
                            Map<String, Object> map = this.data;
                            p210v8.i.e(next, "property");
                            map.put(next, jSONObject.get(next));
                        } else {
                            Class<?> returnType = method.getReturnType();
                            if (p210v8.i.a(returnType, Double.TYPE) ? true : p210v8.i.a(returnType, Double.class)) {
                                Map<String, Object> map2 = this.data;
                                p210v8.i.e(next, "property");
                                map2.put(next, Double.valueOf(jSONObject.getDouble(next)));
                            } else {
                                if (p210v8.i.a(returnType, Long.TYPE) ? true : p210v8.i.a(returnType, Long.class)) {
                                    Map<String, Object> map3 = this.data;
                                    p210v8.i.e(next, "property");
                                    map3.put(next, Long.valueOf(jSONObject.getLong(next)));
                                } else {
                                    if (p210v8.i.a(returnType, Float.TYPE) ? true : p210v8.i.a(returnType, Float.class)) {
                                        Map<String, Object> map4 = this.data;
                                        p210v8.i.e(next, "property");
                                        map4.put(next, Float.valueOf((float) jSONObject.getDouble(next)));
                                    } else {
                                        if (p210v8.i.a(returnType, Integer.TYPE) ? true : p210v8.i.a(returnType, Integer.class)) {
                                            Map<String, Object> map5 = this.data;
                                            p210v8.i.e(next, "property");
                                            map5.put(next, Integer.valueOf(jSONObject.getInt(next)));
                                        } else {
                                            if (p210v8.i.a(returnType, Boolean.TYPE) ? true : p210v8.i.a(returnType, Boolean.class)) {
                                                Map<String, Object> map6 = this.data;
                                                p210v8.i.e(next, "property");
                                                map6.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
                                            } else {
                                                if (!p210v8.i.a(returnType, String.class)) {
                                                    zA = p210v8.i.a(returnType, String.class);
                                                }
                                                if (zA) {
                                                    Map<String, Object> map7 = this.data;
                                                    p210v8.i.e(next, "property");
                                                    map7.put(next, jSONObject.getString(next));
                                                } else {
                                                    Map<String, Object> map8 = this.data;
                                                    p210v8.i.e(next, "property");
                                                    map8.put(next, jSONObject.get(next));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void initializeFromModel(String str, i iVar) {
        p210v8.i.f(iVar, "model");
        Map<? extends String, ? extends Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : iVar.data.entrySet()) {
            if (entry.getValue() instanceof i) {
                Object value = entry.getValue();
                p210v8.i.d(value, "null cannot be cast to non-null type com.onesignal.common.modeling.Model");
                i iVar2 = (i) value;
                iVar2._parentModel = this;
                p210v8.i.e(mapSynchronizedMap, "newData");
                mapSynchronizedMap.put(entry.getKey(), iVar2);
            } else {
                p210v8.i.e(mapSynchronizedMap, "newData");
                mapSynchronizedMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (str != null) {
            p210v8.i.e(mapSynchronizedMap, "newData");
            mapSynchronizedMap.put("id", str);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            p210v8.i.e(mapSynchronizedMap, "newData");
            map.putAll(mapSynchronizedMap);
        }
    }

    public final void setAnyProperty(String str, Object obj, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(obj, "value");
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, obj, str2, z6);
    }

    public final void setBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(bigDecimal, "value");
        p210v8.i.f(str2, "tag");
        setOptBigDecimalProperty(str, bigDecimal, str2, z6);
    }

    public final void setBooleanProperty(String str, boolean z6, String str2, boolean z10) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptBooleanProperty(str, Boolean.valueOf(z6), str2, z10);
    }

    public final void setDoubleProperty(String str, double d3, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptDoubleProperty(str, Double.valueOf(d3), str2, z6);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String str, T t7, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(t7, "value");
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, t7.toString(), str2, z6);
    }

    public final void setFloatProperty(String str, float f10, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptFloatProperty(str, Float.valueOf(f10), str2, z6);
    }

    public final void setId(String str) {
        p210v8.i.f(str, "value");
        setStringProperty$default(this, "id", str, null, false, 12, null);
    }

    public final void setIntProperty(String str, int i10, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptIntProperty(str, Integer.valueOf(i10), str2, z6);
    }

    public final <T> void setListProperty(String str, List<? extends T> list, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(list, "value");
        p210v8.i.f(str2, "tag");
        setOptListProperty(str, list, str2, z6);
    }

    public final void setLongProperty(String str, long j, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptLongProperty(str, Long.valueOf(j), str2, z6);
    }

    public final <T> void setMapModelProperty(String str, h hVar, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(hVar, "value");
        p210v8.i.f(str2, "tag");
        setOptMapModelProperty(str, hVar, str2, z6);
    }

    public final void setOptAnyProperty(String str, Object obj, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        Object obj2 = this.data.get(str);
        synchronized (this.data) {
            try {
                if (!p210v8.i.a(obj2, obj) || z6) {
                    if (obj != null) {
                        this.data.put(str, obj);
                    } else if (this.data.containsKey(str)) {
                        this.data.remove(str);
                    }
                    notifyChanged(str, str, str2, obj2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, bigDecimal != null ? bigDecimal.toString() : null, str2, z6);
    }

    public final void setOptBooleanProperty(String str, Boolean bool, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, bool, str2, z6);
    }

    public final void setOptDoubleProperty(String str, Double d3, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, d3, str2, z6);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String str, T t7, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, t7 != null ? t7.toString() : null, str2, z6);
    }

    public final void setOptFloatProperty(String str, Float f10, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, f10, str2, z6);
    }

    public final void setOptIntProperty(String str, Integer num, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, num, str2, z6);
    }

    public final <T> void setOptListProperty(String str, List<? extends T> list, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, list, str2, z6);
    }

    public final void setOptLongProperty(String str, Long l4, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, l4, str2, z6);
    }

    public final <T> void setOptMapModelProperty(String str, h hVar, String str2, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "tag");
        setOptAnyProperty(str, hVar, str2, z6);
    }

    public final void setOptStringProperty(String str, String str2, String str3, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str3, "tag");
        setOptAnyProperty(str, str2, str3, z6);
    }

    public final void setStringProperty(String str, String str2, String str3, boolean z6) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "value");
        p210v8.i.f(str3, "tag");
        setOptStringProperty(str, str2, str3, z6);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            try {
                for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof i) {
                        jSONObject.put(entry.getKey(), ((i) value).toJSON());
                    } else if (value instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : (List) value) {
                            if (obj instanceof i) {
                                jSONArray.put(((i) obj).toJSON());
                            } else {
                                jSONArray.put(obj);
                            }
                        }
                        jSONObject.put(entry.getKey(), jSONArray);
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public i(i iVar, String str) throws Exception {
        this._parentModel = iVar;
        this._parentProperty = str;
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        p210v8.i.e(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.data = mapSynchronizedMap;
        this.changeNotifier = new com.onesignal.common.events.b();
        i iVar2 = this._parentModel;
        if (iVar2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (iVar2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.a aVar) {
        p210v8.i.f(aVar, "handler");
        this.changeNotifier.subscribe(aVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.a aVar) {
        p210v8.i.f(aVar, "handler");
        this.changeNotifier.unsubscribe(aVar);
    }

    public /* synthetic */ i(i iVar, String str, int i10, p210v8.e eVar) {
        this((i10 & 1) != 0 ? null : iVar, (i10 & 2) != 0 ? null : str);
    }
}
