.class public final Lh9/b;
.super Lk9/n;
.source "SourceFile"


# static fields
.field public static final y:Lh9/b;

.field public static final z:Le9/a;


# instance fields
.field public final s:Lk9/d;

.field public t:I

.field public u:I

.field public v:I

.field public w:B

.field public x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/a;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le9/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh9/b;->z:Le9/a;

    .line 9
    .line 10
    new-instance v0, Lh9/b;

    .line 11
    .line 12
    invoke-direct {v0}, Lh9/b;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh9/b;->y:Lh9/b;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lh9/b;->u:I

    .line 19
    .line 20
    iput v1, v0, Lh9/b;->v:I

    .line 21
    .line 22
    return-void
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
    iput-byte v0, p0, Lh9/b;->w:B

    .line 3
    iput v0, p0, Lh9/b;->x:I

    .line 4
    sget-object v0, Lk9/d;->s:Lk9/s;

    iput-object v0, p0, Lh9/b;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lh9/a;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lh9/b;->w:B

    .line 7
    iput v0, p0, Lh9/b;->x:I

    .line 8
    iget-object p1, p1, Lk9/i;->s:Lk9/d;

    .line 9
    iput-object p1, p0, Lh9/b;->s:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lk9/e;)V
    .locals 6

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lh9/b;->w:B

    .line 12
    iput v0, p0, Lh9/b;->x:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lh9/b;->u:I

    .line 14
    iput v0, p0, Lh9/b;->v:I

    .line 15
    new-instance v1, Lk9/c;

    invoke-direct {v1}, Lk9/c;-><init>()V

    const/4 v2, 0x1

    .line 16
    invoke-static {v1, v2}, LB4/b;->j(Ljava/io/OutputStream;I)LB4/b;

    move-result-object v3

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lk9/e;->n()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x10

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p1, v4, v3}, Lk9/e;->q(ILB4/b;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v0, v2

    goto :goto_0

    .line 19
    :cond_2
    iget v4, p0, Lh9/b;->t:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lh9/b;->t:I

    .line 20
    invoke-virtual {p1}, Lk9/e;->k()I

    move-result v4

    .line 21
    iput v4, p0, Lh9/b;->v:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 22
    :cond_3
    iget v4, p0, Lh9/b;->t:I

    or-int/2addr v4, v2

    iput v4, p0, Lh9/b;->t:I

    .line 23
    invoke-virtual {p1}, Lk9/e;->k()I

    move-result v4

    .line 24
    iput v4, p0, Lh9/b;->u:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 25
    :goto_1
    :try_start_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 27
    iput-object p0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 28
    throw v0

    .line 29
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 30
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :goto_3
    :try_start_2
    invoke-virtual {v3}, LB4/b;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    :catch_2
    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Lh9/b;->s:Lk9/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Lh9/b;->s:Lk9/d;

    .line 33
    throw p1

    .line 34
    :goto_4
    throw p1

    .line 35
    :cond_4
    :try_start_3
    invoke-virtual {v3}, LB4/b;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 36
    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Lh9/b;->s:Lk9/d;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object v0

    iput-object v0, p0, Lh9/b;->s:Lk9/d;

    .line 37
    throw p1

    .line 38
    :catch_3
    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Lh9/b;->s:Lk9/d;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Lh9/b;->x:I

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
    iget v0, p0, Lh9/b;->t:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lh9/b;->u:I

    .line 14
    .line 15
    invoke-static {v1, v0}, LB4/b;->b(II)I

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
    iget v1, p0, Lh9/b;->t:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lh9/b;->v:I

    .line 28
    .line 29
    invoke-static {v2, v1}, LB4/b;->b(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget-object v1, p0, Lh9/b;->s:Lk9/d;

    .line 35
    .line 36
    invoke-virtual {v1}, Lk9/d;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p0, Lh9/b;->x:I

    .line 42
    .line 43
    return v1
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

.method public final c()Lk9/i;
    .locals 2

    .line 1
    new-instance v0, Lh9/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh9/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
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
    .locals 2

    .line 1
    new-instance v0, Lh9/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh9/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lh9/a;->i(Lh9/b;)V

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

.method public final e(LB4/b;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh9/b;->b()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh9/b;->t:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lh9/b;->u:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LB4/b;->m(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lh9/b;->t:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lh9/b;->v:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, LB4/b;->m(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lh9/b;->s:Lk9/d;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LB4/b;->r(Lk9/d;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lh9/b;->w:B

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
    iput-byte v1, p0, Lh9/b;->w:B

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
