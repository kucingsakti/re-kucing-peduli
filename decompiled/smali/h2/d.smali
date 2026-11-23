.class public final Lh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/c;


# static fields
.field public static final a:Lh2/d;

.field public static final b:La4/b;

.field public static final c:La4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh2/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh2/d;->a:Lh2/d;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lh2/d;->b:La4/b;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, La4/b;->a(Ljava/lang/String;)La4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lh2/d;->c:La4/b;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lh2/y;

    .line 2
    .line 3
    check-cast p2, La4/d;

    .line 4
    .line 5
    check-cast p1, Lh2/n;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lh2/x;->s:Lh2/x;

    .line 11
    .line 12
    sget-object v1, Lh2/d;->b:La4/b;

    .line 13
    .line 14
    invoke-interface {p2, v1, v0}, La4/d;->a(La4/b;Ljava/lang/Object;)La4/d;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lh2/n;->a:Lh2/l;

    .line 18
    .line 19
    sget-object v0, Lh2/d;->c:La4/b;

    .line 20
    .line 21
    invoke-interface {p2, v0, p1}, La4/d;->a(La4/b;Ljava/lang/Object;)La4/d;

    .line 22
    .line 23
    .line 24
    return-void
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
