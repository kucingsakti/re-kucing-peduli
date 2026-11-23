.class public final Lcom/google/android/gms/measurement/internal/zzmh;
.super LM2/n;
.source "SourceFile"


# instance fields
.field public u:Lcom/google/android/gms/internal/measurement/zzcz;

.field public v:Z

.field public final w:LA1/r;

.field public final x:LM2/k0;

.field public final y:Lo1/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzhj;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LM2/n;-><init>(Lcom/google/android/gms/measurement/internal/zzhj;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzmh;->v:Z

    .line 6
    .line 7
    new-instance p1, LA1/r;

    .line 8
    .line 9
    const/16 v0, 0x17

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, LA1/r;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzmh;->w:LA1/r;

    .line 15
    .line 16
    new-instance p1, LM2/k0;

    .line 17
    .line 18
    invoke-direct {p1, p0}, LM2/k0;-><init>(Lcom/google/android/gms/measurement/internal/zzmh;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzmh;->x:LM2/k0;

    .line 22
    .line 23
    new-instance p1, Lo1/c;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lo1/c;-><init>(Lcom/google/android/gms/measurement/internal/zzmh;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzmh;->y:Lo1/c;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final c1()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public final d1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LM2/o;->W0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzmh;->u:Lcom/google/android/gms/internal/measurement/zzcz;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcz;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcz;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzmh;->u:Lcom/google/android/gms/internal/measurement/zzcz;

    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
