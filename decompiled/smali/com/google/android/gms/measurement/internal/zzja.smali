.class public final synthetic Lcom/google/android/gms/measurement/internal/zzja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic s:Lcom/google/android/gms/measurement/internal/zziv;

.field public synthetic t:Ljava/util/concurrent/atomic/AtomicReference;


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzja;->s:Lcom/google/android/gms/measurement/internal/zziv;

    .line 2
    .line 3
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LM2/w;->G:Lcom/google/android/gms/measurement/internal/zzgj;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgj;->a()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v0, v0, LB1/a;->s:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    :cond_0
    move-object v6, v1

    .line 29
    invoke-virtual {v3}, LM2/o;->W0()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, LM2/n;->a1()V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {v3, v0}, Lcom/google/android/gms/measurement/internal/zzkx;->p1(Z)Lcom/google/android/gms/measurement/internal/zzo;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    new-instance v2, LM2/y;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzja;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    invoke-direct/range {v2 .. v7}, LM2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
