.class public final LH6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:LE6/a;

.field public h:LI6/a;

.field public i:Lza/c;

.field public j:Lcom/rollbar/notifier/sender/BufferedSender;

.field public final k:Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;

.field public l:Z

.field public final m:Z

.field public final n:LA1/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LH6/b;->k:Lcom/rollbar/notifier/sender/json/JsonSerializerImpl;

    .line 10
    .line 11
    iput-object p1, p0, LH6/b;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, LH6/b;->l:Z

    .line 15
    .line 16
    iput-boolean p1, p0, LH6/b;->m:Z

    .line 17
    .line 18
    new-instance p1, LA1/h;

    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {p1, v0, v1}, LA1/h;-><init>(IZ)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/rollbar/api/payload/data/Level;->WARNING:Lcom/rollbar/api/payload/data/Level;

    .line 27
    .line 28
    iput-object v0, p1, LA1/h;->t:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v0, Lcom/rollbar/api/payload/data/Level;->CRITICAL:Lcom/rollbar/api/payload/data/Level;

    .line 31
    .line 32
    iput-object v0, p1, LA1/h;->u:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v0, Lcom/rollbar/api/payload/data/Level;->ERROR:Lcom/rollbar/api/payload/data/Level;

    .line 35
    .line 36
    iput-object v0, p1, LA1/h;->v:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object p1, p0, LH6/b;->n:LA1/h;

    .line 39
    .line 40
    return-void
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
