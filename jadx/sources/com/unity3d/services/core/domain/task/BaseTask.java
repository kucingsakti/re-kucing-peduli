package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/task/BaseTask;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "P", "R", "Lcom/unity3d/services/core/di/IServiceComponent;", "params", "Lh8/h;", "invoke-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lm8/d;)Ljava/lang/Object;", "invoke", "doWork-gIAlu-s", "doWork", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends BaseParams, R> Object m47invokegIAlus(BaseTask<? super P, R> baseTask, P p10, d<? super h> dVar) {
            BaseTask$invoke$1 baseTask$invoke$1;
            if (dVar instanceof BaseTask$invoke$1) {
                baseTask$invoke$1 = (BaseTask$invoke$1) dVar;
                int i10 = baseTask$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    baseTask$invoke$1 = new BaseTask$invoke$1(dVar);
                }
            } else {
                baseTask$invoke$1 = new BaseTask$invoke$1(dVar);
            }
            Object obj = baseTask$invoke$1.result;
            a aVar = a.f13404s;
            int i11 = baseTask$invoke$1.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                return ((h) obj).f11792s;
            }
            J7.a.v(obj);
            baseTask$invoke$1.label = 1;
            Object objMo45doWorkgIAlus = baseTask.mo45doWorkgIAlus(p10, baseTask$invoke$1);
            return objMo45doWorkgIAlus == aVar ? aVar : objMo45doWorkgIAlus;
        }
    }

    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo45doWorkgIAlus(P p10, d<? super h> dVar);

    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo46invokegIAlus(P p10, d<? super h> dVar);
}
