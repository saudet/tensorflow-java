// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;

@Name("std::unordered_map<tensorflow::int64,tensorflow::eager::OpTapeEntry<tensorflow::gradients::GradientFunction,tensorflow::gradients::TapeTensor> >") @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class OpTape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpTape(Pointer p) { super(p); }
    public OpTape()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef OpTape put(@ByRef OpTape x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @NoOffset @ByVal OpEntry get(@Cast("tensorflow::int64") long i);
    public native OpTape put(@Cast("tensorflow::int64") long i, OpEntry value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Cast("tensorflow::int64") long first();
        public native @Name("operator *().second") @MemberGetter @NoOffset @ByVal OpEntry second();
    }
}
