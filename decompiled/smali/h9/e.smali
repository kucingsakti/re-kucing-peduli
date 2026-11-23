.class public final Lh9/e;
.super Lk9/n;
.source "SourceFile"


# static fields
.field public static final B:Lh9/e;

.field public static final C:Le9/a;


# instance fields
.field public A:I

.field public final s:Lk9/d;

.field public t:I

.field public u:Lh9/b;

.field public v:Lh9/c;

.field public w:Lh9/c;

.field public x:Lh9/c;

.field public y:Lh9/c;

.field public z:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/a;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le9/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh9/e;->C:Le9/a;

    .line 9
    .line 10
    new-instance v0, Lh9/e;

    .line 11
    .line 12
    invoke-direct {v0}, Lh9/e;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh9/e;->B:Lh9/e;

    .line 16
    .line 17
    sget-object v1, Lh9/b;->y:Lh9/b;

    .line 18
    .line 19
    iput-object v1, v0, Lh9/e;->u:Lh9/b;

    .line 20
    .line 21
    sget-object v1, Lh9/c;->y:Lh9/c;

    .line 22
    .line 23
    iput-object v1, v0, Lh9/e;->v:Lh9/c;

    .line 24
    .line 25
    iput-object v1, v0, Lh9/e;->w:Lh9/c;

    .line 26
    .line 27
    iput-object v1, v0, Lh9/e;->x:Lh9/c;

    .line 28
    .line 29
    iput-object v1, v0, Lh9/e;->y:Lh9/c;

    .line 30
    .line 31
    return-void
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
    iput-byte v0, p0, Lh9/e;->z:B

    .line 3
    iput v0, p0, Lh9/e;->A:I

    .line 4
    sget-object v0, Lk9/d;->s:Lk9/s;

    iput-object v0, p0, Lh9/e;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lh9/d;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lh9/e;->z:B

    .line 7
    iput v0, p0, Lh9/e;->A:I

    .line 8
    iget-object p1, p1, Lk9/i;->s:Lk9/d;

    .line 9
    iput-object p1, p0, Lh9/e;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lk9/e;Lk9/g;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lh9/e;->z:B

    .line 12
    iput v0, p0, Lh9/e;->A:I

    .line 13
    sget-object v0, Lh9/b;->y:Lh9/b;

    .line 14
    iput-object v0, p0, Lh9/e;->u:Lh9/b;

    .line 15
    sget-object v0, Lh9/c;->y:Lh9/c;

    .line 16
    iput-object v0, p0, Lh9/e;->v:Lh9/c;

    .line 17
    iput-object v0, p0, Lh9/e;->w:Lh9/c;

    .line 18
    iput-object v0, p0, Lh9/e;->x:Lh9/c;

    .line 19
    iput-object v0, p0, Lh9/e;->y:Lh9/c;

    .line 20
    new-instance v0, Lk9/c;

    invoke-direct {v0}, Lk9/c;-><init>()V

    const/4 v1, 0x1

    .line 21
    invoke-static {v0, v1}, LB4/b;->j(Ljava/io/OutputStream;I)LB4/b;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_11

    .line 22
    :try_start_0
    invoke-virtual {p1}, Lk9/e;->n()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

    if-eq v4, v5, :cond_2

    .line 23
    invoke-virtual {p1, v4, v2}, Lk9/e;->q(ILB4/b;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    .line 24
    :cond_2
    iget v4, p0, Lh9/e;->t:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 25
    iget-object v4, p0, Lh9/e;->y:Lh9/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {v4}, Lh9/c;->h(Lh9/c;)Lh9/a;

    move-result-object v6

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    .line 27
    :cond_3
    :goto_1
    sget-object v4, Lh9/c;->z:Le9/a;

    invoke-virtual {p1, v4, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v4

    check-cast v4, Lh9/c;

    iput-object v4, p0, Lh9/e;->y:Lh9/c;

    if-eqz v6, :cond_4

    .line 28
    invoke-virtual {v6, v4}, Lh9/a;->j(Lh9/c;)V

    .line 29
    invoke-virtual {v6}, Lh9/a;->h()Lh9/c;

    move-result-object v4

    iput-object v4, p0, Lh9/e;->y:Lh9/c;

    .line 30
    :cond_4
    iget v4, p0, Lh9/e;->t:I

    or-int/2addr v4, v5

    iput v4, p0, Lh9/e;->t:I

    goto :goto_0

    .line 31
    :cond_5
    iget v4, p0, Lh9/e;->t:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    .line 32
    iget-object v4, p0, Lh9/e;->x:Lh9/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-static {v4}, Lh9/c;->h(Lh9/c;)Lh9/a;

    move-result-object v6

    .line 34
    :cond_6
    sget-object v4, Lh9/c;->z:Le9/a;

    invoke-virtual {p1, v4, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v4

    check-cast v4, Lh9/c;

    iput-object v4, p0, Lh9/e;->x:Lh9/c;

    if-eqz v6, :cond_7

    .line 35
    invoke-virtual {v6, v4}, Lh9/a;->j(Lh9/c;)V

    .line 36
    invoke-virtual {v6}, Lh9/a;->h()Lh9/c;

    move-result-object v4

    iput-object v4, p0, Lh9/e;->x:Lh9/c;

    .line 37
    :cond_7
    iget v4, p0, Lh9/e;->t:I

    or-int/2addr v4, v5

    iput v4, p0, Lh9/e;->t:I

    goto/16 :goto_0

    .line 38
    :cond_8
    iget v4, p0, Lh9/e;->t:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    .line 39
    iget-object v4, p0, Lh9/e;->w:Lh9/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {v4}, Lh9/c;->h(Lh9/c;)Lh9/a;

    move-result-object v6

    .line 41
    :cond_9
    sget-object v4, Lh9/c;->z:Le9/a;

    invoke-virtual {p1, v4, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v4

    check-cast v4, Lh9/c;

    iput-object v4, p0, Lh9/e;->w:Lh9/c;

    if-eqz v6, :cond_a

    .line 42
    invoke-virtual {v6, v4}, Lh9/a;->j(Lh9/c;)V

    .line 43
    invoke-virtual {v6}, Lh9/a;->h()Lh9/c;

    move-result-object v4

    iput-object v4, p0, Lh9/e;->w:Lh9/c;

    .line 44
    :cond_a
    iget v4, p0, Lh9/e;->t:I

    or-int/2addr v4, v5

    iput v4, p0, Lh9/e;->t:I

    goto/16 :goto_0

    .line 45
    :cond_b
    iget v4, p0, Lh9/e;->t:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    .line 46
    iget-object v4, p0, Lh9/e;->v:Lh9/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-static {v4}, Lh9/c;->h(Lh9/c;)Lh9/a;

    move-result-object v6

    .line 48
    :cond_c
    sget-object v4, Lh9/c;->z:Le9/a;

    invoke-virtual {p1, v4, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v4

    check-cast v4, Lh9/c;

    iput-object v4, p0, Lh9/e;->v:Lh9/c;

    if-eqz v6, :cond_d

    .line 49
    invoke-virtual {v6, v4}, Lh9/a;->j(Lh9/c;)V

    .line 50
    invoke-virtual {v6}, Lh9/a;->h()Lh9/c;

    move-result-object v4

    iput-object v4, p0, Lh9/e;->v:Lh9/c;

    .line 51
    :cond_d
    iget v4, p0, Lh9/e;->t:I

    or-int/2addr v4, v5

    iput v4, p0, Lh9/e;->t:I

    goto/16 :goto_0

    .line 52
    :cond_e
    iget v4, p0, Lh9/e;->t:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    .line 53
    iget-object v4, p0, Lh9/e;->u:Lh9/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    new-instance v6, Lh9/a;

    const/4 v5, 0x0

    .line 55
    invoke-direct {v6, v5}, Lh9/a;-><init>(I)V

    .line 56
    invoke-virtual {v6, v4}, Lh9/a;->i(Lh9/b;)V

    .line 57
    :cond_f
    sget-object v4, Lh9/b;->z:Le9/a;

    invoke-virtual {p1, v4, p2}, Lk9/e;->g(Lk9/u;Lk9/g;)Lk9/a;

    move-result-object v4

    check-cast v4, Lh9/b;

    iput-object v4, p0, Lh9/e;->u:Lh9/b;

    if-eqz v6, :cond_10

    .line 58
    invoke-virtual {v6, v4}, Lh9/a;->i(Lh9/b;)V

    .line 59
    invoke-virtual {v6}, Lh9/a;->f()Lh9/b;

    move-result-object v4

    iput-object v4, p0, Lh9/e;->u:Lh9/b;

    .line 60
    :cond_10
    iget v4, p0, Lh9/e;->t:I

    or-int/2addr v4, v1

    iput v4, p0, Lh9/e;->t:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 61
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 63
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 64
    throw p2

    .line 65
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 66
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :goto_4
    :try_start_2
    invoke-virtual {v2}, LB4/b;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    :catch_2
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Lh9/e;->s:Lk9/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Lh9/e;->s:Lk9/d;

    .line 69
    throw p1

    .line 70
    :goto_5
    throw p1

    .line 71
    :cond_11
    :try_start_3
    invoke-virtual {v2}, LB4/b;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 72
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Lh9/e;->s:Lk9/d;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Lh9/e;->s:Lk9/d;

    .line 73
    throw p1

    .line 74
    :catch_3
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Lh9/e;->s:Lk9/d;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 4

    .line 1
    iget v0, p0, Lh9/e;->A:I

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
    iget v0, p0, Lh9/e;->t:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lh9/e;->u:Lh9/b;

    .line 14
    .line 15
    invoke-static {v1, v0}, LB4/b;->d(ILk9/a;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lh9/e;->t:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lh9/e;->v:Lh9/c;

    .line 28
    .line 29
    invoke-static {v2, v1}, LB4/b;->d(ILk9/a;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lh9/e;->t:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v3, p0, Lh9/e;->w:Lh9/c;

    .line 42
    .line 43
    invoke-static {v1, v3}, LB4/b;->d(ILk9/a;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    iget v1, p0, Lh9/e;->t:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lh9/e;->x:Lh9/c;

    .line 56
    .line 57
    invoke-static {v2, v1}, LB4/b;->d(ILk9/a;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget v1, p0, Lh9/e;->t:I

    .line 63
    .line 64
    const/16 v2, 0x10

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget-object v2, p0, Lh9/e;->y:Lh9/c;

    .line 71
    .line 72
    invoke-static {v1, v2}, LB4/b;->d(ILk9/a;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget-object v1, p0, Lh9/e;->s:Lk9/d;

    .line 78
    .line 79
    invoke-virtual {v1}, Lk9/d;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v1, v0

    .line 84
    iput v1, p0, Lh9/e;->A:I

    .line 85
    .line 86
    return v1
.end method

.method public final c()Lk9/i;
    .locals 1

    .line 1
    invoke-static {}, Lh9/d;->h()Lh9/d;

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
    invoke-static {}, Lh9/d;->h()Lh9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lh9/d;->i(Lh9/e;)V

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
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh9/e;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh9/e;->t:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lh9/e;->u:Lh9/b;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LB4/b;->o(ILk9/a;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lh9/e;->t:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lh9/e;->v:Lh9/c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, LB4/b;->o(ILk9/a;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lh9/e;->t:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    iget-object v2, p0, Lh9/e;->w:Lh9/c;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, LB4/b;->o(ILk9/a;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v0, p0, Lh9/e;->t:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    and-int/2addr v0, v2

    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Lh9/e;->x:Lh9/c;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, LB4/b;->o(ILk9/a;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v0, p0, Lh9/e;->t:I

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    and-int/2addr v0, v1

    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    iget-object v1, p0, Lh9/e;->y:Lh9/c;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, LB4/b;->o(ILk9/a;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, Lh9/e;->s:Lk9/d;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, LB4/b;->r(Lk9/d;)V

    .line 66
    .line 67
    .line 68
    return-void
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
    .locals 2

    .line 1
    iget-byte v0, p0, Lh9/e;->z:B

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
    iput-byte v1, p0, Lh9/e;->z:B

    .line 8
    .line 9
    return v1
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
