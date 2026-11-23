.class public final Lt1/h;
.super Lv1/d;
.source "SourceFile"


# instance fields
.field public final g:Lv1/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "0F60B2DC19E6C4B38F780121885E6131D0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    return-void
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

.method public constructor <init>(Lv1/f;Lv1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv1/d;-><init>(Lv1/f;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lt1/h;->g:Lv1/j;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final a(Lcom/kcstream/cing/MainApp;)V
    .locals 5

    .line 1
    new-instance v0, LE4/B;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, LE4/B;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lv1/d;->b(Lv1/c;)Lt1/F;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lt1/h;->g:Lv1/j;

    .line 13
    .line 14
    iget-object v1, v0, Lv1/j;->c:Lt1/r0;

    .line 15
    .line 16
    const/16 v2, 0x40

    .line 17
    .line 18
    invoke-static {v1, v2}, Lv1/d;->f(Lt1/r0;I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lv1/j;->b:Lv1/e;

    .line 22
    .line 23
    invoke-virtual {v1}, Lv1/e;->d()Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    const-string v2, "0F60B2DC19E6C4B38F780121885E6131D0"

    .line 27
    .line 28
    invoke-static {v2}, Li8/C;->c(Ljava/lang/String;)[B

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v3}, Li8/C;->a([B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p0, v3, p1}, Lv1/d;->e(Ljava/lang/String;Lt1/F;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lt1/F;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-static {v2}, Li8/C;->c(Ljava/lang/String;)[B

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Li8/C;->a([B)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1}, Lv1/e;->d()Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {p0, v4, v3}, Lv1/d;->c(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {p1}, Lt1/F;->a()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Lv1/e;->d()Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {v2}, Li8/C;->c(Ljava/lang/String;)[B

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Li8/C;->a([B)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, p1, v1}, Lv1/j;->a(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
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

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/h;->g:Lv1/j;

    .line 2
    .line 3
    iget-object v0, v0, Lv1/j;->b:Lv1/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv1/e;->d()Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lv1/d;->g(Ljava/lang/Integer;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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
