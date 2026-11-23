.class public final Le9/L;
.super Lk9/n;
.source "SourceFile"


# static fields
.field public static final w:Le9/L;

.field public static final x:Le9/a;


# instance fields
.field public final s:Lk9/d;

.field public t:Lk9/r;

.field public u:B

.field public v:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/a;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le9/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Le9/L;->x:Le9/a;

    .line 9
    .line 10
    new-instance v0, Le9/L;

    .line 11
    .line 12
    invoke-direct {v0}, Le9/L;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Le9/L;->w:Le9/L;

    .line 16
    .line 17
    sget-object v1, Lk9/q;->t:Lk9/E;

    .line 18
    .line 19
    iput-object v1, v0, Le9/L;->t:Lk9/r;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Le9/L;->u:B

    .line 3
    iput v0, p0, Le9/L;->v:I

    .line 4
    sget-object v0, Lk9/d;->s:Lk9/s;

    iput-object v0, p0, Le9/L;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Le9/m;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Le9/L;->u:B

    .line 7
    iput v0, p0, Le9/L;->v:I

    .line 8
    iget-object p1, p1, Lk9/i;->s:Lk9/d;

    .line 9
    iput-object p1, p0, Le9/L;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lk9/e;)V
    .locals 7

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Le9/L;->u:B

    .line 12
    iput v0, p0, Le9/L;->v:I

    .line 13
    sget-object v0, Lk9/q;->t:Lk9/E;

    iput-object v0, p0, Le9/L;->t:Lk9/r;

    .line 14
    new-instance v0, Lk9/c;

    invoke-direct {v0}, Lk9/c;-><init>()V

    const/4 v1, 0x1

    .line 15
    invoke-static {v0, v1}, LB4/b;->j(Ljava/io/OutputStream;I)LB4/b;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-nez v3, :cond_5

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lk9/e;->n()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0xa

    if-eq v5, v6, :cond_2

    .line 17
    invoke-virtual {p1, v5, v2}, Lk9/e;->q(ILB4/b;)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    .line 18
    :cond_2
    invoke-virtual {p1}, Lk9/e;->e()Lk9/s;

    move-result-object v5

    if-eq v4, v1, :cond_3

    .line 19
    new-instance v6, Lk9/q;

    invoke-direct {v6}, Lk9/q;-><init>()V

    iput-object v6, p0, Le9/L;->t:Lk9/r;

    move v4, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 20
    :cond_3
    :goto_1
    iget-object v6, p0, Le9/L;->t:Lk9/r;

    invoke-interface {v6, v5}, Lk9/r;->p(Lk9/s;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 21
    :goto_2
    :try_start_1
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p0, v3, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 24
    throw v3

    .line 25
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 26
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    if-ne v4, v1, :cond_4

    .line 27
    iget-object v1, p0, Le9/L;->t:Lk9/r;

    invoke-interface {v1}, Lk9/r;->i()Lk9/E;

    move-result-object v1

    iput-object v1, p0, Le9/L;->t:Lk9/r;

    .line 28
    :cond_4
    :try_start_2
    invoke-virtual {v2}, LB4/b;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :catch_2
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Le9/L;->s:Lk9/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Le9/L;->s:Lk9/d;

    .line 30
    throw p1

    .line 31
    :goto_5
    throw p1

    :cond_5
    if-ne v4, v1, :cond_6

    .line 32
    iget-object p1, p0, Le9/L;->t:Lk9/r;

    invoke-interface {p1}, Lk9/r;->i()Lk9/E;

    move-result-object p1

    iput-object p1, p0, Le9/L;->t:Lk9/r;

    .line 33
    :cond_6
    :try_start_3
    invoke-virtual {v2}, LB4/b;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 34
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Le9/L;->s:Lk9/d;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Le9/L;->s:Lk9/d;

    .line 35
    throw p1

    .line 36
    :catch_3
    invoke-virtual {v0}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Le9/L;->s:Lk9/d;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 4

    .line 1
    iget v0, p0, Le9/L;->v:I

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget-object v2, p0, Le9/L;->t:Lk9/r;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Le9/L;->t:Lk9/r;

    .line 18
    .line 19
    invoke-interface {v2, v0}, Lk9/r;->A(I)Lk9/d;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Lk9/d;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v3}, LB4/b;->f(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v2}, Lk9/d;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v3

    .line 36
    add-int/2addr v1, v2

    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p0, Le9/L;->t:Lk9/r;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v0, v1

    .line 47
    iget-object v1, p0, Le9/L;->s:Lk9/d;

    .line 48
    .line 49
    invoke-virtual {v1}, Lk9/d;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, v0

    .line 54
    iput v1, p0, Le9/L;->v:I

    .line 55
    .line 56
    return v1
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

.method public final c()Lk9/i;
    .locals 2

    .line 1
    new-instance v0, Le9/m;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Le9/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lk9/q;->t:Lk9/E;

    .line 8
    .line 9
    iput-object v1, v0, Le9/m;->v:Ljava/util/List;

    .line 10
    .line 11
    return-object v0
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
    .locals 2

    .line 1
    new-instance v0, Le9/m;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Le9/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lk9/q;->t:Lk9/E;

    .line 8
    .line 9
    iput-object v1, v0, Le9/m;->v:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Le9/m;->m(Le9/L;)V

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

.method public final e(LB4/b;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Le9/L;->b()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Le9/L;->t:Lk9/r;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Le9/L;->t:Lk9/r;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lk9/r;->A(I)Lk9/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {p1, v3, v2}, LB4/b;->x(II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lk9/d;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p1, v2}, LB4/b;->v(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, LB4/b;->r(Lk9/d;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Le9/L;->s:Lk9/d;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, LB4/b;->r(Lk9/d;)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Le9/L;->u:B

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
    iput-byte v1, p0, Le9/L;->u:B

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
