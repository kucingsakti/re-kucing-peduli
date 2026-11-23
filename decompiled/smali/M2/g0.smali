.class public final LM2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/google/android/gms/measurement/internal/zzlw;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzlw;I)V
    .locals 0

    .line 1
    iput p2, p0, LM2/g0;->s:I

    iput-object p1, p0, LM2/g0;->t:Lcom/google/android/gms/measurement/internal/zzlw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LM2/g0;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/g0;->t:Lcom/google/android/gms/measurement/internal/zzlw;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzlw;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 9
    .line 10
    new-instance v2, Landroid/content/ComponentName;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzlw;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 13
    .line 14
    iget-object v0, v0, LB1/a;->s:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzhj;->s:Landroid/content/Context;

    .line 19
    .line 20
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 34
    .line 35
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v3, "Disconnected from device MeasurementService"

    .line 40
    .line 41
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzkx;->i1()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, LM2/g0;->t:Lcom/google/android/gms/measurement/internal/zzlw;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzlw;->u:Lcom/google/android/gms/measurement/internal/zzkx;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/zzkx;->v:Lcom/google/android/gms/measurement/internal/zzfl;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkx;->n1()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
