package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.common.modeling.j;
import com.onesignal.inAppMessages.internal.l;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import p076h8.m;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements A5.a, com.onesignal.common.modeling.d {
    private com.onesignal.inAppMessages.internal.triggers.impl.a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    public static final class a extends k implements p200u8.b {
        final /* synthetic */ A5.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A5.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A5.b) obj);
            return m.a;
        }

        public final void invoke(A5.b bVar) {
            i.f(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    public static final class b extends k implements p200u8.b {
        final /* synthetic */ A5.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A5.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A5.b) obj);
            return m.a;
        }

        public final void invoke(A5.b bVar) {
            i.f(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    public e(A5.d dVar, com.onesignal.inAppMessages.internal.triggers.impl.a aVar) {
        i.f(dVar, "triggerModelStore");
        i.f(aVar, "_dynamicTriggerController");
        this._dynamicTriggerController = aVar;
        this.triggers = new ConcurrentHashMap<>();
        dVar.subscribe((com.onesignal.common.modeling.d) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
        }
    }

    private final boolean evaluateAndTriggers(List<l> list) {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(l lVar) {
        if (lVar.getKind() == l.a.UNKNOWN) {
            return false;
        }
        if (lVar.getKind() != l.a.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(lVar);
        }
        l.b operatorType = lVar.getOperatorType();
        Object obj = this.triggers.get(lVar.getProperty());
        if (obj == null) {
            if (operatorType == l.b.NOT_EXISTS) {
                return true;
            }
            return operatorType == l.b.NOT_EQUAL_TO && lVar.getValue() != null;
        }
        if (operatorType == l.b.EXISTS) {
            return true;
        }
        if (operatorType == l.b.NOT_EXISTS) {
            return false;
        }
        if (operatorType == l.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(lVar.getValue());
        }
        if ((obj instanceof String) && (lVar.getValue() instanceof String)) {
            String str = (String) lVar.getValue();
            i.c(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((lVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) lVar.getValue();
            i.c(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(lVar.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, l.b bVar) {
        if (obj == null) {
            return false;
        }
        if (!bVar.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, bVar);
            }
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        if (obj2 instanceof Number) {
            string2 = new DecimalFormat("0.#").format(obj2);
            i.e(string2, "format.format(deviceValue)");
        }
        return triggerMatchesStringValue(string, string2, bVar);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, l.b bVar) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (d.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                return dDoubleValue2 == dDoubleValue;
            case 2:
                return dDoubleValue2 != dDoubleValue;
            case 3:
            case 4:
            case 5:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator with a numeric value: " + bVar, null, 2, null);
                return false;
            case 6:
                return dDoubleValue2 < dDoubleValue;
            case 7:
                return dDoubleValue2 > dDoubleValue;
            case 8:
                return dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue;
            case 9:
                return dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, l.b bVar) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, l.b bVar) {
        int i10 = d.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return i.a(str, str2);
        }
        if (i10 == 2) {
            return !i.a(str, str2);
        }
        com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, null, 2, null);
        return false;
    }

    @Override // A5.a
    public boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        if (aVar.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<l>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // A5.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // A5.a
    public boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection) {
        i.f(aVar, "message");
        i.f(collection, "triggersKeys");
        if (aVar.getTriggers() == null) {
            return false;
        }
        for (String str : collection) {
            Iterator<List<l>> it = aVar.getTriggers().iterator();
            while (it.hasNext()) {
                for (l lVar : it.next()) {
                    if (i.a(str, lVar.getProperty()) || i.a(str, lVar.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // A5.a
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        if (aVar.getTriggers() == null || aVar.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<l>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            for (l lVar : it.next()) {
                if (lVar.getKind() == l.a.CUSTOM || lVar.getKind() == l.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
        com.onesignal.common.modeling.i model = jVar.getModel();
        i.d(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        A5.c cVar = (A5.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(A5.c cVar, String str) {
        i.f(cVar, "model");
        i.f(str, "tag");
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new a(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(A5.c cVar, String str) {
        i.f(cVar, "model");
        i.f(str, "tag");
        removeTriggersForKeys(cVar.getKey());
    }

    @Override // A5.a, com.onesignal.common.events.d
    public void subscribe(A5.b bVar) {
        i.f(bVar, "handler");
        this._dynamicTriggerController.subscribe(bVar);
    }

    @Override // A5.a, com.onesignal.common.events.d
    public void unsubscribe(A5.b bVar) {
        i.f(bVar, "handler");
        this._dynamicTriggerController.unsubscribe(bVar);
    }
}
