.class public final LA3/W;
.super LA3/t;
.source "SourceFile"


# instance fields
.field public final transient w:Ljava/lang/Object;

.field public final transient x:Ljava/lang/Object;

.field public final transient y:LA3/W;

.field public transient z:LA3/W;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1, p2}, LC3/a;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    iput-object p1, p0, LA3/W;->w:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LA3/W;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LA3/W;->y:LA3/W;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LA3/W;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LA3/W;->w:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LA3/W;->x:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, LA3/W;->y:LA3/W;

    return-void
.end method


# virtual methods
.method public final b()LA3/F;
    .locals 3

    .line 1
    new-instance v0, LA3/l;

    .line 2
    .line 3
    iget-object v1, p0, LA3/W;->w:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LA3/W;->x:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LA3/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget v1, LA3/F;->t:I

    .line 11
    .line 12
    new-instance v1, LA3/Y;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LA3/Y;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v1
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

.method public final c()LA3/F;
    .locals 2

    .line 1
    sget v0, LA3/F;->t:I

    .line 2
    .line 3
    new-instance v0, LA3/Y;

    .line 4
    .line 5
    iget-object v1, p0, LA3/W;->w:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LA3/Y;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LA3/W;->w:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LA3/W;->x:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final e()LA3/k;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v1, "should never be called"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw v0
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

.method public final forEach(Ljava/util/function/BiConsumer;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LA3/d;->t(Ljava/lang/Object;)Ljava/util/function/BiConsumer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, LA3/W;->w:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, LA3/W;->x:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, LA3/d;->y(Ljava/util/function/BiConsumer;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final g()LA3/k;
    .locals 3

    .line 1
    iget-object v0, p0, LA3/W;->y:LA3/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, LA3/W;->z:LA3/W;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, LA3/W;

    .line 11
    .line 12
    iget-object v1, p0, LA3/W;->x:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, LA3/W;->w:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, LA3/W;-><init>(Ljava/lang/Object;Ljava/lang/Object;LA3/W;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LA3/W;->z:LA3/W;

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget-object v1, v0, LA3/t;->t:LA3/F;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, LA3/W;->c()LA3/F;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, LA3/t;->t:LA3/F;

    .line 30
    .line 31
    :cond_2
    return-object v1
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

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA3/W;->w:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LA3/W;->x:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
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

.method public final size()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public final values()Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, LA3/W;->y:LA3/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, LA3/W;->z:LA3/W;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, LA3/W;

    .line 11
    .line 12
    iget-object v1, p0, LA3/W;->x:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, LA3/W;->w:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, LA3/W;-><init>(Ljava/lang/Object;Ljava/lang/Object;LA3/W;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LA3/W;->z:LA3/W;

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget-object v1, v0, LA3/t;->t:LA3/F;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, LA3/W;->c()LA3/F;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, LA3/t;->t:LA3/F;

    .line 30
    .line 31
    :cond_2
    return-object v1
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
