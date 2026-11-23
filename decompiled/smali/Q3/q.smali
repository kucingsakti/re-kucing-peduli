.class public final LQ3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/c;


# static fields
.field public static final a:LQ3/q;

.field public static final b:La4/b;

.field public static final c:La4/b;

.field public static final d:La4/b;

.field public static final e:La4/b;

.field public static final f:La4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ3/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ3/q;->a:LQ3/q;

    .line 7
    .line 8
    const-string v0, "pc"

    .line 9
    .line 10
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LQ3/q;->b:La4/b;

    .line 15
    .line 16
    const-string v0, "symbol"

    .line 17
    .line 18
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LQ3/q;->c:La4/b;

    .line 23
    .line 24
    const-string v0, "file"

    .line 25
    .line 26
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LQ3/q;->d:La4/b;

    .line 31
    .line 32
    const-string v0, "offset"

    .line 33
    .line 34
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LQ3/q;->e:La4/b;

    .line 39
    .line 40
    const-string v0, "importance"

    .line 41
    .line 42
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LQ3/q;->f:La4/b;

    .line 47
    .line 48
    return-void
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
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LQ3/A0;

    .line 2
    .line 3
    check-cast p2, La4/d;

    .line 4
    .line 5
    check-cast p1, LQ3/Y;

    .line 6
    .line 7
    iget-wide v0, p1, LQ3/Y;->a:J

    .line 8
    .line 9
    sget-object v2, LQ3/q;->b:La4/b;

    .line 10
    .line 11
    invoke-interface {p2, v2, v0, v1}, La4/d;->e(La4/b;J)La4/d;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LQ3/Y;->b:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, LQ3/q;->c:La4/b;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, La4/d;->a(La4/b;Ljava/lang/Object;)La4/d;

    .line 19
    .line 20
    .line 21
    sget-object v0, LQ3/q;->d:La4/b;

    .line 22
    .line 23
    iget-object v1, p1, LQ3/Y;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p2, v0, v1}, La4/d;->a(La4/b;Ljava/lang/Object;)La4/d;

    .line 26
    .line 27
    .line 28
    sget-object v0, LQ3/q;->e:La4/b;

    .line 29
    .line 30
    iget-wide v1, p1, LQ3/Y;->d:J

    .line 31
    .line 32
    invoke-interface {p2, v0, v1, v2}, La4/d;->e(La4/b;J)La4/d;

    .line 33
    .line 34
    .line 35
    sget-object v0, LQ3/q;->f:La4/b;

    .line 36
    .line 37
    iget p1, p1, LQ3/Y;->e:I

    .line 38
    .line 39
    invoke-interface {p2, v0, p1}, La4/d;->g(La4/b;I)La4/d;

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
.end method
