.class public final Lorg/jsoup/nodes/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public s:I

.field public final synthetic t:Lorg/jsoup/nodes/c;


# direct methods
.method public constructor <init>(Lorg/jsoup/nodes/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/jsoup/nodes/b;->t:Lorg/jsoup/nodes/c;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lorg/jsoup/nodes/b;->s:I

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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 1
    :goto_0
    iget v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/jsoup/nodes/b;->t:Lorg/jsoup/nodes/c;

    .line 4
    .line 5
    iget v2, v1, Lorg/jsoup/nodes/c;->s:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v2, v1, Lorg/jsoup/nodes/c;->t:[Ljava/lang/String;

    .line 11
    .line 12
    aget-object v0, v2, v0

    .line 13
    .line 14
    invoke-static {v0}, Lorg/jsoup/nodes/c;->u(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 21
    .line 22
    add-int/2addr v0, v3

    .line 23
    iput v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 27
    .line 28
    iget v1, v1, Lorg/jsoup/nodes/c;->s:I

    .line 29
    .line 30
    if-ge v0, v1, :cond_1

    .line 31
    .line 32
    return v3

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    return v0
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

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lorg/jsoup/nodes/a;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/jsoup/nodes/b;->t:Lorg/jsoup/nodes/c;

    .line 4
    .line 5
    iget-object v2, v1, Lorg/jsoup/nodes/c;->t:[Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lorg/jsoup/nodes/b;->s:I

    .line 8
    .line 9
    aget-object v2, v2, v3

    .line 10
    .line 11
    iget-object v4, v1, Lorg/jsoup/nodes/c;->u:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object v3, v4, v3

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v1}, Lorg/jsoup/nodes/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jsoup/nodes/c;)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lorg/jsoup/nodes/b;->s:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    iput v1, p0, Lorg/jsoup/nodes/b;->s:I

    .line 25
    .line 26
    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/jsoup/nodes/b;->s:I

    .line 6
    .line 7
    iget-object v1, p0, Lorg/jsoup/nodes/b;->t:Lorg/jsoup/nodes/c;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lorg/jsoup/nodes/c;->x(I)V

    .line 10
    .line 11
    .line 12
    return-void
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
