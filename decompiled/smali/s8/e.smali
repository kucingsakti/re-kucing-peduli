.class public final Ls8/e;
.super Li8/a;
.source "SourceFile"


# instance fields
.field public final u:Ljava/util/ArrayDeque;

.field public final synthetic v:LK9/k;


# direct methods
.method public constructor <init>(LK9/k;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ls8/e;->v:LK9/k;

    .line 2
    .line 3
    invoke-direct {p0}, Li8/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls8/e;->u:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    iget-object v1, p1, LK9/k;->b:Ljava/io/Serializable;

    .line 14
    .line 15
    check-cast v1, Ljava/io/File;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, LK9/k;->b:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast p1, Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ls8/e;->b(Ljava/io/File;)Ls8/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v1, p1, LK9/k;->b:Ljava/io/Serializable;

    .line 36
    .line 37
    check-cast v1, Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance v1, Ls8/c;

    .line 46
    .line 47
    iget-object p1, p1, LK9/k;->b:Ljava/io/Serializable;

    .line 48
    .line 49
    check-cast p1, Ljava/io/File;

    .line 50
    .line 51
    const-string v2, "rootFile"

    .line 52
    .line 53
    invoke-static {p1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, p1}, Ls8/f;-><init>(Ljava/io/File;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    sget-object p1, Li8/D;->u:Li8/D;

    .line 64
    .line 65
    iput-object p1, p0, Li8/a;->s:Li8/D;

    .line 66
    .line 67
    return-void
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
.method public final a()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, Ls8/e;->u:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ls8/f;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {v1}, Ls8/f;->a()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, v1, Ls8/f;->a:Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v3, p0, Ls8/e;->v:LK9/k;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const v3, 0x7fffffff

    .line 47
    .line 48
    .line 49
    if-lt v1, v3, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, v2}, Ls8/e;->b(Ljava/io/File;)Ls8/a;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    :goto_1
    move-object v0, v2

    .line 61
    :goto_2
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iput-object v0, p0, Li8/a;->t:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object v0, Li8/D;->s:Li8/D;

    .line 66
    .line 67
    iput-object v0, p0, Li8/a;->s:Li8/D;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    sget-object v0, Li8/D;->u:Li8/D;

    .line 71
    .line 72
    iput-object v0, p0, Li8/a;->s:Li8/D;

    .line 73
    .line 74
    return-void
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

.method public final b(Ljava/io/File;)Ls8/a;
    .locals 2

    .line 1
    iget-object v0, p0, Ls8/e;->v:LK9/k;

    .line 2
    .line 3
    iget-object v0, v0, LK9/k;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls8/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ls8/b;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Ls8/b;-><init>(Ls8/e;Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 23
    .line 24
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance v0, Ls8/d;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1}, Ls8/d;-><init>(Ls8/e;Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
