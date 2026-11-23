.class public final Lya/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya/k;


# static fields
.field public static final t:Lya/a;

.field public static final u:Lya/a;

.field public static final v:Lya/a;

.field public static final w:Lya/a;

.field public static final x:Lya/a;

.field public static final y:Lya/a;


# instance fields
.field public final synthetic s:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lya/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lya/a;->t:Lya/a;

    .line 8
    .line 9
    new-instance v0, Lya/a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lya/a;->u:Lya/a;

    .line 16
    .line 17
    new-instance v0, Lya/a;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lya/a;->v:Lya/a;

    .line 24
    .line 25
    new-instance v0, Lya/a;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lya/a;->w:Lya/a;

    .line 32
    .line 33
    new-instance v0, Lya/a;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lya/a;->x:Lya/a;

    .line 40
    .line 41
    new-instance v0, Lya/a;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Lya/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lya/a;->y:Lya/a;

    .line 48
    .line 49
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lya/a;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lya/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LX9/O;

    .line 7
    .line 8
    invoke-virtual {p1}, LX9/O;->close()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    check-cast p1, LX9/O;

    .line 14
    .line 15
    invoke-virtual {p1}, LX9/O;->close()V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, LX9/O;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_2
    check-cast p1, LX9/J;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_3
    check-cast p1, LX9/O;

    .line 28
    .line 29
    :try_start_0
    new-instance v4, Lma/f;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, LX9/O;->c()Lma/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0, v4}, Lma/h;->D(Lma/f;)J

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, LX9/O;->b()LX9/A;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, LX9/O;->a()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    new-instance v0, LX9/N;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct/range {v0 .. v5}, LX9/N;-><init>(Ljava/lang/Object;JLma/h;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, LX9/O;->close()V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    invoke-virtual {p1}, LX9/O;->close()V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
