.class public abstract Lcom/onesignal/common/threading/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final suspendifyBlocking(Lu8/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu8/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/onesignal/common/threading/a$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/onesignal/common/threading/a$a;-><init>(Lu8/b;Lm8/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LN9/z;->r(Lu8/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
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

.method public static final suspendifyOnMain(Lu8/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu8/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/onesignal/common/threading/a$b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/onesignal/common/threading/a$b;-><init>(Lu8/b;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/16 v2, 0x1f

    .line 14
    .line 15
    invoke-static {p0, v1, v0, v2}, LQ3/u0;->m(Ljava/lang/String;ILu8/a;I)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public static final suspendifyOnThread(ILu8/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu8/b;",
            ")V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/onesignal/common/threading/a$c;

    invoke-direct {v0, p1}, Lcom/onesignal/common/threading/a$c;-><init>(Lu8/b;)V

    const/16 p1, 0xf

    const/4 v1, 0x0

    invoke-static {v1, p0, v0, p1}, LQ3/u0;->m(Ljava/lang/String;ILu8/a;I)V

    return-void
.end method

.method public static final suspendifyOnThread(Ljava/lang/String;ILu8/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lu8/b;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/onesignal/common/threading/a$d;

    invoke-direct {v0, p0, p2}, Lcom/onesignal/common/threading/a$d;-><init>(Ljava/lang/String;Lu8/b;)V

    const/4 p2, 0x7

    invoke-static {p0, p1, v0, p2}, LQ3/u0;->m(Ljava/lang/String;ILu8/a;I)V

    return-void
.end method

.method public static synthetic suspendifyOnThread$default(ILu8/b;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p0, -0x1

    .line 1
    :cond_0
    invoke-static {p0, p1}, Lcom/onesignal/common/threading/a;->suspendifyOnThread(ILu8/b;)V

    return-void
.end method

.method public static synthetic suspendifyOnThread$default(Ljava/lang/String;ILu8/b;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p1, -0x1

    .line 2
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/onesignal/common/threading/a;->suspendifyOnThread(Ljava/lang/String;ILu8/b;)V

    return-void
.end method
