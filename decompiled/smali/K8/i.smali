.class public final LK8/i;
.super LI8/i;
.source "SourceFile"


# static fields
.field public static final synthetic h:[LC8/u;


# instance fields
.field public f:LI8/l;

.field public final g:Lz9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lv8/n;

    .line 2
    .line 3
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 4
    .line 5
    const-class v2, LK8/i;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "customizer"

    .line 12
    .line 13
    const-string v4, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    .line 14
    .line 15
    invoke-direct {v0, v2, v3, v4}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    new-array v1, v1, [LC8/u;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aput-object v0, v1, v2

    .line 27
    .line 28
    sput-object v1, LK8/i;->h:[LC8/u;

    .line 29
    .line 30
    return-void
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

.method public constructor <init>(Lz9/l;)V
    .locals 3

    .line 1
    const-string v0, "kind"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, LI8/i;-><init>(Lz9/l;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, LA9/A;

    .line 11
    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    invoke-direct {v0, p0, v2, p1}, LA9/A;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lz9/i;

    .line 18
    .line 19
    invoke-direct {v2, p1, v0}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, LK8/i;->g:Lz9/i;

    .line 23
    .line 24
    invoke-static {v1}, Lz/e;->d(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eq p1, v1, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {p0}, LI8/i;->c()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, LI8/i;->c()V

    .line 39
    .line 40
    .line 41
    return-void
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public final J()LK8/n;
    .locals 2

    .line 1
    sget-object v0, LK8/i;->h:[LC8/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, LK8/i;->g:Lz9/i;

    .line 7
    .line 8
    invoke-static {v1, v0}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LK8/n;

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

.method public final d()LN8/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK8/i;->J()LK8/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final l()Ljava/lang/Iterable;
    .locals 5

    .line 1
    invoke-super {p0}, LI8/i;->l()Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LK8/g;

    .line 6
    .line 7
    iget-object v2, p0, LI8/i;->d:Lz9/l;

    .line 8
    .line 9
    invoke-virtual {p0}, LI8/i;->k()LO8/C;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, "builtInsModule"

    .line 14
    .line 15
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, LK8/g;-><init>(Lz9/l;LO8/C;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Li8/k;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
    .line 26
.end method

.method public final p()LN8/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK8/i;->J()LK8/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
