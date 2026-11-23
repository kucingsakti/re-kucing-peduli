.class public final LA3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Spliterator;


# instance fields
.field public final synthetic a:Ljava/util/Spliterator;

.field public final synthetic b:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(Ljava/util/Spliterator;Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 5
    .line 6
    iput-object p2, p0, LA3/f;->b:Ljava/util/function/Function;

    .line 7
    .line 8
    return-void
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
.method public final characteristics()I
    .locals 1

    .line 1
    iget-object v0, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 2
    .line 3
    invoke-static {v0}, LA3/d;->c(Ljava/util/Spliterator;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit16 v0, v0, -0x106

    .line 8
    .line 9
    return v0
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

.method public final estimateSize()J
    .locals 2

    .line 1
    iget-object v0, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 2
    .line 3
    invoke-static {v0}, LA3/d;->e(Ljava/util/Spliterator;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 2
    .line 3
    iget-object v1, p0, LA3/f;->b:Ljava/util/function/Function;

    .line 4
    .line 5
    new-instance v2, LA3/e;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, p1, v1, v3}, LA3/e;-><init>(Ljava/util/function/Consumer;Ljava/util/function/Function;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, LA3/d;->x(Ljava/util/Spliterator;LA3/e;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 2
    .line 3
    iget-object v1, p0, LA3/f;->b:Ljava/util/function/Function;

    .line 4
    .line 5
    new-instance v2, LA3/e;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v2, p1, v1, v3}, LA3/e;-><init>(Ljava/util/function/Consumer;Ljava/util/function/Function;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, LA3/d;->C(Ljava/util/Spliterator;LA3/e;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
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

.method public final trySplit()Ljava/util/Spliterator;
    .locals 3

    .line 1
    iget-object v0, p0, LA3/f;->a:Ljava/util/Spliterator;

    .line 2
    .line 3
    invoke-static {v0}, LA3/d;->r(Ljava/util/Spliterator;)Ljava/util/Spliterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LA3/f;->b:Ljava/util/function/Function;

    .line 10
    .line 11
    new-instance v2, LA3/f;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, LA3/f;-><init>(Ljava/util/Spliterator;Ljava/util/function/Function;)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
