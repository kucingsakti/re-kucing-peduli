.class public final Lcom/google/android/gms/internal/measurement/zzaf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzak;
.implements Lcom/google/android/gms/internal/measurement/zzaq;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzak;",
        "Lcom/google/android/gms/internal/measurement/zzaq;",
        "Ljava/lang/Iterable<",
        "Lcom/google/android/gms/internal/measurement/zzaq;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:Ljava/util/TreeMap;

.field public final t:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 3
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->t:Ljava/util/TreeMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 6
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public varargs constructor <init>([Lcom/google/android/gms/internal/measurement/zzaq;)V
    .locals 0

    .line 7
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v3, v3, Lcom/google/android/gms/internal/measurement/zzak;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 49
    .line 50
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 65
    .line 66
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzaq;->c()Lcom/google/android/gms/internal/measurement/zzaq;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-object v0
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

.method public final d()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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

.method public final e()Ljava/lang/Double;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_3
    invoke-virtual {v0}, Ljava/util/TreeMap;->firstKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-gt v1, v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_4

    .line 72
    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 79
    return p1
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

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final g()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaf;->t:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/measurement/b;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/b;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 24
    .line 25
    .line 26
    return-object v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

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

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
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

.method public final k(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 2

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzai;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-double v0, v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaf;->m(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->t:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 42
    .line 43
    return-object p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final m(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->t:Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
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

.method public final n(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzaq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->t:Ljava/util/TreeMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final o(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 33

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v4, "reduceRight"

    .line 4
    .line 5
    const-string v5, "reduce"

    .line 6
    .line 7
    const-string v6, "push"

    .line 8
    .line 9
    const-string v11, "concat"

    .line 10
    .line 11
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v12

    .line 15
    const-string v13, "toString"

    .line 16
    .line 17
    const-string v14, "sort"

    .line 18
    .line 19
    const-string v15, "some"

    .line 20
    .line 21
    const/16 v16, -0x1

    .line 22
    .line 23
    const-string v7, "slice"

    .line 24
    .line 25
    const-string v10, "shift"

    .line 26
    .line 27
    const-string v8, "reverse"

    .line 28
    .line 29
    const-string v9, "pop"

    .line 30
    .line 31
    move/from16 v20, v12

    .line 32
    .line 33
    const-string v12, "map"

    .line 34
    .line 35
    move-object/from16 v21, v11

    .line 36
    .line 37
    const-string v11, "lastIndexOf"

    .line 38
    .line 39
    const-string v0, "join"

    .line 40
    .line 41
    const-string v2, "indexOf"

    .line 42
    .line 43
    const-string v3, "forEach"

    .line 44
    .line 45
    move-object/from16 v22, v13

    .line 46
    .line 47
    const-string v13, "filter"

    .line 48
    .line 49
    move-object/from16 v23, v14

    .line 50
    .line 51
    const-string v14, "every"

    .line 52
    .line 53
    if-nez v20, :cond_4

    .line 54
    .line 55
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v20

    .line 59
    if-nez v20, :cond_4

    .line 60
    .line 61
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v20

    .line 65
    if-nez v20, :cond_4

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v20

    .line 71
    if-nez v20, :cond_4

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v20

    .line 77
    if-nez v20, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v20

    .line 83
    if-nez v20, :cond_4

    .line 84
    .line 85
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v20

    .line 89
    if-nez v20, :cond_4

    .line 90
    .line 91
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v20

    .line 95
    if-nez v20, :cond_4

    .line 96
    .line 97
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v20

    .line 101
    if-nez v20, :cond_4

    .line 102
    .line 103
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v20

    .line 107
    if-nez v20, :cond_4

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v20

    .line 113
    if-nez v20, :cond_4

    .line 114
    .line 115
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v20

    .line 119
    if-nez v20, :cond_4

    .line 120
    .line 121
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v20

    .line 125
    if-nez v20, :cond_4

    .line 126
    .line 127
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v20

    .line 131
    if-nez v20, :cond_4

    .line 132
    .line 133
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v20

    .line 137
    if-nez v20, :cond_4

    .line 138
    .line 139
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v20

    .line 143
    if-nez v20, :cond_4

    .line 144
    .line 145
    move-object/from16 v20, v13

    .line 146
    .line 147
    move-object/from16 v13, v23

    .line 148
    .line 149
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v23

    .line 153
    if-nez v23, :cond_3

    .line 154
    .line 155
    move-object/from16 v23, v5

    .line 156
    .line 157
    const-string v5, "splice"

    .line 158
    .line 159
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-nez v5, :cond_0

    .line 164
    .line 165
    move-object/from16 v5, v22

    .line 166
    .line 167
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v22

    .line 171
    if-nez v22, :cond_2

    .line 172
    .line 173
    move-object/from16 v22, v5

    .line 174
    .line 175
    const-string v5, "unshift"

    .line 176
    .line 177
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_1

    .line 182
    .line 183
    :cond_0
    :goto_0
    move-object/from16 v5, p0

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzas;

    .line 187
    .line 188
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v5, p0

    .line 192
    .line 193
    move-object/from16 v1, p2

    .line 194
    .line 195
    move-object/from16 v2, p3

    .line 196
    .line 197
    invoke-static {v5, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzan;->a(Lcom/google/android/gms/internal/measurement/zzak;Lcom/google/android/gms/internal/measurement/zzas;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :cond_2
    move-object/from16 v22, v5

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    :goto_1
    move-object/from16 v23, v5

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_4
    move-object/from16 v20, v13

    .line 209
    .line 210
    move-object/from16 v13, v23

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :goto_2
    const-wide/high16 v24, -0x4010000000000000L    # -1.0

    .line 214
    .line 215
    move-object/from16 v26, v3

    .line 216
    .line 217
    invoke-static/range {v24 .. v25}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    move-object/from16 v24, v3

    .line 222
    .line 223
    iget-object v3, v5, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 224
    .line 225
    sget-object v25, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 226
    .line 227
    move-object/from16 v27, v3

    .line 228
    .line 229
    const-string v3, ","

    .line 230
    .line 231
    move-object/from16 v28, v3

    .line 232
    .line 233
    const-string v3, "Callback should be a method"

    .line 234
    .line 235
    move-object/from16 v29, v3

    .line 236
    .line 237
    move-object/from16 v30, v4

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 240
    .line 241
    .line 242
    move-result v31

    .line 243
    sparse-switch v31, :sswitch_data_0

    .line 244
    .line 245
    .line 246
    :goto_3
    move/from16 v1, v16

    .line 247
    .line 248
    :goto_4
    move-object/from16 v3, v20

    .line 249
    .line 250
    move-object/from16 v4, v22

    .line 251
    .line 252
    move-object/from16 v6, v26

    .line 253
    .line 254
    :goto_5
    const-wide/16 v31, 0x0

    .line 255
    .line 256
    goto/16 :goto_b

    .line 257
    .line 258
    :sswitch_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_5

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_5
    const/16 v1, 0x13

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :sswitch_1
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-nez v1, :cond_6

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_6
    const/16 v1, 0x12

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :sswitch_2
    move-object/from16 v6, v30

    .line 279
    .line 280
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_7

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_7
    const/16 v1, 0x11

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :sswitch_3
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-nez v1, :cond_8

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_8
    const/16 v1, 0x10

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :sswitch_4
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-nez v1, :cond_9

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_9
    const/16 v1, 0xf

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :sswitch_5
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-nez v1, :cond_a

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_a
    const/16 v1, 0xe

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :sswitch_6
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-nez v1, :cond_b

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_b
    const/16 v1, 0xd

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :sswitch_7
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-nez v1, :cond_c

    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_c
    const/16 v1, 0xc

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :sswitch_8
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-nez v1, :cond_d

    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_d
    const/16 v1, 0xb

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :sswitch_9
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_e

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_e
    const/16 v1, 0xa

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :sswitch_a
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-nez v1, :cond_f

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_f
    const/16 v1, 0x9

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :sswitch_b
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-nez v1, :cond_10

    .line 375
    .line 376
    goto/16 :goto_3

    .line 377
    .line 378
    :cond_10
    const/16 v1, 0x8

    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :sswitch_c
    const-string v6, "unshift"

    .line 383
    .line 384
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-nez v1, :cond_11

    .line 389
    .line 390
    goto/16 :goto_3

    .line 391
    .line 392
    :cond_11
    const/4 v1, 0x7

    .line 393
    goto/16 :goto_4

    .line 394
    .line 395
    :sswitch_d
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-nez v1, :cond_12

    .line 400
    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :cond_12
    const/4 v1, 0x6

    .line 404
    goto/16 :goto_4

    .line 405
    .line 406
    :sswitch_e
    move-object/from16 v6, v26

    .line 407
    .line 408
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-nez v1, :cond_13

    .line 413
    .line 414
    move/from16 v1, v16

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_13
    const/4 v1, 0x5

    .line 418
    :goto_6
    move-object/from16 v3, v20

    .line 419
    .line 420
    move-object/from16 v4, v22

    .line 421
    .line 422
    goto/16 :goto_5

    .line 423
    .line 424
    :sswitch_f
    move-object/from16 v6, v26

    .line 425
    .line 426
    const-wide/16 v31, 0x0

    .line 427
    .line 428
    const-string v3, "splice"

    .line 429
    .line 430
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-nez v1, :cond_14

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_14
    const/4 v1, 0x4

    .line 438
    goto :goto_8

    .line 439
    :sswitch_10
    move-object/from16 v3, v23

    .line 440
    .line 441
    move-object/from16 v6, v26

    .line 442
    .line 443
    const-wide/16 v31, 0x0

    .line 444
    .line 445
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_15

    .line 450
    .line 451
    :goto_7
    move/from16 v1, v16

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_15
    const/4 v1, 0x3

    .line 455
    :goto_8
    move-object/from16 v3, v20

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :sswitch_11
    move-object/from16 v3, v20

    .line 459
    .line 460
    move-object/from16 v6, v26

    .line 461
    .line 462
    const-wide/16 v31, 0x0

    .line 463
    .line 464
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    if-nez v1, :cond_16

    .line 469
    .line 470
    goto :goto_9

    .line 471
    :cond_16
    move-object/from16 v4, v22

    .line 472
    .line 473
    const/4 v1, 0x2

    .line 474
    goto :goto_b

    .line 475
    :sswitch_12
    move-object/from16 v3, v20

    .line 476
    .line 477
    move-object/from16 v4, v21

    .line 478
    .line 479
    move-object/from16 v6, v26

    .line 480
    .line 481
    const-wide/16 v31, 0x0

    .line 482
    .line 483
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    if-nez v1, :cond_17

    .line 488
    .line 489
    :goto_9
    move/from16 v1, v16

    .line 490
    .line 491
    :goto_a
    move-object/from16 v4, v22

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_17
    move-object/from16 v4, v22

    .line 495
    .line 496
    const/4 v1, 0x1

    .line 497
    goto :goto_b

    .line 498
    :sswitch_13
    move-object/from16 v3, v20

    .line 499
    .line 500
    move-object/from16 v4, v22

    .line 501
    .line 502
    move-object/from16 v6, v26

    .line 503
    .line 504
    const-wide/16 v31, 0x0

    .line 505
    .line 506
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    if-nez v1, :cond_18

    .line 511
    .line 512
    move/from16 v1, v16

    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_18
    const/4 v1, 0x0

    .line 516
    :goto_b
    packed-switch v1, :pswitch_data_0

    .line 517
    .line 518
    .line 519
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 520
    .line 521
    const-string v1, "Command not supported"

    .line 522
    .line 523
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw v0

    .line 527
    :pswitch_0
    move-object/from16 v1, p3

    .line 528
    .line 529
    const/4 v0, 0x2

    .line 530
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzg;->m(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-nez v0, :cond_19

    .line 538
    .line 539
    const/4 v0, 0x0

    .line 540
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 545
    .line 546
    move-object/from16 v2, p2

    .line 547
    .line 548
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 549
    .line 550
    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 551
    .line 552
    .line 553
    move-result-object v25

    .line 554
    :goto_c
    move-object/from16 v0, v25

    .line 555
    .line 556
    goto :goto_d

    .line 557
    :cond_19
    move-object/from16 v2, p2

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :goto_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    const/4 v4, 0x1

    .line 565
    if-le v3, v4, :cond_1b

    .line 566
    .line 567
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 572
    .line 573
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 574
    .line 575
    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 584
    .line 585
    .line 586
    move-result-wide v1

    .line 587
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 588
    .line 589
    .line 590
    move-result-wide v1

    .line 591
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    int-to-double v3, v3

    .line 596
    cmpl-double v3, v1, v3

    .line 597
    .line 598
    if-ltz v3, :cond_1a

    .line 599
    .line 600
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 601
    .line 602
    move-object/from16 v3, v24

    .line 603
    .line 604
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 605
    .line 606
    .line 607
    return-object v0

    .line 608
    :cond_1a
    move-object/from16 v3, v24

    .line 609
    .line 610
    cmpg-double v4, v1, v31

    .line 611
    .line 612
    if-gez v4, :cond_1c

    .line 613
    .line 614
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    int-to-double v6, v4

    .line 619
    add-double/2addr v1, v6

    .line 620
    goto :goto_e

    .line 621
    :cond_1b
    move-object/from16 v3, v24

    .line 622
    .line 623
    move-wide/from16 v1, v31

    .line 624
    .line 625
    :cond_1c
    :goto_e
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    :cond_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v6

    .line 633
    if-eqz v6, :cond_1e

    .line 634
    .line 635
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v6

    .line 639
    check-cast v6, Ljava/lang/Integer;

    .line 640
    .line 641
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    int-to-double v7, v6

    .line 646
    cmpg-double v9, v7, v1

    .line 647
    .line 648
    if-ltz v9, :cond_1d

    .line 649
    .line 650
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    invoke-static {v6, v0}, Lcom/google/android/gms/internal/measurement/zzg;->h(Lcom/google/android/gms/internal/measurement/zzaq;Lcom/google/android/gms/internal/measurement/zzaq;)Z

    .line 655
    .line 656
    .line 657
    move-result v6

    .line 658
    if-eqz v6, :cond_1d

    .line 659
    .line 660
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 661
    .line 662
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 667
    .line 668
    .line 669
    return-object v0

    .line 670
    :cond_1e
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 671
    .line 672
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 673
    .line 674
    .line 675
    return-object v0

    .line 676
    :pswitch_1
    move-object/from16 v1, p3

    .line 677
    .line 678
    const/4 v0, 0x0

    .line 679
    invoke-static {v8, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-eqz v0, :cond_2a

    .line 687
    .line 688
    const/4 v8, 0x0

    .line 689
    :goto_f
    const/16 v19, 0x2

    .line 690
    .line 691
    div-int/lit8 v1, v0, 0x2

    .line 692
    .line 693
    if-ge v8, v1, :cond_2a

    .line 694
    .line 695
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/measurement/zzaf;->x(I)Z

    .line 696
    .line 697
    .line 698
    move-result v1

    .line 699
    if-eqz v1, :cond_20

    .line 700
    .line 701
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    const/4 v2, 0x0

    .line 706
    invoke-virtual {v5, v8, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 707
    .line 708
    .line 709
    const/16 v17, 0x1

    .line 710
    .line 711
    add-int/lit8 v2, v0, -0x1

    .line 712
    .line 713
    sub-int/2addr v2, v8

    .line 714
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->x(I)Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-eqz v3, :cond_1f

    .line 719
    .line 720
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    invoke-virtual {v5, v8, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 725
    .line 726
    .line 727
    :cond_1f
    invoke-virtual {v5, v2, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 728
    .line 729
    .line 730
    goto :goto_10

    .line 731
    :cond_20
    const/16 v17, 0x1

    .line 732
    .line 733
    :goto_10
    add-int/lit8 v8, v8, 0x1

    .line 734
    .line 735
    goto :goto_f

    .line 736
    :pswitch_2
    move-object/from16 v2, p2

    .line 737
    .line 738
    move-object/from16 v1, p3

    .line 739
    .line 740
    const/4 v0, 0x0

    .line 741
    invoke-static {v5, v2, v1, v0}, Lcom/google/android/gms/internal/measurement/zzbe;->b(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    return-object v0

    .line 746
    :pswitch_3
    move-object/from16 v2, p2

    .line 747
    .line 748
    move-object/from16 v1, p3

    .line 749
    .line 750
    const/4 v0, 0x0

    .line 751
    const/4 v3, 0x2

    .line 752
    invoke-static {v3, v7, v1}, Lcom/google/android/gms/internal/measurement/zzg;->m(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 756
    .line 757
    .line 758
    move-result v3

    .line 759
    if-eqz v3, :cond_21

    .line 760
    .line 761
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->c()Lcom/google/android/gms/internal/measurement/zzaq;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    return-object v0

    .line 766
    :cond_21
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    int-to-double v3, v3

    .line 771
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 776
    .line 777
    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 778
    .line 779
    invoke-virtual {v6, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 788
    .line 789
    .line 790
    move-result-wide v6

    .line 791
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 792
    .line 793
    .line 794
    move-result-wide v6

    .line 795
    cmpg-double v0, v6, v31

    .line 796
    .line 797
    if-gez v0, :cond_22

    .line 798
    .line 799
    add-double/2addr v6, v3

    .line 800
    move-wide/from16 v8, v31

    .line 801
    .line 802
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 803
    .line 804
    .line 805
    move-result-wide v6

    .line 806
    goto :goto_11

    .line 807
    :cond_22
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 808
    .line 809
    .line 810
    move-result-wide v6

    .line 811
    :goto_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    const/4 v8, 0x2

    .line 816
    if-ne v0, v8, :cond_24

    .line 817
    .line 818
    const/4 v0, 0x1

    .line 819
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 824
    .line 825
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 826
    .line 827
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 836
    .line 837
    .line 838
    move-result-wide v0

    .line 839
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 840
    .line 841
    .line 842
    move-result-wide v0

    .line 843
    const-wide/16 v8, 0x0

    .line 844
    .line 845
    cmpg-double v2, v0, v8

    .line 846
    .line 847
    if-gez v2, :cond_23

    .line 848
    .line 849
    add-double/2addr v3, v0

    .line 850
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 851
    .line 852
    .line 853
    move-result-wide v3

    .line 854
    goto :goto_12

    .line 855
    :cond_23
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 856
    .line 857
    .line 858
    move-result-wide v3

    .line 859
    :cond_24
    :goto_12
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 860
    .line 861
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 862
    .line 863
    .line 864
    double-to-int v1, v6

    .line 865
    :goto_13
    int-to-double v6, v1

    .line 866
    cmpg-double v2, v6, v3

    .line 867
    .line 868
    if-gez v2, :cond_25

    .line 869
    .line 870
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 875
    .line 876
    .line 877
    const/4 v6, 0x1

    .line 878
    add-int/2addr v1, v6

    .line 879
    goto :goto_13

    .line 880
    :cond_25
    return-object v0

    .line 881
    :pswitch_4
    move-object/from16 v1, p3

    .line 882
    .line 883
    const/4 v0, 0x0

    .line 884
    invoke-static {v10, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    if-nez v1, :cond_26

    .line 892
    .line 893
    goto/16 :goto_21

    .line 894
    .line 895
    :cond_26
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->v(I)V

    .line 900
    .line 901
    .line 902
    return-object v1

    .line 903
    :pswitch_5
    move-object/from16 v2, p2

    .line 904
    .line 905
    move-object/from16 v1, p3

    .line 906
    .line 907
    const/4 v0, 0x0

    .line 908
    const/4 v6, 0x1

    .line 909
    invoke-static {v14, v6, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 917
    .line 918
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 919
    .line 920
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 925
    .line 926
    if-eqz v1, :cond_27

    .line 927
    .line 928
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    if-eqz v1, :cond_2c

    .line 933
    .line 934
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 935
    .line 936
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 937
    .line 938
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 939
    .line 940
    invoke-static {v5, v2, v0, v1, v3}, Lcom/google/android/gms/internal/measurement/zzbe;->a(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzar;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzaf;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 949
    .line 950
    .line 951
    move-result v1

    .line 952
    if-eq v0, v1, :cond_2c

    .line 953
    .line 954
    goto/16 :goto_16

    .line 955
    .line 956
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 957
    .line 958
    move-object/from16 v4, v29

    .line 959
    .line 960
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    throw v0

    .line 964
    :pswitch_6
    move-object/from16 v2, p2

    .line 965
    .line 966
    move-object/from16 v1, p3

    .line 967
    .line 968
    const/4 v0, 0x1

    .line 969
    invoke-static {v0, v13, v1}, Lcom/google/android/gms/internal/measurement/zzg;->m(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    const/4 v3, 0x2

    .line 977
    if-lt v0, v3, :cond_2a

    .line 978
    .line 979
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->z()Ljava/util/ArrayList;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 984
    .line 985
    .line 986
    move-result v3

    .line 987
    if-nez v3, :cond_29

    .line 988
    .line 989
    const/4 v3, 0x0

    .line 990
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 995
    .line 996
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 997
    .line 998
    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    instance-of v3, v1, Lcom/google/android/gms/internal/measurement/zzal;

    .line 1003
    .line 1004
    if-eqz v3, :cond_28

    .line 1005
    .line 1006
    move-object v3, v1

    .line 1007
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzal;

    .line 1008
    .line 1009
    goto :goto_14

    .line 1010
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1011
    .line 1012
    const-string v1, "Comparator should be a method"

    .line 1013
    .line 1014
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    throw v0

    .line 1018
    :cond_29
    const/4 v3, 0x0

    .line 1019
    :goto_14
    new-instance v1, Lcom/google/android/gms/internal/measurement/h;

    .line 1020
    .line 1021
    invoke-direct {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/h;-><init>(Lcom/google/android/gms/internal/measurement/zzal;Lcom/google/android/gms/internal/measurement/zzh;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeMap;->clear()V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    const/4 v8, 0x0

    .line 1035
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v1

    .line 1039
    if-eqz v1, :cond_2a

    .line 1040
    .line 1041
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1046
    .line 1047
    const/4 v6, 0x1

    .line 1048
    add-int/lit8 v2, v8, 0x1

    .line 1049
    .line 1050
    invoke-virtual {v5, v8, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1051
    .line 1052
    .line 1053
    move v8, v2

    .line 1054
    goto :goto_15

    .line 1055
    :cond_2a
    return-object v5

    .line 1056
    :pswitch_7
    move-object/from16 v2, p2

    .line 1057
    .line 1058
    move-object/from16 v1, p3

    .line 1059
    .line 1060
    move-object/from16 v4, v29

    .line 1061
    .line 1062
    const/4 v6, 0x1

    .line 1063
    invoke-static {v15, v6, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 1064
    .line 1065
    .line 1066
    const/4 v0, 0x0

    .line 1067
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1072
    .line 1073
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1074
    .line 1075
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzal;

    .line 1080
    .line 1081
    if-eqz v1, :cond_2e

    .line 1082
    .line 1083
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1084
    .line 1085
    .line 1086
    move-result v1

    .line 1087
    if-eqz v1, :cond_2d

    .line 1088
    .line 1089
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzal;

    .line 1090
    .line 1091
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    :cond_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1096
    .line 1097
    .line 1098
    move-result v3

    .line 1099
    if-eqz v3, :cond_2d

    .line 1100
    .line 1101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    check-cast v3, Ljava/lang/Integer;

    .line 1106
    .line 1107
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1108
    .line 1109
    .line 1110
    move-result v3

    .line 1111
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->x(I)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v4

    .line 1115
    if-eqz v4, :cond_2b

    .line 1116
    .line 1117
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1122
    .line 1123
    int-to-double v7, v3

    .line 1124
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1129
    .line 1130
    .line 1131
    const/4 v3, 0x3

    .line 1132
    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1133
    .line 1134
    const/16 v18, 0x0

    .line 1135
    .line 1136
    aput-object v4, v3, v18

    .line 1137
    .line 1138
    const/16 v17, 0x1

    .line 1139
    .line 1140
    aput-object v6, v3, v17

    .line 1141
    .line 1142
    const/16 v19, 0x2

    .line 1143
    .line 1144
    aput-object v5, v3, v19

    .line 1145
    .line 1146
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzal;->a(Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v3

    .line 1154
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->d()Ljava/lang/Boolean;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v3

    .line 1158
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1159
    .line 1160
    .line 1161
    move-result v3

    .line 1162
    if-eqz v3, :cond_2b

    .line 1163
    .line 1164
    :cond_2c
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->n:Lcom/google/android/gms/internal/measurement/zzag;

    .line 1165
    .line 1166
    return-object v0

    .line 1167
    :cond_2d
    :goto_16
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->o:Lcom/google/android/gms/internal/measurement/zzag;

    .line 1168
    .line 1169
    return-object v0

    .line 1170
    :cond_2e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1171
    .line 1172
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    throw v0

    .line 1176
    :pswitch_8
    move-object/from16 v2, p2

    .line 1177
    .line 1178
    move-object/from16 v1, p3

    .line 1179
    .line 1180
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v0

    .line 1184
    if-nez v0, :cond_2f

    .line 1185
    .line 1186
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v1

    .line 1194
    if-eqz v1, :cond_2f

    .line 1195
    .line 1196
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1201
    .line 1202
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1203
    .line 1204
    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1209
    .line 1210
    .line 1211
    goto :goto_17

    .line 1212
    :cond_2f
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1213
    .line 1214
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1215
    .line 1216
    .line 1217
    move-result v1

    .line 1218
    int-to-double v1, v1

    .line 1219
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v1

    .line 1223
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1224
    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_9
    move-object/from16 v2, p2

    .line 1228
    .line 1229
    move-object/from16 v1, p3

    .line 1230
    .line 1231
    const/4 v6, 0x1

    .line 1232
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->m(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1236
    .line 1237
    .line 1238
    move-result v0

    .line 1239
    if-nez v0, :cond_30

    .line 1240
    .line 1241
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaq;->p:Lcom/google/android/gms/internal/measurement/zzas;

    .line 1242
    .line 1243
    return-object v0

    .line 1244
    :cond_30
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1245
    .line 1246
    .line 1247
    move-result v0

    .line 1248
    if-nez v0, :cond_33

    .line 1249
    .line 1250
    const/4 v0, 0x0

    .line 1251
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1256
    .line 1257
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1258
    .line 1259
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzao;

    .line 1264
    .line 1265
    if-nez v1, :cond_32

    .line 1266
    .line 1267
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzax;

    .line 1268
    .line 1269
    if-eqz v1, :cond_31

    .line 1270
    .line 1271
    goto :goto_18

    .line 1272
    :cond_31
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->f()Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v3

    .line 1276
    goto :goto_19

    .line 1277
    :cond_32
    :goto_18
    const-string v3, ""

    .line 1278
    .line 1279
    goto :goto_19

    .line 1280
    :cond_33
    move-object/from16 v3, v28

    .line 1281
    .line 1282
    :goto_19
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzas;

    .line 1283
    .line 1284
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v1

    .line 1288
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    return-object v0

    .line 1292
    :pswitch_a
    move-object/from16 v1, p3

    .line 1293
    .line 1294
    const/4 v0, 0x0

    .line 1295
    invoke-static {v9, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-nez v0, :cond_34

    .line 1303
    .line 1304
    goto/16 :goto_21

    .line 1305
    .line 1306
    :cond_34
    const/4 v6, 0x1

    .line 1307
    sub-int/2addr v0, v6

    .line 1308
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->v(I)V

    .line 1313
    .line 1314
    .line 1315
    return-object v1

    .line 1316
    :pswitch_b
    move-object/from16 v2, p2

    .line 1317
    .line 1318
    move-object/from16 v1, p3

    .line 1319
    .line 1320
    move-object/from16 v4, v29

    .line 1321
    .line 1322
    const/4 v0, 0x0

    .line 1323
    const/4 v6, 0x1

    .line 1324
    invoke-static {v12, v6, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1332
    .line 1333
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1334
    .line 1335
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 1340
    .line 1341
    if-eqz v1, :cond_36

    .line 1342
    .line 1343
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1344
    .line 1345
    .line 1346
    move-result v1

    .line 1347
    if-nez v1, :cond_35

    .line 1348
    .line 1349
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1350
    .line 1351
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 1352
    .line 1353
    .line 1354
    return-object v0

    .line 1355
    :cond_35
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 1356
    .line 1357
    const/4 v1, 0x0

    .line 1358
    invoke-static {v5, v2, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/zzbe;->a(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzar;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    return-object v0

    .line 1363
    :cond_36
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1364
    .line 1365
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    throw v0

    .line 1369
    :pswitch_c
    move-object/from16 v2, p2

    .line 1370
    .line 1371
    move-object/from16 v1, p3

    .line 1372
    .line 1373
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1374
    .line 1375
    .line 1376
    move-result v0

    .line 1377
    if-nez v0, :cond_3a

    .line 1378
    .line 1379
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1380
    .line 1381
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v1

    .line 1388
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1389
    .line 1390
    .line 1391
    move-result v3

    .line 1392
    if-eqz v3, :cond_38

    .line 1393
    .line 1394
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1399
    .line 1400
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1401
    .line 1402
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v3

    .line 1406
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzaj;

    .line 1407
    .line 1408
    if-nez v4, :cond_37

    .line 1409
    .line 1410
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1411
    .line 1412
    .line 1413
    goto :goto_1a

    .line 1414
    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1415
    .line 1416
    const-string v1, "Argument evaluation failed"

    .line 1417
    .line 1418
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1419
    .line 1420
    .line 1421
    throw v0

    .line 1422
    :cond_38
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1423
    .line 1424
    .line 1425
    move-result v1

    .line 1426
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v2

    .line 1430
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1431
    .line 1432
    .line 1433
    move-result v3

    .line 1434
    if-eqz v3, :cond_39

    .line 1435
    .line 1436
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v3

    .line 1440
    check-cast v3, Ljava/lang/Integer;

    .line 1441
    .line 1442
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1443
    .line 1444
    .line 1445
    move-result v4

    .line 1446
    add-int/2addr v4, v1

    .line 1447
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1448
    .line 1449
    .line 1450
    move-result v3

    .line 1451
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1456
    .line 1457
    .line 1458
    goto :goto_1b

    .line 1459
    :cond_39
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeMap;->clear()V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v1

    .line 1466
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1467
    .line 1468
    .line 1469
    move-result v2

    .line 1470
    if-eqz v2, :cond_3a

    .line 1471
    .line 1472
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v2

    .line 1476
    check-cast v2, Ljava/lang/Integer;

    .line 1477
    .line 1478
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1479
    .line 1480
    .line 1481
    move-result v3

    .line 1482
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1483
    .line 1484
    .line 1485
    move-result v2

    .line 1486
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v2

    .line 1490
    invoke-virtual {v5, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1491
    .line 1492
    .line 1493
    goto :goto_1c

    .line 1494
    :cond_3a
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1495
    .line 1496
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1497
    .line 1498
    .line 1499
    move-result v1

    .line 1500
    int-to-double v1, v1

    .line 1501
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v1

    .line 1505
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1506
    .line 1507
    .line 1508
    return-object v0

    .line 1509
    :pswitch_d
    move-object/from16 v2, p2

    .line 1510
    .line 1511
    move-object/from16 v1, p3

    .line 1512
    .line 1513
    move-object/from16 v3, v24

    .line 1514
    .line 1515
    const/4 v0, 0x2

    .line 1516
    invoke-static {v0, v11, v1}, Lcom/google/android/gms/internal/measurement/zzg;->m(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    if-nez v0, :cond_3b

    .line 1524
    .line 1525
    const/4 v0, 0x0

    .line 1526
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1531
    .line 1532
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1533
    .line 1534
    invoke-virtual {v4, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v25

    .line 1538
    :cond_3b
    move-object/from16 v0, v25

    .line 1539
    .line 1540
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1541
    .line 1542
    .line 1543
    move-result v4

    .line 1544
    const/4 v6, 0x1

    .line 1545
    sub-int/2addr v4, v6

    .line 1546
    int-to-double v7, v4

    .line 1547
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1548
    .line 1549
    .line 1550
    move-result v4

    .line 1551
    if-le v4, v6, :cond_3d

    .line 1552
    .line 1553
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1558
    .line 1559
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1560
    .line 1561
    invoke-virtual {v4, v2, v1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v1

    .line 1565
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v2

    .line 1569
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1570
    .line 1571
    .line 1572
    move-result-wide v7

    .line 1573
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v2

    .line 1577
    if-eqz v2, :cond_3c

    .line 1578
    .line 1579
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1580
    .line 1581
    .line 1582
    move-result v1

    .line 1583
    sub-int/2addr v1, v6

    .line 1584
    int-to-double v1, v1

    .line 1585
    :goto_1d
    move-wide v7, v1

    .line 1586
    const-wide/16 v31, 0x0

    .line 1587
    .line 1588
    goto :goto_1e

    .line 1589
    :cond_3c
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v1

    .line 1593
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1594
    .line 1595
    .line 1596
    move-result-wide v1

    .line 1597
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 1598
    .line 1599
    .line 1600
    move-result-wide v1

    .line 1601
    goto :goto_1d

    .line 1602
    :goto_1e
    cmpg-double v1, v7, v31

    .line 1603
    .line 1604
    if-gez v1, :cond_3e

    .line 1605
    .line 1606
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1607
    .line 1608
    .line 1609
    move-result v1

    .line 1610
    int-to-double v1, v1

    .line 1611
    add-double/2addr v7, v1

    .line 1612
    goto :goto_1f

    .line 1613
    :cond_3d
    const-wide/16 v31, 0x0

    .line 1614
    .line 1615
    :cond_3e
    :goto_1f
    cmpg-double v1, v7, v31

    .line 1616
    .line 1617
    if-gez v1, :cond_3f

    .line 1618
    .line 1619
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1620
    .line 1621
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1622
    .line 1623
    .line 1624
    return-object v0

    .line 1625
    :cond_3f
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1626
    .line 1627
    .line 1628
    move-result v1

    .line 1629
    int-to-double v1, v1

    .line 1630
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->min(DD)D

    .line 1631
    .line 1632
    .line 1633
    move-result-wide v1

    .line 1634
    double-to-int v1, v1

    .line 1635
    :goto_20
    if-ltz v1, :cond_41

    .line 1636
    .line 1637
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->x(I)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v2

    .line 1641
    if-eqz v2, :cond_40

    .line 1642
    .line 1643
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v2

    .line 1647
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/measurement/zzg;->h(Lcom/google/android/gms/internal/measurement/zzaq;Lcom/google/android/gms/internal/measurement/zzaq;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v2

    .line 1651
    if-eqz v2, :cond_40

    .line 1652
    .line 1653
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1654
    .line 1655
    int-to-double v1, v1

    .line 1656
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v1

    .line 1660
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1661
    .line 1662
    .line 1663
    return-object v0

    .line 1664
    :cond_40
    add-int/lit8 v1, v1, -0x1

    .line 1665
    .line 1666
    goto :goto_20

    .line 1667
    :cond_41
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzai;

    .line 1668
    .line 1669
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 1670
    .line 1671
    .line 1672
    return-object v0

    .line 1673
    :pswitch_e
    move-object/from16 v2, p2

    .line 1674
    .line 1675
    move-object/from16 v1, p3

    .line 1676
    .line 1677
    move-object/from16 v4, v29

    .line 1678
    .line 1679
    const/4 v0, 0x1

    .line 1680
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 1681
    .line 1682
    .line 1683
    const/4 v0, 0x0

    .line 1684
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v0

    .line 1688
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1689
    .line 1690
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1691
    .line 1692
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 1697
    .line 1698
    if-eqz v1, :cond_43

    .line 1699
    .line 1700
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeMap;->size()I

    .line 1701
    .line 1702
    .line 1703
    move-result v1

    .line 1704
    if-nez v1, :cond_42

    .line 1705
    .line 1706
    :goto_21
    return-object v25

    .line 1707
    :cond_42
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 1708
    .line 1709
    const/4 v1, 0x0

    .line 1710
    invoke-static {v5, v2, v0, v1, v1}, Lcom/google/android/gms/internal/measurement/zzbe;->a(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzar;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1711
    .line 1712
    .line 1713
    return-object v25

    .line 1714
    :cond_43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1715
    .line 1716
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1717
    .line 1718
    .line 1719
    throw v0

    .line 1720
    :pswitch_f
    move-object/from16 v2, p2

    .line 1721
    .line 1722
    move-object/from16 v1, p3

    .line 1723
    .line 1724
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v0

    .line 1728
    if-eqz v0, :cond_44

    .line 1729
    .line 1730
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1731
    .line 1732
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 1733
    .line 1734
    .line 1735
    return-object v0

    .line 1736
    :cond_44
    const/4 v0, 0x0

    .line 1737
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v3

    .line 1741
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1742
    .line 1743
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1744
    .line 1745
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v0

    .line 1749
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1754
    .line 1755
    .line 1756
    move-result-wide v3

    .line 1757
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 1758
    .line 1759
    .line 1760
    move-result-wide v3

    .line 1761
    double-to-int v0, v3

    .line 1762
    if-gez v0, :cond_45

    .line 1763
    .line 1764
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1765
    .line 1766
    .line 1767
    move-result v3

    .line 1768
    add-int/2addr v3, v0

    .line 1769
    const/4 v0, 0x0

    .line 1770
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 1771
    .line 1772
    .line 1773
    move-result v3

    .line 1774
    move v0, v3

    .line 1775
    goto :goto_22

    .line 1776
    :cond_45
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1777
    .line 1778
    .line 1779
    move-result v3

    .line 1780
    if-le v0, v3, :cond_46

    .line 1781
    .line 1782
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1783
    .line 1784
    .line 1785
    move-result v0

    .line 1786
    :cond_46
    :goto_22
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1787
    .line 1788
    .line 1789
    move-result v3

    .line 1790
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 1791
    .line 1792
    invoke-direct {v4}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1796
    .line 1797
    .line 1798
    move-result v6

    .line 1799
    const/4 v7, 0x1

    .line 1800
    if-le v6, v7, :cond_4d

    .line 1801
    .line 1802
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v6

    .line 1806
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1807
    .line 1808
    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1809
    .line 1810
    invoke-virtual {v7, v2, v6}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v6

    .line 1814
    invoke-interface {v6}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v6

    .line 1818
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 1819
    .line 1820
    .line 1821
    move-result-wide v6

    .line 1822
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/zzg;->a(D)D

    .line 1823
    .line 1824
    .line 1825
    move-result-wide v6

    .line 1826
    double-to-int v6, v6

    .line 1827
    const/4 v7, 0x0

    .line 1828
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 1829
    .line 1830
    .line 1831
    move-result v6

    .line 1832
    if-lez v6, :cond_47

    .line 1833
    .line 1834
    move v7, v0

    .line 1835
    :goto_23
    add-int v8, v0, v6

    .line 1836
    .line 1837
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    .line 1838
    .line 1839
    .line 1840
    move-result v8

    .line 1841
    if-ge v7, v8, :cond_47

    .line 1842
    .line 1843
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v8

    .line 1847
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->v(I)V

    .line 1851
    .line 1852
    .line 1853
    const/16 v17, 0x1

    .line 1854
    .line 1855
    add-int/lit8 v7, v7, 0x1

    .line 1856
    .line 1857
    goto :goto_23

    .line 1858
    :cond_47
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1859
    .line 1860
    .line 1861
    move-result v3

    .line 1862
    const/4 v8, 0x2

    .line 1863
    if-le v3, v8, :cond_4e

    .line 1864
    .line 1865
    const/4 v3, 0x2

    .line 1866
    :goto_24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1867
    .line 1868
    .line 1869
    move-result v6

    .line 1870
    if-ge v3, v6, :cond_4e

    .line 1871
    .line 1872
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v6

    .line 1876
    check-cast v6, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1877
    .line 1878
    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 1879
    .line 1880
    invoke-virtual {v7, v2, v6}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v6

    .line 1884
    instance-of v7, v6, Lcom/google/android/gms/internal/measurement/zzaj;

    .line 1885
    .line 1886
    if-nez v7, :cond_4c

    .line 1887
    .line 1888
    add-int v7, v0, v3

    .line 1889
    .line 1890
    const/16 v19, 0x2

    .line 1891
    .line 1892
    add-int/lit8 v7, v7, -0x2

    .line 1893
    .line 1894
    if-ltz v7, :cond_4b

    .line 1895
    .line 1896
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 1897
    .line 1898
    .line 1899
    move-result v8

    .line 1900
    if-lt v7, v8, :cond_48

    .line 1901
    .line 1902
    invoke-virtual {v5, v7, v6}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1903
    .line 1904
    .line 1905
    move-object/from16 v10, v27

    .line 1906
    .line 1907
    const/16 v17, 0x1

    .line 1908
    .line 1909
    goto :goto_26

    .line 1910
    :cond_48
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v8

    .line 1914
    check-cast v8, Ljava/lang/Integer;

    .line 1915
    .line 1916
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1917
    .line 1918
    .line 1919
    move-result v8

    .line 1920
    :goto_25
    if-lt v8, v7, :cond_4a

    .line 1921
    .line 1922
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v9

    .line 1926
    move-object/from16 v10, v27

    .line 1927
    .line 1928
    invoke-virtual {v10, v9}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v9

    .line 1932
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1933
    .line 1934
    const/16 v17, 0x1

    .line 1935
    .line 1936
    if-eqz v9, :cond_49

    .line 1937
    .line 1938
    add-int/lit8 v11, v8, 0x1

    .line 1939
    .line 1940
    invoke-virtual {v5, v11, v9}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1941
    .line 1942
    .line 1943
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v9

    .line 1947
    invoke-virtual {v10, v9}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    :cond_49
    add-int/lit8 v8, v8, -0x1

    .line 1951
    .line 1952
    move-object/from16 v27, v10

    .line 1953
    .line 1954
    goto :goto_25

    .line 1955
    :cond_4a
    move-object/from16 v10, v27

    .line 1956
    .line 1957
    const/16 v17, 0x1

    .line 1958
    .line 1959
    invoke-virtual {v5, v7, v6}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1960
    .line 1961
    .line 1962
    :goto_26
    add-int/lit8 v3, v3, 0x1

    .line 1963
    .line 1964
    move-object/from16 v27, v10

    .line 1965
    .line 1966
    goto :goto_24

    .line 1967
    :cond_4b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1968
    .line 1969
    const-string v1, "Invalid value index: "

    .line 1970
    .line 1971
    invoke-static {v7, v1}, Landroidx/datastore/preferences/protobuf/g;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v1

    .line 1975
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1976
    .line 1977
    .line 1978
    throw v0

    .line 1979
    :cond_4c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1980
    .line 1981
    const-string v1, "Failed to parse elements to add"

    .line 1982
    .line 1983
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1984
    .line 1985
    .line 1986
    throw v0

    .line 1987
    :cond_4d
    :goto_27
    if-ge v0, v3, :cond_4e

    .line 1988
    .line 1989
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v1

    .line 1993
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1994
    .line 1995
    .line 1996
    const/4 v1, 0x0

    .line 1997
    invoke-virtual {v5, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 1998
    .line 1999
    .line 2000
    const/4 v6, 0x1

    .line 2001
    add-int/2addr v0, v6

    .line 2002
    goto :goto_27

    .line 2003
    :cond_4e
    return-object v4

    .line 2004
    :pswitch_10
    move-object/from16 v2, p2

    .line 2005
    .line 2006
    move-object/from16 v1, p3

    .line 2007
    .line 2008
    const/4 v6, 0x1

    .line 2009
    invoke-static {v5, v2, v1, v6}, Lcom/google/android/gms/internal/measurement/zzbe;->b(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v0

    .line 2013
    return-object v0

    .line 2014
    :pswitch_11
    move-object/from16 v2, p2

    .line 2015
    .line 2016
    move-object/from16 v1, p3

    .line 2017
    .line 2018
    move-object/from16 v10, v27

    .line 2019
    .line 2020
    move-object/from16 v4, v29

    .line 2021
    .line 2022
    const/4 v6, 0x1

    .line 2023
    invoke-static {v3, v6, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 2024
    .line 2025
    .line 2026
    const/4 v0, 0x0

    .line 2027
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v0

    .line 2031
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2032
    .line 2033
    iget-object v1, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 2034
    .line 2035
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v0

    .line 2039
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 2040
    .line 2041
    if-eqz v1, :cond_51

    .line 2042
    .line 2043
    invoke-virtual {v10}, Ljava/util/TreeMap;->size()I

    .line 2044
    .line 2045
    .line 2046
    move-result v1

    .line 2047
    if-nez v1, :cond_4f

    .line 2048
    .line 2049
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2050
    .line 2051
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 2052
    .line 2053
    .line 2054
    return-object v0

    .line 2055
    :cond_4f
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->c()Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v1

    .line 2059
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2060
    .line 2061
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzar;

    .line 2062
    .line 2063
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2064
    .line 2065
    const/4 v4, 0x0

    .line 2066
    invoke-static {v5, v2, v0, v4, v3}, Lcom/google/android/gms/internal/measurement/zzbe;->a(Lcom/google/android/gms/internal/measurement/zzaf;Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzar;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2071
    .line 2072
    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzaf;-><init>()V

    .line 2073
    .line 2074
    .line 2075
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v0

    .line 2079
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2080
    .line 2081
    .line 2082
    move-result v3

    .line 2083
    if-eqz v3, :cond_50

    .line 2084
    .line 2085
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v3

    .line 2089
    check-cast v3, Ljava/lang/Integer;

    .line 2090
    .line 2091
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2092
    .line 2093
    .line 2094
    move-result v3

    .line 2095
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v3

    .line 2099
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->r(Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 2100
    .line 2101
    .line 2102
    goto :goto_28

    .line 2103
    :cond_50
    return-object v2

    .line 2104
    :cond_51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2105
    .line 2106
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2107
    .line 2108
    .line 2109
    throw v0

    .line 2110
    :pswitch_12
    move-object/from16 v2, p2

    .line 2111
    .line 2112
    move-object/from16 v1, p3

    .line 2113
    .line 2114
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzaf;->c()Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2119
    .line 2120
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2121
    .line 2122
    .line 2123
    move-result v3

    .line 2124
    if-nez v3, :cond_55

    .line 2125
    .line 2126
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v1

    .line 2130
    :cond_52
    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2131
    .line 2132
    .line 2133
    move-result v3

    .line 2134
    if-eqz v3, :cond_55

    .line 2135
    .line 2136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v3

    .line 2140
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2141
    .line 2142
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 2143
    .line 2144
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v3

    .line 2148
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzaj;

    .line 2149
    .line 2150
    if-nez v4, :cond_54

    .line 2151
    .line 2152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 2153
    .line 2154
    .line 2155
    move-result v4

    .line 2156
    instance-of v6, v3, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2157
    .line 2158
    if-eqz v6, :cond_53

    .line 2159
    .line 2160
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzaf;

    .line 2161
    .line 2162
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzaf;->y()Ljava/util/Iterator;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v6

    .line 2166
    :goto_2a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2167
    .line 2168
    .line 2169
    move-result v7

    .line 2170
    if-eqz v7, :cond_52

    .line 2171
    .line 2172
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v7

    .line 2176
    check-cast v7, Ljava/lang/Integer;

    .line 2177
    .line 2178
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2179
    .line 2180
    .line 2181
    move-result v8

    .line 2182
    add-int/2addr v8, v4

    .line 2183
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2184
    .line 2185
    .line 2186
    move-result v7

    .line 2187
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v7

    .line 2191
    invoke-virtual {v0, v8, v7}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 2192
    .line 2193
    .line 2194
    goto :goto_2a

    .line 2195
    :cond_53
    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 2196
    .line 2197
    .line 2198
    goto :goto_29

    .line 2199
    :cond_54
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2200
    .line 2201
    const-string v1, "Failed evaluation of arguments"

    .line 2202
    .line 2203
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2204
    .line 2205
    .line 2206
    throw v0

    .line 2207
    :cond_55
    return-object v0

    .line 2208
    :pswitch_13
    move-object/from16 v1, p3

    .line 2209
    .line 2210
    const/4 v0, 0x0

    .line 2211
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->g(Ljava/lang/String;ILjava/util/List;)V

    .line 2212
    .line 2213
    .line 2214
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzas;

    .line 2215
    .line 2216
    move-object/from16 v1, v28

    .line 2217
    .line 2218
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v1

    .line 2222
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzas;-><init>(Ljava/lang/String;)V

    .line 2223
    .line 2224
    .line 2225
    return-object v0

    .line 2226
    nop

    .line 2227
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_13
        -0x50c088ec -> :sswitch_12
        -0x4bf73488 -> :sswitch_11
        -0x37b90a9a -> :sswitch_10
        -0x3565b984 -> :sswitch_f
        -0x28732996 -> :sswitch_e
        -0x1bdda92d -> :sswitch_d
        -0x108c6a77 -> :sswitch_c
        0x1a55c -> :sswitch_b
        0x1b251 -> :sswitch_a
        0x31dd2a -> :sswitch_9
        0x34af1a -> :sswitch_8
        0x35f4f4 -> :sswitch_7
        0x35f59e -> :sswitch_6
        0x5c6731b -> :sswitch_5
        0x6856c82 -> :sswitch_4
        0x6873d92 -> :sswitch_3
        0x398d4c56 -> :sswitch_2
        0x418e52e2 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
.end method

.method public final q(I)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaf;->x(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 32
    .line 33
    const-string v0, "Attempting to get element outside of current array"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final r(Lcom/google/android/gms/internal/measurement/zzaq;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaf;->w(ILcom/google/android/gms/internal/measurement/zzaq;)V

    .line 6
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
.end method

.method public final s()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    return v0
    .line 24
    .line 25
    .line 26
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaf;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzax;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/zzao;

    .line 38
    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/zzaq;->f()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {v0, v1, p1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final v(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gt p1, v1, :cond_3

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-ne p1, v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    if-ltz p1, :cond_3

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzaq;->i:Lcom/google/android/gms/internal/measurement/zzax;

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-gt p1, v1, :cond_3

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    add-int/lit8 v2, p1, -0x1

    .line 78
    .line 79
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_2
    goto :goto_0

    .line 94
    :cond_3
    :goto_1
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method

.method public final w(ILcom/google/android/gms/internal/measurement/zzaq;)V
    .locals 1

    .line 1
    const/16 v0, 0x7ed4

    .line 2
    .line 3
    if-gt p1, v0, :cond_2

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 28
    .line 29
    const-string v0, "Out of bounds index: "

    .line 30
    .line 31
    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p2

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string p2, "Array too large"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
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

.method public final x(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gt p1, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v1, "Out of bounds index: "

    .line 29
    .line 30
    invoke-static {p1, v1}, Landroidx/datastore/preferences/protobuf/g;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final y()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaf;->s:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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

.method public final z()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaf;->s()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/zzaf;->q(I)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0
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
