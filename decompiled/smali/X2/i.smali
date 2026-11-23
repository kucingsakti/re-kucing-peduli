.class public LX2/i;
.super Li/G;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li/G;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method


# virtual methods
.method public final g0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/o;->E0:Landroid/app/Dialog;

    .line 2
    .line 3
    instance-of v1, v0, LX2/h;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    check-cast v0, LX2/h;

    .line 8
    .line 9
    iget-object v1, v0, LX2/h;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LX2/h;->h()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, v0, LX2/h;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 17
    .line 18
    iget-boolean v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Z

    .line 19
    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0, v0}, Lq0/o;->i0(ZZ)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/o;->E0:Landroid/app/Dialog;

    .line 2
    .line 3
    instance-of v1, v0, LX2/h;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    check-cast v0, LX2/h;

    .line 8
    .line 9
    iget-object v1, v0, LX2/h;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LX2/h;->h()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, v0, LX2/h;->x:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 17
    .line 18
    iget-boolean v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Z

    .line 19
    .line 20
    :cond_1
    invoke-super {p0}, Lq0/o;->h0()V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method

.method public k0()Landroid/app/Dialog;
    .locals 3

    .line 1
    new-instance v0, LX2/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/b;->m()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lq0/o;->j0()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, LX2/h;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method
