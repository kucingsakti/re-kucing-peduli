.class public final Lea/l;
.super Laa/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lea/o;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lea/o;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lea/l;->e:I

    iput-object p2, p0, Lea/l;->f:Lea/o;

    iput p3, p0, Lea/l;->g:I

    iput-object p4, p0, Lea/l;->h:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lea/o;ILjava/util/List;Z)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, Lea/l;->e:I

    iput-object p2, p0, Lea/l;->f:Lea/o;

    iput p3, p0, Lea/l;->g:I

    iput-object p4, p0, Lea/l;->h:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method private final b()J
    .locals 3

    .line 1
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 2
    .line 3
    iget-object v0, v0, Lea/o;->C:Lea/y;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 9
    .line 10
    iget-object v0, v0, Lea/o;->O:Lea/w;

    .line 11
    .line 12
    iget v1, p0, Lea/l;->g:I

    .line 13
    .line 14
    sget-object v2, Lea/a;->y:Lea/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lea/w;->j(ILea/a;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 20
    .line 21
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :try_start_1
    iget-object v1, p0, Lea/l;->f:Lea/o;

    .line 23
    .line 24
    iget-object v1, v1, Lea/o;->Q:Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    iget v2, p0, Lea/l;->g:I

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_2
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0

    .line 39
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 40
    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    .line 41
    .line 42
    return-wide v0
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


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget v0, p0, Lea/l;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 7
    .line 8
    :try_start_0
    iget v1, p0, Lea/l;->g:I

    .line 9
    .line 10
    iget-object v2, p0, Lea/l;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lea/a;

    .line 13
    .line 14
    iget-object v3, v0, Lea/o;->O:Lea/w;

    .line 15
    .line 16
    invoke-virtual {v3, v1, v2}, Lea/w;->j(ILea/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v1

    .line 21
    invoke-virtual {v0, v1}, Lea/o;->b(Ljava/io/IOException;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const-wide/16 v0, -0x1

    .line 25
    .line 26
    return-wide v0

    .line 27
    :pswitch_0
    invoke-direct {p0}, Lea/l;->b()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0

    .line 32
    :pswitch_1
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 33
    .line 34
    iget-object v0, v0, Lea/o;->C:Lea/y;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    :try_start_1
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 40
    .line 41
    iget-object v0, v0, Lea/o;->O:Lea/w;

    .line 42
    .line 43
    iget v1, p0, Lea/l;->g:I

    .line 44
    .line 45
    sget-object v2, Lea/a;->y:Lea/a;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lea/w;->j(ILea/a;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lea/l;->f:Lea/o;

    .line 51
    .line 52
    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    :try_start_2
    iget-object v1, p0, Lea/l;->f:Lea/o;

    .line 54
    .line 55
    iget-object v1, v1, Lea/o;->Q:Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    iget v2, p0, Lea/l;->g:I

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    :try_start_3
    monitor-exit v0

    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    monitor-exit v0

    .line 70
    throw v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 71
    :catch_1
    :goto_1
    const-wide/16 v0, -0x1

    .line 72
    .line 73
    return-wide v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
