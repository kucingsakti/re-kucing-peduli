package p126n0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import oa.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f13292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f13293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13294e = true;

    public f(TextView textView) {
        this.f13292c = textView;
        this.f13293d = new d(textView);
    }

    @Override // oa.b
    public final InputFilter[] e(InputFilter[] inputFilterArr) {
        if (!this.f13294e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f13293d;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // oa.b
    public final boolean j() {
        return this.f13294e;
    }

    @Override // oa.b
    public final void l(boolean z6) {
        if (z6) {
            TextView textView = this.f13292c;
            textView.setTransformationMethod(q(textView.getTransformationMethod()));
        }
    }

    @Override // oa.b
    public final void m(boolean z6) {
        this.f13294e = z6;
        TextView textView = this.f13292c;
        textView.setTransformationMethod(q(textView.getTransformationMethod()));
        textView.setFilters(e(textView.getFilters()));
    }

    @Override // oa.b
    public final TransformationMethod q(TransformationMethod transformationMethod) {
        if (this.f13294e) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).a : transformationMethod;
    }
}
