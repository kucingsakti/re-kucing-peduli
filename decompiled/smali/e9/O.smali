.class public final Le9/O;
.super Lk9/n;
.source "SourceFile"


# static fields
.field public static final A:Le9/a;

.field public static final z:Le9/O;


# instance fields
.field public final s:Lk9/d;

.field public t:I

.field public u:Le9/N;

.field public v:Le9/Q;

.field public w:I

.field public x:B

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/a;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le9/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Le9/O;->A:Le9/a;

    .line 9
    .line 10
    new-instance v0, Le9/O;

    .line 11
    .line 12
    invoke-direct {v0}, Le9/O;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Le9/O;->z:Le9/O;

    .line 16
    .line 17
    sget-object v1, Le9/N;->v:Le9/N;

    .line 18
    .line 19
    iput-object v1, v0, Le9/O;->u:Le9/N;

    .line 20
    .line 21
    sget-object v1, Le9/Q;->L:Le9/Q;

    .line 22
    .line 23
    iput-object v1, v0, Le9/O;->v:Le9/Q;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput v1, v0, Le9/O;->w:I

    .line 27
    .line 28
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Le9/O;->x:B

    .line 3
    iput v0, p0, Le9/O;->y:I

    .line 4
    sget-object v0, Lk9/d;->s:Lk9/s;

    iput-object v0, p0, Le9/O;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Le9/M;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Le9/O;->x:B

    .line 7
    iput v0, p0, Le9/O;->y:I

    .line 8
    iget-object p1, p1, Lk9/i;->s:Lk9/d;

    .line 9
    iput-object p1, p0, Le9/O;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lk9/e;Lk9/g;)V
    .locals 9

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Le9/O;->x:B

    .line 12
    iput v0, p0, Le9/O;->y:I

    .line 13
    sget-object v0, Le9/N;->v:Le9/N;

    iput-object v0, p0, Le9/O;->u:Le9/N;

    .line 14
    sget-object v1, Le9/Q;->L:Le9/Q;

    .line 15
    iput-object v1, p0, Le9/O;->v:Le9/Q;

    const/4 v1, 0x0

    .line 16
    iput v1, p0, Le9/O;->w:I

    .line 17
    new-instance v2, Lk9/c;

    invoke-direct {v2}, Lk9/c;-><init>()V

    const/4 v3, 0x1

    .line 18
    invoke-static {v2, v3}, LB4/b;->j(Ljava/io/OutputStream;I)LB4/b;

    move-result-object v4

    :cond_0
    :goto_0
    if-nez v1, :cond_c

    .line 19
    :try_start_0
    invoke-virtual {p1}, Lk9/e;->n()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eq v5, v6, :cond_6

    const/16 v6, 0x12

    if-eq v5, v6, :cond_3

    const/16 v6, 0x18

    if-eq v5, v6, :cond_2

    .line 20
    invoke-virtual {p1, v5, v4}, Lk9/e;->q(ILB4/b;)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v1, v3

    goto :goto_0

    .line 21
    :cond_2
    iget v5, p0, Le9/O;->t:I

    or-int/lit8 v5, v5, 0x4

    iput v5, p0, Le9/O;->t:I

    .line 22
    invoke-virtual {p1}, Lk9/e;->k()I

    move-result v5

    .line 23
    iput v5, p0, Le9/O;->w:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 24
    :cond_3
    iget v5, p0, Le9/O;->t:I

    and-int/2addr v5, v8

    if-ne v5, v8, :cond_4

    .line 25
    iget-object v5, p0, Le9/O;->v:Le9/Q;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {v5}, Le9/Q;->q(Le9/Q;)Le9/P;

    move-result-object v7

    .line 27
    :cond_4
    sget-object v5, Le9/Q;->M:Le9/a;

    invoke-virtual {p1, v5, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v5

    check-cast v5, Le9/Q;

    iput-object v5, p0, Le9/O;->v:Le9/Q;

    if-eqz v7, :cond_5

    .line 28
    invoke-virtual {v7, v5}, Le9/P;->j(Le9/Q;)Le9/P;

    .line 29
    invoke-virtual {v7}, Le9/P;->h()Le9/Q;

    move-result-object v5

    iput-object v5, p0, Le9/O;->v:Le9/Q;

    .line 30
    :cond_5
    iget v5, p0, Le9/O;->t:I

    or-int/2addr v5, v8

    iput v5, p0, Le9/O;->t:I

    goto :goto_0

    .line 31
    :cond_6
    invoke-virtual {p1}, Lk9/e;->k()I

    move-result v6

    if-eqz v6, :cond_a

    if-eq v6, v3, :cond_9

    if-eq v6, v8, :cond_8

    const/4 v8, 0x3

    if-eq v6, v8, :cond_7

    goto :goto_1

    .line 32
    :cond_7
    sget-object v7, Le9/N;->w:Le9/N;

    goto :goto_1

    :cond_8
    move-object v7, v0

    goto :goto_1

    .line 33
    :cond_9
    sget-object v7, Le9/N;->u:Le9/N;

    goto :goto_1

    .line 34
    :cond_a
    sget-object v7, Le9/N;->t:Le9/N;

    :goto_1
    if-nez v7, :cond_b

    .line 35
    invoke-virtual {v4, v5}, LB4/b;->v(I)V

    .line 36
    invoke-virtual {v4, v6}, LB4/b;->v(I)V

    goto :goto_0

    .line 37
    :cond_b
    iget v5, p0, Le9/O;->t:I

    or-int/2addr v5, v3

    iput v5, p0, Le9/O;->t:I

    .line 38
    iput-object v7, p0, Le9/O;->u:Le9/N;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 39
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 41
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 42
    throw p2

    .line 43
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 44
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :goto_4
    :try_start_2
    invoke-virtual {v4}, LB4/b;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    :catch_2
    invoke-virtual {v2}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/O;->s:Lk9/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/O;->s:Lk9/d;

    .line 47
    throw p1

    .line 48
    :goto_5
    throw p1

    .line 49
    :cond_c
    :try_start_3
    invoke-virtual {v4}, LB4/b;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    invoke-virtual {v2}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Le9/O;->s:Lk9/d;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v2}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/O;->s:Lk9/d;

    .line 51
    throw p1

    .line 52
    :catch_3
    invoke-virtual {v2}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Le9/O;->s:Lk9/d;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Le9/O;->y:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Le9/O;->t:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Le9/O;->u:Le9/N;

    .line 14
    .line 15
    iget v0, v0, Le9/N;->s:I

    .line 16
    .line 17
    invoke-static {v1, v0}, LB4/b;->a(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget v1, p0, Le9/O;->t:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    and-int/2addr v1, v2

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Le9/O;->v:Le9/Q;

    .line 30
    .line 31
    invoke-static {v2, v1}, LB4/b;->d(ILk9/a;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    :cond_2
    iget v1, p0, Le9/O;->t:I

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    and-int/2addr v1, v2

    .line 40
    if-ne v1, v2, :cond_3

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    iget v2, p0, Le9/O;->w:I

    .line 44
    .line 45
    invoke-static {v1, v2}, LB4/b;->b(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    iget-object v1, p0, Le9/O;->s:Lk9/d;

    .line 51
    .line 52
    invoke-virtual {v1}, Lk9/d;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    iput v1, p0, Le9/O;->y:I

    .line 58
    .line 59
    return v1
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

.method public final c()Lk9/i;
    .locals 1

    .line 1
    invoke-static {}, Le9/M;->h()Le9/M;

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

.method public final d()Lk9/i;
    .locals 1

    .line 1
    invoke-static {}, Le9/M;->h()Le9/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Le9/M;->i(Le9/O;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final e(LB4/b;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le9/O;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Le9/O;->t:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Le9/O;->u:Le9/N;

    .line 11
    .line 12
    iget v0, v0, Le9/N;->s:I

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, LB4/b;->l(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, Le9/O;->t:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Le9/O;->v:Le9/Q;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, LB4/b;->o(ILk9/a;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget v0, p0, Le9/O;->t:I

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    and-int/2addr v0, v1

    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    iget v1, p0, Le9/O;->w:I

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, LB4/b;->m(II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Le9/O;->s:Lk9/d;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, LB4/b;->r(Lk9/d;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public final isInitialized()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Le9/O;->x:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Le9/O;->t:I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    and-int/2addr v0, v3

    .line 15
    if-ne v0, v3, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Le9/O;->v:Le9/Q;

    .line 18
    .line 19
    invoke-virtual {v0}, Le9/Q;->isInitialized()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iput-byte v2, p0, Le9/O;->x:B

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    iput-byte v1, p0, Le9/O;->x:B

    .line 29
    .line 30
    return v1
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
