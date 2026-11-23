.class public final Lcom/google/android/gms/internal/measurement/zzr;
.super Lcom/google/android/gms/internal/measurement/zzal;
.source "SourceFile"


# instance fields
.field public final u:Le1/j;


# direct methods
.method public constructor <init>(Le1/j;)V
    .locals 6

    .line 1
    const-string v0, "internal.logger"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzal;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzr;->u:Le1/j;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzal;->t:Ljava/util/HashMap;

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/measurement/S0;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/measurement/S0;-><init>(Lcom/google/android/gms/internal/measurement/zzr;ZZ)V

    .line 15
    .line 16
    .line 17
    const-string v3, "log"

    .line 18
    .line 19
    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzal;->t:Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance v0, Lcom/google/android/gms/internal/measurement/a;

    .line 25
    .line 26
    const-string v4, "silent"

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-direct {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/a;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzal;->t:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzal;

    .line 42
    .line 43
    new-instance v0, Lcom/google/android/gms/internal/measurement/S0;

    .line 44
    .line 45
    invoke-direct {v0, p0, v2, v2}, Lcom/google/android/gms/internal/measurement/S0;-><init>(Lcom/google/android/gms/internal/measurement/zzr;ZZ)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/zzal;->n(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzal;->t:Ljava/util/HashMap;

    .line 52
    .line 53
    new-instance v0, Lcom/google/android/gms/internal/measurement/a;

    .line 54
    .line 55
    const-string v2, "unmonitored"

    .line 56
    .line 57
    const/4 v4, 0x2

    .line 58
    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/internal/measurement/a;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzal;->t:Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzal;

    .line 71
    .line 72
    new-instance v0, Lcom/google/android/gms/internal/measurement/S0;

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v1}, Lcom/google/android/gms/internal/measurement/S0;-><init>(Lcom/google/android/gms/internal/measurement/zzr;ZZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/zzal;->n(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 78
    .line 79
    .line 80
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 0

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method
