.class public final LX9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:LX9/y;

.field public final b:LX9/w;

.field public final c:Ljava/lang/String;

.field public final d:LX9/F;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:LX9/w;

.field public final h:LX9/v;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lga/n;->a:Lga/n;

    .line 2
    .line 3
    sget-object v0, Lga/n;->a:Lga/n;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "-Sent-Millis"

    .line 9
    .line 10
    const-string v1, "OkHttp"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, LX9/e;->k:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v0, Lga/n;->a:Lga/n;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v0, "-Received-Millis"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LX9/e;->l:Ljava/lang/String;

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

.method public constructor <init>(LX9/L;)V
    .locals 10

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iget-object v0, p1, LX9/L;->s:LX9/G;

    iget-object v1, v0, LX9/G;->a:LX9/y;

    .line 55
    iput-object v1, p0, LX9/e;->a:LX9/y;

    .line 56
    iget-object v1, p1, LX9/L;->z:LX9/L;

    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 57
    iget-object v1, v1, LX9/L;->s:LX9/G;

    iget-object v1, v1, LX9/G;->c:LX9/w;

    .line 58
    iget-object v2, p1, LX9/L;->x:LX9/w;

    invoke-static {v2}, Ls3/a;->y(LX9/w;)Ljava/util/Set;

    move-result-object v3

    .line 59
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, LY9/c;->b:LX9/w;

    goto :goto_1

    .line 60
    :cond_0
    new-instance v4, LM1/c;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, LM1/c;-><init>(I)V

    .line 61
    invoke-virtual {v1}, LX9/w;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    add-int/lit8 v7, v6, 0x1

    .line 62
    invoke-virtual {v1, v6}, LX9/w;->f(I)Ljava/lang/String;

    move-result-object v8

    .line 63
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 64
    invoke-virtual {v1, v6}, LX9/w;->m(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v8, v6}, LM1/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move v6, v7

    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v4}, LM1/c;->d()LX9/w;

    move-result-object v1

    .line 66
    :goto_1
    iput-object v1, p0, LX9/e;->b:LX9/w;

    .line 67
    iget-object v0, v0, LX9/G;->b:Ljava/lang/String;

    iput-object v0, p0, LX9/e;->c:Ljava/lang/String;

    .line 68
    iget-object v0, p1, LX9/L;->t:LX9/F;

    iput-object v0, p0, LX9/e;->d:LX9/F;

    .line 69
    iget v0, p1, LX9/L;->v:I

    iput v0, p0, LX9/e;->e:I

    .line 70
    iget-object v0, p1, LX9/L;->u:Ljava/lang/String;

    iput-object v0, p0, LX9/e;->f:Ljava/lang/String;

    .line 71
    iput-object v2, p0, LX9/e;->g:LX9/w;

    .line 72
    iget-object v0, p1, LX9/L;->w:LX9/v;

    iput-object v0, p0, LX9/e;->h:LX9/v;

    .line 73
    iget-wide v0, p1, LX9/L;->C:J

    iput-wide v0, p0, LX9/e;->i:J

    .line 74
    iget-wide v0, p1, LX9/L;->D:J

    iput-wide v0, p0, LX9/e;->j:J

    return-void
.end method

