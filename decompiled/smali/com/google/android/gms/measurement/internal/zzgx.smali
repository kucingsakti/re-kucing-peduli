.class public final synthetic Lcom/google/android/gms/measurement/internal/zzgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic s:Lcom/google/android/gms/measurement/internal/zzgt;

.field public synthetic t:Ljava/lang/String;


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzx;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzgv;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgx;->s:Lcom/google/android/gms/measurement/internal/zzgt;

    .line 9
    .line 10
    iput-object v2, v1, Lcom/google/android/gms/measurement/internal/zzgv;->s:Lcom/google/android/gms/measurement/internal/zzgt;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgx;->t:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v2, v1, Lcom/google/android/gms/measurement/internal/zzgv;->t:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzx;-><init>(Lcom/google/android/gms/measurement/internal/zzgv;)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
