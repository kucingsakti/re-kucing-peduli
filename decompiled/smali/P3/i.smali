.class public final LP3/i;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public s:I

.field public t:I

.field public final synthetic u:LP3/k;


# direct methods
.method public constructor <init>(LP3/k;LP3/h;)V
    .locals 1

    .line 1
    iput-object p1, p0, LP3/i;->u:LP3/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v0, p2, LP3/h;->a:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x4

    .line 9
    .line 10
    invoke-virtual {p1, v0}, LP3/k;->t(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, LP3/i;->s:I

    .line 15
    .line 16
    iget p1, p2, LP3/h;->b:I

    .line 17
    .line 18
    iput p1, p0, LP3/i;->t:I

    .line 19
    .line 20
    return-void
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
.method public final read()I
    .locals 4

    .line 11
    iget v0, p0, LP3/i;->t:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 12
    :cond_0
    iget-object v0, p0, LP3/i;->u:LP3/k;

    iget-object v1, v0, LP3/k;->s:Ljava/io/RandomAccessFile;

    .line 13
    iget v2, p0, LP3/i;->s:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 14
    iget-object v1, v0, LP3/k;->s:Ljava/io/RandomAccessFile;

    .line 15
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->read()I

    move-result v1

    .line 16
    iget v2, p0, LP3/i;->s:I

    add-int/lit8 v2, v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, LP3/k;->t(I)I

    move-result v0

    .line 18
    iput v0, p0, LP3/i;->s:I

    .line 19
    iget v0, p0, LP3/i;->t:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LP3/i;->t:I

    return v1
.end method

.method public final read([BII)I
    .locals 2

    if-eqz p1, :cond_3

    or-int v0, p2, p3

    if-ltz v0, :cond_2

    .line 1
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    .line 2
    iget v0, p0, LP3/i;->t:I

    if-lez v0, :cond_1

    if-le p3, v0, :cond_0

    move p3, v0

    .line 3
    :cond_0
    iget v0, p0, LP3/i;->s:I

    .line 4
    iget-object v1, p0, LP3/i;->u:LP3/k;

    invoke-virtual {v1, v0, p2, p3, p1}, LP3/k;->n(III[B)V

    .line 5
    iget p1, p0, LP3/i;->s:I

    add-int/2addr p1, p3

    .line 6
    invoke-virtual {v1, p1}, LP3/k;->t(I)I

    move-result p1

    .line 7
    iput p1, p0, LP3/i;->s:I

    .line 8
    iget p1, p0, LP3/i;->t:I

    sub-int/2addr p1, p3

    iput p1, p0, LP3/i;->t:I

    return p3

    :cond_1
    const/4 p1, -0x1

    return p1

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    .line 10
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
