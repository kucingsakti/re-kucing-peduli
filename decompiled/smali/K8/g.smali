.class public final LK8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN8/c;


# static fields
.field public static final d:LK8/e;

.field public static final synthetic e:[LC8/u;

.field public static final f:Lj9/c;

.field public static final g:Lj9/f;

.field public static final h:Lj9/b;


# instance fields
.field public final a:LO8/C;

.field public final b:Lu8/b;

.field public final c:Lz9/i;


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
    const-class v2, LK8/g;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "cloneable"

    .line 12
    .line 13
    const-string v4, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

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
    sput-object v1, LK8/g;->e:[LC8/u;

    .line 29
    .line 30
    new-instance v0, LK8/e;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, LK8/g;->d:LK8/e;

    .line 36
    .line 37
    sget-object v0, LI8/o;->k:Lj9/c;

    .line 38
    .line 39
    sput-object v0, LK8/g;->f:Lj9/c;

    .line 40
    .line 41
    sget-object v0, LI8/n;->c:Lj9/e;

    .line 42
    .line 43
    invoke-virtual {v0}, Lj9/e;->f()Lj9/f;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "cloneable.shortName()"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, LK8/g;->g:Lj9/f;

    .line 53
    .line 54
    invoke-virtual {v0}, Lj9/e;->g()Lj9/c;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LK8/g;->h:Lj9/b;

    .line 63
    .line 64
    return-void
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

.method public constructor <init>(Lz9/l;LO8/C;)V
    .locals 1

    .line 1
    sget-object v0, LK8/f;->s:LK8/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LK8/g;->a:LO8/C;

    .line 7
    .line 8
    iput-object v0, p0, LK8/g;->b:Lu8/b;

    .line 9
    .line 10
    new-instance p2, LA9/A;

    .line 11
    .line 12
    const/16 v0, 0x12

    .line 13
    .line 14
    invoke-direct {p2, p0, v0, p1}, LA9/A;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lz9/i;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LK8/g;->c:Lz9/i;

    .line 23
    .line 24
    return-void
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


# virtual methods
.method public final a(Lj9/b;)LL8/e;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK8/g;->h:Lj9/b;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lj9/b;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LK8/g;->c:Lz9/i;

    .line 15
    .line 16
    sget-object v0, LK8/g;->e:[LC8/u;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aget-object v0, v0, v1

    .line 20
    .line 21
    invoke-static {p1, v0}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LO8/m;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final b(Lj9/c;Lj9/f;)Z
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LK8/g;->g:Lj9/f;

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Lj9/f;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p2, LK8/g;->f:Lj9/c;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lj9/c;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
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

.method public final c(Lj9/c;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK8/g;->f:Lj9/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lj9/c;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LK8/g;->c:Lz9/i;

    .line 15
    .line 16
    sget-object v0, LK8/g;->e:[LC8/u;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aget-object v0, v0, v1

    .line 20
    .line 21
    invoke-static {p1, v0}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LO8/m;

    .line 26
    .line 27
    invoke-static {p1}, Li8/C;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    sget-object p1, Li8/u;->s:Li8/u;

    .line 33
    .line 34
    return-object p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
