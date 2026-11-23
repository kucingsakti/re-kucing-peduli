.class public final enum Lsa/y;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "Text"

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final h(LK0/n;Lsa/b;)Z
    .locals 2

    .line 1
    iget v0, p1, LK0/n;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    check-cast p1, Lsa/G;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lsa/b;->s(Lsa/G;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, LK0/n;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lsa/b;->A()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p2, Lsa/b;->m:Lsa/B;

    .line 25
    .line 26
    iput-object v0, p2, Lsa/b;->l:Lsa/B;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_1
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p2}, Lsa/b;->A()V

    .line 40
    .line 41
    .line 42
    iget-object p1, p2, Lsa/b;->m:Lsa/B;

    .line 43
    .line 44
    iput-object p1, p2, Lsa/b;->l:Lsa/B;

    .line 45
    .line 46
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 47
    return p1
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
