.class public final LM2/l0;
.super LM2/i;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LM2/M;I)V
    .locals 0

    .line 1
    iput p3, p0, LM2/l0;->e:I

    iput-object p1, p0, LM2/l0;->f:Ljava/lang/Object;

    invoke-direct {p0, p2}, LM2/i;-><init>(LM2/M;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LM2/l0;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/l0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzmw;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzmw;->d1()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "Starting upload from DelayedRunnable"

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, LM2/n0;->t:Lcom/google/android/gms/measurement/internal/zznc;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zznc;->d0()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, LM2/l0;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LM2/k0;

    .line 33
    .line 34
    iget-object v1, v0, LM2/k0;->d:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 35
    .line 36
    invoke-virtual {v1}, LM2/o;->W0()V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, LM2/k0;->d:Lcom/google/android/gms/measurement/internal/zzmh;

    .line 40
    .line 41
    iget-object v2, v1, LB1/a;->s:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 44
    .line 45
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzhj;->F:Lcom/google/android/gms/common/util/DefaultClock;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-virtual {v0, v4, v4, v2, v3}, LM2/k0;->a(ZZJ)Z

    .line 56
    .line 57
    .line 58
    iget-object v0, v1, LB1/a;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->m()Lcom/google/android/gms/measurement/internal/zzb;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzhj;->F:Lcom/google/android/gms/common/util/DefaultClock;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzb;->a1(J)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
