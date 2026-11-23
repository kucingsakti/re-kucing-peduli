.class public final LG4/j;
.super LN6/o;
.source "SourceFile"


# instance fields
.field public e:Ljava/util/List;


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, LG4/j;->e:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const-string v0, "data"

    .line 11
    .line 12
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    throw v0
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
