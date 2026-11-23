package com.onesignal.session.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements p065g6.a {
    private final j6.b _outcomeController;

    /* JADX INFO: renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0077a extends g implements p200u8.b {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0077a(String str, d<? super C0077a> dVar) {
            super(1, dVar);
            this.$name = str;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new C0077a(this.$name, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j6.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((C0077a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends g implements p200u8.b {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f10, d<? super b> dVar) {
            super(1, dVar);
            this.$name = str;
            this.$value = f10;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new b(this.$name, this.$value, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j6.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f10 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f10, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class c extends g implements p200u8.b {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, d<? super c> dVar) {
            super(1, dVar);
            this.$name = str;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new c(this.$name, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j6.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((c) create(dVar)).invokeSuspend(m.a);
        }
    }

    public a(j6.b bVar) {
        i.f(bVar, "_outcomeController");
        this._outcomeController = bVar;
    }

    @Override // p065g6.a
    public void addOutcome(String str) {
        i.f(str, MediationMetaData.KEY_NAME);
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "sendOutcome(name: " + str + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0077a(str, null), 1, null);
    }

    @Override // p065g6.a
    public void addOutcomeWithValue(String str, float f10) {
        i.f(str, MediationMetaData.KEY_NAME);
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "sendOutcomeWithValue(name: " + str + ", value: " + f10 + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(str, f10, null), 1, null);
    }

    @Override // p065g6.a
    public void addUniqueOutcome(String str) {
        i.f(str, MediationMetaData.KEY_NAME);
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "sendUniqueOutcome(name: " + str + ')');
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }
}
