// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// =============== Experimental C++ API for computing gradients ===============

// Sample gradient function:
//
// class AddGradientFunction : public GradientFunction {
//  public:
//   Status Compute(Context* ctx,
//                  absl::Span<AbstractTensorHandle* const> grad_inputs,
//                  absl::Span<AbstractTensorHandle*> grad_outputs) override {
//     grad_outputs[0] = grad_inputs[0];
//     grad_outputs[1] = grad_inputs[0];
//     grad_outputs[0]->Ref();
//     grad_outputs[1]->Ref();
//     return Status::OK();
//   }
//   ~AddGradientFunction() override {}
// };
//
// GradientFunction* AddRegisterer(const ForwardOperation& op) {
//   // More complex gradient functions can use inputs/attrs etc. from the
//   // forward `op`.
//   return new AddGradientFunction;
// }
//
// Status RegisterGradients(GradientRegistry* registry) {
//   return registry->Register("Add", AddRegisterer);
// }
@Namespace("tensorflow::gradients") @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class GradientFunction extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GradientFunction() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GradientFunction(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GradientFunction(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GradientFunction position(long position) {
        return (GradientFunction)super.position(position);
    }
    @Override public GradientFunction getPointer(long i) {
        return new GradientFunction((Pointer)this).position(position + i);
    }

  @Virtual(true) public native @ByVal Status Compute(AbstractContext ctx,
                           @Cast({"tensorflow::AbstractTensorHandle* const*", "absl::Span<tensorflow::AbstractTensorHandle* const>"}) @Span PointerPointer<AbstractTensorHandle> grad_outputs,
                           @Cast({"tensorflow::AbstractTensorHandle**", "absl::Span<tensorflow::AbstractTensorHandle*>"}) @Span PointerPointer<AbstractTensorHandle> grad_inputs);
}