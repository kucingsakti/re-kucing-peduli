.class public final synthetic LU8/s;
.super Lv8/g;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# static fields
.field public static final A:LU8/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU8/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lv8/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LU8/s;->A:LU8/s;

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final d()LC8/e;
    .locals 3

    .line 1
    sget-object v0, Lv8/u;->a:Lv8/v;

    .line 2
    .line 3
    const-class v1, LU8/q;

    .line 4
    .line 5
    const-string v2, "compiler.common.jvm"

    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Lv8/v;->c(Ljava/lang/String;Ljava/lang/Class;)LC8/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

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

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;"

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "getDefaultReportLevelForAnnotation"

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

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lj9/c;

    .line 2
    .line 3
    const-string v0, "p0"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, LU8/q;->a:Lj9/c;

    .line 9
    .line 10
    sget-object v0, LU8/A;->b:LU8/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, LU8/z;->b:Lo1/k;

    .line 16
    .line 17
    new-instance v1, Lh8/c;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    const/16 v3, 0x14

    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lh8/c;-><init>(II)V

    .line 23
    .line 24
    .line 25
    const-string v2, "configuredReportLevels"

    .line 26
    .line 27
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Lo1/k;->t:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lz9/j;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lz9/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LU8/B;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    sget-object v0, LU8/q;->c:Lo1/k;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lo1/k;->t:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lz9/j;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lz9/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, LU8/r;

    .line 57
    .line 58
    if-nez p1, :cond_1

    .line 59
    .line 60
    sget-object p1, LU8/B;->t:LU8/B;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_1
    iget-object v0, p1, LU8/r;->b:Lh8/c;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    iget v0, v0, Lh8/c;->v:I

    .line 68
    .line 69
    iget v1, v1, Lh8/c;->v:I

    .line 70
    .line 71
    sub-int/2addr v0, v1

    .line 72
    if-gtz v0, :cond_2

    .line 73
    .line 74
    iget-object p1, p1, LU8/r;->c:LU8/B;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    iget-object p1, p1, LU8/r;->a:LU8/B;

    .line 78
    .line 79
    return-object p1
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
