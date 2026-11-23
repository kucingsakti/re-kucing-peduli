.class public final LM2/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:J

.field public final synthetic u:Lcom/google/android/gms/measurement/internal/zziv;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zziv;JI)V
    .locals 0

    .line 1
    iput p4, p0, LM2/S;->s:I

    iput-wide p2, p0, LM2/S;->t:J

    iput-object p1, p0, LM2/S;->u:Lcom/google/android/gms/measurement/internal/zziv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LM2/S;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, LM2/S;->u:Lcom/google/android/gms/measurement/internal/zziv;

    .line 8
    .line 9
    iget-wide v2, p0, LM2/S;->t:J

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zziv;->f1(JZ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, LB1/a;->s:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzkx;->g1(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, LM2/S;->u:Lcom/google/android/gms/measurement/internal/zziv;

    .line 32
    .line 33
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, LM2/w;->D:Lcom/google/android/gms/measurement/internal/zzgm;

    .line 38
    .line 39
    iget-wide v2, p0, LM2/S;->t:J

    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzgm;->b(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->E:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 53
    .line 54
    const-string v2, "Session timeout duration set"

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
