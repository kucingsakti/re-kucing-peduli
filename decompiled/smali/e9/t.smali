.class public final Le9/t;
.super Lk9/k;
.source "SourceFile"


# static fields
.field public static final y:Le9/t;

.field public static final z:Le9/a;


# instance fields
.field public final t:Lk9/d;

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
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Le9/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/t;->z:Le9/a;

    .line 8
    .line 9
    new-instance v0, Le9/t;

    .line 10
    .line 11
    invoke-direct {v0}, Le9/t;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Le9/t;->y:Le9/t;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Le9/t;->v:I

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lk9/k;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Le9/t;->w:B

    .line 8
    iput v0, p0, Le9/t;->x:I

    .line 9
    sget-object v0, Lk9/d;->s:Lk9/s;

    iput-object v0, p0, Le9/t;->t:Lk9/d;

    return-void
.end method

.method public constructor <init>(Le9/s;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lk9/k;-><init>(Lk9/j;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Le9/t;->w:B

    .line 3
    iput v0, p0, Le9/t;->x:I

    .line 4
    iget-object p1, p1, Lk9/i;->s:Lk9/d;

    .line 5
    iput-object p1, p0, Le9/t;->t:Lk9/d;

    return-void
.end method

.method public constructor <init>(Lk9/e;Lk9/g;)V
    .locals 6

    .line 10
    invoke-direct {p0}, Lk9/k;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Le9/t;->w:B

    .line 12
    iput v0, p0, Le9/t;->x:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Le9/t;->v:I

    .line 14
    new-instance v1, Lk9/c;

    invoke-direct {v1}, Lk9/c;-><init>()V

    const/4 v2, 0x1

    .line 15
    invoke-static {v1, v2}, LB4/b;->j(Ljava/io/OutputStream;I)LB4/b;

    move-result-object v3

    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lk9/e;->n()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_2

    .line 17
    invoke-virtual {p0, p1, v3, p2, v4}, Lk9/k;->m(Lk9/e;LB4/b;Lk9/g;I)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    move v0, v2

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

    .line 18
    :cond_2
    iget v4, p0, Le9/t;->u:I

    or-int/2addr v4, v2

    iput v4, p0, Le9/t;->u:I

    .line 19
    invoke-virtual {p1}, Lk9/e;->k()I

    move-result v4

    .line 20
    iput v4, p0, Le9/t;->v:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 21
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 24
    throw p2

    .line 25
    :goto_2
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 26
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :goto_3
    :try_start_2
    invoke-virtual {v3}, LB4/b;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    :catch_2
    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/t;->t:Lk9/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/t;->t:Lk9/d;

    .line 29
    throw p1

    .line 30
    :goto_4
    invoke-virtual {p0}, Lk9/k;->l()V

    .line 31
    throw p1

    .line 32
    :cond_3
    :try_start_3
    invoke-virtual {v3}, LB4/b;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    :catch_3
    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p1

    iput-object p1, p0, Le9/t;->t:Lk9/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lk9/c;->c()Lk9/d;

    move-result-object p2

    iput-object p2, p0, Le9/t;->t:Lk9/d;

    .line 34
    throw p1

    .line 35
    :goto_5
    invoke-virtual {p0}, Lk9/k;->l()V

    return-void
.end method


# virtual methods
.method public final a()Lk9/a;
    .locals 1

    .line 1
    sget-object v0, Le9/t;->y:Le9/t;

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

.method public final b()I
    .locals 2

    .line 1
    iget v0, p0, Le9/t;->x:I

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
    iget v0, p0, Le9/t;->u:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Le9/t;->v:I

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
    invoke-virtual {p0}, Lk9/k;->i()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v0

    .line 26
    iget-object v0, p0, Le9/t;->t:Lk9/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lk9/d;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v1

    .line 33
    iput v0, p0, Le9/t;->x:I

    .line 34
    .line 35
    return v0
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

.method public final c()Lk9/i;
    .locals 1

    .line 1
    new-instance v0, Le9/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lk9/j;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    new-instance v0, Le9/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lk9/j;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Le9/s;->h(Le9/t;)V

    .line 7
    .line 8
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

.method public final e(LB4/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le9/t;->b()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/measurement/S;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/S;-><init>(Lk9/k;)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Le9/t;->u:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Le9/t;->v:I

    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, LB4/b;->m(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/16 v1, 0xc8

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/S;->y(ILB4/b;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Le9/t;->t:Lk9/d;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, LB4/b;->r(Lk9/d;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method

.method public final isInitialized()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Le9/t;->w:B

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
    invoke-virtual {p0}, Lk9/k;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Le9/t;->w:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Le9/t;->w:B

    .line 21
    .line 22
    return v1
    .line 23
    .line 24
    .line 25
    .line 26
.end method
