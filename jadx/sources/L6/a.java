package L6;

import com.rollbar.api.payload.data.body.ExceptionInfo;
import com.rollbar.api.payload.data.body.Frame;
import com.rollbar.api.payload.data.body.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Trace a(M6.a aVar) {
        F6.a[] aVarArr;
        Trace.Builder builder = new Trace.Builder();
        StackTraceElement[] stackTraceElementArr = aVar.f3178c;
        StackTraceElement[] stackTraceElementArr2 = (StackTraceElement[]) Arrays.copyOf(stackTraceElementArr, stackTraceElementArr.length);
        Throwable th = aVar.f3180e;
        if (th == null) {
            HashSet hashSet = F6.b.a;
            aVarArr = null;
        } else {
            aVarArr = (F6.a[]) ((Map) F6.b.f1506b.get()).get(th);
        }
        int length = aVarArr != null ? aVarArr.length - 1 : 0;
        ArrayList arrayList = new ArrayList();
        int length2 = stackTraceElementArr2.length - 1;
        while (length2 >= 0) {
            StackTraceElement stackTraceElement = stackTraceElementArr2[length2];
            if (aVarArr != null) {
                if (length >= 0) {
                    F6.a aVar2 = aVarArr[length];
                    throw null;
                }
                if (length >= 0) {
                    F6.a aVar3 = aVarArr[length];
                    throw null;
                }
            }
            String fileName = stackTraceElement.getFileName();
            arrayList.add(new Frame.Builder().filename(fileName).lineNumber(Integer.valueOf(stackTraceElement.getLineNumber())).method(stackTraceElement.getMethodName()).className(stackTraceElement.getClassName()).locals(null).build());
            length2--;
            length--;
        }
        return builder.frames(arrayList).exception(new ExceptionInfo.Builder().className(aVar.a).message(aVar.f3177b).description(null).build()).build();
    }
}
