.class public final LB9/h;
.super LA9/D;
.source "SourceFile"

# interfaces
.implements LD9/b;


# instance fields
.field public final t:I

.field public final u:LB9/j;

.field public final v:LA9/d0;

.field public final w:LA9/K;

.field public final x:Z

.field public final y:Z


# direct methods
.method public constructor <init>(ILB9/j;LA9/d0;LA9/K;ZI)V
    .locals 7

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_0

    .line 8
    sget-object p4, LA9/K;->t:Lo1/c;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    sget-object p4, LA9/K;->u:LA9/K;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 10
    invoke-direct/range {v0 .. v6}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZZ)V

    return-void
.end method

.method public constructor <init>(ILB9/j;LA9/d0;LA9/K;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LB9/h;->t:I

    .line 3
    iput-object p2, p0, LB9/h;->u:LB9/j;

    .line 4
    iput-object p3, p0, LB9/h;->v:LA9/d0;

    .line 5
    iput-object p4, p0, LB9/h;->w:LA9/K;

    .line 6
    iput-boolean p5, p0, LB9/h;->x:Z

    .line 7
    iput-boolean p6, p0, LB9/h;->y:Z

    return-void
.end method


# virtual methods
.method public final D()LA9/O;
    .locals 1

    .line 1
    iget-object v0, p0, LB9/h;->u:LB9/j;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final E0()Lt9/n;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-static {v1, v1, v0}, LC9/i;->a(IZ[Ljava/lang/String;)LC9/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final G0(Z)LA9/d0;
    .locals 7

    .line 1
    new-instance v0, LB9/h;

    .line 2
    .line 3
    iget-object v2, p0, LB9/h;->u:LB9/j;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget v1, p0, LB9/h;->t:I

    .line 8
    .line 9
    iget-object v3, p0, LB9/h;->v:LA9/d0;

    .line 10
    .line 11
    iget-object v4, p0, LB9/h;->w:LA9/K;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB9/h;->x:Z

    .line 2
    .line 3
    return v0
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
.end method

.method public final bridge synthetic K0(LB9/f;)LA9/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LB9/h;->Q0(LB9/f;)LB9/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public final O0(Z)LA9/D;
    .locals 7

    .line 1
    new-instance v0, LB9/h;

    .line 2
    .line 3
    iget-object v2, p0, LB9/h;->u:LB9/j;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget v1, p0, LB9/h;->t:I

    .line 8
    .line 9
    iget-object v3, p0, LB9/h;->v:LA9/d0;

    .line 10
    .line 11
    iget-object v4, p0, LB9/h;->w:LA9/K;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
.end method

.method public final P0(LA9/K;)LA9/D;
    .locals 8

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LB9/h;

    .line 7
    .line 8
    iget-object v4, p0, LB9/h;->v:LA9/d0;

    .line 9
    .line 10
    iget-boolean v6, p0, LB9/h;->x:Z

    .line 11
    .line 12
    iget v2, p0, LB9/h;->t:I

    .line 13
    .line 14
    iget-object v3, p0, LB9/h;->u:LB9/j;

    .line 15
    .line 16
    iget-boolean v7, p0, LB9/h;->y:Z

    .line 17
    .line 18
    move-object v5, p1

    .line 19
    invoke-direct/range {v1 .. v7}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZZ)V

    .line 20
    .line 21
    .line 22
    return-object v1
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
.end method

.method public final Q0(LB9/f;)LB9/h;
    .locals 11

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB9/h;->u:LB9/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, LB9/j;->a:LA9/S;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, LA9/S;->d(LB9/f;)LA9/S;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, LB9/j;->b:Lu8/a;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v2, LA9/A;

    .line 23
    .line 24
    invoke-direct {v2, v0, p1}, LA9/A;-><init>(LB9/j;LB9/f;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v3

    .line 29
    :goto_0
    iget-object p1, v0, LB9/j;->c:LB9/j;

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :cond_1
    new-instance v6, LB9/j;

    .line 35
    .line 36
    iget-object v0, v0, LB9/j;->d:LL8/P;

    .line 37
    .line 38
    invoke-direct {v6, v1, v2, p1, v0}, LB9/j;-><init>(LA9/S;Lu8/a;LB9/j;LL8/P;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, LB9/h;->v:LA9/d0;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    move-object v7, p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v7, v3

    .line 48
    :goto_1
    new-instance v4, LB9/h;

    .line 49
    .line 50
    iget-boolean v9, p0, LB9/h;->x:Z

    .line 51
    .line 52
    const/16 v10, 0x20

    .line 53
    .line 54
    iget v5, p0, LB9/h;->t:I

    .line 55
    .line 56
    iget-object v8, p0, LB9/h;->w:LA9/K;

    .line 57
    .line 58
    invoke-direct/range {v4 .. v10}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZI)V

    .line 59
    .line 60
    .line 61
    return-object v4
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Li8/s;->s:Li8/s;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final bridge synthetic l0(LB9/f;)LA9/y;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LB9/h;->Q0(LB9/f;)LB9/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public final o()LA9/K;
    .locals 1

    .line 1
    iget-object v0, p0, LB9/h;->w:LA9/K;

    .line 2
    .line 3
    return-object v0
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
.end method
