.class public abstract LA3/B;
.super LA3/F;
.source "SourceFile"


# instance fields
.field public transient u:LA3/q;


# virtual methods
.method public final d()LA3/q;
    .locals 1

    .line 1
    iget-object v0, p0, LA3/B;->u:LA3/q;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA3/B;->s()LA3/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LA3/B;->u:LA3/q;

    .line 10
    .line 11
    :cond_0
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

.method public abstract s()LA3/q;
.end method
