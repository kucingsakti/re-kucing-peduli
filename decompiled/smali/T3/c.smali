.class public final LT3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LD1/e;LD1/e;LD1/e;LD1/e;LA1/t;LA1/t;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, LA1/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LA1/r;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0x96

    .line 56
    invoke-static {v1, v0}, LV1/d;->a(ILV1/a;)LA1/h;

    move-result-object v0

    iput-object v0, p0, LT3/c;->g:Ljava/lang/Object;

    .line 57
    iput-object p1, p0, LT3/c;->a:Ljava/lang/Object;

    .line 58
    iput-object p2, p0, LT3/c;->b:Ljava/lang/Object;

    .line 59
    iput-object p3, p0, LT3/c;->c:Ljava/lang/Object;

    .line 60
    iput-object p4, p0, LT3/c;->d:Ljava/lang/Object;

    .line 61
    iput-object p5, p0, LT3/c;->e:Ljava/lang/Object;

    .line 62
    iput-object p6, p0, LT3/c;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v0, LL3/d;->a:LL3/d;

    .line 14
    invoke-virtual {v0, p1}, LL3/d;->c(Landroid/content/Context;)LQ3/D0;

    move-result-object v0

    check-cast v0, LQ3/a0;

    iget-object v0, v0, LQ3/a0;->a:Ljava/lang/String;

    iput-object v0, p0, LT3/c;->a:Ljava/lang/Object;

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, LT3/c;->b:Ljava/lang/Object;

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ".crashlytics.v3"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x28

    if-le v2, v3, :cond_0

    .line 19
    invoke-static {v0}, LO3/g;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 20
    :cond_0
    const-string v2, "[^a-zA-Z0-9.]"

    const-string v3, "_"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 22
    :cond_1
    const-string v0, ".com.google.firebase.crashlytics.files.v1"

    .line 23
    :goto_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1}, LT3/c;->c(Ljava/io/File;)V

    iput-object v1, p0, LT3/c;->c:Ljava/lang/Object;

    .line 24
    new-instance p1, Ljava/io/File;

    const-string v0, "open-sessions"

    invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, LT3/c;->c(Ljava/io/File;)V

    iput-object p1, p0, LT3/c;->d:Ljava/lang/Object;

    .line 25
    new-instance p1, Ljava/io/File;

    const-string v0, "reports"

    invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, LT3/c;->c(Ljava/io/File;)V

    iput-object p1, p0, LT3/c;->e:Ljava/lang/Object;

    .line 26
    new-instance p1, Ljava/io/File;

    const-string v0, "priority-reports"

    invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, LT3/c;->c(Ljava/io/File;)V

    iput-object p1, p0, LT3/c;->f:Ljava/lang/Object;

    .line 27
    new-instance p1, Ljava/io/File;

    const-string v0, "native-reports"

    invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1}, LT3/c;->c(Ljava/io/File;)V

    iput-object p1, p0, LT3/c;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh7/c;Lq7/i;Li7/g;Lm7/a;LY1/c;Landroid/os/Handler;Lo1/r;LV3/b;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p3

    move-object/from16 v10, p6

    const-string v2, "uiHandler"

    invoke-static {v10, v2}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, LT3/c;->c:Ljava/lang/Object;

    move-object/from16 v12, p2

    iput-object v12, v1, LT3/c;->d:Ljava/lang/Object;

    iput-object v3, v1, LT3/c;->e:Ljava/lang/Object;

    iput-object v10, v1, LT3/c;->f:Ljava/lang/Object;

    move-object/from16 v9, p8

    iput-object v9, v1, LT3/c;->g:Ljava/lang/Object;

    .line 37
    new-instance v2, Lm7/a;

    invoke-direct {v2, v3}, Lm7/a;-><init>(Li7/g;)V

    .line 38
    new-instance v15, Lo7/a;

    iget-object v4, v0, Lh7/c;->a:Landroid/content/Context;

    invoke-direct {v15, v4}, Lo7/a;-><init>(Landroid/content/Context;)V

    iput-object v15, v1, LT3/c;->a:Ljava/lang/Object;

    .line 39
    new-instance v13, Lk7/a;

    .line 40
    iget-object v7, v0, Lh7/c;->b:Ls7/a;

    .line 41
    iget-object v11, v0, Lh7/c;->e:Lo1/k;

    move-object/from16 v16, v15

    .line 42
    iget-object v15, v0, Lh7/c;->c:Lq7/f;

    iget-object v4, v0, Lh7/c;->d:Lh7/d;

    iget-object v5, v0, Lh7/c;->a:Landroid/content/Context;

    move-object/from16 v23, p5

    move-object/from16 v18, p7

    move-object/from16 v17, v2

    move-object/from16 v20, v4

    move-object/from16 v22, v5

    move-object v14, v7

    move-object/from16 v19, v9

    move-object/from16 v21, v11

    invoke-direct/range {v13 .. v23}, Lk7/a;-><init>(Ls7/a;Lq7/f;Lo7/a;Lm7/a;Lo1/r;LV3/b;Lh7/d;Lo1/k;Landroid/content/Context;LY1/c;)V

    .line 43
    new-instance v11, Lm7/e;

    iget-object v2, v0, Lh7/c;->c:Lq7/f;

    iget-object v4, v0, Lh7/c;->a:Landroid/content/Context;

    move-object/from16 v17, p8

    move-object/from16 v18, v4

    move-object v14, v13

    move-object/from16 v15, v16

    move-object/from16 v13, p4

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v18}, Lm7/e;-><init>(Lq7/i;Lm7/a;Lk7/a;Lo7/a;Lq7/f;LV3/b;Landroid/content/Context;)V

    move-object v13, v14

    .line 44
    const-string v2, "<set-?>"

    const/4 v4, 0x1

    invoke-static {v4, v2}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 45
    new-instance v2, Ll7/a;

    .line 46
    iget-object v12, v0, Lh7/c;->f:LN4/e;

    .line 47
    iget-object v6, v0, Lh7/c;->c:Lq7/f;

    iget-object v8, v0, Lh7/c;->d:Lh7/d;

    move-object/from16 v9, p8

    move-object v5, v11

    move-object v4, v13

    move-object/from16 v11, v21

    move-object/from16 v13, p5

    invoke-direct/range {v2 .. v13}, Ll7/a;-><init>(Li7/g;Lk7/a;Lm7/e;Lq7/f;Ls7/a;Lh7/d;LV3/b;Landroid/os/Handler;Lo1/k;LN4/e;LY1/c;)V

    iput-object v2, v1, LT3/c;->b:Ljava/lang/Object;

    .line 48
    new-instance v0, Lk7/e;

    invoke-direct {v0, v1}, Lk7/e;-><init>(Ljava/lang/Object;)V

    .line 49
    iget-object v2, v3, Li7/g;->s:Ljava/lang/Object;

    .line 50
    monitor-enter v2

    .line 51
    :try_start_0
    iget-object v3, v3, Li7/g;->t:Li7/f;

    .line 52
    iput-object v0, v3, Li7/f;->t:Lk7/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;LT3/c;Lo1/h;)V
    .locals 3

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, LK0/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LK0/g;-><init>(LT3/c;Z)V

    iput-object v0, p0, LT3/c;->d:Ljava/lang/Object;

    .line 30
    new-instance v0, LK0/g;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, LK0/g;-><init>(LT3/c;Z)V

    iput-object v0, p0, LT3/c;->e:Ljava/lang/Object;

    .line 31
    new-instance v0, LP3/n;

    invoke-direct {v0}, LP3/n;-><init>()V

    iput-object v0, p0, LT3/c;->f:Ljava/lang/Object;

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, LT3/c;->g:Ljava/lang/Object;

    .line 33
    iput-object p1, p0, LT3/c;->a:Ljava/lang/Object;

    .line 34
    new-instance p1, LP3/g;

    invoke-direct {p1, p2}, LP3/g;-><init>(LT3/c;)V

    iput-object p1, p0, LT3/c;->b:Ljava/lang/Object;

    .line 35
    iput-object p3, p0, LT3/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv1/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LT3/c;->a:Ljava/lang/Object;

    .line 3
    iget-object p1, p2, Lv1/e;->a:Lv1/f;

    .line 4
    iget-object p1, p1, Lv1/f;->b:Ljava/lang/Object;

    check-cast p1, Lu1/b;

    .line 5
    iget-object p2, p1, Lu1/b;->v:Ljava/io/Serializable;

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, LT3/c;->b:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, LT3/c;->e:Ljava/lang/Object;

    .line 7
    iget-object p1, p1, Lu1/b;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    .line 8
    iput-object p1, p0, LT3/c;->c:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 9
    new-array p3, p2, [Ljava/lang/String;

    iput-object p3, p0, LT3/c;->d:Ljava/lang/Object;

    .line 10
    iput-object p4, p0, LT3/c;->f:Ljava/lang/Object;

    .line 11
    aget-object p1, p1, p2

    iput-object p1, p0, LT3/c;->g:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized c(Ljava/io/File;)V
    .locals 3

    .line 1
    const-class v0, LT3/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    const-string v1, "FirebaseCrashlytics"

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_2
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    throw p0
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

.method public static d(Ljava/io/File;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-static {v3}, LT3/c;->d(Ljava/io/File;)Z

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
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

.method public static e([Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, LT3/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, LT3/c;->d(Ljava/io/File;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const-string p1, "FirebaseCrashlytics"

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    iget-object v2, p0, LT3/c;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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

.method public f(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LT3/c;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK0/g;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, LK0/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LP3/d;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, LP3/d;->b(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, v0, LK0/g;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LP3/d;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 38
    .line 39
    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    new-instance p1, LP3/o;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {p1, v0, v1}, LP3/o;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, LK0/g;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    :cond_1
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, LK0/g;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, LT3/c;

    .line 61
    .line 62
    iget-object v0, v0, LT3/c;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lo1/h;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lo1/h;->t(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    return-void

    .line 77
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1
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