.method public constructor <init>(Lma/w;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x3

    const-string v2, "rawSource"

    invoke-static {p1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Lga/d;->d(Lma/w;)Lma/r;

    move-result-object v2

    const-wide v3, 0x7fffffffffffffffL

    .line 3
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    .line 4
    :try_start_1
    new-instance v7, LX9/x;

    invoke-direct {v7}, LX9/x;-><init>()V

    invoke-virtual {v7, v6, v5}, LX9/x;->c(LX9/y;Ljava/lang/String;)V

    invoke-virtual {v7}, LX9/x;->a()LX9/y;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-object v7, v6

    :goto_0
    if-eqz v7, :cond_7

    .line 5
    :try_start_2
    iput-object v7, p0, LX9/e;->a:LX9/y;

    .line 6
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v5

    .line 7
    iput-object v5, p0, LX9/e;->c:Ljava/lang/String;

    .line 8
    new-instance v5, LM1/c;

    invoke-direct {v5, v1}, LM1/c;-><init>(I)V

    .line 9
    invoke-static {v2}, Ls3/a;->p(Lma/r;)I

    move-result v7

    move v8, v0

    :goto_1
    if-ge v8, v7, :cond_0

    add-int/lit8 v8, v8, 0x1

    .line 10
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v9

    .line 11
    invoke-virtual {v5, v9}, LM1/c;->b(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    .line 12
    :cond_0
    invoke-virtual {v5}, LM1/c;->d()LX9/w;

    move-result-object v5

    iput-object v5, p0, LX9/e;->b:LX9/w;

    .line 13
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-static {v5}, LC3/a;->l(Ljava/lang/String;)LA1/q;

    move-result-object v5

    .line 15
    iget-object v7, v5, LA1/q;->c:Ljava/lang/Object;

    check-cast v7, LX9/F;

    iput-object v7, p0, LX9/e;->d:LX9/F;

    .line 16
    iget v7, v5, LA1/q;->b:I

    iput v7, p0, LX9/e;->e:I

    .line 17
    iget-object v5, v5, LA1/q;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iput-object v5, p0, LX9/e;->f:Ljava/lang/String;

    .line 18
    new-instance v5, LM1/c;

    invoke-direct {v5, v1}, LM1/c;-><init>(I)V

    .line 19
    invoke-static {v2}, Ls3/a;->p(Lma/r;)I

    move-result v1

    move v7, v0

    :goto_2
    if-ge v7, v1, :cond_1

    add-int/lit8 v7, v7, 0x1

    .line 20
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v8

    .line 21
    invoke-virtual {v5, v8}, LM1/c;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :cond_1
    sget-object v1, LX9/e;->k:Ljava/lang/String;

    invoke-virtual {v5, v1}, LM1/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 23
    sget-object v8, LX9/e;->l:Ljava/lang/String;

    invoke-virtual {v5, v8}, LM1/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 24
    invoke-virtual {v5, v1}, LM1/c;->i(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v5, v8}, LM1/c;->i(Ljava/lang/String;)V

    const-wide/16 v10, 0x0

    if-nez v7, :cond_2

    move-wide v7, v10

    goto :goto_3

    .line 26
    :cond_2
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    :goto_3
    iput-wide v7, p0, LX9/e;->i:J

    if-nez v9, :cond_3

    goto :goto_4

    .line 27
    :cond_3
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    :goto_4
    iput-wide v10, p0, LX9/e;->j:J

    .line 28
    invoke-virtual {v5}, LM1/c;->d()LX9/w;

    move-result-object v1

    iput-object v1, p0, LX9/e;->g:LX9/w;

    .line 29
    iget-object v1, p0, LX9/e;->a:LX9/y;

    iget-object v1, v1, LX9/y;->a:Ljava/lang/String;

    .line 30
    const-string v5, "https"

    invoke-static {v1, v5}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 31
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_5

    .line 33
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v1

    .line 34
    sget-object v5, LX9/n;->b:LX9/b;

    invoke-virtual {v5, v1}, LX9/b;->c(Ljava/lang/String;)LX9/n;

    move-result-object v1

    .line 35
    invoke-static {v2}, LX9/e;->a(Lma/r;)Ljava/util/List;

    move-result-object v5

    .line 36
    invoke-static {v2}, LX9/e;->a(Lma/r;)Ljava/util/List;

    move-result-object v6

    .line 37
    invoke-virtual {v2}, Lma/r;->a()Z

    move-result v7

    if-nez v7, :cond_4

    .line 38
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    move-result-object v2

    .line 39
    invoke-static {v2}, Lo1/f;->g(Ljava/lang/String;)LX9/Q;

    move-result-object v2

    goto :goto_5

    .line 40
    :cond_4
    sget-object v2, LX9/Q;->x:LX9/Q;

    .line 41
    :goto_5
    invoke-static {v5}, LY9/c;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 42
    new-instance v4, LX9/v;

    invoke-static {v6}, LY9/c;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    new-instance v6, LX9/t;

    invoke-direct {v6, v3, v0}, LX9/t;-><init>(Ljava/util/List;I)V

    invoke-direct {v4, v2, v1, v5, v6}, LX9/v;-><init>(LX9/Q;LX9/n;Ljava/util/List;Lu8/a;)V

    .line 43
    iput-object v4, p0, LX9/e;->h:LX9/v;

    goto :goto_6

    .line 44
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_6
    iput-object v6, p0, LX9/e;->h:LX9/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_6
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    .line 47
    :cond_7
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cache corruption for "

    invoke-static {v5, v1}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    sget-object v1, Lga/n;->a:Lga/n;

    .line 49
    sget-object v1, Lga/n;->a:Lga/n;

    .line 50
    const-string v2, "cache corruption"

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x5

    invoke-static {v2, v1, v0}, Lga/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 51
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    :goto_7
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Lma/r;)Ljava/util/List;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0}, Ls3/a;->p(Lma/r;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, -0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    sget-object p0, Li8/s;->s:Li8/s;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    const-string v2, "X.509"

    .line 13
    .line 14
    invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    move v4, v0

    .line 24
    :goto_0
    if-ge v4, v1, :cond_1

    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    const-wide v5, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v5, v6}, Lma/r;->o(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v6, Lma/f;

    .line 38
    .line 39
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v7, Lma/i;->v:Lma/i;

    .line 43
    .line 44
    invoke-static {v5}, Lx9/d;->p(Ljava/lang/String;)Lma/i;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-static {v5}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v5}, Lma/f;->a0(Lma/i;)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Lma/e;

    .line 55
    .line 56
    invoke-direct {v5, v6, v0}, Lma/e;-><init>(Lma/h;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-object v3

    .line 68
    :catch_0
    move-exception p0

    .line 69
    new-instance v0, Ljava/io/IOException;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0
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

.method public static b(Lma/q;Ljava/util/List;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lma/q;->R(J)Lma/g;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lma/q;->z(I)Lma/g;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/security/cert/Certificate;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lma/i;->v:Lma/i;

    .line 35
    .line 36
    const-string v2, "bytes"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lx9/d;->u([B)Lma/i;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lma/i;->f()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0, v1}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lma/q;->z(I)Lma/g;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance p1, Ljava/io/IOException;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
.end method


# virtual methods
.method public final c(LK0/g;)V
    .locals 11

    .line 1
    iget-object v0, p0, LX9/e;->a:LX9/y;

    .line 2
    .line 3
    iget-object v1, p0, LX9/e;->h:LX9/v;

    .line 4
    .line 5
    iget-object v2, p0, LX9/e;->g:LX9/w;

    .line 6
    .line 7
    iget-object v3, p0, LX9/e;->b:LX9/w;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {p1, v4}, LK0/g;->j(I)Lma/v;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lga/d;->c(Lma/v;)Lma/q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    iget-object v5, v0, LX9/y;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, v5}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 21
    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 26
    .line 27
    .line 28
    iget-object v6, p0, LX9/e;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v6}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, LX9/w;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-long v6, v6

    .line 41
    invoke-virtual {p1, v6, v7}, Lma/q;->R(J)Lma/g;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, LX9/w;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    move v7, v4

    .line 52
    :goto_0
    const-string v8, ": "

    .line 53
    .line 54
    if-ge v7, v6, :cond_0

    .line 55
    .line 56
    add-int/lit8 v9, v7, 0x1

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v3, v7}, LX9/w;->f(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {p1, v10}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v8}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v7}, LX9/w;->m(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {p1, v7}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v5}, Lma/g;->z(I)Lma/g;

    .line 76
    .line 77
    .line 78
    move v7, v9

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_0
    iget-object v3, p0, LX9/e;->d:LX9/F;

    .line 84
    .line 85
    iget v6, p0, LX9/e;->e:I

    .line 86
    .line 87
    iget-object v7, p0, LX9/e;->f:Ljava/lang/String;

    .line 88
    .line 89
    const-string v9, "protocol"

    .line 90
    .line 91
    invoke-static {v3, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v9, "message"

    .line 95
    .line 96
    invoke-static {v7, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v9, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    sget-object v10, LX9/F;->t:LX9/F;

    .line 105
    .line 106
    if-ne v3, v10, :cond_1

    .line 107
    .line 108
    const-string v3, "HTTP/1.0"

    .line 109
    .line 110
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    const-string v3, "HTTP/1.1"

    .line 115
    .line 116
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    :goto_1
    const/16 v3, 0x20

    .line 120
    .line 121
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const-string v6, "StringBuilder().apply(builderAction).toString()"

    .line 138
    .line 139
    invoke-static {v3, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, LX9/w;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-int/lit8 v3, v3, 0x2

    .line 153
    .line 154
    int-to-long v6, v3

    .line 155
    invoke-virtual {p1, v6, v7}, Lma/q;->R(J)Lma/g;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, LX9/w;->size()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    :goto_2
    if-ge v4, v3, :cond_2

    .line 166
    .line 167
    add-int/lit8 v6, v4, 0x1

    .line 168
    .line 169
    invoke-virtual {v2, v4}, LX9/w;->f(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {p1, v7}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v8}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, LX9/w;->m(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-interface {p1, v4}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 184
    .line 185
    .line 186
    invoke-interface {p1, v5}, Lma/g;->z(I)Lma/g;

    .line 187
    .line 188
    .line 189
    move v4, v6

    .line 190
    goto :goto_2

    .line 191
    :cond_2
    sget-object v2, LX9/e;->k:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p1, v2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v8}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 197
    .line 198
    .line 199
    iget-wide v2, p0, LX9/e;->i:J

    .line 200
    .line 201
    invoke-interface {p1, v2, v3}, Lma/g;->R(J)Lma/g;

    .line 202
    .line 203
    .line 204
    invoke-interface {p1, v5}, Lma/g;->z(I)Lma/g;

    .line 205
    .line 206
    .line 207
    sget-object v2, LX9/e;->l:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p1, v2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v8}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 213
    .line 214
    .line 215
    iget-wide v2, p0, LX9/e;->j:J

    .line 216
    .line 217
    invoke-interface {p1, v2, v3}, Lma/g;->R(J)Lma/g;

    .line 218
    .line 219
    .line 220
    invoke-interface {p1, v5}, Lma/g;->z(I)Lma/g;

    .line 221
    .line 222
    .line 223
    iget-object v0, v0, LX9/y;->a:Ljava/lang/String;

    .line 224
    .line 225
    const-string v2, "https"

    .line 226
    .line 227
    invoke-static {v0, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_3

    .line 232
    .line 233
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 234
    .line 235
    .line 236
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, v1, LX9/v;->b:LX9/n;

    .line 240
    .line 241
    iget-object v0, v0, LX9/n;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, LX9/v;->a()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {p1, v0}, LX9/e;->b(Lma/q;Ljava/util/List;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, v1, LX9/v;->c:Ljava/util/List;

    .line 257
    .line 258
    invoke-static {p1, v0}, LX9/e;->b(Lma/q;Ljava/util/List;)V

    .line 259
    .line 260
    .line 261
    iget-object v0, v1, LX9/v;->a:LX9/Q;

    .line 262
    .line 263
    iget-object v0, v0, LX9/Q;->s:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    .line 270
    .line 271
    :cond_3
    invoke-virtual {p1}, Lma/q;->close()V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :goto_3
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 276
    :catchall_1
    move-exception v1

    .line 277
    invoke-static {p1, v0}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    throw v1
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
.end method
